package guru.springframework.norris.chuck.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService {

    private final ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

    @Override
    public String getRandomJoke() {
        String randomQuote = chuckNorrisQuotes.getRandomQuote();
        return randomQuote;
    }
}
