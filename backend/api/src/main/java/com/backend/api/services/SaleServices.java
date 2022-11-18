package com.backend.api.services;

import com.backend.api.config.model.Sale;
import com.backend.api.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
@Service
public class SaleServices {

    @Autowired
    private SaleRepository repository;


    public Page<Sale> findSalesData(String minDate,String maxDate,Pageable pageable){

        LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());

        LocalDate min = minDate.equals("")? today.minusDays(365): LocalDate.parse(minDate);
        LocalDate max = maxDate.equals("")? today: LocalDate.parse(maxDate);

       return repository.findSales(min,max,pageable);

    }



}
