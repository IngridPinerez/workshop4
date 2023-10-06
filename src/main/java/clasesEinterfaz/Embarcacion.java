package clasesEinterfaz;

public abstract class Embarcacion {

    private double precioBase;
    private double valorAdicional;
    private int anhoFabricacion;
    private double eslora;
    private Capitan capitan;

    public Embarcacion (double precioBase, int anhoFabricacion, double eslora, Capitan capitan) {
        this.precioBase = precioBase;
        this.anhoFabricacion = anhoFabricacion;
        this.eslora = eslora;
        this.capitan = capitan;
    }

    public double obtenerMontoAlquiler(){
        double montoAlquiler = this.precioBase;

        if (this.anhoFabricacion > 2020){
            this.valorAdicional = 20000;
            montoAlquiler += this.valorAdicional;
        }
        return montoAlquiler;
    }

    public String verDetalle(){
        if (this.anhoFabricacion > 2020) {
            this.valorAdicional = 20000;
        }

        return "Datos del Capitan: \n" +
                " | Nombre: "+ capitan.getNombre() + "\n | Apellido: " + capitan.getApellido()
                + "\n | Matricula de navegacion: " + capitan.getMatriculaNavegacion() + "\n\nDatos de embarcacion: " +
                "\n | Precio Base: " + this.precioBase + " \n | Monto adicional: " + this.valorAdicional
                + "\n | Año de fabricacion: " + this.anhoFabricacion + "\n | Eslora: " + this.eslora + "\n";
    }

}
