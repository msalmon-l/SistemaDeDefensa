package elementos;

import Batallones.Infanteria;

public class Sanitario implements ItropaConArma, IMilitar, IMovil, IBlindado, ICostable{
    @Override
    public double resistenciaAlAtaque() {
        return 5;
    }

    @Override
    public double dameCosto() {
        return 500;
    }

    @Override
    public String dameNombre() {
        return "Sanitario";
    }

    @Override
    public double capacidadDeMovimiento() {
        return 7;
    }

    @Override
    public boolean tieneArma() {
        return false;
    }
}
