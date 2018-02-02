package com.iot.spring.vo;

public class UserInfo {
	private int ciNo;
	private String ciName;
	private String ciDesc;
	private int uiNo;
	private String uiName;
	private String uiId;
	private String uiPwd;
	private int uiAge;
	private String uiRegdate;
	private String address;
	private String searchType;
	
	
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	
	@Override
	public String toString() {
		return "UserInfo [ciNo=" + ciNo + ", ciName=" + ciName + ", ciDesc=" + ciDesc + ", uiNo=" + uiNo + ", uiName="
				+ uiName + ", uiId=" + uiId + ", uiPwd=" + uiPwd + ", uiAge=" + uiAge + ", uiRegdate=" + uiRegdate
				+ ", address=" + address + ", searchType=" + searchType + "]";
	}
	
	public int getCiNo() {
		return ciNo;
	}
	public void setCiNo(int ciNo) {
		this.ciNo = ciNo;
	}
	public String getCiName() {
		return ciName;
	}
	public void setCiName(String ciName) {
		this.ciName = ciName;
	}
	public String getCiDesc() {
		return ciDesc;
	}
	public void setCiDesc(String ciDesc) {
		this.ciDesc = ciDesc;
	}
	public int getUiNo() {
		return uiNo;
	}
	public void setUiNo(int uiNo) {
		this.uiNo = uiNo;
	}
	public String getUiName() {
		return uiName;
	}
	public void setUiName(String uiName) {
		this.uiName = uiName;
	}
	public String getUiId() {
		return uiId;
	}
	public void setUiId(String uiId) {
		this.uiId = uiId;
	}
	public String getUiPwd() {
		return uiPwd;
	}
	public void setUiPwd(String uiPwd) {
		this.uiPwd = uiPwd;
	}
	public int getUiAge() {
		return uiAge;
	}
	public void setUiAge(int uiAge) {
		this.uiAge = uiAge;
	}
	public String getUiRegdate() {
		return uiRegdate;
	}
	public void setUiRegdate(String uiRegdate) {
		this.uiRegdate = uiRegdate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
