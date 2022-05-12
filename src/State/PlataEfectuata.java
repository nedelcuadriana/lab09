package State;

public class PlataEfectuata implements State{
    @Override
    public void updateState(ComandaMancare c) {
        c.setS(new MancareInPreparare());
        System.out.println("Plata efectuata");
    }
}
