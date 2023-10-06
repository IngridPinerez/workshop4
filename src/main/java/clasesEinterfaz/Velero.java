package clasesEinterfaz;

public class Velero extends Embarcacion implements Validacion {

    private int cantidadMastiles;

    public Velero(double precioBase, int anhoFabricacion, double eslora, Capitan capitan, int cantidadMastiles) {
        super(precioBase, anhoFabricacion, eslora, capitan);
        this.cantidadMastiles = cantidadMastiles;
    }

    @Override
    public String validar() {

        if (this.cantidadMastiles > 4){
            return "El velero es grande\n";
        }
        else {
            return "El velero es pequeño\n";
        }
    }
}
