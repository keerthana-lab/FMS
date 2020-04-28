import React, { Component } from 'react';
import './Style.css';
import axios from 'axios';

class DashboardDetails extends Component {

	constructor(props) {
        super(props);
        this.state = {
			dashboard: [],
            isLoaded: false
        }
	}
	
	componentDidMount() {
        axios.get(`http://localhost:8084/event/dashboard`)
        //.then(res => res.json())
        .then(res => {
            this.setState({
                dashboard: res.data,
                isLoaded: true
            });
		}) 
	}
	
    render() {  
		var {dashboard, isLoaded}=this.state 
		
		if(!isLoaded) {
            return <h3 className="text-center p-5"> Loading....</h3>
        }
        else{
        return(
            <div>
					<div className="container">
						<div className="row">
							<div className="col-3">
								<div className="box p-3">
									<div className="bg-red p-3 text-white text-center">
										<b> Total Events </b>
										<br/>
										{dashboard.totalEvents}
									</div>
								</div>
							</div>
							<div className="col-3">
								<div className="box p-3">
									<div className="bg-orange p-3 text-white text-center">
										<b> Lives Impacted </b>
										<br/>
										{dashboard.livesImpacted}
									</div>
								</div>
							</div>
							<div className="col-3">
								<div className="box p-3">
									<div className="bg-violet p-3 text-white text-center">
										<b> Total Volunteers </b>
										<br/>
										{dashboard.totalVolunteers}
									</div>
								</div>
							</div>
							<div className="col-3">
								<div className="box p-3">
									<div className="bg-d-grey p-3 text-white text-center">
										<b> Total Participants </b>
										<br/>
										{dashboard.totalParticipants}
									</div>
								</div>
							</div>
						</div>
					</div>
            </div>
        );}
    }
}

export default DashboardDetails;