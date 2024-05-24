package net.jiabin.design.pattern.practice.factory.abstractfactory;

public class IntelFactory implements ComputerFactory {


    @Override
    public CPU makeCPU() {
        return new CPU();
    }

    @Override
    public MainBoard makeMainBoard() {
        return new MainBoard();
    }
}
