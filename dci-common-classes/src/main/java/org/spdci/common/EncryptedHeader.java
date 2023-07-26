package org.spdci.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EncryptedHeader {
    private String algorithm;
    private String encryptionAlgorithm;
    private String keyIdentifier;
}
