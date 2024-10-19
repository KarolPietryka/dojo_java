package com.kp.proj;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.kp.proj.config.Module;

public class StaticClass {
    public static void x(){
        Injector injector = Guice.createInjector(new Module());
        MyService ms = injector.getInstance(MyService.class);
        ms.dependencyPrinting();
    }
}
