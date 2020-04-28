import React from 'react';
//import Header from './Components/Header';
//import Footer from './Components/Footer';
import Report from './Components/Report';
import EventsList from './Components/EventsList';
import Event from './Components/Event';
import Dashboard from './Components/Dashboard';
import Login from './Components/Login';
import FeedbackQuestions from './Components/FeedbackQuestions';

import {Route, BrowserRouter as Router} from 'react-router-dom';

function App() {
  return (
            <div>
                <Router>
                    <Route path='/fms' component={Login}/>
                    <Route path='/summary/all' component={EventsList}/>
                    <Route path='/event/all' component={Report}/>
                    <Route path='/summaryId/:eventId' component={Event}/>
                    <Route path='/dashboard' component={Dashboard}/>
                    <Route path="/feedback" component={FeedbackQuestions}/>
                </Router> 
            
            </div>
  );
}

export default App;
