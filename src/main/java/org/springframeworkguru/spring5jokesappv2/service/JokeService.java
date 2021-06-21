package org.springframeworkguru.spring5jokesappv2.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeService {
    private final ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

    public String getRandomJoke() {

        return chuckNorrisQuotes.getRandomQuote();
    }
}
