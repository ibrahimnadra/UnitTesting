import com.knoldus.Person;
import com.knoldus.InvalidAgeException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    private Person notNullPerson;
    private Person nullPerson;

    //not thrown the exception because  If an exception is thrown
    // during setup, it can cause the tests to fail or behave in unexpected ways.
    @BeforeEach
    public void setUp(){
        try {
            notNullPerson = new Person("Nadra", 22, "nadra.ibrahim@knoldus.com");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage()) ;
        }
        nullPerson = new Person();
    }

    @Test
    public void testGetAge_givenNullAndNonNullValues_ShouldReturnExpectedValue(){
        //Test the getter method for a non-null value
        assertNotNull(notNullPerson.getAge());
        //Test the getter method for a null value
        assertNull(nullPerson.getAge());
    }

    @Test
    public void testGetName_givenNullAndNonNullValues_ShouldReturnExpectedValue(){
        //Test the getter method for a non-null value
        assertNotNull(notNullPerson.getName());
        //Test the getter method for a null value
        assertNull(nullPerson.getName());
    }

    @Test
    public void testGetEmail_givenNullAndNonNullValues_ShouldReturnExpectedValue(){
        //Test the getter method for a non-null value
        assertNotNull(notNullPerson.getEmail());
        //Test the getter method for a null value
        assertNull(nullPerson.getEmail());
    }

    @Test
    public void testSetAge_givenValidAndInvalidInputs_ShouldSetAgeOrThrowException(){

        //Test the setter method with a positive integer
        try {
            nullPerson.setAge(27);
        } catch (InvalidAgeException e) {
            throw new RuntimeException(e);
        }
        assertEquals(27, nullPerson.getAge());

        //Test the setter method with a negative integer
        Exception exception = assertThrows(InvalidAgeException.class, () -> nullPerson.setAge(-7));

        System.out.println(exception.getMessage());
        //Test the setter method with zero
        exception = assertThrows(InvalidAgeException.class, () -> nullPerson.setAge(0));
        System.out.println(exception.getMessage());
    }

}
