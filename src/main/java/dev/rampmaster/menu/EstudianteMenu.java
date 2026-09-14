package dev.rampmaster.menu;

import dev.rampmaster.Estudiante;

import java.util.HashMap;
import java.util.Scanner;

public class EstudianteMenu extends AbstractMenu {

    private HashMap<String, Estudiante> estudiantes;

    public EstudianteMenu(){
        super("Menu de Estudiantes");
        this.agregarOpcion(0,"Volver");
        this.agregarOpcion(1,"Listar Estudiante");
        this.agregarOpcion(2,"Crear Estudiante");
        this.agregarOpcion(3,"Actualizar Estudiante");
        this.agregarOpcion(4,"Borrar Estudiante");
    }

    @Override
    public int procesarSeleccion(int seleccion){

        Scanner sc = new Scanner(System.in);

        switch (seleccion){
            case 0:
                System.out.println("Volver");
                break;
            case 1:
                System.out.println("Listar Estudiante");
                for(Estudiante estudiante : estudiantes.values()){
                    System.out.println(estudiante);
                }
                break;
            case 2:
                System.out.println("Crear estudiante");
                Estudiante estudiante=this.crearNuevoEstudiante();
                this.estudiantes.put(estudiante.getRun(),estudiante);
                break;
            case 3:
                System.out.println("Actualizar Estudiante");
                System.out.println("Ingrese Run:");
                String runSearch =sc.nextLine();
                Estudiante estudianteAntiguo = this.estudiantes.get(runSearch);
                if(estudianteAntiguo != null){
                    Estudiante estudiante1=this.crearNuevoEstudiante();
                    this.estudiantes.put(runSearch,estudiante1);
                }
                break;
            case 4:
                System.out.println("Borrar Estudiante");
                System.out.println("Ingrese Run:");
                String runDelete =sc.nextLine();
                this.estudiantes.remove(runDelete);
                break;
            default:
                return this.invalidSelectOption();
        }
        return seleccion;
    }

    private Estudiante crearNuevoEstudiante(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese Nombre:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese Apellido:");
        String apellido =sc.nextLine();
        System.out.println("Ingrese Correo:");
        String correo =sc.nextLine();
        System.out.println("Ingrese Run:");
        String run =sc.nextLine();
        Estudiante estudiante=new Estudiante(nombre,apellido,correo,run);
        return estudiante;
    }
}
