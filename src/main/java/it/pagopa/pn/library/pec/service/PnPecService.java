package it.pagopa.pn.library.pec.service;

import it.pagopa.pn.library.exceptions.PnSpapiPermanentErrorException;
import it.pagopa.pn.library.exceptions.PnSpapiTemporaryErrorException;
import it.pagopa.pn.library.pec.pojo.PnGetMessagesResponse;
import reactor.core.publisher.Mono;

public interface PnPecService {
    Mono<Void> sendMail(byte[] message) throws PnSpapiPermanentErrorException, PnSpapiTemporaryErrorException;

    Mono<PnGetMessagesResponse> getUnreadMessages(int limit) throws PnSpapiPermanentErrorException, PnSpapiTemporaryErrorException;

    Mono<Void> markMessageAsRead(String messageID) throws PnSpapiPermanentErrorException, PnSpapiTemporaryErrorException;

    Mono<Integer> getMessageCount() throws PnSpapiPermanentErrorException, PnSpapiTemporaryErrorException;

    Mono<Void> deleteMessage(String messageID) throws PnSpapiPermanentErrorException, PnSpapiTemporaryErrorException;
}
