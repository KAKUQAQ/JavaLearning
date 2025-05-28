package FieldAndMethod.Field.Exer01;

public class EmployeeTest {
    public static void main(String[] args) {
//        创建实例
        Employee emp1 = new Employee();

        emp1.id = 1001;
        emp1.name = "Tom";
        emp1.age = 25;
        emp1.salary = 10000;
        System.out.println(emp1.id + " " + emp1.name + " " + emp1.age + " " + emp1.salary);

        Employee emp2 = new Employee();
        emp2.id = 1002;
        emp2.name = "Jerry";
        emp2.age = 22;
        emp2.salary = 10000;
        System.out.println(emp2.id + " " + emp2.name + " " + emp2.age + " " + emp2.salary);
    }
}
