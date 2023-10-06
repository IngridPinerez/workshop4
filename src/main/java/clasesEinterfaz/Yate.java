package clasesEinterfaz;

public class Yate extends Embarcacion implements Validacion {

    private int cantidadCamarotes;

    public Yate(double precioBase, int anhoFabricacion, double eslora, Capitan capitan, int cantidadCamarotes) {
        super(precioBase, anhoFabricacion, eslora, capitan);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    @Override
    public String validar() {

        if (this.cantidadCamarotes >= 7){
            return "El yate es de lujo\n";
        }
        else {
            return "El yate es estandar\n";
        }
    }
}
