package staff.management;

import staff.Employee;

public class Manager extends Employee {

    private String depName;
    public Manager(String name, String nin, int salary, String depName) {
        super(name, nin, salary);
        this.depName = depName;
    }

    public String getDepName() {
        return depName;
    }
}
