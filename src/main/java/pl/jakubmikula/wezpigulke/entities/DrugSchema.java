package pl.jakubmikula.wezpigulke.entities;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;

/**
 * @author U519526, 9/16/2020
 */

@Entity
@Getter
public class DrugSchema {

    public DrugSchema() {
     }

    @Id
    @GeneratedValue
    private long id;

    @OneToOne
    private Drug drug;
    private Timestamp timestamp;
    private long period;
    private int numberOfDays;
    private int dose;

    public DrugSchema(Drug drug, Timestamp timestamp, long period, int numberOfDays, int dose) {
        this.drug = drug;
        this.timestamp = timestamp;
        this.period = period;
        this.numberOfDays = numberOfDays;
        this.dose = dose;
    }
}
