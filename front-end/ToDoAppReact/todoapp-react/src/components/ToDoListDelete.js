import React from 'react';

class ToDoListDelete extends React.Component {
	
	componentDidMount() {
		fetch('http://localhost:8080/items/{id}', {
			method: 'DELETE'
		});
	}	
}
export default ToDoListDelete;