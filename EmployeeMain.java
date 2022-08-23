package com.EmpManagement;

import java.util.Scanner;

public class main{

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
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch(choice){ 
            case 1:
                 System.out.println("Add Employee Details");
                 d.addEmp();
                 break;
            case 2:
                 System.out.println("View Employee Details");
                 d.viewEmp();
                 break;
            case 3:
                 System.out.println("Update Employee Details");
                 d.updateEmp();
                 break;
            case 4:
                 System.out.println("Delete Employee Details");
                 d.deleteEmp();
                 break;
            case 5:
                 System.out.println("View all Employee Details");
                 d.viewAllEmp();
                 break;
             case 6:
                 System.out.println("Thanks for using Application");
                 System.exit(0);
             default:
                 System.out.println("Please enter valid choice")
                 break;
         }

        }while(true);
    } 
}
