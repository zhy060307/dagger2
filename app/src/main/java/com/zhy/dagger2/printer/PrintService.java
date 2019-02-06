package com.zhy.dagger2.printer;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
public class PrintService {
    private final Printer printer;

    @Inject
    public PrintService(@Named("pdf") Printer printer) {
        this.printer = printer;
        System.out.println("Loading PrintService....");
    }

    public void startWork() {
        System.out.println(this);
        this.printer.print();
    }
}