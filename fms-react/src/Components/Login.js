import React, { Component } from 'react';
import Title from './Title';
import Header from './Header';
import Footer from './Footer';
import './Style.css';
import axios from 'axios';

class Login extends Component {
    constructor(props) {
        super(props);
        this.state = {
            username: '',
            password: '',
            role: '',
            loggedIn: false
        }
        this.onClickHandleEvent=this.onClickHandleEvent.bind(this);
    }

    onClickHandleEvent(event) {
        event.preventDefault();
        console.log("username : " + this.state.username);
        console.log("password : " + this.state.password);
        var credentials = btoa(this.state.username + ':' + this.state.password);
        var basicAuth = 'Basic ' + credentials;

        axios.get(`http://localhost:8082/login/login`, {headers: { 'Authorization': basicAuth}})
        //.then(res => console.log(res.status))
        .then(res => {
            console.log(res.status)
            if(res.status === 200) 
                return res.data;
            else {
                throw new Error('Authentication Failed');
            }            
        })
        .then(res => {
            console.log(res.role);
            this.setState({
                role: res.role,
                loggedIn: true
            })
            
            this.props.history.push({pathname: '/dashboard', role: res.role});
        }).catch(error => {
            console.log(error);
        })
    }


    render() { 
        return(
            <div>
                    <div className="container-fluid pb-5">
		            <div className="row header pb-5">
			            <nav className="navbar navbar-expand-sm bg-info navbar-light text-white w-100">
				            <Header/>
			            </nav>
	            	</div>
                </div>
                <Title/>
                <form className="form" onSubmit={this.onClickHandleEvent}>
                    <input type="text" placeholder="Enter UserName" 
                    onChange={(event) => {this.setState({username: event.target.value})}}/>
                    <input type="password" placeholder="Enter Password" 
                    onChange={(event) => {this.setState({password: event.target.value})}}/>
                    <button className="button-container"> Login </button>
                </form>
                <div className="container-fluid">
					<div className="row footer">
						<Footer/>
					</div>
                </div>
            </div>
        );
    }
}

export default Login;