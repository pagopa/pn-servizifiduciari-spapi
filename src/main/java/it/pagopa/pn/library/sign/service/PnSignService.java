package it.pagopa.pn.library.sign.service;

import it.pagopa.pn.library.exceptions.PnSpapiPermanentErrorException;
import it.pagopa.pn.library.exceptions.PnSpapiTemporaryErrorException;
import it.pagopa.pn.library.sign.pojo.PnSignDocumentResponse;
import reactor.core.publisher.Mono;

public interface PnSignService {
    Mono<PnSignDocumentResponse> signPdfDocument(byte[] fileBytes, Boolean timestamping) throws PnSpapiPermanentErrorException, PnSpapiTemporaryErrorException;

    Mono<PnSignDocumentResponse> signXmlDocument(byte[] fileBytes, Boolean timestamping) throws PnSpapiPermanentErrorException, PnSpapiTemporaryErrorException;

    Mono<PnSignDocumentResponse> pkcs7Signature(byte[] fileBytes, Boolean timestamping) throws PnSpapiPermanentErrorException, PnSpapiTemporaryErrorException;
}
