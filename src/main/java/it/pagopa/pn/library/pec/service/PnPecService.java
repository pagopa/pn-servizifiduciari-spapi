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
     * @param limit : the max number of messages to retrieve
     * @return PnGetMessagesResponse: the unread messages for a maximum of items coherent with
     * the set limit.
     */
    Mono<PnGetMessagesResponse> getUnreadMessages(int limit);

    /**
     * Method that marks a specific message as read
     * @param messageID : the ID of the message to mark as read
     * @return Mono<Void>
     */
    Mono<Void> markMessageAsRead(String messageID);

    /**
     * Method that counts how many messages are present in that specific mailbox
     * @return the number of read and unread messages in the mailbox
     */
    Mono<Integer> getMessageCount();

    /**
     * Method that deletes a specific message
     * @param messageID : the ID of the message to delete
     * @return Mono<Void>
     */
    Mono<Void> deleteMessage(String messageID);
}
