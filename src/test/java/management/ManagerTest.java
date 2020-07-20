package management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerTest {
    Manager manager;
    @Before
    public void before(){
        manager = new Manager("Paul", "SD00001", 2000, "Product");
    }

    @Test
    public void getDepName() {
        assertEquals("Product", manager.getDepName());
    }
    @Test
    public void hasSalaryPayRaise(){
        manager.raiseSalary(manager.addBonus());
        assertEquals(2020, manager.getSalary());
    }
}