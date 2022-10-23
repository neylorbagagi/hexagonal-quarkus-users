package org.acme.domain.services;

import org.acme.domain.entities.Costumer;
import org.acme.domain.ports.CostumerRepositoryPort;

import java.util.List;

public class CostumerFetchAllService {

    private final CostumerRepositoryPort repository;

    public CostumerFetchAllService(CostumerRepositoryPort repository) {
        this.repository = repository;
    }

    public List<Costumer> execute(){
        return repository.fetchAll();
    }
}
