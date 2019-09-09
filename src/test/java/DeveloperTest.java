import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("John", "EZ554", 31000);
    }

    @Test
    public void hasName() {
        assertEquals("John", developer.getName());
    }

    @Test
    public void hasSalary() {
        assertEquals(31000, developer.getSalary());
    }

    @Test
    public void hasNI(){
        assertEquals("EZ554", developer.getNI());
    }

    @Test
    public void testRaiseSalary(){
        developer.raiseSalary(100.00);
        assertEquals(31100, developer.getSalary());
    }

    @Test
    public void testPaybonus(){
        assertEquals(310, developer.payBonus(), 0.01);
    }

}
