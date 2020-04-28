import React, { Component } from 'react';
import './Style.css';
import Header from './Header';
import Footer from './Footer';
import axios from 'axios';

class Report extends Component {

    constructor(props) {
        super(props);
        this.state = {
            eventsList: [],
            role: '',
            isLoaded: false
        }
    }

    onDashboardClick() {
        this.props.history.push({pathname: '/dashboard', role: this.state.role});
    }

    onEventsClick() {
        this.props.history.push({pathname: '/summary/all', role: this.state.role});
    }

    componentDidMount() {
        axios.get(`http://localhost:8084/event/all`)
        //.then(res => res.json())
        .then(res => {
            this.setState({
                eventsList: res.data,
                isLoaded: true
            });
        }) 

        this.setState({
			role: this.props.location.role 
		});
    }

    render() { 
        var {eventsList, isLoaded}=this.state
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
			            			<li className="navbar-item"> <a onClick={this.onDashboardClick.bind(this)} className="nav-link text-white"> Dashboard </a> </li> 
						            <li className="navbar-item"> <a href="/fms" className="nav-link text-white"> Logout </a> </li>	
					            </ul>
                    		</div>
			            </nav>
	            	</div>
                </div>
                <div className="container-fluid">
                    <h4 className="p-3"> Events Report </h4>
					<div className="container-fluid">		
                        <div className="row pt-3 pb-5">
                            <div className="col-12">
                            <table className="table table-bordered text-center">
                            <thead className="thead-light">
                              <tr>
                                <th scope="col">Event ID</th>
                                <th scope="col">Base Location</th>
                                <th scope="col">Beneficiary Name</th>
                                <th scope="col">Council Name</th>
                                <th scope="col">Event Name</th>
                                <th scope="col">Description</th>
                                <th scope="col">Date</th>
                                <th scope="col">Emp Id</th>
                                <th scope="col">Emp Name</th>
                                <th scope="col">Volunteering Hours</th>
                                <th scope="col">Travel Hours</th>
                                <th scope="col">Lives Impacted</th>
                                <th scope="col">Business Unit</th>
                                <th scope="col">Status</th>
                                <th scope="col">IIEP category </th>
                              </tr>
                            </thead>
                            <tbody>
                                {eventsList.map((e,id) => (<tr key={id}>
                                <td scope="row">{e.body.eventId}</td>
                                <td scope="row">{e.body.baseLocation}</td>
                                <td scope="row">{e.body.beneficiaryName}</td>
                                <td scope="row">{e.body.councilName}</td>
                                <td scope="row">{e.body.eventName}</td>
                                <td scope="row">{e.body.eventDescription}</td>
                                <td scope="row">{e.body.eventDate}</td>
                                <td scope="row">{e.body.empId}</td>
                                <td scope="row">{e.body.empName}</td>
                                <td scope="row">{e.body.volunteerHours}</td>
                                <td scope="row">{e.body.travelHours}</td>
                                <td scope="row">{e.body.livesImpacted}</td>
                                <td scope="row">{e.body.businessUnit}</td>
                                <td scope="row">{e.body.status}</td>
                                <td scope="row">{e.body.iiepCategory}</td>
                                </tr>
                                ))}
                            </tbody>
                          </table>
                        </div>
                        </div>
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

export default Report;