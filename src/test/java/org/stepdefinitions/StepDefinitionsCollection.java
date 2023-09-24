package org.stepdefinitions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.cucumber.java.en.Given;

public class StepDefinitionsCollection {
	@Given("Array List")
	public void array_list() {
		List<Object> list = new ArrayList();
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

	@Given("LinkedaList")
	public void linkeda_list() {
		List<Object> list = new ArrayList();
		list.add("nandhini");
		list.add(12345);
		list.add(123.45);
		list.add(true);
		list.add(null);
		list.add("Nandhini");
		list.add(12345);
		list.add(123.45);
		list.add(true);
		list.add(null);
		System.out.println(list.size());
		//Iterate by using for loop
		System.out.println("Datas stored in LinkedLIst:");
		System.out.println("===for Loop Iteration===");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("===for-each Loop Iteration===");
		for(Object a:list) {
			System.out.println(a);
		}
	}
	   
	}

