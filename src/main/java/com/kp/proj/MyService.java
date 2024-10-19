package com.kp.proj;

import com.google.inject.Inject;

public class MyService {
    @Inject
    private KpiUtils kpiUtils;

    public void dependencyPrinting(){
        kpiUtils.simplePrinting();
    }
}
