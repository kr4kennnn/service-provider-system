package project101;

import org.junit.Test;
import org.junit.BeforeClass;
import static junit.framework.TestCase.*;

public class CustomerTest {

    public CustomerTest() {
    }

    private static Customer bx;

    @BeforeClass
    public static void setUpClass() {
        bx = new Customer("644232", "Bakhtiyar", "05415555555", "x@gmail.com") {
        };
    }

    @Test
    public void testGetTel() {
        System.out.println("Testing getTel");
        String expResult = "05415555555";
        String result = bx.getTel();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetTel() {
        System.out.println("Testing setTel");
        String tel = "05410000000";
        bx.setTel(tel);
        assertEquals("05410000000", bx.getTel());
    }

    @Test
    public void testGetMail() {
        System.out.println("Testing getMail");
        String expResult = "x@gmail.com";
        String result = bx.getMail();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetMail() {
        System.out.println("Testing setMail");
        String mail = "new@gmail.com";
        bx.setMail(mail);
        assertEquals("new@gmail.com", bx.getMail());
    }

    @Test
    public void testGetName() {
        System.out.println("Testing getName");
        String expResult = "Bakhtiyar";
        String result = bx.getName();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetName() {
        System.out.println("Testing setName");
        String name = "Ali";
        bx.setName(name);
        assertEquals(name, bx.getName());
    }
    
    @Test
    public void testToString() {
        System.out.println("Testing toString");
        String expResult = "CITIZENSHIP NR: " + "644232" + "\nCUSTOMER NAME: " + "Bakhtiyar";
        String result = bx.toString();
        assertEquals(expResult, result);
    }

}
