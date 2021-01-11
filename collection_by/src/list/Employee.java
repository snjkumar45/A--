package list;

public class Employee {
private int EmployeeId;
private int EmployeeAge;
private String EmployeeName;
public Employee(int employeeId, int employeeAge, String employeeName) {
	super();
	EmployeeId = employeeId;
	EmployeeAge = employeeAge;
	EmployeeName = employeeName;
}
public Employee() {
	super();
	 
}
@Override
public String toString() {
	return "Employee [EmployeeId=" + EmployeeId + ", EmployeeAge=" + EmployeeAge + ", EmployeeName=" + EmployeeName
			+ "]";
}
public int getEmployeeId() {
	return EmployeeId;
}
public void setEmployeeId(int employeeId) {
	EmployeeId = employeeId;
}
public int getEmployeeAge() {
	return EmployeeAge;
}
public void setEmployeeAge(int employeeAge) {
	EmployeeAge = employeeAge;
}
public String getEmployeeName() {
	return EmployeeName;
}
public void setEmployeeName(String employeeName) {
	EmployeeName = employeeName;
}

}
