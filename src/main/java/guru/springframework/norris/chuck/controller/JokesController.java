package guru.springframework.norris.chuck.controller;

import guru.springframework.norris.chuck.service.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jt on 12/24/19.
 */
@Controller
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping("/")
    public String getJoke(Model model){

        model.addAttribute("joke", jokesService.getRandomJoke());

        return "jokes/index";
    }
}
