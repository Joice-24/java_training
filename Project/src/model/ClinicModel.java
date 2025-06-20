package model;

public class ClinicModel {
	
	 private String ClinicName;      
	    private String Address;         
	    private String ContactNumber;    
	    private String Email;            
	    private String OpeningHours;
		private String name;
	    
	    public void ClinicDetails(String name, String address, String contactNumber, String email, String openingHours) {
	        this.name = name;
	        this.Address = address;
	        this.ContactNumber = contactNumber;
	        this.Email = email;
	        this.OpeningHours = openingHours;
	        
	        
	    }
		public String getClinicName() {
			return ClinicName;
		}
		public void setClinicName(String clinicName) {
			ClinicName = clinicName;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		public String getContactNumber() {
			return ContactNumber;
		}
		public void setContactNumber(String contactNumber) {
			ContactNumber = contactNumber;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public String getOpeningHours() {
			return OpeningHours;
		}
		public void setOpeningHours(String openingHours) {
			OpeningHours = openingHours;
		} 

	    
	      
}
