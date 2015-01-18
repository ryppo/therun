package org.y3.therun.model;

import java.util.Date;
import org.y3.commons.model.IModel_model;

/**
 * <p>Title: org.y3.therun.model - Discipline_model</p>
 * <p>Description: Discipline model</p>
 * <p>Copyright: 2015</p>
 * <p>Organisation: IT-Happens.de</p>
 * @author Christian.Rybotycky
 */
public class Discipline_model implements IModel_model {

    private String name;
    private String length;
    private Date startOfDiscipline;
    private Boolean started;
    private Boolean ended;
    private Long priceInEuroCent;

    public static enum durationFormat {
        HH_mm_ss_SSS, HH_mm_ss, mm_ss
    }
    
    private durationFormat formatOfDuration = durationFormat.HH_mm_ss;

    public String getName() {
        return name;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public Date getStartOfDiscipline() {
        return startOfDiscipline;
    }

    public void setStartOfDiscipline(Date startOfDiscipline) {
        this.startOfDiscipline = startOfDiscipline;
    }

    public Long getPriceInEuroCent() {
        return priceInEuroCent;
    }

    public void setPriceInEuroCent(Long priceInEuroCent) {
        this.priceInEuroCent = priceInEuroCent;
    }

    public durationFormat getFormatOfDuration() {
        return formatOfDuration;
    }

    public void setFormatOfDuration(durationFormat formatOfDuration) {
        this.formatOfDuration = formatOfDuration;
    }


}
