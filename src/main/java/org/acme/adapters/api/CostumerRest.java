package org.acme.adapters.api;
import org.acme.adapters.db.CostumerInMemoryRepository;
import org.acme.domain.entities.Costumer;
import org.acme.domain.ports.CostumerRestPort;
import org.acme.domain.services.CostumerDomainService;

import javax.transaction.Transactional;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/api/costumer")
public class CostumerRest implements CostumerRestPort {

    CostumerInMemoryRepository repository = new CostumerInMemoryRepository();

    @POST
    @Override
    @Transactional
    public void save(Costumer costumer) { // TODO: CRIAR USER PARA PACKAGE DO ADAPTER
        CostumerDomainService costumerDomainService = new CostumerDomainService(repository);
        costumerDomainService.save(costumer);
    }
}