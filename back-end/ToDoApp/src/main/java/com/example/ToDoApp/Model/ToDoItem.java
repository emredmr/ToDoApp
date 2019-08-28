package com.example.ToDoApp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@Table(name = "ToDoItem")
public class ToDoItem {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
    @NotBlank(message = "To-do items name can't be empty!")
	private String name;
    @NotBlank(message = "To-do items description can't be empty!")
	private String description;
	private String deadline;
	private String status;
	
	
	public ToDoItem() {

	}
	public ToDoItem(String id, String name, String description, String deadline, String status) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.deadline = deadline;
		this.status = status;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
