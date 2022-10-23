package org.acme.domain.ports;

import org.acme.domain.entities.Costumer;

public interface CostumerRepositoryPort {
    public void save(Costumer costumer);
}
