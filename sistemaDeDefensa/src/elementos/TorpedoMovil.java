package elementos;

public class TorpedoMovil implements ICanionMovil, IMilitar, IMovil, IDestructor, IBlindado, ICostable {
    @Override
    public double resistenciaAlAtaque() {
        return 2;
    }

    @Override
    public double dameCosto() {
        return 1350;
    }

    @Override
    public double capacidadDeDestruccion() {
        return 19;
    }

    @Override
    public String dameNombre() {
        return "Torpedero móvil";
    }

    @Override
    public double capacidadDeMovimiento() {
        return 3;
    }

    @Override
    public boolean CanionEsMovil() {
        return true;
    }
}
