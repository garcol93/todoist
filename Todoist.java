
/**
 * Write a description of class todoist here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Todoist
{
    // instance variables - replace the example below with your own
    private String tarea0;
    private String tarea1;
    private String tarea2;

    /**
     * Constructor for objects of class todoist
     */
    public Todoist()
    {
        tarea0 = null;
        tarea1 = null;
        tarea2 = null;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void addTarea(String nombreTarea, int posicion)
    {   
        if(posicion == 0){
            tarea0 = nombreTarea;
        }
        else if (posicion == 1){
            tarea1 = nombreTarea;
        }
        else if (posicion == 2){
            tarea2 = nombreTarea;
        }
    }

    public void mostrarTareas(){
        System.out.println("Tareas existentes");
        if(tarea0 !=null){
            System.out.println(tarea0);
        }

        if(tarea1 !=null){
            System.out.println(tarea1);
        }
        
        if(tarea2 !=null){
            System.out.println(tarea2);
        }
    }

}
