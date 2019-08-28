import React from 'react';

class ToDoListFilter extends React.Component {
    render() {        
        return ( 
            <div className = "container mb-2">
                <div className = "card">
                    <div className = "card-header d-flex justify-content-between">
                    Show : 
                    <select>
                        <option value="ALL">All</option>
                        <option value="Active">Active</option>
                        <option value="Expired">Expired</option>
                        <option value="Complete">Completed</option>
                    </select><br/>
                    Order : 
                    <select>
                        <option value="create date">Create Date</option>
                        <option value="deadline">Deadline</option>
                        <option value="name">Name</option>
                        <option value="status">Status</option>
                    </select><br/>
                    </div>
                </div>
            </div>
        )}
}
export default ToDoListFilter;