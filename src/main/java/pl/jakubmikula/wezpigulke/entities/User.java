package pl.jakubmikula.wezpigulke.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author U519526, 9/16/2020
 */

@Entity
public class User {

    @Id
    private long id;
    private String name;
    private String picture;
}
