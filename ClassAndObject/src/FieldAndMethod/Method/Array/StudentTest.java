package FieldAndMethod.Method.Array;

public class StudentTest {
    public static void main(String[] args) {

//        创建数组
        Student[] students = new Student[20];
//        使用循环给元素赋值
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();

            //        给每一个学生对象的属性赋值
            students[i].number = i +1;
            students[i].state = (int)(Math.random() * 6 + 1);
            students[i].score = (int)(Math.random() * 101);
        }

//        三年级学生信息
//        for (int i = 0; i < students.length; i++) {
//            if (students[i].state == 3) {
//                Student stu = students[i];
//                System.out.println(stu.show());
//            }
//        }
        StudentUtil util = new StudentUtil();
        util.printStudentWithIndex(students, 3);

//        冒泡排序成绩、遍历信息
        util.printStudentIndex(students);
        System.out.println("*************");
//        for (int i = 0; i < students.length - 1; i++) {
//            for (int j = 0; j < students.length - 1 - i; j++) {
//                if(students[j].score > students[j + 1].score) {
//                    Student temp = students[j];
//                    students[j] = students[j+1];
//                    students[j+1] = temp;
//                }
//            }
//        }
        util.sortStudent(students);
//        for (int i = 0; i < students.length; i++) {
//            System.out.println(students[i].show());
//        }

    }
}
