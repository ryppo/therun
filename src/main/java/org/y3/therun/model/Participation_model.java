package org.y3.therun.model;

import org.y3.commons.model.IModel_model;

/**
 * <p>Title: org.y3.therun.model - Participation_model</p>
 * <p>Description: Participation model</p>
 * <p>Copyright: 2015</p>
 * <p>Organisation: IT-Happens.de</p>
 * @author Christian.Rybotycky
 */
public class Participation_model implements IModel_model {
    
    private String participationNumber;
    private Long resultTime;
    private String participantName;
    private Boolean paymentDone;
    private Boolean certificationHandedOver;
    private Boolean noncompetitive;
    private Boolean participationCanceled;
    private Integer rankOverAll;
    private Integer ageClassRank;
    private Integer genderRank;
    private Integer genderAgeClassRank;
    private String comment;
    private Integer donationHospizInEuroCent;
    private Boolean registeredOnline;
    //related models
    private Contact_model contact;

    public String getParticipationNumber() {
        return participationNumber;
    }

    public void setParticipationNumber(String participationNumber) {
        this.participationNumber = participationNumber;
    }

    public Long getResultTime() {
        return resultTime;
    }

    public void setResultTime(Long resultTime) {
        this.resultTime = resultTime;
    }

    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public Boolean getPaymentDone() {
        return paymentDone;
    }

    public void setPaymentDone(Boolean paymentDone) {
        this.paymentDone = paymentDone;
    }

    public Boolean getCertificationHandedOver() {
        return certificationHandedOver;
    }

    public void setCertificationHandedOver(Boolean certificationHandedOver) {
        this.certificationHandedOver = certificationHandedOver;
    }

    public Boolean getNoncompetitive() {
        return noncompetitive;
    }

    public void setNoncompetitive(Boolean noncompetitive) {
        this.noncompetitive = noncompetitive;
    }

    public Boolean getParticipationCanceled() {
        return participationCanceled;
    }

    public void setParticipationCanceled(Boolean participationCanceled) {
        this.participationCanceled = participationCanceled;
    }

    public Integer getRankOverAll() {
        return rankOverAll;
    }

    public void setRankOverAll(Integer rankOverAll) {
        this.rankOverAll = rankOverAll;
    }

    public Integer getAgeClassRank() {
        return ageClassRank;
    }

    public void setAgeClassRank(Integer ageClassRank) {
        this.ageClassRank = ageClassRank;
    }

    public Integer getGenderRank() {
        return genderRank;
    }

    public void setGenderRank(Integer genderRank) {
        this.genderRank = genderRank;
    }

    public Integer getGenderAgeClassRank() {
        return genderAgeClassRank;
    }

    public void setGenderAgeClassRank(Integer genderAgeClassRank) {
        this.genderAgeClassRank = genderAgeClassRank;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getDonationHospizInEuroCent() {
        return donationHospizInEuroCent;
    }

    public void setDonationHospizInEuroCent(Integer donationHospizInEuroCent) {
        this.donationHospizInEuroCent = donationHospizInEuroCent;
    }

    public Boolean getRegisteredOnline() {
        return registeredOnline;
    }

    public void setRegisteredOnline(Boolean registeredOnline) {
        this.registeredOnline = registeredOnline;
    }

    public Contact_model getContact() {
        return contact;
    }

    public void setContact(Contact_model contact) {
        this.contact = contact;
    }

}
