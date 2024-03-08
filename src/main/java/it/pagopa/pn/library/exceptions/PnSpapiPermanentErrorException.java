package it.pagopa.pn.library.exceptions;

public class PnSpapiPermanentErrorException extends RuntimeException {
    public PnSpapiPermanentErrorException(String message) {
        super(message);
    }

    public PnSpapiPermanentErrorException(String message, Throwable cause) {
        super(message, cause);
    }
}
