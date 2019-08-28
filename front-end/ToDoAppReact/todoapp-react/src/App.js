import React from 'react';
import ToDoListAddForm from './components/ToDoListAddForm';
import ToDoListGet from './components/ToDoListGet';
import ToDoListFilter from './components/ToDoListFilter';

function App() {
  return (
    <div className="container">
      <ToDoListAddForm/>  
    <center><h4><u>.:: Todo Item List ::.</u></h4></center>
      <ToDoListFilter/>       
      <ToDoListGet/>           
  </div>
  );
}
export default App;
