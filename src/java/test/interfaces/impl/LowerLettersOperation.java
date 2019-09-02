package test.interfaces.impl;

import test.interfaces.MySpringOperation;

public class LowerLettersOperation implements MySpringOperation {
    @Override
    public String operaed(String litter) {
        return litter.toLowerCase();
    }
}
