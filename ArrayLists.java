package arraylists;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        try{
            System.out.println("Como desea operar?"
                    + "\n(1) Definicion de ArrayList"
                    + "\n(2) 6 Diferencias entre ArrayList, arreglo y vector"
                    + "\n(3) 4 Metodos de ArrayList"
                    + "\n(4) Sub-menu ArrayList"
                    + "\n(5) Finalizar");
            Scanner input = new Scanner(System.in); 
            int option = input.nextInt();
            switch (option){
                case 1:
                    Options.case_1();
                    //System.out.println("case 1");
                    break;
                case 2:
                    Options.case_2();
                    //System.out.println("case 2");
                    break;
                case 3:
                    Options.case_3();
                    //System.out.println("case 3");
                    break;
                case 4:
                    list_1();
                    //System.out.println("case 4");
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("\nOPCION INVALIDA\n");
                    menu();
                    break;
            }
        }
        catch(Exception e){
            System.out.println("\nOPCION INVALIDA\n");
            menu();
        }
    }
    public static void list_1(){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<11;i++){
            list.add(i);
        }
        sub_menu(list);
    }
    public static void sub_menu(ArrayList<Integer> list){
        try{
            System.out.println("\n(1) Agregar un elemento al ArrayList"
                    + "\n(2) Eliminar un elemendo del ArrayList"
                    + "\n(3) Buscar un elemento del ArrayList"
                    + "\n(4) Mostrar el contenido del ArrayList"
                    + "\n(5) Volver al menu principal");
            Scanner input_2 = new Scanner(System.in);
            int option_2 = input_2.nextInt();
            switch (option_2){
                case 1:
                    Options.array_1(list);
                    break;
                case 2:
                    Options.array_2(list);
                    break;
                case 3:
                    Options.array_3(list);
                    break;
                case 4:
                    Options.array_4(list);
                    break;
                case 5:
                    menu();
                    break;
                default:
                    System.out.println("\nOPCION INVALIDA");
                    sub_menu(list);
                    break;
            }
        }
        catch (Exception e){
            System.out.println("\nOPCION INVALIDA");
            sub_menu(list);
        }
    }
}
