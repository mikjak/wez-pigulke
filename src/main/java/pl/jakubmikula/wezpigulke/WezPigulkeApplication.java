package pl.jakubmikula.wezpigulke;

import java.sql.Timestamp;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pl.jakubmikula.wezpigulke.entities.Drug;
import pl.jakubmikula.wezpigulke.entities.DrugSchema;

@SpringBootApplication
public class WezPigulkeApplication implements CommandLineRunner {

    @Autowired
    DrugService drugService;

    @Autowired
    DrugSchemaService drugSchemaService;

    public static void main(String[] args) {
        SpringApplication.run(WezPigulkeApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        List<Drug> drugs = new ArrayList<>();
        drugs.add(new Drug("Tramal", Unit.mg));
        drugs.add(new Drug("Koka", Unit.sztuka));
        drugs.add(new Drug("Paracetamol", Unit.sztuka));
        drugs.add(new Drug("Polopiryna", Unit.sztuka));
        drugService.add(drugs);

        List<DrugSchema> drugSchemas = new ArrayList<>();
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneOffset.UTC);
        Timestamp timestamp = Timestamp.from(zonedDateTime.toInstant());
        drugSchemas.add(new DrugSchema(drugs.get(0), timestamp, 12, 7, 1));
        drugSchemas.add(new DrugSchema(drugs.get(1), timestamp, 12, 7, 1));
        drugSchemas.add(new DrugSchema(drugs.get(2), timestamp, 12, 7, 1));
        drugSchemas.add(new DrugSchema(drugs.get(3), timestamp, 12, 7, 1));
        drugSchemas.add(new DrugSchema(drugs.get(1), timestamp, 12, 7, 1));
        drugSchemaService.add(drugSchemas);
    }
}
