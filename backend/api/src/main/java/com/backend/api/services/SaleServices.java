package com.backend.api.services;

import com.backend.api.config.model.Sale;
import com.backend.api.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SaleServices {

    @Autowired
    private SaleRepository repository;


    public List<Sale> findSales(){
       return repository.findAll();

    }



}
