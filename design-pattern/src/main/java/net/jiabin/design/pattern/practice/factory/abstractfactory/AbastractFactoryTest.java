package net.jiabin.design.pattern.practice.factory.abstractfactory;

public class AbastractFactoryTest {


    public static void main(String[] args) {
        // 第一步就要选定一个“大厂”
        ComputerFactory cf = new AMDFactory();
        // 从这个大厂造 CPU
        CPU cpu = cf.makeCPU();
        // 从这个大厂造主板
        MainBoard board = cf.makeMainBoard();
        // 将同一个厂子出来的 CPU、主板、硬盘组装在一起
        Computer result = new Computer(cpu, board);
    }
}
