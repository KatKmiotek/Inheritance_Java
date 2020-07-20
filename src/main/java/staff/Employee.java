package staff;

public abstract class Employee {
    private String name;
    private String nin;
    private int salary;

    public Employee(String name, String nin, int salary){
        this.name = name;
        this.nin = nin;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNin() {
        return nin;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        if(name != "") {
            this.name = name;
        }
    }

    public void raiseSalary(double money){
        if(money > 0) {
            salary += money;
        }
    }
    public double addBonus(){
        return salary / 100;
    }
}
