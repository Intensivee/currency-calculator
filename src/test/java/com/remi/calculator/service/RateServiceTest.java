package com.remi.calculator.service;

import feign.FeignException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class RateServiceTest {
    
    private final RateService rateService;

    @Autowired
    public RateServiceTest(RateService rateService) {
        this.rateService = rateService;
    }

    @Test
    void givenWrongCurrencyCode_throwsException() {
        String wrongCurrencyCode = "Some Wrong Code";

        assertThrows(FeignException.class, () -> this.rateService.getCurrentRateByCurrencyCode(wrongCurrencyCode));
    }

    @Test
    void givenGbpCurrencyCode_returnsPositiveRate() {
        String currencyCode = "GBP";

        Double rate = this.rateService.getCurrentRateByCurrencyCode(currencyCode);

        assertTrue(rate > 0);
    }
}
