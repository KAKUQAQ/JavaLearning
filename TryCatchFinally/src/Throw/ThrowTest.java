package Throw;

public class ThrowTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        try {
            s1.regist(-10);
            System.out.println(s1);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

class Student{
    int id;

    public void regist(int id) throws Exception {
        if(id > 0){
            this.id = id;
        }else {
            throw new BelowZeroException("非法id");
        }
    }

    @Override
    public String toString() {
        return "Throw.Student{" +
                "id=" + id +
                '}';
    }
}

