package exer03;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[2];

        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
            System.out.println("---------Add employee---------");

            System.out.println("name: ");
            String name = sc.next();
            System.out.println("gender: ");
            String gender = sc.next();
            System.out.println("age: ");
            int age = sc.nextInt();
            System.out.println("phoneNumber: ");
            String phoneNumber = sc.next();

            employees[i].setName(name);
            employees[i].setGender(gender);
            employees[i].setAge(age);
            employees[i].setPhoneNumber(phoneNumber);
        }

        System.out.println("-------Employee List-------");
        System.out.println("id\tname\tgender\tage\tphoneNumber");
        for (int i = 0; i < employees.length; i++) {
            System.out.println((i + 1) + "\t" + employees[i].info());
        }
    }
}
