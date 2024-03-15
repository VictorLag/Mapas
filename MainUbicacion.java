import java.util.*;

public class MainUbicacion {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

    Ubicacion ubic0=new Ubicacion(0,"Estás sentado en la clase de programación");
    Ubicacion ubic1=new Ubicacion(1,"Estás en la cima de una montaña");
    Ubicacion ubic2=new Ubicacion(2,"Estás bañándote en la playa");
    Ubicacion ubic3=new Ubicacion(3,"Estás dentro de un edificio muy alto");
    Ubicacion ubic4=new Ubicacion(4,"Estás de pie en un puente");
    Ubicacion ubic5=new Ubicacion(5,"Estás en un bosque");

        ArrayList<Ubicacion> listaubicacion = new ArrayList<>();

        listaubicacion.add(ubic0);
        listaubicacion.add(ubic1);
        listaubicacion.add(ubic2);
        listaubicacion.add(ubic3);
        listaubicacion.add(ubic4);
        listaubicacion.add(ubic5);

        ubic1.addExit("N",5);
        ubic1.addExit("S",4);
        ubic1.addExit("E",3);
        ubic1.addExit("O",2);
        ubic1.addExit("Q",0);

        ubic2.addExit("N",5);
        ubic2.addExit("Q",0);

        ubic3.addExit("O",1);
        ubic3.addExit("Q",0);

        ubic4.addExit("N",1);
        ubic4.addExit("O",2);
        ubic4.addExit("Q",0);

        ubic5.addExit("O",2);
        ubic5.addExit("S",1);
        ubic5.addExit("Q",0);

        boolean seguir=true;
        String opcion;

        int id=1;

        do {
            System.out.println(listaubicacion.get(id).getDescripcion());
            System.out.println("Tus salidas validas son "+ listaubicacion.get(id).getExits() );

            opcion=sc.next();

            if (opcion.equalsIgnoreCase("Q")){
                System.out.println(ubic0.getDescripcion());
                seguir=false;
            }

            else {
                try {

                    id = listaubicacion.get(id).getExits().get(opcion.toUpperCase(Locale.ROOT));

                } catch (Exception e) {

                    System.out.println("No puedes ir a ese lugar");

                }
            }
        }while (seguir);
    }
}
