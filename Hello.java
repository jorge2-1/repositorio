import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        int x, y;
        x = 3;
        y = 2;

        System.out.println("Hola mundo");
        System.out.println();
        System.out.println("La suma es: " + (x + y));

        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe tu nombre: ");  // <-- mensaje antes del input
        String nombre = sc.nextLine();

        System.out.println("Hola " + nombre);
        sc.close();
    }
}
public static void main(String[] args){
    private Scanner sc;
}