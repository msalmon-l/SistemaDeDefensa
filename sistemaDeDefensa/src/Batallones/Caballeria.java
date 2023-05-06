package Batallones;

import elementos.*;

import java.util.ArrayList;

public class Caballeria implements IBatallones, IcoleccionCaballeria{
    private String Unidad;
    private static int nextElement;
    private int NumerosElemento;
    private double totalPotencia = 0;
    private double totalDefense = 0;
    private double totalMovimiento = 0;
    private double totalCoste = 0;
    private double CapacidadMilitar = 0;
    private ArrayList<IVehiculoArma> unidadElemento;
    public Caballeria() {
        unidadElemento = new ArrayList<>();
        Unidad = dameNombreBatallon();
    }
    @Override
    public String dameNombreBatallon() {
        return "Artilleria";
    }

    public String getUnidad() {
        return Unidad;
    }

    @Override
    public void add(IVehiculoArma elemento) {
        unidadElemento.add(elemento);
        NumerosElemento = nextElement;
        totalPotencia += addPotenciaTotal(NumerosElemento);
        totalDefense += addblindajeTotal(NumerosElemento);
        totalMovimiento += addMovimientoTotal(NumerosElemento);
        totalCoste += addTotalCoste(NumerosElemento);
        CapacidadMilitar += addCmTotalInfanteria(NumerosElemento);
        nextElement++;
    }

    @Override
    public double addPotenciaTotal(int posicionElemento) {
        double Añadido = 0;
        if (unidadElemento.get(posicionElemento) instanceof IDestructor)
            Añadido = ((IDestructor) unidadElemento.get((int) posicionElemento)).capacidadDeDestruccion();
        return Añadido;
    }

    @Override
    public double addblindajeTotal(int posicionElemento) {
        double Añadido = 0;
        if (unidadElemento.get(posicionElemento) instanceof IBlindado)
            Añadido = ((IBlindado) unidadElemento.get((int) posicionElemento)).resistenciaAlAtaque();
        return Añadido;
    }

    @Override
    public double addMovimientoTotal(int posicionElemento) {
        double Añadido = 0;
        if (unidadElemento.get(posicionElemento) instanceof IMovil)
            Añadido = ((IMovil) unidadElemento.get((int) posicionElemento)).capacidadDeMovimiento();
        return Añadido;
    }

    @Override
    public double addTotalCoste(int posicionElemento) {
        double Añadido = 0;
        if (unidadElemento.get(posicionElemento) instanceof ICostable)
            Añadido = ((ICostable) unidadElemento.get((int) posicionElemento)).dameCosto();
        return Añadido;
    }

    @Override
    public double addCmTotalInfanteria(int posicionElemento) {
        double Pf = addPotenciaTotal(posicionElemento);
        double Cm = addMovimientoTotal(posicionElemento);
        double Bi = addblindajeTotal(posicionElemento);
        double CM = (Pf * (Cm / 2)) / (100 - Bi);
        return CM;
    }

    public double getNumerosElemento() {
        return NumerosElemento;
    }

    public double getTotalPotencia() {
        return totalPotencia;
    }

    public double getTotalDefense() {
        return totalDefense;
    }

    public double getTotalMovimiento() {
        return totalMovimiento;
    }

    public double getTotalCoste() {
        return totalCoste;
    }

    public double getCapacidadMilitar() {
        return CapacidadMilitar;
    }

    public ArrayList<IVehiculoArma> getUnidadElemento() {
        return unidadElemento;
    }

    @Override
    public String toString() {
        return "Caballeria{" +
                "Unidad='" + Unidad + '\'' +
                ", NumerosElemento=" + NumerosElemento +
                ", totalPotencia=" + totalPotencia +
                ", totalDefense=" + totalDefense +
                ", totalMovimiento=" + totalMovimiento +
                ", totalCoste=" + totalCoste +
                ", CapacidadMilitar=" + CapacidadMilitar +
                '}';
    }
}
