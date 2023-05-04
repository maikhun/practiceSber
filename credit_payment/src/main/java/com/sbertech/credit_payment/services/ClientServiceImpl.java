package com.sbertech.credit_payment.services;

import com.sbertech.credit_payment.models.Client;
import com.sbertech.credit_payment.repos.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private final ClientRepo clientRepository;

    public ClientServiceImpl(ClientRepo clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public List<Client> findAllClients() {
        return (List<Client>) clientRepository.findAll();
    }

    @Override
    public Client findClientByFullName(String name) {
        return clientRepository.findClientByFullName(name);
    }

    @Override
    public Optional<Client> findClientById(Long id) {
        return clientRepository.findById(id);
    }

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client updateClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void deleteClientById(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public void deleteClientByFullName(String name) {

    }
}
