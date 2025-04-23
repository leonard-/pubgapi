package com.github.gplnature.pubgapi.exception;

public class PubgClientException extends Exception {

    private int statusCode = -1;

    public PubgClientException() {
    }

    public PubgClientException(String message) {
        super(message);
    }

    public PubgClientException(String message, int statusCode) {
        super(message);
        this.statusCode = statusCode;
    }

    public PubgClientException(String message, Throwable cause) {
        super(message, cause);
    }

    public PubgClientException(Throwable cause) {
        super(cause);
    }

    public PubgClientException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public int getStatusCode() {
        return statusCode;
    }
}