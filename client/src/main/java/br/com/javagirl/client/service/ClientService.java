package br.com.javagirl.client.service;

import br.com.javagirl.client.entity.Client;
import br.com.javagirl.client.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client salvar(Client client){
        return clientRepository.save(client);
    }

    public List<Client> listaCliente(){
        return clientRepository.findAll();
    }
    public Optional<Client> buscarPorId(Long id){
        return clientRepository.findById(id);
    }
    public void removePorId(Long id){
        clientRepository.deleteById(id);
    }
}
