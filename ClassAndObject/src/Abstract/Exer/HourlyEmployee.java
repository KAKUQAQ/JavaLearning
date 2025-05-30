package Abstract.Exer;

public class HourlyEmployee extends Employee {

    private double wage;
    private int hour;
    public HourlyEmployee() {

    }

    public HourlyEmployee(String name, int number, MyDate birthday, double wage, int hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public double earning() {
        return wage * hour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee [" + super.toString() + "]";
    }
}
