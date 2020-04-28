import React, { Component } from 'react';
import './Style.css';
import Header from './Header';
import Footer from './Footer';
import axios from 'axios';

class Event extends Component {
    constructor(props) {
        super(props);
        this.state = {
            event: [],
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
        //console.log("heyy" + this.props);
        let eventId = this.props.match.params.eventId;
        //console.log("id" + eventId);
        axios.get(`http://localhost:8084/event/summaryId/`+eventId)
        //.then(res => res.json())
        .then(res => {
            this.setState({
                event: res.data,
                isLoaded: true
            });
        })
        this.setState({
			role: this.props.location.role 
		});
    }


    render() { 
        var {event, isLoaded}=this.state 
        //console.log(event)
        if(!isLoaded) {
            return <h3 className="text-center p-5"> Loading....</h3>
        }
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
                                <li className="navbar-item"> <a onClick={this.onEventsClick.bind(this)} className="nav-link text-white"> Events </a> </li>
                                <li className="navbar-item"> <a onClick={this.onReportClick.bind(this)} className="nav-link text-white"> Report </a> </li>
                                <li className="navbar-item"> <a onClick={this.onDashboardClick.bind(this)} className="nav-link text-white"> Dashboard </a> </li>
                                <li className="navbar-item"> <a href="/fms" className="nav-link text-white"> Logout </a> </li>	
					            </ul>
                    		</div>
			            </nav>
	            	</div>
                </div>
                <div className="container-fluid">
                    <h4 className="p-3"> Events & Beneficiary Details </h4>
					<div className="container-fluid">		
						    <div className="row">
                            <div className="col-6">
                                <div className="card p-3">
                                    <div className="bg-blue p-3 text-white">
                                            <b>ID : </b>{event.eventId}<br/>
                                        <span>
                                        <b>Date : </b>{event.eventDate}
                                        </span>
                                    </div>
                                    <div className="pb-3">
                                    <h6 className="p-2 text-center"> {event.eventName} </h6>
                                    <span>
                                        {event.eventDescription}
                                    </span>
                                    </div>
                                    <div className="bg-grey p-2">
                                        <b>Status : </b>
                                        <span className="btn btn-success pb-2">{event.status}</span>
                                        <br/>
                                        <span>
                                        <b>Category : </b>
                                        {event.category}
                                        </span>
                                    </div>
                                </div>
                            </div>
                            <div className="col-6">
                                <div className="card p-3 ">
                                    <div className="bg-blue p-3 text-white">
                                            <b>Location : </b>{event.baseLocation}
                                            <br/>
                                        <span>
                                            <b>Council : </b>{event.councilName}
                                        </span>
                                    </div>
                                    <div className="pb-3">
                                        <h6 className="p-2 text-center"> {event.beneficiaryName} </h6>
                                        <span> {event.venueAddress}</span>
                                    </div>
                                    <div className="bg-grey p-2">
                                        <b>Feedback : </b>
                                        <span className="btn btn-warning">good</span>
                                        <span className="float-right">
                                        <b>Rating : </b>
                                        4
                                        </span>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div className="row pt-3 pb-5">
                            <div className="col-7">
                            <div className="card p-3">
                                <div className="bg-blue p-3 text-white text-center">
                                    <h5> Statistics : </h5>
                                </div>
                            <table className="table text-center">
                            <thead className="thead-light">
                              <tr>
                                <th scope="col">Total Volunteers</th>
                                <th scope="col">Volunteering Hours</th>
                                <th scope="col">Travel Hours</th>
                                <th scope="col">Total Hours</th>
                                <th scope="col">Lives Impacted</th>
                              </tr>
                            </thead>
                            <tbody>
                              <tr>
                                <td>{event.totalVolunteers}</td>
                                <td>{event.totalVolunteerHours}</td>
                                <td>{event.totalTravelHours}</td>
                                <td>{event.overallHours}</td>
                                <td>{event.livesImpacted}</td>
                              </tr>
                            </tbody>
                          </table>
                          </div>
                        </div>
                        <div className="col-5">
                        <div className="card p-3">
                        <div className="bg-blue p-3 text-white text-center">
                            <h5> Poc Details: </h5>
                        </div>
                    <table className="table text-center">
                    <thead className="thead-light">
                      <tr>
                        <th scope="col">Id</th>
                        <th scope="col">Name</th>
                        <th scope="col">Contact No.</th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <td>{event.pocId}</td>
                        <td>{event.pocName}</td>
                        <td>{event.pocContact}</td>
                      </tr>
                    </tbody>
                  </table>
                  </div>
                        </div>
                        </div>
					</div>
                    <div className="text-center pb-5">
                    <button className="text-center" onClick={this.onEventsClick.bind(this)}>Go Back to Events List</button>
                    </div>
                </div>
                <div className="container-fluid">
					<div className="row">
						<Footer/>
					</div>
                </div>
            </div>
        );}
    }
}

export default Event;