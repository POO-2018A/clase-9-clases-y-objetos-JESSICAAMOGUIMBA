
package cedula;

import java.util.Scanner;

/**
 *
 * @author FRANCISCO
 */
public class Cedula {
    private String cedula;
    
    private String getCedula(){
    return cedula;
    }


    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
      
        String cedula;
        System.out.println("Ingrese la Cedula: "); 
        
         cedula = scan.nextLine(); 
         int suma = 0;
         char [] digito;
        digito = cedula.toCharArray();
         
      if( digito.length==10)
      { 
          for(int i = 0; i< digito.length-1; i++)
          {
          int numero =Integer.bitCount(i);
         if((i+1)%2==1)
         {
             numero=Integer.bitCount(i)*2;
             if (numero > 9 )
             {
                 numero = numero-9;
             }
         }
         suma= suma + numero;
            }
          
          suma=10-(suma % 10);
          if (suma>9){
              System.out.println("Numero de la cedula es incorecto");
          }else{
              System.out.println("Numero final debe ser igual a : "+ suma);
          }
       }else{
          System.out.println("Error numero muy corto o muy largo");
        }
                   
    }
    
}
