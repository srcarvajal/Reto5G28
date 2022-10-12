/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Repositorio;

import com.example.demo.Interface.MessageInterface;
import com.example.demo.Modelo.Message;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Usuario
 */
@Repository
public class MessageRepository {
    @Autowired
    private MessageInterface categoryCrudRepository;
    
    public List<Message> getAll (){
        return (List<Message>) categoryCrudRepository.findAll();
    }
    public Optional<Message> getMessage(int id){
        return categoryCrudRepository.findById(id);
    } 
    
    public Message save (Message message){
        return categoryCrudRepository.save(message);
    }
    
    public void delete(Message message){
        categoryCrudRepository.delete(message);
    }
    
}