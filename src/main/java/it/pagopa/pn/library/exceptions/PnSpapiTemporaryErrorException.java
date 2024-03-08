package it.pagopa.pn.library.exceptions;

public class PnSpapiTemporaryErrorException extends RuntimeException {
    public PnSpapiTemporaryErrorException(String message) {
        super(message);
    }

    public PnSpapiTemporaryErrorException(String message, Throwable cause) {
        super(message, cause);
    }
}
