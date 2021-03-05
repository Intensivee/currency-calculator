package com.remi.calculator.service;

import com.remi.calculator.resource.CurrencyResource;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="nbp-proxy", url="http://api.nbp.pl/api/exchangerates/rates/")
public interface NbpApiClient {

    @GetMapping("a/{code}")
    @Headers("Content-Type: application/json")
    CurrencyResource getCurrencyStatus(@PathVariable("code") String code);
}
