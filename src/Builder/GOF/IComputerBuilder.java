package Builder.GOF;

public interface IComputerBuilder {
    public void buildGPU();
    public void buildCPU();
    public void buildMotherboard();
    public void buildRam();
    Computer getComputer();
}
