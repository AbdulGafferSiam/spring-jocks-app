package me.personalproject.springjocksapp.services.impl;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import me.personalproject.springjocksapp.services.JockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JockServiceImpl implements JockService {

    @Autowired
    private ChuckNorrisQuotes chuckNorrisQuotes;

    @Override
    public String getJock() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
