package lthdt2;

public class Worker extends Person implements Tax {


	public double payTax(double income,String start_time,String end_time) {
		if (income>=15) {
			 return (income *0.01);	
			
		}else return 0;
		
		 
	}
	String name;
	String citizenID;
	String phone;
	String email;
	double salary;
	double other_income;
	double income=salary + other_income;
		
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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


	@Override
	public String getBirthday() {
		// TODO Auto-generated method stub
		return super.getBirthday();
	}

	@Override
	public void setBirthday(String birthday) {
		// TODO Auto-generated method stub
		super.setBirthday(birthday);
	}

	@Override
	public String getGender() {
		// TODO Auto-generated method stub
		return super.getGender();
	}

	@Override
	public void setGender(String gender) {
		// TODO Auto-generated method stub
		super.setGender(gender);
	}

	@Override
	public String getBlood_type() {
		// TODO Auto-generated method stub
		return super.getBlood_type();
	}

	@Override
	public void setBlood_type(String blood_type) {
		// TODO Auto-generated method stub
		super.setBlood_type(blood_type);
	}

	@Override
	public String toString() {
		return "Worker [getBirthday()=" + getBirthday() + ", getGender()=" + getGender() + ", getBlood_type()="
				+ getBlood_type() + "]";
	}
		

	}


