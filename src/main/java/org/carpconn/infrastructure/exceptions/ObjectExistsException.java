package org.carpconn.infrastructure.exceptions;

/**
 * ObjectExistsException
 *
 * @author carpc on 11/27/2021
 */
public class ObjectExistsException extends Exception {
    public ObjectExistsException() {
        super();
    }

    public ObjectExistsException(String message) {
        super(message);
    }
}
