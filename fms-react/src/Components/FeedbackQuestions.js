import React, { Component } from 'react';
import './Style.css';
import Header from './Header';
import Footer from './Footer';
import axios from 'axios';

class FeedbackQuestions extends Component {

    constructor(props) {
        super(props);
        this.state = {
            questionList: [],
            role: '',
            isLoaded: false
        }
    }

    onDashboardClick() {
        this.props.history.push({pathname: '/dashboard', role: this.state.role});
    }

    onReportClick() {
        this.props.history.push({pathname: '/event/all', role: this.state.role});
    }

    onEventsClick() {
        this.props.history.push({pathname: '/summary/all', role: this.state.role});
    }

    componentDidMount() {
        axios.get(`http://localhost:8083/feedback/question/all`)
        //.then(res => res.json())
        .then(res => {
            this.setState({
                questionList: res.data,
                isLoaded: true
            });
        })
        this.setState({
			role: this.props.location.role 
		}); 
    }

    render() { 
        var {questionList, isLoaded}=this.state;
        if(!isLoaded) {
            return <h3 className="text-center p-5"> Loading....</h3>
        }
        else{  
        return(
                <div className="container-fluid">
		            <div className="row">
			            <nav className="navbar navbar-expand-sm bg-info navbar-light text-white w-100">
				            <Header/>
		            		<button type="button" className="navbar-toggler" data-toggle="collapse" data-target="#options">
					            <span className="navbar-toggler-icon"> </span>
				            </button>
				            <div id="options" className="collapse navbar-collapse">
                                <ul className="navbar-nav ml-auto">
                                <li className="navbar-item"> <a onClick={this.onEventsClick.bind(this)} className="nav-link text-white"> Events </a> </li>
                                <li className="navbar-item"> <a onClick={this.onReportClick.bind(this)} className="nav-link text-white"> Report </a> </li>
                                <li className="navbar-item"> <a onClick={this.onDashboardClick.bind(this)} className="nav-link text-white"> Dashboard </a> </li>
                                <li className="navbar-item"> <a href="/fms" className="nav-link text-white"> Logout </a> </li>	
                                </ul>
                    		</div>
			            </nav>
	            	</div>
                    <br/>
                    <div className="box p-3">
					    <h4 className="bg-blue p-3 text-white"> Feedback_Questions </h4>
					    <div className="container pt-3">
						    <div className="row">
                                <div className="col-12">
                                <table class="table">
                                    <thead class="thead-light text-center">
                                        <tr>
                                            <th scope="col">Questions</th>
                                            <th scope="col">Feedback Type</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        {questionList.map((q,id) => (<tr key={id}>
                                        <td scope="row">{q.body.question}</td>
                                        <td scope="row" className="text-center">{q.body.feedbackType}</td>
                                        </tr>
                                        ))}
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    </div>
					<div className="row pt-5">
                    <Footer/>
                </div>
                </div>
        );}
    }
}

export default FeedbackQuestions;