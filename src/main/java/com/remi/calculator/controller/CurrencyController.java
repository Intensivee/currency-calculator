package com.remi.calculator.controller;

import com.remi.calculator.service.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CurrencyController {
    private static final String SEND_CURRENCY = "GBP";
    private static final String RECEIVE_CURRENCY = "PLN";

    private final RateService rateService;

    @Autowired
    public CurrencyController(RateService rateService) {
        this.rateService = rateService;
    }

    @GetMapping
    public String mainPage(ModelMap model) {
        model.addAttribute("sendCurrency", SEND_CURRENCY);
        model.addAttribute("receiveCurrency", RECEIVE_CURRENCY);
        model.addAttribute("currencyRate", rateService.getCurrentRateByCurrencyCode(SEND_CURRENCY));
        return "main";
    }
}
