package lthdt2;

public class Student extends Person implements Tax {
	public double payTax(double income,String start_time,String end_time) {
		if (income>=11) {
			
			return (income *0.005);
		}else return 0;
		 	
		
		
		
	}
	@Override
	public String toString() {
		return "Student [income=" + income + ", name=" + name + ", studentID=" + studentID + ", phone=" + phone
				+ ", email=" + email + "]";
	}
	double income;
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	String name;
	String studentID;
	String phone;
	String email;


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	

	
}
