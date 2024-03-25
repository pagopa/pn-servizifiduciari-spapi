package it.pagopa.pn.library.pec.pojo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
/**
 * Class that represents the messages in the folder INBOX, their number and the result of the operation
 */
public class PnGetMessagesResponse {

    PnListOfMessages pnListOfMessages;
    int numOfMessages;

}
