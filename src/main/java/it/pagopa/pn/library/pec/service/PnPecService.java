package it.pagopa.pn.library.pec.service;

import it.pagopa.pn.library.pec.pojo.PnGetMessagesResponse;
import reactor.core.publisher.Mono;

public interface PnPecService {
    /**
     * Method that sends a PEC mail
     * @param message : the message to send, eventual attachments included
     * @return Mono<String> : the message ID of the mail that has been sent.
     */
    Mono<String> sendMail(byte[] message);

    /**
     * Method that retrieves the messages not already read.
     * @param limit : the max number of messages to retrieve from the folder INBOX
     * @return PnGetMessagesResponse: the unread messages retrieved from the folder INBOX
     * for a maximum of items coherent with the set limit.
     */
    Mono<PnGetMessagesResponse> getUnreadMessages(int limit);

    /**
     * Method that marks a specific message inside the folder INBOX as read
     * @param messageID : the ID of the message to mark as read
     * @return Mono<Void>
     */
    Mono<Void> markMessageAsRead(String messageID);

    /**
     * Method that counts how many messages are present in the folder INBOX
     * @return the number of read and unread messages in the folder INBOX
     */
    Mono<Integer> getMessageCount();

    /**
     * Method that deletes a specific message contained in the folder INBOX
     * @param messageID : the ID of the message to delete
     * @return Mono<Void>
     */
    Mono<Void> deleteMessage(String messageID);
}
