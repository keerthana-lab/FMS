import React, { Component } from 'react';
import './Style.css';

class Header extends Component {
    render() {   
        return(
            <a href="#" className="navbar-brand">
				<span className="text-white"> OutReach FMS </span>
			</a>
        );
    }
}

export default Header;