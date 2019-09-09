import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("John", "EZ554", 31000, "Marketing", 400000);
    }

    @Test
    public void hasName() {
        assertEquals("John", director.getName());
    }

    @Test
    public void getDeptName(){
        assertEquals("Marketing", director.getDeptName());
    }


    @Test
    public void hasSalary() {
        assertEquals(31000, director.getSalary());
    }

    @Test
    public void hasNI(){
        assertEquals("EZ554", director.getNI());
    }

    @Test
    public void testRaiseSalary(){
        director.raiseSalary(100.00);
        assertEquals(31100, director.getSalary());
    }

    @Test
    public void testPaybonus(){
        assertEquals(620, director.payBonus(), 0.01);
    }

    @Test
    public void hasBudget() {
        assertEquals(400000, director.getBudget(), 0.01);
    }

}
