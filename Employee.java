package com.EmpManagement
 
public class Employee{
          Private int id;
          Private String name;
          Private int age;  
          Private String designation;
          Private String department;
          Private double salary;
         public int getId(){
              return id;
         }
         public void setId(){
              this.id = id;
         }
         public String getName(){
              return name;
         }
         public void setName(){
              this.name = name ;
          }
         public int getAge(){
              return age;
          }
         public void setAge(){
              this.age = age;
          } 
         public String getDesignation(){
              return designation;
          }
         public void setDesignation(){
              this.designation = designation;
          }

         public String getDepartment(){
              return department;
          }
         public void setDepartment(){
               this.department = department;
          }
          Public double getSalary(){
              return salary;
          }
         Public void setSalary(){
              this.salary = salary;
          }
         @Override
	 public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", desiganation=" + desiganation
				+ ", department=" + department + ", salary=" + salary + "]";
	}
        public Employee(int id, String name, int age, String desiganation, String department, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.department = department;
		this.salary = salary;
	}
}     
