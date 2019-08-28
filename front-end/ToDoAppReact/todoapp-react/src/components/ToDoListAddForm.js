import React from 'react';

class ToDoListAddForm extends React.Component {

    constructor(props) {
		super(props);
		this.state = {user: []};
	}

	async componentDidMount() {
		fetch('http://localhost:8080/items', {
			method: 'POST',
			body: JSON.stringify({
                name: "",
                description: "",
                deadline: ""
              }),
			headers: {
				"Content-type": "application/json; charset=UTF-8"
			}
		}).then(response => {
				return response.json()
			}).then(json => {
				this.setState({
					user:json
				});
			});
	}
	render() {
		return (            
            <div className="container mb-5">
                <div className="card">
                    <div>
                        <center><h4><u>.:: Add Todo Item Form ::.</u></h4></center>
                    </div>
                    <div className="card-body">
                        <form className="mb-5">
                            <div className="form-group">
                                <label htmlFor="name">Name</label>
                                <input type="text" name="name" id="id" placeholder="Enter Name" class="form-control"/>
                            </div>
                            <div className="form-group">
                                <label htmlFor="description">Description</label>
                                <input type="text" name="description" id="description" placeholder="Enter description" class="form-control"/>
                            </div>
                            <div className="form-group">
                                <label htmlFor="deadline">Deadline</label>
                                <input type="date" name="deadline" id="deadline" placeholder="Enter Deadline" class="form-control"/>
                            </div>                        
                            <button class="btn btn-danger btn-block" type="submit">Add User</button>
                        </form>
                    </div>
                </div>
            </div>
        )
	}
}
export default ToDoListAddForm;