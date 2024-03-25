package it.pagopa.pn.library.sign.service;

import it.pagopa.pn.library.sign.pojo.PnSignDocumentResponse;
import reactor.core.publisher.Mono;

public interface PnSignService {
    /**
     * Method to sign a document of PDF type and to eventually add a temporal marker to it.
     * @param fileBytes : the document to sign
     * @param timestamping : a check on the need for a temporal marker
     * @return PnSignDocumentResponse : a class containing the result of the operation and
     * the signed document, if the timestamping variable is set to true, it adds the
     * temporal marker as well.
     */
    Mono<PnSignDocumentResponse> signPdfDocument(byte[] fileBytes, Boolean timestamping);

    /**
     * Method to sign a document of XML type and to eventually add a temporal marker to it.
     * @param fileBytes : the document to sign
     * @param timestamping : a check on the need for a temporal marker
     * @return PnSignDocumentResponse : a class containing the result of the operation and
     * the signed document, if the timestamping variable is set to true, it adds the
     * temporal marker as well.
     */
    Mono<PnSignDocumentResponse> signXmlDocument(byte[] fileBytes, Boolean timestamping);

    /**
     * Method to sign a document of a type different from XML and PDF and to eventually add a
     * temporal marker to it.
     * @param fileBytes : the document to sign
     * @param timestamping : a check on the need for a temporal marker
     * @return PnSignDocumentResponse : a class containing the result of the operation and
     * the signed document, if the timestamping variable is set to true, it adds the
     * temporal marker as well.
     */
    Mono<PnSignDocumentResponse> pkcs7Signature(byte[] fileBytes, Boolean timestamping);
}
