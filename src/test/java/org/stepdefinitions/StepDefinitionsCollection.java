package org.stepdefinitions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.LinkedList;

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
	@Given("Hash Map")
	public void hash_map() {
		Map<String,Integer> m1 = new HashMap();
		m1.put("Ten",10);
		m1.put("Twenty",20);
		m1.put("Thirty",30);
		m1.put("Forty",40);
		m1.put("Fifty",null);
		m1.put("Sixty",60);
		m1.put("Seventy",null);
		System.out.println(m1);
		//Iterate by using for-each loop
				System.out.println("Datas stored in Hash Map:");
				Set<String>keySet = m1.keySet();
				System.out.println("===Keys===");
				for(String a:keySet) {
					System.out.println(a);
				}
				Collection<Integer>values =m1.values();
				System.out.println("===Values===");
				for(Integer b:values) {
					System.out.println(b);
				}
	}
	@Given("Linked Hash Set")
	public void linked_hash_set() {
		Set<Object> set = new LinkedHashSet();
		set.add("Guna");
		set.add(12345);
		set.add(123.45);
		set.add(true);
		set.add(null);
		set.add("Guna");
		set.add(12345);
		set.add(123.45);
		set.add(true);
		set.add(null);
		System.out.println(set);
		//Iterate by using for loop
		System.out.println("Datas stored in Linked HashSet:");
		System.out.println("===for-each Loop Iteration===");
		for(Object a:set) {
			System.out.println(a);
		}
	}
	@Given("Linked List")
	public void linked_list() {
		List<Object> list1 = new LinkedList();
		list1.add("Guna");
		list1.add(12345);
		list1.add(123.45);
		list1.add(true);
		list1.add(null);
		list1.add("Guna");
		list1.add(12345);
		list1.add(123.45);
		list1.add(true);
		list1.add(null);
		System.out.println(list1);
		//Iterate by using for loop
		System.out.println("Datas stored in LinkedLIst:");
		System.out.println("===for-each Loop Iteration===");
		for(Object a:list1) {
			System.out.println(a);
		}
	}
}
