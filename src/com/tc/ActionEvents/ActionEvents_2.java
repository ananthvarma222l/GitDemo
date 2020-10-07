package com.tc.ActionEvents;

public class ActionEvents_2 {
	
	public void Program1(){
		for(int i=1 ;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public void Program2(){
		
		int a = 0, b=1,c=0;
		System.out.print(a+" "+b);
		for(int i=0; i<10;i++){
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}
		System.out.println();
	}
	
	public void Program3(){
		
		String input="Ananth";
		String output="";
		for(int i=input.length()-1;i>=0;i--){
			char c = input.charAt(i);
			System.out.print(c);
		}
		System.out.println();
	}
	
	public void Program4(){
		
		int[] arr = {1,23,3562,2,54,12,432,11};
		int var1 = arr[0];
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>var1){
				var1=arr[i];
			}
		}
		System.out.println("largest Number: "+var1);
	}
	
	public void Program5(){
		System.out.print(1+" ");
		for(int n=1;n<=100;n++){
			int count=0;
			for(int i=1;i<=n;i++){
				if(n%i==0){
					count++;
				}
			}
			if(count==2){
				System.out.print(n+" ");
			}	
		}
	}
	
	public static void main(String[] args) {
		ActionEvents_2 obj = new ActionEvents_2();
		obj.Program1();
		obj.Program2();
		obj.Program3();
		obj.Program4();
		obj.Program5();
	}
}
