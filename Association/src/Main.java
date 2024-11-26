import Vehicle_Person_1_To_Many.*;
import Student_Corse_1_to_Many.*;
import Account_Customer_1_to_Many.*;
import Bank_Employee_1_to_Many.*;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Farhan",101,20222);
        Employee e2 = new Employee("Chowdhyr",102,3453);
        Employee e3 = new Employee("Fahmida",103,533);
        Employee e4 = new Employee("Jerin",104,4253);

        Bank b1 = new Bank("islami Bank LTD", "khilgaon", 3);

        b1.addEmployee(e1);
        b1.addEmployee(e2);
        b1.addEmployee(e3);

        b1.display();
        System.out.println("============Delete===========");
        b1.deleteEmployee(e2);
        b1.display();
        System.out.println("============Search===========");
        b1.searchEmployee(e2);


        // Account Customer

        Account a1 = new Account(101, 1500);
        Account a2 = new Account(102, 1600);
        Account a3 = new Account(103, 1700);
        Account a4 = new Account(104, 1900);
        Account a5 = new Account(105, 1800);

        Customer customer1 = new Customer("Bruce", 501, 2);
        Customer customer2 = new Customer("Lee", 502, 2);

        customer1.addAccount(a1);
        customer1.addAccount(a2);

        customer1.display();
        System.out.println("=======================");

        customer2.addAccount(a4);

        customer1.performTransfer(a1, customer2,a4,500);
        customer1.display();
        customer2.display();

        // Vehicle person
        /*
        Vehicle v1 = new Vehicle("audi","A23");
        Vehicle v2 = new Vehicle("BMW","B34");
        Vehicle v3 = new Vehicle("Toyota","T23");
        Vehicle v4 = new Vehicle("Civic","2019");

        Person p1 = new Person("Farhan",101,3);

        p1.addVehicles(v1);
        p1.addVehicles(v2);
        p1.addVehicles(v3);
        p1.display();
        System.out.println("============Delete===========");
        p1.deleteVehicles(v2);
        p1.display();
        System.out.println("============Search===========");
        p1.searchVehicles(v2);
        */

        // Student Course
        /*
        Course c1 = new Course("physics",101);
        Course c2 = new Course("math",102);
        Course c3 = new Course("chemistry",103);
        Course c4 = new Course("java",104);

        Student s1 = new Student("Farhan",501,4);
        Student s2 = new Student("Chowdury",502,2);

        s1.addCourse(c1);
        s1.addCourse(c2);
        s1.addCourse(c3);
        s1.addCourse(c4);
        s1.display();

        System.out.println("======================\n");

        s1.searchCourse(c3);
        System.out.println("======================\n");
        s1.deleteCourse(c3);
        System.out.println("======================\n");
        s1.searchCourse(c3);
         */

    }
}