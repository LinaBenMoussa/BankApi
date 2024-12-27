package tn.iit.service;

import org.springframework.stereotype.Service;
import tn.iit.entity.Client;
import tn.iit.repository.ClientRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    public Optional<Client> getClientById(Integer id) {
        return clientRepository.findById(id);
    }

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public void deleteClient(Integer id) {
        clientRepository.deleteById(id);
    }
}
