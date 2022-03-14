/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2.posiciondato;

import java.util.Scanner;

public class Conteo {

    int[] Datos;

    public Conteo(int[] Datos) {
        this.Datos = Datos;
    }

    public void LlenarDatos() {
        System.out.println("Ingresa los numeros");
        for (int i = 0; i < Datos.length; i++) {
            Datos[i] = new Scanner(System.in).nextInt();
        }
    }

    public void Repetidos() {
        for (int i = 0; i < Datos.length; i++) {
            int contador = 0;
            for (int j = 0; j < Datos.length; j++) {
                if (Datos[i] == Datos[j]) {
                    contador++;
                }
            }
            System.out.println("el numero en la posicion " + i + " es: " + Datos[i]);
        }
    }
}
