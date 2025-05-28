package Abstract.Exer;

import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee[] emps = new Employee[2];
        emps[0] = new SalariedEmployee("Tom", 1001, new MyDate(1996,1,12), 18000);
        emps[1] = new HourlyEmployee("Jerry", 1002, new MyDate(1997, 3, 22), 300, 40);

        System.out.println("当前月份：");
        int month = sc.nextInt();

        for (int i = 0; i < emps.length; i++) {
            System.out.println(emps[i].toString());
            System.out.println("工资为：" + emps[i].earning());

            if (month == emps[i].getBirthday().getMonth()){
                System.out.println("生日快乐");
            }
        }
        sc.close();
    }
}
