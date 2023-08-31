package io.swagger.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.*;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "marriage_registry")
@Getter
@Setter
@Entity
public class MarriageRegistry {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "registration_number")
    private String registrationNumber;

    @Column(name = "date_of_marriage")
    private String dateOfMarriage;

    @Column(name = "bride_first_name")
    private String brideFirstName;

    @Column(name = "bride_family_name")
    private String brideFamilyName;

    @Column(name = "bride_national_id")
    private String brideNationalId;

    @Column(name = "groom_first_name")
    private String groomFirstName;

    @Column(name = "groom_family_name")
    private String groomFamilyName;

    @Column(name = "groom_national_id")
    private String groomNationalId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getDateOfMarriage() {
        return dateOfMarriage;
    }

    public void setDateOfMarriage(String dateOfMarriage) {
        this.dateOfMarriage = dateOfMarriage;
    }

    public String getBrideFirstName() {
        return brideFirstName;
    }

    public void setBrideFirstName(String brideFirstName) {
        this.brideFirstName = brideFirstName;
    }

    public String getBrideFamilyName() {
        return brideFamilyName;
    }

    public void setBrideFamilyName(String brideFamilyName) {
        this.brideFamilyName = brideFamilyName;
    }

    public String getBrideNationalId() {
        return brideNationalId;
    }

    public void setBrideNationalId(String brideNationalId) {
        this.brideNationalId = brideNationalId;
    }

    public String getGroomFirstName() {
        return groomFirstName;
    }

    public void setGroomFirstName(String groomFirstName) {
        this.groomFirstName = groomFirstName;
    }

    public String getGroomFamilyName() {
        return groomFamilyName;
    }

    public void setGroomFamilyName(String groomFamilyName) {
        this.groomFamilyName = groomFamilyName;
    }

    public String getGroomNationalId() {
        return groomNationalId;
    }

    public void setGroomNationalId(String groomNationalId) {
        this.groomNationalId = groomNationalId;
    }
}
