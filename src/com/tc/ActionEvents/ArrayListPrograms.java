package com.tc.ActionEvents;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.yaml.snakeyaml.nodes.CollectionNode;

public class ArrayListPrograms {
	
	public ArrayList<String> al;
	public ArrayList<String> a2;
	public ArrayList<String> a3;
	public ArrayList<String> a4;
	//This Method will create an Array List and add elements and print it.
	public void Program1(){
		System.out.println("*********PROGRAM-1*****************");
		al = new ArrayList<String>();
		al.add("Ananth");
		al.add("Varma");
		al.add("Manusha");
		al.add("Vizag");
		
		System.out.println(al);
	}

	//This Program is to add elements to arrayList and print Using For and Enhanced For
	public void Program2(){
		System.out.println("*********PROGRAM-2*****************");

		al.add("Program2");
		
		System.out.print("Using Regular For Loop: ");
		for(int i = 0;i < al.size();i++){
			System.out.print(al.get(i)+" ");
		}
		
		System.out.println();
		
		System.out.print("Using Enhanced For Loop: ");
		for(String str : al){
			System.out.print(str+" ");
		}
	}
	
	//Program to insert a element into a array in first position
	public void Program3(){
		
		System.out.println();
		System.out.println("*********PROGRAM-3*****************");

		System.out.println("Before Inserting any Element in First Position : "+ al);
		
		al.add(0, "Added Element");
		
		System.out.println("After Inserting in First Position: "+ al);
	}
	
	//Program to Retrieve an element from specified Index
	public String Program4(int index){
		System.out.println("*********PROGRAM-4*****************");

		return al.get(index);
	}
	
	//Program to update an element with given element
	public void Program5(int index,String input){
		System.out.println("*********PROGRAM-5*****************");

		al.set(index, input);
		System.out.println("ArrayList after updating an element: "+al);
	}
	
	//Program to remove sepcific index element from arrayList
	public void Program6(int index){	
		System.out.println("*********PROGRAM-6*****************");

		al.remove(index);
		
		System.out.println("Removing Specific Index Element: "+al);
	}
	
	//Program to Verify certain element is there in ArrayList or Not
	public void Program7(String Element){
		
		System.out.println("*********PROGRAM-7*****************");
		
		if(al.contains(Element)){
			System.out.println(Element + " is Present");
		}
		else{
			System.out.println(Element + " is Not Present");
		}
	}
	
	//Sorting ArrayList
	public void Program8(){
		System.out.println("*********PROGRAM-8*****************");

		Collections.sort(al);
		
		System.out.println("After Sorting: "+al);
	}
	
	//Program to copy One ArrayList to Other and shuffle the list
	public void Program9(){
		System.out.println("*********PROGRAM-9*****************");
		a2 = new ArrayList<String>();
		for(String str : al){
			a2.add(str);
		}
		System.out.println("Copied List using For Loop: "+a2);
		
		Collections.shuffle(a2);
		
		System.out.println("List After Shuffling : "+a2);

	}
	
	//Program to reverese the arrayList
	public void Program10(){
		System.out.println("*********PROGRAM-10*****************");
		
		a3 = new ArrayList<String>();

		
		System.out.println("Before reverse: "+al);
		
		for(int i = al.size()-1;i>=0;i--){
			a3.add(al.get(i));
		}
		
		System.out.println(a3);
	}
	
	//Program to extract the part of List
	public void Program11(){
		System.out.println("*********PROGRAM-11*****************");

		System.out.println(al);
		
		List<String> lis=al.subList(2, 4);
		
		System.out.println("SUBLIST: "+ lis);
		
	}
	
	//Program to Compare two Lists
	public void Program12(){
		System.out.println("*********PROGRAM-12*****************");

		System.out.println("First List: "+al);
		System.out.println("Second List: "+a2);
		
		al.add("First");
		a2.add("Second");
		
		a4 = new ArrayList<String>();
		
		for(String str : al){
			a4.add(a2.contains(str)? "Yes" : "No");
		}
		
		System.out.println("Yes/No List "+a4);
	}
	
	//Program to swap two elements in an ArrayList
	public void Program13(int index1, int index2){
		
		System.out.println("*********PROGRAM-13*****************");

		System.out.println("Before Swapping "+al);
		
		Collections.swap(al, index1, index2);
		
		System.out.println("After Swapping "+al);
	}
	
	//Program to Join Two ArrayLists
	public void Program14(){
		
		System.out.println("*********PROGRAM-14*****************");

		for(String str : al){
			a2.add(str);
		}
		
		System.out.println(a2);
	}
	
	//Program to empty an ArrayList
	public void Program15(){
		
		System.out.println("*********PROGRAM-15*****************");
		
		System.out.println("Full ArrayList : "+ a2);
		
		int n = a2.size();
		
		for(int i = 0; i<n;i++){
			a2.remove(0);
		}
		
		System.out.println("Empty List: "+a2);
	}
	
	public static void main(String[] args) {
		
		ArrayListPrograms obj = new ArrayListPrograms();
		obj.Program1();
		obj.Program2();
		obj.Program3();
		System.out.println(obj.Program4(3));
		obj.Program5(0, "Updated Element");
		obj.Program6(0);
		obj.Program7("Ananth");
		obj.Program8();
		obj.Program9();
		obj.Program10();
		obj.Program11();
		obj.Program12();
		obj.Program13(2, 3);
		obj.Program14();
		obj.Program15();
		
	}
	
}
