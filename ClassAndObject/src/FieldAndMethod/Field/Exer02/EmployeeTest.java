package FieldAndMethod.Field.Exer02;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee();

        emp1.id = 1001;
        emp1.name = "John Doe";
        emp1.age = 25;
        emp1.salary = 10000;
        emp1.birthday = new MyDate();
        emp1.birthday.year = 1996;
        emp1.birthday.month = 1;
        emp1.birthday.day = 12;

        System.out.println(emp1.id + " " + emp1.name + " " + emp1.age + " " + emp1.salary + " " + emp1.birthday.year + " " + emp1.birthday.month + " " + emp1.birthday.day);
    }
}
