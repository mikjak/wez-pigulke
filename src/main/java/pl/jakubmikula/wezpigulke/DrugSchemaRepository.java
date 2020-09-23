package pl.jakubmikula.wezpigulke;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pl.jakubmikula.wezpigulke.entities.DrugSchema;

/**
 * @author U519526, 9/16/2020
 */

@Repository
public interface DrugSchemaRepository extends CrudRepository<DrugSchema, Long> {
}
