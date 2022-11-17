package com.backend.api.controllers;

import com.backend.api.config.model.Sale;
import com.backend.api.services.SaleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleServices services;

    @GetMapping
    public List<Sale> findSales() {
        return services.findSales();
    }


}
