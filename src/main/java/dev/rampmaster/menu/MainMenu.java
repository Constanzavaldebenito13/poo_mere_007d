package dev.rampmaster.menu;

public class MainMenu extends AbstractMenu{

    public MainMenu(){
        super("Menu Principal");
        this.agregarOpcion(0,"Salir");
        this.agregarOpcion(1,"Gestión de Asignaturas");
        this.agregarOpcion(2,"Gestión de Sedes");
        this.agregarOpcion(3,"Gestión de Colaboradores");
        this.agregarOpcion(4,"Gestión de Estudiantes");
    }

    @Override
    public int procesarSeleccion(int seleccion){
        switch (seleccion){
            case 0:
                System.out.println("Saliendo del sistema");
                break;
            case 1:
                System.out.println("Ingresando al modulo de Asignaturas");
                AbstractMenu menu1 = new AsignaturaMenu();
                this.bucleMenuInterno(menu1);
                break;
            case 2:
                System.out.println("Ingresando al modulo de Sedes");
                AbstractMenu menu2 = new SedeMenu();
                this.bucleMenuInterno(menu2);
                break;
            case 3:
                System.out.println("Ingresando al modulo de Colaboradores");
                AbstractMenu menu3 = new ColaboradorMenu();
                this.bucleMenuInterno(menu3);
                break;
            case 4:
                System.out.println("Ingresando al modulo de Estudiantes");
                AbstractMenu menu4 = new EstudianteMenu();
                this.bucleMenuInterno(menu4);
                break;
            default:
                return AbstractMenu.invalidSelectOption();
        }
        return seleccion;
    }
}
