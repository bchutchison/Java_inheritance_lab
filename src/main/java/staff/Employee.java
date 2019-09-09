package staff;

public abstract class Employee {

    private String name;
    private String NI;
    private int salary;


    public employee(String name, String NI, int salary) {
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getNI() {
        return NI;
    }

    public void setNI(String NI) {
        this.NI = NI;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    //raises salary
    public void raiseSalary(double raise) {
        this.salary += raise;
    }

    //pays bonus
    public double payBonus() {
        return this.salary / 100 * 1;
    }


}
