package State;

public class Main {
    public static void main(String[] args) {
        ComandaMancare comandaMancare = new ComandaMancare(ComandaPlasata.getInstance(), 0);
        comandaMancare.nextState();
        comandaMancare.nextState();
        comandaMancare.nextState();
        comandaMancare.nextState();
        comandaMancare.nextState();
        comandaMancare.nextState();

        System.out.println();

        ComandaMancare comandaMancare2 = new ComandaMancare(ComandaPlasata.getInstance(),1);
        comandaMancare2.nextState();
        comandaMancare2.nextState();
        comandaMancare2.nextState();
        comandaMancare2.nextState();
        comandaMancare2.nextState();
        comandaMancare2.nextState();
    }
}
