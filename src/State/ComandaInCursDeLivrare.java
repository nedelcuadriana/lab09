package State;

public class ComandaInCursDeLivrare implements State{
    @Override
    public void updateState(ComandaMancare c) {
        c.setS(new Livrat());
        System.out.println("Comanda in curs de livrare");
    }
}
