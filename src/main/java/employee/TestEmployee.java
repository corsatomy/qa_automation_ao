package employee;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEmployee {


    Employee em = new Employee("Sam", "Wilsson", 19, "Waiter");

    @Test
    public void validateName() {
        assertEquals("Sam", em.getName());
    }

    @Test
    public void validateSurname() {
        assertEquals("Wilsson", em.getSurname());
    }

    @Test
    public void validateAge() {
        assertEquals(19, em.getAge());
    }

    @Test
    public void validateRole() {
        assertEquals("Waiter", em.getRole());
    }
}
    


