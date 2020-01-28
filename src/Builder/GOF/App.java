package Builder.GOF;

public class App {
    public static void main(String[] args) {
        IComputerBuilder pcBuilder = new PcBuilder();
        ComputerDirector computerDirector = new ComputerDirector(pcBuilder);
        computerDirector.buildComputer();
        Computer firstPc = computerDirector.getComputer();

        System.out.println("Computer built");
        System.out.println("Computer cpu is "+ firstPc.getCpu());
    }
}
