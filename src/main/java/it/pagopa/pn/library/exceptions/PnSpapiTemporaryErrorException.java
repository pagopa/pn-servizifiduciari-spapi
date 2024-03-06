package it.pagopa.pn.library.exceptions;

public class PnSpapiTemporaryErrorException extends Exception {
    public PnSpapiTemporaryErrorException(String message) {
        super(message);
    }

    public PnSpapiTemporaryErrorException(String message, Throwable cause) {
        super(message, cause);
    }
}
