package org.acme.domain.services;

import org.acme.domain.entities.Costumer;
import org.acme.domain.ports.CostumerRepositoryPort;

import java.util.List;

public class CostumerDomainService {

    private final CostumerSaveService costumerSaveService;
    private final CostumerFetchAllService costumerFetchAllService;

    public CostumerDomainService(CostumerRepositoryPort repository) {
        this.costumerSaveService = new CostumerSaveService(repository);
        this.costumerFetchAllService = new CostumerFetchAllService(repository);
    }

    public void save(Costumer costumer) {
        costumerSaveService.execute(costumer);
    }

    public List<Costumer> fetchAll() { return costumerFetchAllService.execute(); }
}
