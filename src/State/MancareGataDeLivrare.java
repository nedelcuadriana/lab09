package State;

public class MancareGataDeLivrare implements State{
    @Override
    public void updateState(ComandaMancare c) {
        c.setS(new ComandaInCursDeLivrare());
        System.out.println("Mancare gata de livrare");
    }
}
