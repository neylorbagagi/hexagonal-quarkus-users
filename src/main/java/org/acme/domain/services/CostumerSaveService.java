package org.acme.domain.services;

import org.acme.domain.entities.Costumer;
import org.acme.domain.ports.CostumerRepositoryPort;

public class CostumerSaveService {

    private final CostumerRepositoryPort repository;

    public CostumerSaveService(CostumerRepositoryPort repository) {
        this.repository = repository;
    }

    public void execute(Costumer costumer){
        repository.save(costumer);
    }
}
