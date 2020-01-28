package Builder.GOF;

public class Computer implements IComputerPlan {
    private String cpu;
    private String gpu;
    private String motherboard;
    private int ram;


    @Override
    public void buildCPU(String cpu) {
        this.cpu=cpu;
    }

    public String getCpu() { return cpu;    }

    @Override
    public void buildGPU(String gpu) {
        this.gpu=gpu;
    }

    public String getGpu() {        return gpu;    }

    @Override
    public void buildMotherboard(String motherboard) {
        this.motherboard=motherboard;
    }

    public String getMotherboard() { return motherboard;    }

    @Override
    public void buildRam(int ram) {
        this.ram=ram;
    }

    public int getRam() {return ram;    }
}
