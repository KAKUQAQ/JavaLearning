package Abstract.Exer;

public abstract class Employee {

    private String name;
    private int number;
    private MyDate birthday;

    public Employee() {

    }
    public Employee(String name, int number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public abstract double earning();

    public String toString() {
        return name + " , " + number + " , " + birthday.toDateString();
    }
}
