package com.kp.proj.config;

import com.google.inject.AbstractModule;
import com.kp.proj.KpiUtils;
import com.kp.proj.MyService;

public class Module extends AbstractModule {
    @Override
    protected void configure() {
        bind(KpiUtils.class);
        bind(MyService.class);
    }
}
