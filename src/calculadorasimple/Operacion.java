
package calculadorasimple;

import java.util.Scanner;


public class Operacion {
    
    private String operando;
    private int resultado, numero1, numero2;
    
    public void operando(){
        Scanner num1=new Scanner(System.in);
        Scanner num2=new Scanner(System.in);
        Scanner op=new Scanner (System.in);
        
        System.out.println("Escoja operación, suma +; resta -; multiplicación *; división /;");
        operando=op.nextLine();
        
            switch(operando){
                case "+":
                    System.out.println("Elije número: ");
                    numero1=num1.nextInt();
                    System.out.println("Elije número: ");
                    numero2=num2.nextInt();
                    resultado=numero1 + numero2;
                    System.out.println(resultado);
                    break;
                case "-":
                    System.out.println("Elije número: ");
                    numero1=num1.nextInt();
                    System.out.println("Elije número: ");
                    numero2=num2.nextInt();
                    resultado=numero1 - numero2;
                    System.out.println(resultado);
                    break;
                case "*":
                    System.out.println("Elije número: ");
                    numero1=num1.nextInt();
                    System.out.println("Elije número: ");
                    numero2=num2.nextInt();
                    resultado=numero1 * numero2;
                    System.out.println(resultado);
                    break;
                case "/":
                    System.out.println("Elije número: ");
                    numero1=num1.nextInt();
                    System.out.println("Elije número: ");
                    numero2=num2.nextInt();                    
                    try{resultado=numero1 / numero2;
                    }catch(ArithmeticException ex){
                        System.out.println("ERROR, no puedes dividir un numero entre 0");
                    }
                    System.out.println(resultado);
                    break;
            }
                
    }
        

}
