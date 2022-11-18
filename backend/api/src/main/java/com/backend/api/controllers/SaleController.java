package com.backend.api.controllers;

import com.backend.api.config.model.Sale;
import com.backend.api.services.SaleServices;
import com.backend.api.services.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleServices services;

    @Autowired
    private SmsService smsService;

    @GetMapping
    public Page<Sale> findSalesData(
            @RequestParam(value = "minDate",defaultValue = "") String minDate,
            @RequestParam(value = "maxDate",defaultValue = "") String maxDate,
            Pageable pageable) {
        return services.findSalesData(minDate,maxDate, pageable);
    }

    @GetMapping("/notification/{id}")
    public void notifySms(@PathVariable Long id){
        smsService.sendSms(id);
    }

}
