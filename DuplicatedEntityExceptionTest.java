package example.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class DuplicatedEntityExceptionTest {
    /**
     * Method under test: {@link DuplicatedEntityException#DuplicatedEntityException()}
     */
    @Test
    void testConstructor() {
        DuplicatedEntityException actualDuplicatedEntityException = new DuplicatedEntityException();
        assertNull(actualDuplicatedEntityException.getCause());
        assertEquals(0, actualDuplicatedEntityException.getSuppressed().length);
        assertNull(actualDuplicatedEntityException.getMessage());
        assertNull(actualDuplicatedEntityException.getLocalizedMessage());
    }

    /**
     * Method under test: {@link DuplicatedEntityException#DuplicatedEntityException(String)}
     */
    @Test
    void testConstructor2() {
        DuplicatedEntityException actualDuplicatedEntityException = new DuplicatedEntityException("An error occurred");
        assertNull(actualDuplicatedEntityException.getCause());
        assertEquals(0, actualDuplicatedEntityException.getSuppressed().length);
        assertEquals("An error occurred", actualDuplicatedEntityException.getMessage());
        assertEquals("An error occurred", actualDuplicatedEntityException.getLocalizedMessage());
    }
}

