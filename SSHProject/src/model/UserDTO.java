package model;

import java.sql.Timestamp;

public class UserDTO {
	private String userId;
	private String userName;
	private String primitivePsw;
	private String password;
	private String confirmPsw;
	//用户详细信息
	private String IdCardNo;
	private String realName;
	private int gender;
    private String telphone;
    private String email;
    private String address;
    //后台维护信息
    private int grade;
    private int state;
    private Timestamp createTime;
    private Timestamp updateTime;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPsw() {
		return confirmPsw;
	}
	public void setConfirmPsw(String confirmPsw) {
		this.confirmPsw = confirmPsw;
	}
	public String getTelphone() {
		return telphone;
	}
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPrimitivePsw() {
		return primitivePsw;
	}
	public void setPrimitivePsw(String primitivePsw) {
		this.primitivePsw = primitivePsw;
	}
	public String getIdCardNo() {
		return IdCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		IdCardNo = idCardNo;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public Timestamp getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}
	
	
}
