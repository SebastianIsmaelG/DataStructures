import ed.Alumno;
import ed.Vector;

public class Main {
    public static void main(String[] args) {

        Alumno a1 = new Alumno("Juan");
        Alumno a2 = new Alumno("Jose");
        Alumno a3 = new Alumno("Danilo");

        Vector lista = new Vector();

        lista.adicionar(0,a1);
        lista.adicionar(1,a2);


        System.out.println(lista);
        lista.adicionar(0, a3);
        System.out.println(lista);

        lista.remover(2);
        System.out.println(lista);
        //Alumno x = lista.obtener(200);
        //System.out.println(x);

        //Alumno a3 = new Alumno("Danilo");
        //System.out.println(lista.contiene(a3));

        //VOY EN Cambiar el tamaño del Array
    }
}