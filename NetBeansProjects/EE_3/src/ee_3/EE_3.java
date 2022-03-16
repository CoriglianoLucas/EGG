package ee_3;

import ee_3.control.RaicesControl;
import ee_3.entidades.Raices;

public class EE_3 {

    public static void main(String[] args) {
        RaicesControl rc = new RaicesControl();
        Raices r = rc.crearEcuacion();
        rc.metodoCalcular(r);

    }

}
