package main_package.Creators;

import main_package.Operations.Summator;

public class SumCreator extends Creator {
    public Summator create() { return new Summator(); }
}
