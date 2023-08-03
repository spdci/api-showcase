package org.spdci.common;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

import org.spdci.enums.CREventType;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CRRecord {

    private List<Identifier> identifier;
    private HumanName name;
    private List<CRRelatedPerson> relatedPerson;
    private List<String> phoneNumber;
    private Sex sex;

    private LocalDateTime issuedDate;
    private String status;
    private String email;
    private boolean isEmailVerified;
    private LocalDateTime birthDate;
    private Address birthPlace;
    private boolean isPhoneNumberVerified;
    private List<Address> address;
    private List<String> nationalities;
    private LocalDateTime updatedAt;
    private AttributeNameValue attributeNameValue;

    private CREventType eventType;
    private String registrationNumber;
    private LocalDateTime registrationDate;
    private String linkRegistrationNumber;

    private LocalDateTime deathDate;
    private Address deathPlace;

    private String maritalStatus;
    private LocalDateTime marriageDate;
    private LocalDateTime divorceDate;


}
