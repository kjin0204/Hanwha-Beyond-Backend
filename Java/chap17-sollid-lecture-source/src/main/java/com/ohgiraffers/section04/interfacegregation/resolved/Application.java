package com.ohgiraffers.section04.interfacegregation.resolved;

public class Application {
    public static void main(String[] args) {
        BasicPrinter bp = new BasicPrinter();
        bp.print();

        AdvancedPrinter mfp = new AdvancedPrinter();
        mfp.print();
        mfp.scan();
        mfp.fax();
    }
}
