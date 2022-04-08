package lthdt2;

public class BusinessPerson extends Person implements Tax {

	public double payTax(double income,String start_time,String end_time) {
		if (income>50) {return (0.03*income);
		}
		else {
		return (0.02*income);	
		
		}
			

		
		
			
		
		
	};
	String name;
	String citizenID;
	String phone;
	String email;
	double salary;
	double other_income;
	double business_income;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "BusinessPerson [name=" + name + ", citizenID=" + citizenID + ", phone=" + phone + ", email=" + email
				+ ", salary=" + salary + ", other_income=" + other_income + ", business_income=" + business_income
				+ "]";
	}
	public String getCitizenID() {
		return citizenID;
	}
	public void setCitizenID(String citizenID) {
		this.citizenID = citizenID;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getOther_income() {
		return other_income;
	}
	public void setOther_income(double other_income) {
		this.other_income = other_income;
	}
	public double getBusiness_income() {
		return business_income;
	}
	public void setBusiness_income(double business_income) {
		this.business_income = business_income;
	}
}
