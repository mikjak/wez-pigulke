package pl.jakubmikula.wezpigulke;

import java.util.List;

import pl.jakubmikula.wezpigulke.entities.Drug;

/**
 * @author U519526, 9/12/2020
 */


public interface DrugService {
    public void add(Drug drug);
    public void add(List<Drug> drugs);
    public List<Drug> findAll();
}
