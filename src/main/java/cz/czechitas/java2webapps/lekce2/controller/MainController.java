package cz.czechitas.java2webapps.lekce2.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

@Controller
public class MainController {
    private final Random random = new Random();
    @GetMapping("/")
    public ModelAndView throwDice() {
        int randomDiceNumber = random.nextInt(1,7);

        ModelAndView result = new ModelAndView("dice");
        result.addObject("thrownNumber",randomDiceNumber);
        return result;
    }
}
