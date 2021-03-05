package com.remi.calculator.resource;

import java.util.List;

public class CurrencyResource {

    String table;
    String currency;
    String code;
    List<RateResource> rates;

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<RateResource> getRates() {
        return rates;
    }

    public void setRates(List<RateResource> rates) {
        this.rates = rates;
    }
}

