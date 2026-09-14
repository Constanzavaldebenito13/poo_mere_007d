package dev.rampmaster.menu;

public class EstudianteMenu extends AbstractMenu {
    public EstudianteMenu(){
        super("Menu de Asignaturas");
        this.agregarOpcion(0,"Volver");
        this.agregarOpcion(1,"Gestión de Asignaturas");
        this.agregarOpcion(2,"Gestión de Sedes");
        this.agregarOpcion(3,"Gestión de Colaboradores");
        this.agregarOpcion(4,"Gestión de Estudiantes");
    }

    @Override
    public int procesarSeleccion(int seleccion){
        switch (seleccion){
            case 0:
                System.out.println("Volver");
                break;
            case 1:
                System.out.println("Listar Asignaturas");
                // Listar Asignaturas
                break;
            case 2:
                System.out.println("Crear Asignatura");
                // Crear Asignatura
                break;
            case 3:
                System.out.println("Actualizar Asignatura");
                // Actualizar Asignatura
                break;
            case 4:
                System.out.println("Borrar Asignatura");
                // Borrar Asignatura
                break;
            default:
                return this.invalidSelectOption();
        }
        return seleccion;
    }
}
