package io.xream.x7.common.exception;

public class BusyException extends RuntimeException {

    private String message;
    public BusyException(String message) {
        this.message  = message;
    }

    public String getMessage(){
        return this.message;
    }

}