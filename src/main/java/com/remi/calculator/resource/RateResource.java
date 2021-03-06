package com.remi.calculator.resource;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class RateResource {

    @NotNull
    @Min(0)
    Double mid;

    public Double getMid() {
        return mid;
    }

    public void setMid(Double mid) {
        this.mid = mid;
    }
}
