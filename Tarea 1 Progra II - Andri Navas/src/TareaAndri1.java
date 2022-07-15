import java.util.Scanner;
 
public class TareaAndri1 {
 
     
    public static void main(String[] args) {
         
       try (Scanner sn = new Scanner(System.in)) {
		boolean salir = false;
		   int opcion = 0; 
		   double num1 = 5;
		   double num2 = 10;
		   int select = -1;
		   double numeroraiz = 90;
		
		   while(select !=0){
			   System.out.println("Funciones que puedes elegir:");
		       System.out.println("1. Suma");
		       System.out.println("2. Resta");
		       System.out.println("3. Division");
		       System.out.println("4. Multiplicacion");
		       System.out.println("5. Raiz Cuadrada");
		       System.out.println("6. Raiz Cubica");
		       System.out.println("7. Salir");
		        
		       System.out.println("Escribe una de las opciones:");
		       opcion = sn.nextInt();
		     
		       switch(opcion){
		           case 1:
		        	   pideNumeros();
						System.out.println("La suma de\t"+num1+" + "+num2+" es "+(num1+num2));
						break;
		           case 2:
		        	   pideNumeros();
						System.out.println("La resta de\t"+num1+" - "+num2+" es "+(num1-num2));
						break;
		            case 3:
						pideNumeros();
						System.out.println("La division de\t"+num1+" / "+num2+" es "+(num1/num2));
						break;
		            case 4:
		            	pideNumeros();
						System.out.println("La multiplicacion de\t"+num1+" * "+num2+" es "+(num1*num2));
						break;
		            case 5:
		            	pideNumeros();
		            	double raizCuadrada = Math.sqrt(numeroraiz);
		            	System.out.printf("Raíz cuadrada de %.2f es %.2f\n", numeroraiz, raizCuadrada);
		            	break;
		            case 6:
		            	pideNumeros();
		            	double raizCubica = Math.cbrt(numeroraiz);
		            	System.out.printf("Raíz cúbica de %.2f es %.2f\n", numeroraiz, raizCubica);
		            	break;
		            case 7:
		               salir=true;
		               break;
		            default:
		               System.out.println("Solo números entre 1 y 7");
		       }
		       while(opcion!=7);
		   }
       }
        
    }

	public static void pideNumeros() {
		
	}
     
}