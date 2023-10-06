import clasesEinterfaz.Capitan;
import clasesEinterfaz.Embarcacion;
import clasesEinterfaz.Yate;
import clasesEinterfaz.Velero;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Embarcacion> listaDeEmbarcaciones = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int index;
        int tipoEmbarcacion;


        System.out.println("Empresa MAKAI \nAdministrador de embarcaciones");

        do {
            System.out.println("Por favor seleccione la opcion que desea realizar");
            System.out.println("1. Agregar una embarcacion");
            System.out.println("2. Ver el monto de alquiler de una embarcacion");
            System.out.println("3. Validar una embarcacion");
            System.out.println("4. Ver el detalle de una embarcacion");
            System.out.println("5. Eliminar una embarcacion");
            System.out.println("6. Salir");
            opcion = scanner.nextInt();

            switch(opcion){
                case 1:

                    do {
                        System.out.println("Seleccion el tipo de embarcacion");
                        System.out.println("1. Velero");
                        System.out.println("2. Yate");
                        tipoEmbarcacion = scanner.nextInt();

                    } while (tipoEmbarcacion < 1 || tipoEmbarcacion > 2);


                    System.out.println("Primero debe agregar los datos del capitan de la embarcacion");
                    System.out.println("Ingrese el nombre del capitan");
                    String nombre = scanner.next();
                    System.out.println("Ingrese el apellido del capitan");
                    String apellido = scanner.next();
                    System.out.println("Ingrese el numero de la matricula de navegacion del capitan");
                    int matriculaNavegacion = scanner.nextInt();
                    Capitan capitan = new Capitan(nombre, apellido, matriculaNavegacion);

                    System.out.println("Ahora por favor ingrese los datos de la embarcacion");
                    System.out.println("Ingrese el precio base de la embarcacion");
                    double precioBase = scanner.nextDouble();
                    System.out.println("Ingrese el año de fabricacion de la embarcacion");
                    int anhoEmbarcacion = scanner.nextInt();
                    System.out.println("Ingrese la longitud en metros de la embarcacion");
                    double eslora = scanner.nextInt();

                    if (tipoEmbarcacion == 1){
                        System.out.println("Ingrese la cantidad de mastiles del velero");
                        int mastiles = scanner.nextInt();
                        Velero velero = new Velero(precioBase,anhoEmbarcacion,eslora,capitan,mastiles);
                        listaDeEmbarcaciones.add(velero);
                        System.out.println("Embarcacion creada con exito!\n");

                    } else if (tipoEmbarcacion == 2){
                        System.out.println("Ingrese la cantidad de camarotes del yate");
                        int camarotes = scanner.nextInt();
                        Yate yate = new Yate(precioBase,anhoEmbarcacion,eslora,capitan,camarotes);
                        listaDeEmbarcaciones.add(yate);
                        System.out.println("Embarcacion creada con exito!\n");
                    }
                    break;

                case 2:
                    if (listaDeEmbarcaciones.size() <= 0) {
                        System.out.println("No hay embarcaciones creadas\n");
                    }
                    else {

                        do {
                            System.out.println("Selecciona la embarcacion de la que desea ver el monto de alquiler");
                            for (int i = 0; i < listaDeEmbarcaciones.size(); i++){
                                System.out.println((i+1) + ". Embarcacion " + (i+1) );
                            }

                            index = scanner.nextInt()-1;
                        } while (!(index >= 0 && index <= listaDeEmbarcaciones.size()-1));

                        Embarcacion eb = listaDeEmbarcaciones.get(index);
                        System.out.println("El monto de alquiler de la embarcacion " + index + " es de: "
                                + eb.obtenerMontoAlquiler() + "\n");
                    }
                    break;

                case 3:
                    if (listaDeEmbarcaciones.size() <= 0) {
                        System.out.println("No hay embarcaciones creadas\n");
                    }
                    else {
                        do {
                            System.out.println("Seleccion la embarcacion a validar");
                            for (int i = 0; i < listaDeEmbarcaciones.size(); i++){

                                System.out.println((i+1) + ". Embarcacion " + (i+1) );
                            }
                            index = scanner.nextInt() - 1;
                        } while (!(index >= 0 && index <= listaDeEmbarcaciones.size()-1));

                        if (listaDeEmbarcaciones.get(index) instanceof Yate){
                            System.out.println(((Yate) listaDeEmbarcaciones.get(index)).validar());

                        } else {
                            System.out.println(((Velero) listaDeEmbarcaciones.get(index)).validar());
                        }
                    }
                    break;

                case 4:
                    if (listaDeEmbarcaciones.size() <= 0) {
                        System.out.println("No hay embarcaciones creadas\n");
                    }
                    else {
                        do {
                            System.out.println("Seleccion la embarcacion a validar");
                            for (int i = 0; i < listaDeEmbarcaciones.size(); i++){
                                System.out.println((i+1) + ". Embarcacion " + (i+1) );
                            }
                            index = scanner.nextInt() - 1;

                        } while (!(index >= 0 && index <= listaDeEmbarcaciones.size()-1));

                        System.out.println(listaDeEmbarcaciones.get(index).verDetalle());
                    }
                    break;

                case 5:

                    if (listaDeEmbarcaciones.size() <= 0) {
                        System.out.println("No hay embarcaciones creadas\n");
                    }
                    else {
                        do {
                            System.out.println("Seleccion la embarcacion a eliminar");
                            for (int i = 0; i < listaDeEmbarcaciones.size(); i++){
                                System.out.println((i+1) + ". Embarcacion " + (i+1) );
                            }
                            index = scanner.nextInt() - 1;

                        } while (!(index >= 0 && index <= listaDeEmbarcaciones.size()-1));

                        listaDeEmbarcaciones.remove(index);
                        System.out.println("Embarcacion " +(index + 1) + " eliminada con exito!!\n");
                    }
                    break;

                case 6:
                    System.out.println("Saliendo del sistema, hasta luego!");
                    break;

                default:
                    System.out.println("Error: Opcion no valida");

            }

        } while (opcion != 6);





    }
}
