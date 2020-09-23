package pl.jakubmikula.wezpigulke;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pl.jakubmikula.wezpigulke.entities.Drug;

/**
 * @author U519526, 9/10/2020
 */

@Repository
public interface DrugsRepository extends CrudRepository<Drug, Long> {
    List<Drug> findByName(String name);
    List<Drug> findByUnit(Unit prescription);
}
