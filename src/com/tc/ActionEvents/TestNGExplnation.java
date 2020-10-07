package com.tc.ActionEvents;



public class TestNGExplnation {
	
	public static void main(String[] args) {
		
		
		System.out.println("Pyramid - 1");
		
		for(int i = 0; i < 5; i++){
			for(int j = 0;j <= i; j++){	
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("Pyramid-2");
		
		for(int i = 1; i <= 5; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("Pyramid-3");
		
		for(int i = 0;i < 5 ;i++){
			for(int j = 0;j <= i;j++){
				System.out.print("A ");
			}
			System.out.println();
		}
		System.out.println("Pyramid-4");
		for(int i = 5; i > 0 ;i--){
			for(int j = i; j > 0;j--){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("Pyramid-5");
		
		for(int i = 5; i > 0 ; i--){
			for(int j = 1; j <= i; j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("Pyramid-6");
		
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<9-i;j++)
			{
				System.out.print(" ");
			}
			for(int z=0;z<2*i+1;z++)
				System.out.print("*");
			System.out.println();		
			
		}
		
		System.out.println("Pyramid-7");
		
		for(int i=0;i<10;i++)
		{
			for(int z=0;z<i;z++)
				System.out.print(" ");
			for(int j=i;j<20-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();		
		}
	}
	
	
	
}
