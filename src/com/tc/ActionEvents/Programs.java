package com.tc.ActionEvents;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class Programs {
	
	
	public String StringReverseUsingDefaultFunc(String Name){
		
		StringBuilder sb = new StringBuilder(Name);
		return sb.reverse().toString();
	}
	
	public String StringReverseCode(String Name){
		
		String temp="";
		for(int i = Name.length()-1; i>=0; i--){
			char c  = Name.charAt(i);
			temp= temp+c;
		}
		return temp;
	}
	
	public void reverseArray(int[] a){
		int[] b = new int[a.length];
		for (int i = a.length-1; i>=0 ; i--) {
			b[i]=a[i];
		}
		for (int c=b.length-1;c>=0;c--){
			System.out.print(b[c]+" ");
		}
		System.out.println();
	}
	
	public void RevreseWordsInString(String input){
		
		String[] str = input.split(" ");
		for(int i = str.length-1;i>=0;i--){
			System.out.print(str[i]+" ");
		}
	}
	
	public boolean StringPallindrome(String input){
		char[] c = input.toCharArray();
		String temp="";
		for(int i = c.length-1;i>=0;i--){
			temp+=c[i];
		}
		if(input.equalsIgnoreCase(temp)){
			return true;
		}
		return false;
	}

	public boolean NumberPallindrome(int n){
		int temp,rev=0;
		while(n>0){
			temp=n%10;
			rev=rev*10+temp;
			n=n/10;
		}
		if(n==rev){
			return true;
		}
		return false;
	}
	
	public void FirstMaxAndMinNumberofArray(int[] n){
		
		int Maxnumber = n[0];
		int Minnumber = n[0];
		
		for(int i=1;i<n.length;i++){
			if(n[i]>Maxnumber){
				Maxnumber=n[i];
			}
		}
		
		for(int i=1;i<n.length;i++){
			if(n[i]<Minnumber){
				Minnumber=n[i];
			}
		}
		System.out.println("MaximumNumber of Array: "+Maxnumber+" Minimum Number of Array: "+Minnumber);
	}
	
	public void SecondMaxAndMinNumberofArray(int[] input){
		
		int firstMax=input[0];
		int[] arr2 = new int[input.length];
		for(int i = 1;i<input.length;i++){
			if(input[i]>firstMax){
				firstMax=input[i];
			}
		}
		System.out.println(firstMax);
		
		for(int i = 0;i<input.length;i++){
			if(input[i]!=firstMax){
				arr2[i]=input[i];
			}
		}
		int secondMax=arr2[0];
		for(int i=0;i<arr2.length;i++){
			if(arr2[i]>secondMax){
				secondMax=arr2[i];
			}
		}
		
		System.out.println("First Maximum Number in Array : "+firstMax);
		System.out.println("Second Maximum Number in Array : "+secondMax);
		
	}
	
	public void StringPoolEqualsOperator(){
		
		String s1 = "apple";
		String s2 = "apple";
		String s3 = new String("apple");
		
		System.out.println(s1==s2);//Object Comparision
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));//Content Comparision
		
	}
	
	public void swaping(int a, int b){
		
		System.out.println("Before Swapping a: "+a+" b: "+b);
		
		b=b-a;//6-5 = 1
		a=a+b;//5+1 = 6
		b=a-b;//6-1 = 5
		
		System.out.println("After Swapping a: "+a+" b: "+b);
		
	}
	
	public void AnagramStrings(String s1, String s2){
		int count=0;
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		for(int i=0; i<c1.length; i++){
			if(c1[i]==c2[i]){
				count++;
			}
		}
		if(count==c1.length){
			System.out.println("Anagram");
		}
		else{
			System.out.println("Not Anagram");
		}
	}
	
	public void removeDuplicatesFromString(String str){
		
		LinkedHashSet<Character> h1 = new LinkedHashSet<Character>();
		
		for(int i=0;i<str.length();i++){
			h1.add(str.charAt(i));
		}
		
		for(Character ch : h1){
			System.out.print(ch);
		}
	}
	
	
	
	public static void main(String[] args) {
		int[] n = {101,23,3938,43,512,76};
		Programs p = new Programs();
		System.out.println(p.StringReverseUsingDefaultFunc("Ananth"));
		System.out.println(p.StringReverseCode("Ananth"));
		p.reverseArray(n);
		p.RevreseWordsInString("Ananth Loves Manusha");
		System.out.println();
		System.out.println("Pallindrome True/False: "+p.StringPallindrome("Level"));
		System.out.println("Pallindrome True/False: "+p.NumberPallindrome(143));
		p.FirstMaxAndMinNumberofArray(n);
		p.SecondMaxAndMinNumberofArray(n);
		p.StringPoolEqualsOperator();
		p.swaping(5, 6);
		p.AnagramStrings("TRIANGLE", "INVEGRAL");
		p.removeDuplicatesFromString("abcdefghabcd");
	}

}
