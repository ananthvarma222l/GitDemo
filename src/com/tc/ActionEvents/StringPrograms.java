package com.tc.ActionEvents;

import java.util.HashSet;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class StringPrograms {
	
	public boolean ReverseString(String input){
		
		int n = input.length();
		System.out.println(input.length());
		
		for(int i = 0; i<n/2; i++){
			
			if(input.charAt(i)!=input.charAt(n-i-1)){
				return false;
			}
		}
		return true;
		
	}
	
	public void removeDuplicateCharFromString(String input){
		
		String outputString = "";
		HashSet<Character> hs = new HashSet<Character>();
		
		for(int i = 0; i<input.length()-1;i++){
			hs.add(input.charAt(i));
		}
		
		for(Character c : hs){
			outputString+=c;
		}
		
		System.out.println(outputString);
	}
	
	

	public static void main(String[] args) {
		
		StringPrograms obj = new StringPrograms();
		System.out.println(obj.ReverseString("madam"));
		
		obj.removeDuplicateCharFromString("abcdefabcd");
		
	}
	
}
