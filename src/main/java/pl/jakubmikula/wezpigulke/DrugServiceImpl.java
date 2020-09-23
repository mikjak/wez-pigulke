package pl.jakubmikula.wezpigulke;

import java.util.List;

import org.springframework.stereotype.Service;

import pl.jakubmikula.wezpigulke.entities.Drug;

/**
 * @author U519526, 9/12/2020
 */


@Service
public class DrugServiceImpl implements DrugService {

    private DrugsRepository repository;

    public DrugServiceImpl(DrugsRepository repository) {
        this.repository = repository;
    }

    public void add(Drug drug) {
        repository.save(drug);
    }

    public void add(List<Drug> drugs) {
        drugs.forEach(s -> repository.save(s));
    }

    @Override
    public List<Drug> findAll() {
        return (List<Drug>) repository.findAll();
    }
}
