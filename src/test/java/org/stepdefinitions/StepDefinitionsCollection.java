package org.stepdefinitions;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.en.Given;

public class StepDefinitionsCollection {
	@Given("Array List")
	public void array_list() {
		List list = new ArrayList();
		list.add("Guna");
		list.add(12345);
		list.add(123.45);
		list.add(true);
		list.add(null);
		list.add("Guna");
		list.add(12345);
		list.add(123.45);
		list.add(true);
		list.add(null);
		System.out.println(list);
		//Iterate by using for loop
		System.out.println("Datas stored in ArrayLIst:");
		System.out.println("===for Loop Iteration===");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("===for-each Loop Iteration===");
		for(Object a:list) {
			System.out.println(a);
		}
	}
	@Given("Linked List")
	public void linked_list() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Given("Hash Set")
	public void hash_set() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Given("Linked Hash Set")
	public void linked_hash_set() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Given("Tree Set")
	public void tree_set() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Given("Hash Map")
	public void hash_map() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Given("Linked Hash Map")
	public void linked_hash_map() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Given("Tree Map")
	public void tree_map() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Given("Hash Table")
	public void hash_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Given("2D Array")
	public void d_array() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	}
