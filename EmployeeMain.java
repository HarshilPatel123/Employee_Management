Package com.EmpManagement;

import java.util.Scanner;

Public class main{

     EmployeeData d = new EmployeeData();

     public static void menu(){
          System.out.println(\n1.Add Employee details);
          System.out.println(\n2.view Employee details);
          System.out.println(\n3.Update Employee details);
          System.out.println(\n4.delete Employee);
          System.out.println(\n5.view all Employee details);
          System.out.println(\n6.exit);
     }
     
     public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

        do{
            menu();
            int choice;
            System.out.println(Enter your choice);
            Choice = sc.nextInt();
            switch(choice){ 
            case 1:
                 System.out.println(Enter your choice);
                 d.addemployee();






        }




        }


     
 }


     
      



}