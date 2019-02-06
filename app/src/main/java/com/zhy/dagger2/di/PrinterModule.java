package com.zhy.dagger2.di;

import com.zhy.dagger2.printer.PdfPrinter;
import com.zhy.dagger2.printer.Printer;
import com.zhy.dagger2.printer.SamplePrinter;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module(includes = {AppModule.class})
public class PrinterModule {

    @Provides
    @Named("pdf")
    public Printer providePrinter() {
        return new PdfPrinter();
    }


    @Provides
    @Named("sample")
    public Printer provideSamplePrinter() {
        return new SamplePrinter();
    }

}
