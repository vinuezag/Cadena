
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class ContCocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String cadena = "El dia de ayer Margarita Julia y Jorge salieron de excursion";

        int contA = 0;
        String nueva = "";
        int cont = 0;
        String cadenaAlreves = "";
        int contE = 0;
        int contI = 0;
        int contO = 0;
        int contU = 0;
        
        //Funcion para contar el numero de vocales en una cadena
        for (int i = 0; i < cadena.length(); i++) {
            // Convierte a minúscula para hacer comparaciones sin distinción de mayúsculas o minúsculas
            char caracterActual = Character.toLowerCase(cadena.charAt(i)); 
            switch (caracterActual) {
                case 'a' -> contA++;
                case 'e' -> contE++;
                case 'i' -> contI++;
                case 'o' -> contO++;
                case 'u' -> contU++;
                default -> {
                }
            }
        }

        System.out.println("el # de A:" + contA + " el # de E:" + contE + " el # de I:" + contI + " el # de O:" + contO + " el # de U:" + contU);
        
        //Funcion para reemplazar en una cadena las A=@ y a las O=$
        for (int i = 0; i < cadena.length(); i++) {
            switch (cadena.charAt(i)) {
                case 'a' -> nueva += "@";
                case 'o' -> nueva += "$";
                default -> nueva += cadena.charAt(i); 
            }
        }
                
        
        System.out.println("nueva cadena: "+nueva);
        
        //Funcion para subdividir una cadena cada que hay un esopacio y contar el numero de palabras
        String[] partes = cadena.split(" ");

        // Iterar sobre las partes e imprimir cada fragmento
        for (String parte : partes) {
            //System.out.println(parte);
            System.out.println(parte);
            cont++;
        }
        
        System.out.println("el numero de palabras es: "+cont);
        
        //Funcion para invertir las letras al reves de una cadena
        
        for (int i = cadena.length()-1; i >= 0; i--) {
             cadenaAlreves+=cadena.charAt(i);
        }
        
        System.out.println("Cadena invertida: "+ cadenaAlreves);
        
        
        
        
        
    }   
    }
    

