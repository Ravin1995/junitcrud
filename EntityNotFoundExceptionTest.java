package example.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class EntityNotFoundExceptionTest {
    /**
     * Method under test: {@link EntityNotFoundException#EntityNotFoundException()}
     */
    @Test
    void testConstructor() {
        EntityNotFoundException actualEntityNotFoundException = new EntityNotFoundException();
        assertNull(actualEntityNotFoundException.getCause());
        assertEquals(0, actualEntityNotFoundException.getSuppressed().length);
        assertNull(actualEntityNotFoundException.getMessage());
        assertNull(actualEntityNotFoundException.getLocalizedMessage());
    }

    /**
     * Method under test: {@link EntityNotFoundException#EntityNotFoundException(String)}
     */
    @Test
    void testConstructor2() {
        EntityNotFoundException actualEntityNotFoundException = new EntityNotFoundException("An error occurred");
        assertNull(actualEntityNotFoundException.getCause());
        assertEquals(0, actualEntityNotFoundException.getSuppressed().length);
        assertEquals("An error occurred", actualEntityNotFoundException.getMessage());
        assertEquals("An error occurred", actualEntityNotFoundException.getLocalizedMessage());
    }
}

