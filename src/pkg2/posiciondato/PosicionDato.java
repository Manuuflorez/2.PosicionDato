package pkg2.posiciondato;
 /*Crear un algoritmo que lea un vector de tamaño N de números enteros 
        y un dato, y devuelva la posición donde se encuentra dicho dato, 
        suponga que el dato si está y solo una vez
        
         */
import java.util.Scanner;
public class PosicionDato {

    public static void main(String[] args) {
       

        System.out.println("Cuantos numeros tendra el vector?");
        int TamanoVector = new Scanner(System.in).nextInt();
        int[] Datos = new int[TamanoVector];
        Conteo objConteo = new Conteo(Datos);
        objConteo.LlenarDatos();
        objConteo.Repetidos();
    }
}
