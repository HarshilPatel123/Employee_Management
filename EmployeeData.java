package com.EmpManagement;

import java.util.*;

class EmployeeData {
     HashSet<Employee> empset = new HashSet<Employee>();
    
     int id;
     String name;
     int age;
     String designation;
     String department;
     double salary;
    
     Employee emp1 = new Employee(101,"Harsh",24,"Devloper","IT",37000);
     Employee emp1 = new Employee(102,"Raj",28,"Admin","Devops",49000);
     Employee emp1 = new Employee(103,"rishi",26,"Devloper","IT",28000);
     Employee emp1 = new Employee(104,"Paresh",29,"Tester","Soft eng.",37000);
     Employee emp1 = new Employee(105,"Harshil",23,"Devloper","Devops",57000);
     Employee emp1 = new Employee(106,"Shubham",25,"Sepervisor","IT",51000);

     Scanner sc = new Scanner(System.in);

     Public EmployeeData(){
        
          empset.add(emp1);
          empset.add(emp1);
          empset.add(emp1);
          empset.add(emp1);
          empset.add(emp1);
          empset.add(emp1);
}

        public void viewAllEmp() {
		for(Employee emp:empset) {
			System.out.println(emp);
		}
	}
	//view employee based on there id

	public void viewEmp(){
		
		System.out.println("Enter id: ");
		id=sc.nextInt();
                boolean found = false;
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				System.out.println(emp);
				found=true;
			}
			
		}
		if(!found) {
			System.out.println("Employee with this id is not present");
		}
	}
	//update the employee details

	public void updateEmp() {
		System.out.println("Enter id: ");
		id=sc.nextInt();
		boolean found=false;
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				System.out.println("Enter new name: ");
				name=sc.next();
				System.out.println("Enter new Salary");
				sal=sc.nextDouble();
				emp.setName(name);
				emp.setSalary(sal);
				System.out.println("Updated Details of employee are: ");
				System.out.println(emp);
				found=true;
			}
		}
		if(!found) {
			System.out.println("Employee is not present");
		}
		else {
			System.out.println("Employee details updated successfully !!");
		}
	}
	//delete employee datails

	public void deleteEmp() {
		System.out.println("Enter id");
		id=sc.nextInt();
		boolean found=false;
		Employee empdelete=null;
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				empdelete=emp;
				found=true;
			}
		}
		if(!found) {
			System.out.println("Employee is not present");
		}
		else {
			empset.remove(empdelete);
			System.out.println("Employee deleted successfully!!");
		}
	}
	//add employee

	public void addEmp() {
		System.out.println("Enter id:");
		id=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("enter Desiganation");
		desiganation=sc.next();
		System.out.println("Enter Department");
		department=sc.next();
		System.out.println("Enter sal");
		sc.nextDouble();
		
		Employee emp=new Employee(id, name, age, desiganation, department, sal);
		
		empset.add(emp);
		System.out.println(emp);
		System.out.println("Employtee addeed successsfully");
		
	}

}
