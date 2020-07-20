package staff.management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DirectorTest {
    Director director;
    @Before
    public void before(){
        director = new Director("Julia", "SD0004", 3000, "Product", 10000);
    }
    @Test
    public void hasBudget(){
        assertEquals(10000, director.getBudget(), 0.01);
    }
    @Test
    public void hasBiggerBonus(){
        director.raiseSalary(director.addBonus());
        assertEquals(3060, director.getSalary());
    }
}