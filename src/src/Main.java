import Models.Estudiante;
import Models.Persona;
import Models.Staff;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Estudiante est1 = new Estudiante("Jorge","programacion", 200);
        Estudiante est2 = new Estudiante("Mauro", "Matematica", 140);
        Estudiante est3 = new Estudiante("Pablo","Naval", 100);
        Estudiante est4 = new Estudiante("Jeronimo", "pesquero", 100);

        Staff staff1 = new Staff("Manu", "Llopart", "Mañana", 200);
        Staff staff2 = new Staff("Nadia", "Llopart", "Tarde", 200);
        Staff staff3 = new Staff("Miguel", "Llopart", "Mañana", 200);
        Staff staff4 = new Staff("María", "Llopart", "Tarde", 200);

        ArrayList<Persona> personas = new ArrayList<>(8);
        int alumnos=0;
        int stafi=0;
        int i=0;
        int cobro = 0;
        if (personas.add(est1)){
            System.out.println("Se añadio a " + personas.getLast().getNombre());
        }
        if (personas.add(est2)){
            System.out.println("Se añadio a " + personas.getLast().getNombre());
        }
        if (personas.add(est3)){
            System.out.println("Se añadio a " + personas.getLast().getNombre());
        }
        if (personas.add(est4)){
            System.out.println("Se añadio a " + personas.getLast().getNombre());
        }
        if (personas.add(staff1)){
            System.out.println("Se añadio a " + personas.getLast().getNombre());
        }
        if (personas.add(staff2)){
            System.out.println("Se añadio a " + personas.getLast().getNombre());
        }
        if (personas.add(staff3)){
            System.out.println("Se añadio a " + personas.getLast().getNombre());
        }
        if (personas.add(staff4)){
            System.out.println("Se añadio a " + personas.getLast().getNombre());
        }

        while(i < personas.size()){
            if(personas.get(i) instanceof Estudiante){
                alumnos++;
                cobro += (int) ((Estudiante) personas.get(i)).getCuotaMensual();
            }else {
                stafi++;
            }
            i++;
        }
        System.out.println("Hay " + alumnos + " y " + stafi + " gente de staff" + " y los ingresos mensuales son " + cobro);



    }
}
