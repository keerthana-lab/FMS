import React, { Component } from 'react';
import './Style.css';
import Header from './Header';
import Footer from './Footer';
import axios from 'axios';

class EventsList extends Component {

    constructor(props) {
        super(props);
        this.state = {
            summaryList: [],
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

    OnClickHandler(eventId) {
        console.log("button clicked " + eventId);
        console.log(this.props);
        this.props.history.push({pathname: '/summaryId/'+eventId, role: this.state.role});
    }

    componentDidMount() {
        axios.get(`http://localhost:8084/event/summary/all`)
        //.then(res => res.json())
        .then(res => {
            this.setState({
                summaryList: res.data,
                isLoaded: true
            });
        }) 
        this.setState({
			role: this.props.location.role 
		});
    }

    render() { 
        var {summaryList, isLoaded}=this.state 
        console.log(summaryList);
        
        if(!isLoaded) {
            return <h3 className="text-center p-5"> Loading....</h3>
        }
        else{ 
        return(         
            <div>
                import React, { Component } from 'react';
import './Style.css';
import axios from 'axios';
				                <div className="container-fluid pb-5">
		            <div className="row header pb-5">
			            <nav className="navbar navbar-expand-sm bg-info navbar-light text-white w-100">
				            <Header/>
		            		<button type="button" className="navbar-toggler" data-toggle="collapse" data-target="#options">
					            <span className="navbar-toggler-icon"> </span>
				            </button>
				            <div id="options" className="collapse navbar-collapse">
					            <ul className="navbar-nav ml-auto">
						            <li className="navbar-item"> <a onClick={this.onReportClick.bind(this)} className="nav-link text-white"> Report </a> </li>
            						<li className="navbar-item"> <a onClick={this.onDashboardClick.bind(this)} className="nav-link text-white"> Dashboard </a> </li>
						            <li className="navbar-item"> <a href="/fms" className="nav-link text-white"> Logout </a> </li>	
					            </ul>
                    		</div>
			            </nav>
	            	</div>
                </div>
                <div className="container-fluid">
                    <h4 className="p-3"> List Of Events </h4>
					<div className="container-fluid">		
                        <div className="row pt-3 pb-5">
                            <div className="col-12">
                            <table className="table table-bordered text-center">
                            <thead className="thead-light">
                              <tr>
                                <th scope="col">Event ID</th>
                                <th scope="col">Event Name</th>
                                <th scope="col">Location</th>
                                <th scope="col">Date</th>
                                <th scope="col">Beneficiary Name</th>                              
                                <th></th>
                              </tr>
                            </thead>
                            <tbody>
                                {summaryList.map((e,id) => (<tr key={id}>
                                <td scope="row">{e.body.eventId}</td>
                                <td scope="row">{e.body.eventName}</td>
                                <td scope="row">{e.body.baseLocation}</td>
                                <td scope="row">{e.body.eventDate}</td>
                                <td scope="row">{e.body.beneficiaryName}</td>  
                                <td><button onClick={this.OnClickHandler.bind(this,e.body.eventId)}>View...</button></td>
                                </tr>
                                ))}
                            </tbody>
                          </table>
                        </div>
                        </div>
					</div>
                </div>
                <div className="container-fluid">
					<div className="row footer">
						<Footer/>
					</div>
                </div>
            </div>
        );}
    }
}

export default EventsList;