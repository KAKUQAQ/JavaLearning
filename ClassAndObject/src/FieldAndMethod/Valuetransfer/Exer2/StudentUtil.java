package FieldAndMethod.Valuetransfer.Exer2;

public class StudentUtil {

//    打印制定年级学生信息
    public void printStudentWithIndex(Student[] students, int state) {
        for (int i = 0; i < students.length; i++) {
            if (state == students[i].state) {
                Student stu = students[i];
                System.out.println(stu.show());
            }
        }
    }
//    遍历指定学生数组
    public void printStudentIndex(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].show());
        }
    }

//    排序
    public  void sortStudent(Student[] students) {
        for (int i = 0; i < students.length -1; i ++){
            for (int j = 0; j < students.length - 1 - i; j++){
                if (students[j].state > students[j+1].state || students[j].state == students[j+1].state && students[j]. score > students[j+1].score){
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < students.length; i++){
            System.out.println(students[i].show());
        }
    }

}
