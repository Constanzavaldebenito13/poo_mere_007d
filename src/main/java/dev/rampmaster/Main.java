package dev.rampmaster;

import dev.rampmaster.menu.AbstractMenu;
import dev.rampmaster.menu.MainMenu;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int menuSelect;
        AbstractMenu menu = new MainMenu();

        do{
            Scanner sc = new Scanner(System.in);

            System.out.println("Bienvenido al sistema Control+Alt+Class");
            System.out.println("Seleccione el numero de su menu");
            menu.mostrarOpciones();

            try{
                menuSelect = sc.nextInt();
                menuSelect = menu.procesarSeleccion(menuSelect);
            }catch (InputMismatchException exception){
                menuSelect = Main.invalidSelectOption();
            }catch (NoSuchElementException exception){
                System.out.println(exception.getMessage());
                menuSelect = Main.invalidSelectOption();
            }

        }while (menuSelect!=0);

    }

    public static int invalidSelectOption(){
        System.out.println("Ingrese un valor valido");
        return -1;
    }
}