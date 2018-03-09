package com.nexient.lnl.clients.repository;

import com.nexient.lnl.clients.domain.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer> {
    List<Client> findAll();
}
