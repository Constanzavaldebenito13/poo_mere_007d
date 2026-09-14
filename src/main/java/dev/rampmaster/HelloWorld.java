package dev.rampmaster;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Tangananica o Tanganana?");
        System.out.print("R: ");
        String respuesta = scanner.nextLine();
        System.out.println("La respuesta es: " + respuesta);
    }
}