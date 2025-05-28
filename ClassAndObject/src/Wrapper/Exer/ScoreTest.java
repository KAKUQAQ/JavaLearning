package Wrapper.Exer;

import java.util.Scanner;
import java.util.Vector;

public class ScoreTest {
    public static void main(String[] args) {

        Vector v = new Vector();

        Scanner sc = new Scanner(System.in);

        int maxScore = 0;

        while(true) {
            System.out.println("输入成绩(以负数代表输入结束)");
            int intScore = sc.nextInt();

            if (intScore < 0){
                break;
            }
            // 添加成绩到v中
            v.addElement(intScore);

            // 获取最高分
            if (intScore > maxScore) {
                maxScore = intScore;
            }
        }
        System.out.println("Highest:" + maxScore);
        // 遍历
        for (int i = 0; i < v.size(); i++) {
            Object objScore = v.elementAt(i);
            // 拆箱
            int score = (Integer) objScore;
            char grade = ' ';
            if(maxScore - score <= 10){
                grade = 'A';
            }else if(maxScore - score <= 20){
                grade = 'B';
            }else if(maxScore - score <= 30){
                grade = 'C';
            }else {
                grade = 'D';
            }
            System.out.println("Student:" + i + " score:" + score + " grade:" + grade);
        }


        sc.close();
    }
}
