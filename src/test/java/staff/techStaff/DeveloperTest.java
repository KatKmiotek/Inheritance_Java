package staff.techStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeveloperTest {

    Developer developer;
    @Before
    public void before(){
        developer = new Developer("John", "SD0002", 1000);
    }
    @Test
    public void hasBonus(){
        assertEquals(10, developer.addBonus(), 0.01);
    }
    @Test
    public void canGetPayRaise(){
        developer.raiseSalary(developer.addBonus());
        assertEquals(1010, developer.getSalary());
    }
    @Test
    public void canChangeName(){
        developer.setName("Max");
        assertEquals("Max", developer.getName());
    }
    @Test
    public void cantChangeName(){
        developer.setName("");
        assertEquals("John", developer.getName());
    }
    @Test
    public void cantHaveBonus(){
        developer.raiseSalary(-20);
        assertEquals(1000, developer.getSalary());
    }
}