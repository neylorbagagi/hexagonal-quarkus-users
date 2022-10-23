package org.acme.domain.ports;

import org.acme.domain.entities.Costumer;

import java.util.List;

public interface CostumerRestPort {

    public void save(Costumer costumer);

    public List<Costumer> fetchAll();
}
