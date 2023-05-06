package elementos;

public class TanqueSombra implements IVehiculoArma, IMilitar, IDestructor, IMovil, ICostable, IBlindado {

    @Override
    public double dameCosto() {
        return 15.600;
    }

    @Override
    public double capacidadDeDestruccion() {
        return 7.3;
    }

    @Override
    public String dameNombre() {
        return "Tanque de ataque Sombras-VB98";
    }

    @Override
    public double capacidadDeMovimiento() {
        return 7.3;
    }

    @Override
    public double resistenciaAlAtaque() {
        return 4.8;
    }

    @Override
    public boolean IVehiculoConArma() {
        return true;
    }
}
