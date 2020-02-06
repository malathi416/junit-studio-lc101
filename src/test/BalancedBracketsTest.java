package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    BalancedBrackets test_Class;

//    @Before
//    public void createBracketObject() {
//        BalancedBrackets test_Class = new BalancedBrackets();
//    }

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("[]"));
    }

    //Testcase3:
    @Test
    public void stringWithBalancedBrackets() {
        assertTrue(test_Class.hasBalancedBrackets("[LaunchCode]"));
    }

    //Testcase4:
    @Test
    public void stringWithBalancedBracketInBetween() {
        assertTrue(test_Class.hasBalancedBrackets("Launch[Code]"));
    }
    //Testcase5:
    @Test
    public void stringWithBalancedBracketAtStart() {
        assertTrue(test_Class.hasBalancedBrackets("[]LaunchCode"));
    }

    //Testcase6:
    @Test
    public void stringWithOnlyOpeningBracket() {
        assertFalse(test_Class.hasBalancedBrackets("[LaunchCode"));
    }
    //TestCase7:
    @Test
    public void stringWithOnlyClosingBracket() {
        assertFalse(test_Class.hasBalancedBrackets("LaunchCode]"));
    }

    //TestCase8:
    @Test
    public void unOrderedBracketsBetweenString() {
        assertFalse(test_Class.hasBalancedBrackets("Launch]Code["));
    }

    //TestCase9:
    @Test
    public void stringWithBalancedBracketAtEnd() {
        assertTrue(test_Class.hasBalancedBrackets("LaunchCode[]"));
    }

}
