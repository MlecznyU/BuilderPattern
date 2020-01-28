package Builder.GOF;

public interface IComputerPlan {
    void buildCPU(String cpu);
    void buildGPU(String gpu);
    void buildMotherboard(String motherboard);
    void buildRam(int ram);

}
