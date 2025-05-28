package Abstract.Exer;

public class SalariedEmployee extends Employee {

    private double monthlySalary;

    public SalariedEmployee() {

    }

    @Override
    public double earning() {
        return monthlySalary;
    }


    public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }


    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public String toString(){
        return "SalariedEmployee [" + super.toString() + "]";
    }
}
