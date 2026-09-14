package dev.rampmaster.menu;

import dev.rampmaster.Main;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public abstract class AbstractMenu {
    protected String nombre;
    protected HashMap<Integer,String> opciones;

    public AbstractMenu(String nombre){
        this.nombre = nombre;
        this.opciones = new HashMap<Integer, String>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashMap<Integer, String> getOpciones() {
        return opciones;
    }

    public void setOpciones(HashMap<Integer, String> opciones) {
        this.opciones = opciones;
    }

    public void agregarOpcion(Integer opcion, String leyenda){
        this.opciones.put(opcion,leyenda);
    }

    public void mostrarOpciones(){
        for (int i = 0; i < this.opciones.size(); i++){
            System.out.println(i+") "+ this.opciones.get(i));
        }
        System.out.print("R: ");
    }

    public void bucleMenuInterno(AbstractMenu menu){
        int menuSelect;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Seleccione el numero de su menu");
            menu.mostrarOpciones();
            try{
                menuSelect = sc.nextInt();
                System.out.println("Recibido '"+menuSelect+"'");
                menuSelect = menu.procesarSeleccion(menuSelect);
            }catch (InputMismatchException exception){
                menuSelect = Main.invalidSelectOption();
            }catch (NoSuchElementException exception){
                System.out.println(exception.getMessage());
                menuSelect = Main.invalidSelectOption();
            }

        }while (menuSelect!=0);
    }

    public abstract int procesarSeleccion(int seleccion);

    public static int invalidSelectOption(){
        System.out.println("Ingrese un valor valido del menu");
        return -1;
    }
}
