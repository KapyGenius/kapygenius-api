package com.example.kapygenius.repository;

import com.example.kapygenius.entity.Portfolio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortfolioRepository extends CrudRepository<Portfolio, Long> {
}
