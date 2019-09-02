package test.interfaces.impl;

import test.interfaces.MySpringOperation;

public class UpLettersOperation implements MySpringOperation {
    @Override
    public String operaed(String litter) {
        return litter.toUpperCase();
    }
}
