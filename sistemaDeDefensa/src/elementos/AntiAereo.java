package elementos;

public class AntiAereo implements ICanionMovil, IMilitar, IDestructor, ICostable {
    @Override
    public double dameCosto() {
        return 1100;
    }

    @Override
    public double capacidadDeDestruccion() {
        return 22;
    }

    @Override
    public String dameNombre() {
        return "Cañon Antiaereo";
    }

    @Override
    public boolean CanionEsMovil() {
        return false;
    }
}
