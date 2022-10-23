package org.acme.domain.services;

import org.acme.domain.entities.Costumer;
import org.acme.domain.ports.CostumerRepositoryPort;

public class CostumerDomainService {

    private final CostumerSaveService costumerSaveService;

    public CostumerDomainService(CostumerRepositoryPort repository) {
        this.costumerSaveService = new CostumerSaveService(repository);
    }

    public void save(Costumer costumer) {
        costumerSaveService.execute(costumer);
    }
}
