Package com.EmpManagement
 
Public class Employee{
          Private int id;
          Private String name;
          Private int age;  
          Private String designation;
          Private String department;
          Private double salary;
         public int getid(){
              return id;
         }
         Public void setid(){
              this.id = id;
         }
         Public String getname(){
              return name;
         }
         Public void setname(){
              this.name = name ;
          }
         Public int getage(){
              return age;
          }
         Public void setage(){
              this.age = age;
          } 
         Public String getdesignation(){
              return designation;
          }
         Public void setdesignation(){
              this.designation = designation;
          }

         Public String getdepartment(){
              return department;
          }
         Public void setdepartment(){
               this.department = department;
          }
          Public double getsalary(){
              return salary;
          }
         Public void setsalary(){
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
		this.desiganation = desiganation;
		this.department = department;
		this.salary = salary;
	}
}     
