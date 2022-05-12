package State;

public class MancareInPreparare implements State{
    @Override
    public void updateState(ComandaMancare c) {
        c.setS(new MancareGataDeLivrare());
        System.out.println("Mancare in preparare");
    }
}
