package management;

public class Director extends Manager {
    private double budget;
    public Director(String name, String nin, int salary, String depName, double budget) {
        super(name, nin, salary, depName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
    public double addBonus(){
        return this.getSalary() / 100 * 2;
    }
}
