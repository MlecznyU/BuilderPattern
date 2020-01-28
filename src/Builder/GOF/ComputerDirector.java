package Builder.GOF;

public class ComputerDirector {
    private IComputerBuilder iComputerBuilder;

    public ComputerDirector(IComputerBuilder iComputerBuilder) {
        this.iComputerBuilder = iComputerBuilder;
    }
    public Computer getComputer(){
        return this.iComputerBuilder.getComputer();
    }
    public void buildComputer(){
        this.iComputerBuilder.buildCPU();
        this.iComputerBuilder.buildGPU();
        this.iComputerBuilder.buildMotherboard();
        this.iComputerBuilder.buildRam();
    }
}
