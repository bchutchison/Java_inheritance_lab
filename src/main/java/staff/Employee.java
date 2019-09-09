package staff;

public abstract class Employee {

    private String name;
    private String NI;
    private int salary;


    public Employee(String name, String NI, int salary) {
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getNI() {
        return NI;
    }



    public int getSalary() {
        return salary;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }

    }

    //raises salary
    public void raiseSalary(double raise) {
        this.salary += Math.abs(raise);
    }




    //pays bonus
    public double payBonus() {
        return this.salary / 100 * 1;
    }


}
