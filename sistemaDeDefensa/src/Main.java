import Batallones.*;
import elementos.*;

public class Main {
    public static void main(String[] args) {
/*
* El General quiere:
 Saber cuantos elementos tiene cada ejercito.
 Conocer cual es la potencia de fuego total de un ejército.
 Conocer cual es el blindaje total de un ejército.
 Saber cual es la capacidad de movimiento de un ejército.
 Conocer cuanto dinero se lleva gastado.
 Conocer cual es el CM o capacidad militar de un ejército.
* */
        IColeccionInfanteria MiInfanteria = new Infanteria();
        MiInfanteria.add(new SoldadoRaso());
        MiInfanteria.add(new SoldadoRaso());
        MiInfanteria.add(new SoldadoRaso());
        MiInfanteria.add(new SoldadoRaso());
        MiInfanteria.add(new SoldadoRaso());
        MiInfanteria.add(new SoldadoRaso());
        MiInfanteria.add(new Ametrallador());
        MiInfanteria.add(new Ametrallador());
        MiInfanteria.add(new Ametrallador());
        MiInfanteria.add(new Ametrallador());
        MiInfanteria.add(new Sanitario());
        MiInfanteria.add(new Sanitario());
        System.out.println(MiInfanteria);
        IColeccionArtilleria MiArtilleria = new Artilleria();
        MiArtilleria.add(new AntiAereo());
        MiArtilleria.add(new AntiAereo());
        MiArtilleria.add(new AntiAereo());
        MiArtilleria.add(new Canion());
        MiArtilleria.add(new Canion());
        MiArtilleria.add(new TorpedoMovil());
        MiArtilleria.add(new TorpedoMovil());
        System.out.println(MiArtilleria);
        IcoleccionCaballeria MiCaballeria = new Caballeria();
        MiCaballeria.add(new TanqueSombra());
        MiCaballeria.add(new TanqueSombra());
        MiCaballeria.add(new TanqueSombra());
        MiCaballeria.add(new TanqueSombra());
        MiCaballeria.add(new TrasporteBlindado());
        MiCaballeria.add(new TrasporteBlindado());
        MiCaballeria.add(new TrasporteRapido());
        MiCaballeria.add(new TrasporteRapido());
        System.out.println(MiCaballeria);



    }
}