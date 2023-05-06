package elementos;

import Batallones.Infanteria;

public class SoldadoRaso implements ItropaConArma, IMilitar ,IMovil, IDestructor, ICostable {

    @Override
    public double dameCosto() {
        return 250;
    }

    @Override
    public double capacidadDeDestruccion() {
        return 7;
    }

    @Override
    public String dameNombre() {
        return "Infantería Básica";
    }

    @Override
    public double capacidadDeMovimiento() {
        return 6;
    }

    @Override
    public boolean tieneArma() {
        return true;
    }
}
