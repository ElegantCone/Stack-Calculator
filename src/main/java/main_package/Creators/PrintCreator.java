package main_package.Creators;

import main_package.Operations.Printer;

public class PrintCreator extends Creator {
    public Printer create() { return new Printer(); }
}
