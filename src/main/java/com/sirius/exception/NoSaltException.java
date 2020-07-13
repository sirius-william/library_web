/**
 * Demo class
 *
 * @author Sirius
 * @date 2020-07-13 19:25
 */
package com.sirius.exception;

public class NoSaltException extends Exception{
    public NoSaltException() {
        super();
    }

    public NoSaltException(String message) {
        super(message);
    }
}
