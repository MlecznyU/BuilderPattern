package Builder.GOF;

public class PcBuilder implements IComputerBuilder{
    private Computer computer;

    public PcBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildGPU() {
        computer.buildGPU("AMD");
    }

    @Override
    public void buildCPU() {
        computer.buildCPU("Ryzen 7");
    }

    @Override
    public void buildMotherboard() {
        computer.buildMotherboard("Asus");
    }

    @Override
    public void buildRam() {
        computer.buildRam(8);
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }

}
