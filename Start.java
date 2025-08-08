import java.util.Scanner;

public class Start {

    private Scanner sc;
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        Start run = new Start();
        run.init();
    }

    /**
     * 
     */
    public void init() {
        this.sc = new Scanner(System.in);
        System.out.println("Coloca un numero para a");
        int a = this.sc.nextInt();
        System.out.println("Coloca un numero para b");
        int b = this.sc.nextInt();
        int responseSum = sum(a, b);
        int responseMult = multi(a, b);
        System.out.println("Resultado suma "+responseSum);
        System.out.println("Resultado multi "+responseMult);

        if (a == b){
            System.out.println("El numero a y b son iguales");
        }else if (a > b){
            System.out.println("El numero a es mayor a b");
        }
        else if (b > a){
            System.out.println("El numero b es mayor a a");
        }
        else if ((a % 2) == 0 ){
            System.out.println("El numero a es par");
        }else{
             System.out.println("El numero a y b no son iguales");
        }
    }

    /**
     * 
     * @param numeroA 
     * @param numeroB
     * @return
     */
    public int multi(int numeroA, int numeroB) {
        int response = 0;
        response = numeroA * numeroB;
        return response;
    }

    /**
     * 
     * @param numeroA
     * @param numeroB
     * @return
     */
    public int sum(int numeroA, int numeroB) {
        int response = 0;
        response = numeroA + numeroB;
        return response;
    }

}