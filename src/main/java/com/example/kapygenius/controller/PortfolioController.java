package com.example.kapygenius.controller;

import com.example.kapygenius.entity.Portfolio;
import com.example.kapygenius.repository.PortfolioRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortfolioController {

    private PortfolioRepository portfolioRepository;

    public PortfolioController(PortfolioRepository portfolioRepository) {
        this.portfolioRepository = portfolioRepository;
    }

    @GetMapping
    public Iterable<Portfolio> getall() {
        return portfolioRepository.findAll();
    }
}
