package elementos;

public class TrasporteRapido implements IVehiculoArma, IMilitar, IMovil, ICostable {
    @Override
    public double dameCosto() {
        return 1600;
    }

    @Override
    public String dameNombre() {
        return "Transporte rápido TAXIN-66";
    }

    @Override
    public double capacidadDeMovimiento() {
        return 12;
    }

    @Override
    public boolean IVehiculoConArma() {
        return false;
    }
}
