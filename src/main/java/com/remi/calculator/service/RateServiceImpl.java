package com.remi.calculator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RateServiceImpl implements RateService{

    private final NbpApiClient nbpApiClient;

    @Autowired
    public RateServiceImpl(NbpApiClient nbpApiClient) {
        this.nbpApiClient = nbpApiClient;
    }

    public Double getCurrentRateByCurrencyCode(String code){
        return this.nbpApiClient.getCurrencyStatus(code).getRates().get(0).getMid();
    }
}
