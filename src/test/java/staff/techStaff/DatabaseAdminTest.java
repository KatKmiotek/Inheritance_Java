package staff.techStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;
    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Anna", "SD0003", 1500);
    }
    @Test
    public void hasBonus(){
        assertEquals(15, databaseAdmin.addBonus(), 0.01);
    }
    @Test
    public void canGetPayRaise(){
        databaseAdmin.raiseSalary(databaseAdmin.addBonus());
        assertEquals(1515, databaseAdmin.getSalary());
    }

}