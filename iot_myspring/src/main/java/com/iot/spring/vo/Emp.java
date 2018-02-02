package com.iot.spring.vo;

public class Emp {
	private int emNo;
	private String emName;
	private int emSal;
	
	public int getEmNo() {
		return emNo;
	}
	public void setEmNo(int emNo) {
		this.emNo = emNo;
	}
	public String getEmName() {
		return emName;
	}

	public void setEmName(String emName) {
		this.emName = emName;
	}
	public int getEmSal() {
		return emSal;
	}
	public void setEmSal(int emSal) {
		this.emSal = emSal;
	}
	
	@Override
	public String toString() {
		return "Emp [emNo=" + emNo + ", emName=" + emName + ", emSal=" + emSal + "]";
	}
}
