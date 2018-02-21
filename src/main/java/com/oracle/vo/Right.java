package com.oracle.vo;

public class Right {
	
	private String rightId;
	private String rightName;
	private String rightURL;
	
	public String getRightId() {
		return rightId;
	}
	public void setRightId(String rightId) {
		this.rightId = rightId;
	}
	public String getRightName() {
		return rightName;
	}
	public void setRightName(String rightName) {
		this.rightName = rightName;
	}
	public String getRightURL() {
		return rightURL;
	}
	public void setRightURL(String rightURL) {
		this.rightURL = rightURL;
	}
	@Override
	public String toString() {
		return "Right [rightId=" + rightId + ", rightName=" + rightName + ", rightURL=" + rightURL + "]";
	}
	

}
