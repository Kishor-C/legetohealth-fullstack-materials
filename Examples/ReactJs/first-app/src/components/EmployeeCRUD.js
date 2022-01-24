import React, {Component} from 'react';
import axios from 'axios';
export class EmployeeItems extends React.Component {
    constructor(props) {
        super(props);
        this.state = {employees : []}
    }
    handleRefresh = (event) => {
        let url = 'http://localhost:9090/employee';
        axios.get(url)
        .then((response) => this.setState({employees : response.data}))
        .catch((err) => console.log(err))
    }
    render() {
        return (<div>
            <h2>Employees List</h2>
            <button onClick = {this.handleRefresh} className = 'btn btn-primary'>Refresh</button>
            <table className = 'table table-striped'>
                <thead>
                    <tr>
                        <th>Sl No.</th><th>Id</th><th>Name</th><th>Salary</th>
                    </tr>
                </thead>
                <tbody>
                    {this.state.employees.map((item, index) => <tr key = {item._id}>
                        <td>{index + 1}</td><td>{item._id}</td><td>{item.name}</td><td>{item.salary}</td>
                    </tr>)}
                </tbody>
            </table>
        </div>)
    }
}
export class EmployeeStore extends React.Component {
    constructor(props) {
        super(props);
        this.state = {_id: '', name : '', salary: ''};
    }
    handleSubmit = (event) => {
        event.preventDefault();
        // submit the state to the backend
    }
    handleChange = (event) => {
        this.setState({[event.target.name]: event.target.value})
        
    }
    render() {
        return (<div>
            <h3>Employee Store Form</h3>
            <form onSubmit = {this.handleSubmit}>
                <label>
                    Id <input type = 'number' name = '_id' autoComplete = 'off' 
                    onChange = {this.handleChange}/>
                </label>
                <br />
                <label>
                    Name <input type = 'text' name = 'name' autoComplete = 'off'  
                    onChange = {this.handleChange}/>
                </label>
                <br />
                <label>
                    Salary <input type = 'number' name = 'salary' autoComplete = 'off'  
                    onChange = {this.handleChange}/>
                </label>
                <br />
                <button type = 'submit' className = 'btn btn-primary'>Submit</button>
            </form>
            <div>
                Id: {this.state.id}, Name: {this.state.name}, Salary: {this.state.salary}
            </div>
        </div>)
    }
}