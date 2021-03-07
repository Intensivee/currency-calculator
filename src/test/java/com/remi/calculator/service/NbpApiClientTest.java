package com.remi.calculator.service;

import feign.FeignException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class NbpApiClientTest {

    private final NbpApiClient nbpApiClient;

    @Autowired
    public NbpApiClientTest(NbpApiClient nbpApiClient) {
        this.nbpApiClient = nbpApiClient;
    }

    @Test
    void givenWrongCurrencyCode_throwsException() {
        String wrongCurrencyCode = "Some Wrong Codee";

        assertThrows(FeignException.class, () -> this.nbpApiClient.getCurrencyStatus(wrongCurrencyCode));
    }

    @Test
    void givenGbpCurrencyCode_returnsGbpValue() {
        String expectedCurrencyCode = "GBP";

        String actualCurrencyCode = this.nbpApiClient.getCurrencyStatus(expectedCurrencyCode).getCode();

        assertEquals(expectedCurrencyCode, actualCurrencyCode);
    }
}
