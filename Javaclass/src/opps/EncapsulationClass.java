package opps;

import java.util.Date;

public class EncapsulationClass {
	private String email;
	private String username;
	private long mobile;
	private long age;
	private char gender;
	private boolean graduate;
	private Date date;
	
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setusername(String username) {
		this.username=username;
	}
	
	public String getUsername() {
		return username;
	}
	public void setMobile(long mobile) {
		 this.mobile=mobile;
	}
	public long getMobile() {
		return mobile;
		
	}
	
	public void setAge(long age) {
		 this.age=age;
	}
	
	public long getage() {
		return age;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	
	public char getGender() {
		return gender;
	}
	public void setGraduate(boolean graduate) {
		this.graduate=graduate;
	}
	
	public boolean getgraduate() {
		return graduate;
	}
	public void setMobile(Date date) {
		this.date=date;
	}
	
	public Date getDate() {
		return date;
	}
	
}
