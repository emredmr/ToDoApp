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
@Table(name = "ToDoList")
public class ToDoList {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	@NotBlank(message = "To-do list name can't be empty!")
	private String name;
	@NotBlank(message = "To-do list description can't be empty!")
	private String description;
	private String deadline;
	private String status;
	
	public ToDoList() {

	}
	public ToDoList(String id, String name, String description, String deadline, String status) {
		super();
		this.id = id;
		this.setName(name);
		this.setDescription(description);
		this.setDeadline(deadline);
		this.setStatus(status);
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
