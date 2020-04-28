import React, { Component } from 'react';
import './Style.css';
import axios from 'axios';
import Header from './Header';
import Footer from './Footer';
import DashboardDetails from './DashboardDetails';

class Dashboard extends Component {

	constructor(props) {
        super(props);
        this.state = {
			role: '',
			event_message: '',
            summary_message: ''
        }
	}
	
	onReportClick(){
		this.props.history.push({pathname: '/event/all', role: this.state.role});
	}

	onEventsClick(){
		this.props.history.push({pathname: '/summary/all', role: this.state.role});
	}

	onFeedbackClick = () => {
        this.props.history.push({pathname: '/feedback', role: this.state.role});
	}
	
	summaryClick() {
        axios.get(`http://localhost:8085/upload/summary`)
        //.then(res => res.json())
        .then(res => {
            this.setState({
                summary_message: res.data
            });
        }) 
    }

	eventClick() {
        axios.get(`http://localhost:8085/upload/event`)
        //.then(res => res.json())
        .then(res => {
            this.setState({
                event_message: res.data
            });
        })
	}
	
	componentDidMount() {
		console.log(this.props.location.role);
		this.setState({
			role: this.props.location.role 
		});
	}
	
    render() {  
		var {role, event_message, summary_message}=this.state 
		console.log("heyy" + role); 
		
		if(role==='admin') {
            return (
				<div>
					<div className="container-fluid pb-5">
		            <div className="row header pb-5">
			            <nav className="navbar navbar-expand-sm bg-info navbar-light text-white w-100">
				            <Header/>
		            		<button type="button" className="navbar-toggler" data-toggle="collapse" data-target="#options">
					            <span className="navbar-toggler-icon"> </span>
				            </button>
				            <div id="options" className="collapse navbar-collapse">
					            <ul className="navbar-nav ml-auto">
						            <li className="navbar-item"> <a onClick={this.onEventsClick.bind(this)} className="nav-link text-white"> Events </a> </li>
            						<li className="navbar-item"> <a onClick={this.onReportClick.bind(this)} className="nav-link text-white"> Report </a> </li>
						            <li className="navbar-item"> <a href="/fms" className="nav-link text-white"> Logout </a> </li>	
					            </ul>
                    		</div>
			            </nav>
	            	</div>
                </div>
                <div className="container-fluid">
					<h2 className="p-3"> Dashboard </h2>
					<DashboardDetails/>
					<h2 className="p-2">Hi admin !</h2>
					<div className="container pb-5">
                    <div className="row pb-5">
                        <div className="col-6">
                            <div className="card p-3">
                                <div className="bg-blue p-3 text-white">
                                <b>Click to Upload data from excel</b>
                                </div>
                                <table className="table table-borderless">
                                    <tr>
                                        <th className="text-center">
                                        <button onClick={this.eventClick.bind(this)}>Events</button>
                                        </th>
                                        <th className="text-center">
                                        <button onClick={this.summaryClick.bind(this)}>Summary</button>
                                        </th>
                                    </tr>
                                    <tr>
                                        <td>{event_message}</td>
                                        <td>{summary_message}</td>
                                    </tr>
                                </table>
                            </div>    
                        </div>
                        <div className="col-6">
                        <div className="card p-3">
                                <div className="bg-blue p-3 text-white">
                                <b>Click to View feedback questions</b>
                                </div>
                                <button onClick={this.onFeedbackClick.bind(this)}>Click</button>
                            </div>
                        </div>
                    </div>
                </div>
					<div className="row footer">
						<Footer/>
					</div>
                </div>
				</div>
			);
        }
        else if(role!=='participant'){
        return(
            <div>
				    <div className="container-fluid pb-5">
		            <div className="row header pb-5">
			            <nav className="navbar navbar-expand-sm bg-info navbar-light text-white w-100">
				            <Header/>
		            		<button type="button" className="navbar-toggler" data-toggle="collapse" data-target="#options">
					            <span className="navbar-toggler-icon"> </span>
				            </button>
				            <div id="options" className="collapse navbar-collapse">
							<ul className="navbar-nav ml-auto">
								<li className="navbar-item"> <a onClick={this.onEventsClick.bind(this)} className="nav-link text-white"> Events </a> </li>
								<li className="navbar-item"> <a onClick={this.onReportClick.bind(this)} className="nav-link text-white"> Report </a> </li>
								<li className="navbar-item"> <a href="/fms" className="nav-link text-white"> Logout </a> </li>	
							</ul>
                    		</div>
			            </nav>
	            	</div>
                </div>
                <div className="container-fluid">
					<h2 className="p-3"> Dashboard </h2>
					<DashboardDetails/>
					<h2 className="p-2">Hi {role} !</h2>
					<div className="row footer">
						<Footer/>
					</div>
                </div>
            </div>
		);}
		else{
			return(
				<div>
					<div className="container-fluid pb-5">
		            <div className="row header pb-5">
			            <nav className="navbar navbar-expand-sm bg-info navbar-light text-white w-100">
				            <Header/>
		            		<button type="button" className="navbar-toggler" data-toggle="collapse" data-target="#options">
					            <span className="navbar-toggler-icon"> </span>
				            </button>
							<div id="options" className="collapse navbar-collapse">
					            <ul className="navbar-nav ml-auto">
						            <li className="navbar-item"> <a href="/fms" className="nav-link text-white"> Logout </a> </li>	
					            </ul>
                    		</div>
							</nav>
							</div>
							</div>
				<div className="container-fluid pt-5">
					<h2 className="p-2">Hi {role} !</h2>
					<h4 className="text-center">Thanks for participating in the event !</h4>
					<div className="text-center">Your Presence was appreciated.</div>
					<div className="row footer">
						<Footer/>
					</div>
                </div>
				</div>
			);
		}
    }
}

export default Dashboard;