package elementos;

import Batallones.Infanteria;

public class Ametrallador implements ItropaConArma, IMilitar, IMovil, IDestructor, ICostable {
    @Override
    public double dameCosto() {
        return 400;
    }

    @Override
    public double capacidadDeDestruccion() {
        return 10;
    }

    @Override
    public String dameNombre() {
        return "Ametrallador";
    }

    @Override
    public double capacidadDeMovimiento() {
        return 4;
    }

    @Override
    public boolean tieneArma() {
        return true;
    }
}
