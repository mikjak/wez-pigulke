package pl.jakubmikula.wezpigulke.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import pl.jakubmikula.wezpigulke.Unit;

/**
 * @author U519526
 */

@Entity
@Table(name = "drugs")
public class Drug {

    @Id
    @GeneratedValue()
    private long id;

    private String name;
    private Unit unit;

    public Drug() {}

    public Drug(String name, Unit unit) {
        this.name = name;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public Unit getUnit() {
        return unit;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(unit);
        return sb.toString();
    }

    public Long getId() {
        return id;
    }
}

