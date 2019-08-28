import React from 'react';

class ToDoListGet extends React.Component {

    constructor(props) {
		super(props);
        this.state = {users: []}; 
    }

    async componentDidMount() {
        fetch('http://localhost:8080/items')
            .then((response) => response.json())
            .then((findresponse)=>{
            console.log(findresponse)
            this.setState({
                users:findresponse,
            })
        })            
    }

    render() {        
        return ( 
            <div>
				{ 
                   this.state.users.map(function(item) {             
                    return ( 
                        <div className = "container mb-2">
                            <div className = "card">
                                <div className = "card-header d-flex justify-content-between">
                                    <h4 className="d-inline">Name : {item.name}</h4>                                    
                                    <i style={{cursor:"pointer"}}>Completed</i>
                                    <i style={{cursor:"pointer"}}>Delete</i>
                                </div>
                
                                <div className="card-body">
                                <p className="card-text"><b>Description : </b>{item.description}</p>
                                <p className="card-text"><b>Deadline : </b>{item.deadline}</p>
                                <p className="card-text"><b>Status : </b>{item.status}</p>
                                </div>
                            </div>                                             
                        </div>
                    )
                    }
        )
                }						
			</div>             
        )
    }    
}
export default ToDoListGet;