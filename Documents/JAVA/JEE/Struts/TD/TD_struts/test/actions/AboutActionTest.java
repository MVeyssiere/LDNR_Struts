package actions;

import com.opensymphony.xwork2.ActionSupport;
import java.util.regex.Pattern;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Herbert Caffarel <herbert.caffarel@cicef.pro>
 */
public class AboutActionTest {

    AboutAction instance;

    public AboutActionTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new AboutAction();
    }

    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of execute method, of class AboutAction.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testExecute() throws Exception {
        System.out.println("execute");
        String expResult = ActionSupport.SUCCESS;
        String result = instance.execute();
        assertEquals(expResult, result);
    }

    /**
     * Test of getToday method, of class AboutAction.
     */
    @Test
    public void testGetToday() {
        System.out.println("getToday");
        assertTrue(Pattern.matches("^\\d{1,2}\\s\\w+\\s\\d{4}$",
                instance.getToday()));

    }

    /**
     * Test of getVisits method, of class AboutAction.
     */
    @Test
    public void testGetVisits() {
        System.out.println("getVisits");
        int expResult = instance.getVisits() + 1;
        try {
            instance.execute();
        } catch (Exception ex) {
        }
        int result = instance.getVisits();
        assertEquals(expResult, result);
    }

}
