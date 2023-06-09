package com.sbertech.credit_payment.services;

import com.sbertech.credit_payment.models.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    List<Client> findAllClients();
    Optional<Client> findClientById(Long id);
    Client saveClient(Client client);
    Client updateClient(Client client);
    void deleteClientById(Long id);
}
