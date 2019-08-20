package PRAKTIKUM2;
        
import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] risa) {
        // Deklarasi
        double Fahrenhait;
        int Celcius;
      
        // Membuat scanner baru
        Scanner baca = new Scanner(System.in);
        
        // Input
        System.out.println("Suhu Celsius ke Fahrenheit");
        System.out.print("input Celcius: ");
        Celcius = baca.nextInt();
        
        // Proses
        Fahrenhait= Double.valueOf((Celcius * 9 / 5) + 32);
 
        // Output
        System.out.println("Fahrenhait = " + Fahrenhait);
    }
}
  
        
        
        

        
        
    

  
    
       

   
