public class Main {


    public static void main(String[] args) {
        PC newpc = new PC(new Case(), new MotherBoard(), new Monitor());
        newpc.description();
        newpc.powerUp();


    }
}
