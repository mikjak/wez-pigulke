package pl.jakubmikula.wezpigulke;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.jakubmikula.wezpigulke.entities.Drug;
import pl.jakubmikula.wezpigulke.entities.DrugSchema;

/**
 * @author U519526, 9/16/2020
 */

@Service
public class DrugSchemaServiceImpl implements DrugSchemaService {

    @Autowired
    private DrugSchemaRepository drugSchemaRepository;


    @Override
    public void add(DrugSchema drugSchema) {
        drugSchemaRepository.save(drugSchema);
    }

    @Override
    public void add(List<DrugSchema> drugSchemas) {
        drugSchemas.forEach(s -> drugSchemaRepository.save(s));
    }

    @Override
    public Optional<DrugSchema> get(long drugId) {
        return drugSchemaRepository.findById(drugId);
    }

    @Override
    public Optional<DrugSchema> get(Drug drug) {
        return drugSchemaRepository.findById(drug.getId());
    }
}
