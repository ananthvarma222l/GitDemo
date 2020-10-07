package com.tc.ActionEvents;

import java.io.Serializable;

class ActionEvents_1 implements Serializable{

	private String empName;
	private int empNo;
	private int Marks;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	
	public static void main(String[] args) {
		
		ActionEvents_1 obj = new ActionEvents_1();
		obj.setEmpName("Ananth");
		obj.setEmpNo(101);
		obj.setMarks(100);
		
		String Json=SerilizeDeserilize.convertJavaToJson(obj);
		System.out.println(Json);
	}
	
}


