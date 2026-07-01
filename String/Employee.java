class Employee{
	int emp_id;
	String emp_name;
	double salary;
	String department;
	
	
	Employee(int emp_id , String emp_name, double salary, String department){
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.salary= salary;
		this.department= department;
	}
	
	public String toString(){
		return "Employee Id :"+emp_id+"\nEmployee Name: "+emp_name+"\nEmployee Salary: "+salary+"\nEmployee department: "+department;
	}
	
	public static void main(String[] args){
		Employee e1 = new Employee(1, "akshay", 23423, "development");
		
		
		System.out.println(e1);
	}
}