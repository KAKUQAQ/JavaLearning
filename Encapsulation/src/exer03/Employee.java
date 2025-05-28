package exer03;

public class Employee {

    private String name;
    private String gender;
    private int age;
    private String phoneNumber;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String info(){
        return name + "\t" + gender + "\t" + age + "\t" + phoneNumber;
    }
}
