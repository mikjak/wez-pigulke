package pl.jakubmikula.wezpigulke;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pl.jakubmikula.wezpigulke.entities.Drug;
import pl.jakubmikula.wezpigulke.entities.DrugSchema;

/**
 * @author U519526, 9/11/2020
 */

@Controller
public class DrugController {

    @Autowired
    DrugService drugService;

    @Autowired
    DrugSchemaService drugSchemaService;

    @GetMapping("/drugs")
    public ModelAndView getDrugs() {
        ModelAndView modelAndView = new ModelAndView();

        List<Drug> drugs = drugService.findAll();
        var model = new HashMap<String, List<Drug>>();
        model.put("drugs", drugs);

        modelAndView.setViewName("showDrugs");
        modelAndView.addAllObjects(model);

        return modelAndView;
    }

    @GetMapping("/schedule")
    public ModelAndView getSchedule(@RequestParam long drugId) {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("schedule");
        Optional<DrugSchema> drugSchema = drugSchemaService.get(drugId);
        if( drugSchema.isPresent()) {
            modelAndView.addObject("schedule", drugSchema.get());
        }

        return modelAndView;
    }
}
