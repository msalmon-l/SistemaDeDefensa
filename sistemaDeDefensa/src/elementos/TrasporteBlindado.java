package elementos;

public class TrasporteBlindado implements IVehiculoArma, IMilitar, IMovil, IBlindado, ICostable{

    @Override
    public double resistenciaAlAtaque() {
        return 1.4;
    }

    @Override
    public double dameCosto() {
        return 4.200;
    }

    @Override
    public String dameNombre() {
        return "MX-7899";
    }

    @Override
    public double capacidadDeMovimiento() {
        return 4.5;
    }

    @Override
    public boolean IVehiculoConArma() {
        return false;
    }
}
