package dev.rampmaster.menu;

public class AsignaturaMenu extends AbstractMenu {
    public AsignaturaMenu(){
        super("Menu de Asignaturas");
        this.agregarOpcion(0,"Volver");
        this.agregarOpcion(1,"Listar Asignaturas");
        this.agregarOpcion(2,"Crear Asignatura");
        this.agregarOpcion(3,"Actualizar Asignatura");
        this.agregarOpcion(4,"Borrar Asignatura");
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
                return AbstractMenu.invalidSelectOption();
        }
        return seleccion;
    }
}
