/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Repositorio;

import com.example.demo.Interface.ClientInterface;
import com.example.demo.Modelo.Client;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Usuario
 */
@Repository

public class ClientRepository {
    @Autowired
    private ClientInterface categoryCrudRepository;
    
    public List<Client> getAll (){
        return (List<Client>) categoryCrudRepository.findAll();
    }
    public Optional<Client> getClient(int id){
        return categoryCrudRepository.findById(id);
    } 
    
    public Client save (Client client){
        return categoryCrudRepository.save(client);
    }
    
    public void delete (Client client){
        categoryCrudRepository.delete(client);
    }
}
