package arraylists;
import java.util.Scanner;
import java.util.ArrayList;

public class Options {
    
    
    public static void enter(){
        Scanner wait = new Scanner(System.in);
        System.out.println("\nPresione ENTER para continuar");
        wait.nextLine();
    }
    
    public static void case_1(){
        System.out.println("\nUn ArrayList a grandes rasgos se define como una de las más sencillas"
                + "\nestructuras de datos lineales, lo cual se traduce en una lista que "
                + "\naloja datos de cualquier tipo, no solamente primitivos."
                + "\n(Duncan A. Buell (2013), Data Structures Using Java, p. 61)"
                + "\n(https://books.google.es/books?id=lAYlBIJhoyoC&lpg=PP2&dq=arraylist%20java&lr&hl=es&pg=PP2#v=onepage&q=arraylist%20java&f=false)");
        enter();
        ArrayLists.menu();
    }
    public static void case_2(){
        System.out.println("\n(1) Capacidad dinamica vs estatica:"
                + "\n   ArrayList puede crecer y decrecer dinamicamente"
                + "\n   Los arreglos tienen una longitud fija una vez creados"
                + "\n   (https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)"
                + "\n(2) Sincronizacion:"
                + "\n   Vector es sincronizado, lo que significa que es seguro para el acceso concurrente por multiples hilos"
                + "\n(3) Rendimiento:"
                + "\n   Debido a la sincronizacion, Vector es mas lento que ArrayList"
                + "\n   ArrayList ofrece mejor rendimiento en operaciones de no sincronizacion"
                + "\n   (https://www.geeksforgeeks.org/vector-vs-arraylist-java/)"
                + "\n(4) Crecimiento:"
                + "\n   ArrayList crece en un 50% de su tamaño actual"
                + "\n   Vector duplica su tamaño cuando se excede su capacidad"
                + "\n   (https://www.geeksforgeeks.org/vector-vs-arraylist-java/)"
                + "\n(5) Legado:"
                + "\n   Vector es una clase antigua y parte del legado de Java 1.0"
                + "\n   ArrayList es parte del marco de colecciones introducido en Java 1.2"
                + "\n   (https://www.javatpoint.com/difference-between-arraylist-and-vector)"
                + "\n(6) Elementos Nulos:"
                + "\n   ArrayList permite elementos nulos"
                + "\n   Los arreglos pueden tener elementos nulos solo si se inicializan explicitamente con nulos"
                + "\n   (https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)");
        enter();
        ArrayLists.menu();
    }
    public static void case_3(){
        System.out.println("\n(1) void add(posicion, elemento):"
                + "\n   Permite añadir un elemento a la lista en la posicion indicada"
                + "\n(2) void clear():"
                + "\n   Elimina los elementos dentro de la lista"
                + "\n(3) boolean isEmpty():"
                + "\n   Valida si la lista se encuentra sin elementos, de ser asi, retorna 'TRUE'"
                + "\n(4) E remove(posicion):"
                + "\n   Elimina un elemento de la lista en la posicion indicada"
                + "\n   (https://refactorizando.com/uso-arraylist-en-java/)");
        enter();
        ArrayLists.menu();
    }
    public static void array_1(ArrayList<Integer> list){
        System.out.println("\nQue elemento desea agregar al ArrayList?");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        list.add(num);
        System.out.println("\nSe ha añadido el elemento '"+num+"' al ArrayList");
        enter();
        ArrayLists.sub_menu(list);
    }
    public static void array_2(ArrayList<Integer> list){
        //System.out.println("Se ha eliminado el elemento '"+list.get(0)+"' del ArrayList");
        //list.remove(0);
        System.out.println("\nQue elemento de la ArrayList desea eliminar?");
        System.out.println(list);
        Scanner option = new Scanner(System.in);
        int counter = 0;
        int delete = option.nextInt();
        for (int i=0;i<list.size();i++){
            if (list.get(i)==delete){
                list.remove(i);
                counter++;
            }
        }
        if (counter==0){
            System.out.println("\nEl elemento "+delete+" no se encuentra en la lista");
        }
        else{
            System.out.println("\nEl elemento '"+delete+"' ha sido eliminado");
        }
        enter();
        ArrayLists.sub_menu(list);
    }
    public static void array_3(ArrayList<Integer> list){
        System.out.println("\nEn que posicion desea buscar? (hay "+list.size()+" elementos)");
        Scanner input = new Scanner(System.in);
        int search = input.nextInt();
        if (search<1 && search>list.size()-1){
            System.out.println("\nOPCION INVALIDA");
            array_3(list);
        }
        else{
            System.out.println("\nEl elemento del espacio "+search+" es: "+list.get(search-1));
        }
        enter();
        ArrayLists.sub_menu(list);
    }
    public static void array_4(ArrayList<Integer> list){
        System.out.println("\nLos elementos de la ArrayList son:"
                +"\n"+list);
        enter();
        ArrayLists.sub_menu(list);
    }
}
