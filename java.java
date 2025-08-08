public class java {
/*
 * 
 */
    public static void main (String[] args){
        java run= new java();
        run.init();

       

    }
   
    
    public int multi(int numeroA, int numeroE){
        int response = 0;
        response= numeroA + numeroE;
        return response;
        

    }
    public int sum(int numeroA, int numeroB){
        int response= 0;
        response= numeroA + numeroB;
        return response;

    }
    public void init() {
        

        
        int a= 2;
        int b= 3;
        int responseSum= sum(a,b);
        int responseMult= multi(a,b);
        System.out.println("resultado suma "+ responseSum);
        System.out.println("resultado suma "+ responseMult);

    }

}
