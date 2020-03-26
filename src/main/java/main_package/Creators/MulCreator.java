package main_package.Creators;

import main_package.Operations.Multiplier;

public class MulCreator extends Creator {
    public Multiplier create() { return new Multiplier(); }
}
