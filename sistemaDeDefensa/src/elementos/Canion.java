package elementos;

public class Canion implements ICanionMovil, IMilitar, IDestructor, ICostable{
    @Override
    public boolean CanionEsMovil() {
        return false;
    }

    @Override
    public double dameCosto() {
        return 1100;
    }

    @Override
    public double capacidadDeDestruccion() {
        return 14;
    }

    @Override
    public String dameNombre() {
        return "Cañon";
    }
}
