package it.pagopa.pn.library.sign.pojo;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
/**
 * A class that represents the signed document and the result of the operation
 */
public class PnSignDocumentResponse {

    @ToString.Exclude
    byte[] signedDocument;
}
