import com.knoldus.EmptyStringException;
import com.knoldus.StringUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class StringUtilsTest {
    @Parameter(0)
    public String actualString;
    @Parameter(1)
    public String reverseExpectedResult;

    @Parameter(2)
    public Boolean isEmptyExpectedResult;

    @Parameter(3)
    public Boolean isPalindromeExpectedResult;

    private StringUtils stringUtils;

    @Before
    public void setUp() throws Exception{
        stringUtils = new StringUtils();
    }

    // creates the test data
    @Parameters(name = "{0}")
    public static Collection<Object[]> data() {
        //Test the method with an  empty string, palindromic string and non-empty string
        Object[][] data = new Object[][]{{"", "hello", true, true}, {"naman", "naman", false, true}, {"nadra", "ardan", false, false}};
        return Arrays.asList(data);
    }

    @Test
    public void testReverse_givenString_shouldReturnReversedString(){
        try {
            assertEquals("Testing reverse()", stringUtils.reverse(actualString), reverseExpectedResult);
        } catch (EmptyStringException e) {
            System.out.println(e.getMessage() + " Reversing the string is not possible.");
        }
    }

    @Test
    public void testIsEmpty_givenString_shouldReturnBoolean(){
        assertEquals("Testing isEmpty()", stringUtils.isEmpty(actualString), isEmptyExpectedResult);
    }

    @Test
    public void testIsPalindrome_givenString_shouldReturnBoolean(){
        try {
            assertEquals("Testing isPalindrome()", stringUtils.isPalindrome(actualString), isPalindromeExpectedResult);
        } catch (EmptyStringException e) {
            System.out.println(e.getMessage() + " Finding palindrome is not possible.");
        }
    }

}
