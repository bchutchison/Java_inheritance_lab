import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("John", "EZ554", 31000);
    }

    @Test
    public void hasName() { assertEquals("John", databaseAdmin.getName());
    }

    @Test
    public void hasSalary() {
        assertEquals(31000, databaseAdmin.getSalary());
    }

    @Test
    public void hasNI(){
        assertEquals("EZ554", databaseAdmin.getNI());
    }

    @Test
    public void testRaiseSalary(){
        databaseAdmin.raiseSalary(100.00);
        assertEquals(31100, databaseAdmin.getSalary());
    }

    @Test
    public void testPaybonus(){
        assertEquals(310, databaseAdmin.payBonus(), 0.01);
    }

}





