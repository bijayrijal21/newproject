package MyApp.model;

public class Contact {
	String employee_id,empName,mobNum,phoneNum,homeNum,email,offNum;
	public Contact(){
		
	}
public Contact(String employee_id, String empName, String mobNum, String phoneNum, String homeNum, String email,
			String offNum) {
		super();
		this.employee_id = employee_id;
		this.empName = empName;
		this.mobNum = mobNum;
		this.phoneNum = phoneNum;
		this.homeNum = homeNum;
		this.email = email;
		this.offNum = offNum;
	}
public String getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getMobNum() {
		return mobNum;
	}
	public void setMobNum(String mobNum) {
		this.mobNum = mobNum;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getHomeNum() {
		return homeNum;
	}
	public void setHomeNum(String homeNum) {
		this.homeNum = homeNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getOffNum() {
		return offNum;
	}
	public void setOffNum(String offNum) {
		this.offNum = offNum;
	}
}
