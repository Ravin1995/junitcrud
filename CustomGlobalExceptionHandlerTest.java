package example.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;

class CustomGlobalExceptionHandlerTest {
    /**
     * Method under test: {@link CustomGlobalExceptionHandler#handleMethodArgumentNotValid(MethodArgumentNotValidException, HttpHeaders, HttpStatus, WebRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testHandleMethodArgumentNotValid() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Constructor must not be null
        //   See https://diff.blue/R013 to resolve this issue.

        CustomGlobalExceptionHandler customGlobalExceptionHandler = new CustomGlobalExceptionHandler();
        MethodParameter parameter = new MethodParameter((Constructor<?>) null, 1);

        MethodArgumentNotValidException ex = new MethodArgumentNotValidException(parameter,
                new BindException("Target", "Object Name"));

        HttpHeaders headers = new HttpHeaders();
        customGlobalExceptionHandler.handleMethodArgumentNotValid(ex, headers, HttpStatus.CONTINUE,
                new ServletWebRequest(new MockHttpServletRequest()));
    }

    /**
     * Method under test: {@link CustomGlobalExceptionHandler#handleMethodArgumentNotValid(MethodArgumentNotValidException, HttpHeaders, HttpStatus, WebRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testHandleMethodArgumentNotValid2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.springframework.core.MethodParameter.getParameterIndex()" because "this.parameter" is null
        //       at example.exception.CustomGlobalExceptionHandler.handleMethodArgumentNotValid(CustomGlobalExceptionHandler.java:29)
        //   See https://diff.blue/R013 to resolve this issue.

        CustomGlobalExceptionHandler customGlobalExceptionHandler = new CustomGlobalExceptionHandler();
        MethodArgumentNotValidException ex = new MethodArgumentNotValidException(null,
                new BindException("Target", "Object Name"));

        HttpHeaders headers = new HttpHeaders();
        customGlobalExceptionHandler.handleMethodArgumentNotValid(ex, headers, HttpStatus.CONTINUE,
                new ServletWebRequest(new MockHttpServletRequest()));
    }

    /**
     * Method under test: {@link CustomGlobalExceptionHandler#handleConstraintViolationException(Exception, WebRequest)}
     */
    @Test
    void testHandleConstraintViolationException() {
        CustomGlobalExceptionHandler customGlobalExceptionHandler = new CustomGlobalExceptionHandler();
        Exception ex = new Exception();
        ResponseEntity<Object> actualHandleConstraintViolationExceptionResult = customGlobalExceptionHandler
                .handleConstraintViolationException(ex, new ServletWebRequest(new MockHttpServletRequest()));
        assertNull(actualHandleConstraintViolationExceptionResult.getBody());
        assertEquals(HttpStatus.BAD_REQUEST, actualHandleConstraintViolationExceptionResult.getStatusCode());
        assertTrue(actualHandleConstraintViolationExceptionResult.getHeaders().isEmpty());
    }

    /**
     * Method under test: {@link CustomGlobalExceptionHandler#handleConstraintViolationException(Exception, WebRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testHandleConstraintViolationException2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Exception.getMessage()" because "ex" is null
        //       at example.exception.CustomGlobalExceptionHandler.handleConstraintViolationException(CustomGlobalExceptionHandler.java:49)
        //   See https://diff.blue/R013 to resolve this issue.

        CustomGlobalExceptionHandler customGlobalExceptionHandler = new CustomGlobalExceptionHandler();
        customGlobalExceptionHandler.handleConstraintViolationException(null,
                new ServletWebRequest(new MockHttpServletRequest()));
    }
}

