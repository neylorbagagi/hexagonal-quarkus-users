package org.acme.adapters.db;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.acme.domain.entities.Costumer;
import org.acme.domain.ports.CostumerRepositoryPort;

public class CostumerInMemoryRepository implements CostumerRepositoryPort, PanacheRepository<Costumer>{
    @Override
    public void save(Costumer costumer) {
        this.persist(costumer);
    }
}