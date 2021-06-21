package org.springframeworkguru.spring5jokesappv2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframeworkguru.spring5jokesappv2.service.JokeService;
import org.springframeworkguru.spring5jokesappv2.service.JokeServiceImpl;

@Controller
public class JokesController {
    private final JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String getJokes(Model model) {
        model.addAttribute("joke",jokeService.getRandomJoke());
        return "index";
    }
}
