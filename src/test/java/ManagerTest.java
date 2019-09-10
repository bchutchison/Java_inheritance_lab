import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("John", "EZ554", 31000, "Marketing");
    }

    @Test
    public void hasName() {
        assertEquals("John", manager.getName());
    }

    @Test
    public void canChangeName(){
        manager.setName("Pete");
        assertEquals("Pete",manager.getName());
    }

    @Test
    public void getDeptName(){
        assertEquals("Marketing", manager.getDeptName());
    }


    @Test
    public void hasSalary() {
        assertEquals(31000, manager.getSalary());
    }

    @Test
    public void hasNI(){
        assertEquals("EZ554", manager.getNI());
    }

    @Test
    public void testRaiseSalary(){
        manager.raiseSalary(-100.00);
        assertEquals(31100, manager.getSalary());
    }

    @Test
    public void testPayBonus(){
        assertEquals(310, manager.payBonus(), 0.01);
    }

}
