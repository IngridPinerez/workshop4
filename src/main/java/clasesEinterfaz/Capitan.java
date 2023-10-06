package clasesEinterfaz;

public class Capitan {

    private String nombre;
    private String apellido;
    private int matriculaNavegacion;

    public Capitan(String nombre, String apellido, int matriculaNavegacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matriculaNavegacion = matriculaNavegacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getMatriculaNavegacion() {
        return matriculaNavegacion;
    }

}
