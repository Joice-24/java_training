package model;

public class PatientDeatialsModel {
	private String FullName;
	private String Gender;
	private int Weight;
	private int PhoneNumber;
	private int Height;
	private int Age;
	private String Address;
	private String BloodGroup;
	private String MedicalHistory;
	private String Allergies;
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getWeight() {
		return Weight;
	}
	public void setWeight(int weight) {
		Weight = weight;
	}
	public int getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public int getHeight() {
		return Height;
	}
	public void setHeight(int height) {
		Height = height;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getBloodGroup() {
		return BloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		BloodGroup = bloodGroup;
	}
	public String getMedicalHistory() {
		return MedicalHistory;
	}
	public void setMedicalHistory(String medicalHistory) {
		MedicalHistory = medicalHistory;
	}
	public String getAllergies() {
		return Allergies;
	}
	public void setAllergies(String allergies) {
		Allergies = allergies;
	}
	
}
