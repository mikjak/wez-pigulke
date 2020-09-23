package pl.jakubmikula.wezpigulke;

import java.util.List;
import java.util.Optional;

import pl.jakubmikula.wezpigulke.entities.Drug;
import pl.jakubmikula.wezpigulke.entities.DrugSchema;

/**
 * @author U519526, 9/16/2020
 */

public interface DrugSchemaService {
    void add(DrugSchema drugSchema);
    void add(List<DrugSchema> drugSchemas);

    Optional<DrugSchema> get(Drug drug);
    Optional<DrugSchema> get(long drugId);

}
