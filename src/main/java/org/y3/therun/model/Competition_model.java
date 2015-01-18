package org.y3.therun.model;

import java.net.URL;
import java.util.Date;
import org.y3.commons.model.IModel_model;

/**
 * <p>Title: org.y3.therun.model - Competition_model</p>
 * <p>Description: Competition model</p>
 * <p>Copyright: 2015</p>
 * <p>Organisation: IT-Happens.de</p>
 * @author Christian.Rybotycky
 */
public class Competition_model implements IModel_model {

    private String title;
    private Date startOfCompetition;
    private URL webPage;
    private URL registrationPage;
    private URL registrationsLogFile;
    private AgeClassesDefinition_model ageClassesDefinition;
    private Discipline_list disciplines;
    private Boolean started;
    private Boolean ended;

    public String getTitle() {
        return title;
    }

    public Discipline_list getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(Discipline_list disciplines) {
        this.disciplines = disciplines;
    }

    public Boolean getStarted() {
        return started;
    }

    public void setStarted(Boolean started) {
        this.started = started;
    }

    public Boolean getEnded() {
        return ended;
    }

    public void setEnded(Boolean ended) {
        this.ended = ended;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartOfCompetition() {
        return startOfCompetition;
    }

    public void setStartOfCompetition(Date startOfCompetition) {
        this.startOfCompetition = startOfCompetition;
    }

    public URL getWebPage() {
        return webPage;
    }

    public void setWebPage(URL webPage) {
        this.webPage = webPage;
    }

    public URL getRegistrationPage() {
        return registrationPage;
    }

    public void setRegistrationPage(URL registrationPage) {
        this.registrationPage = registrationPage;
    }

    public URL getRegistrationsLogFile() {
        return registrationsLogFile;
    }

    public void setRegistrationsLogFile(URL registrationsLogFile) {
        this.registrationsLogFile = registrationsLogFile;
    }

    public AgeClassesDefinition_model getAgeClassesDefinition() {
        return ageClassesDefinition;
    }

    public void setAgeClassesDefinition(AgeClassesDefinition_model ageClassesDefinition) {
        this.ageClassesDefinition = ageClassesDefinition;
    }

}
