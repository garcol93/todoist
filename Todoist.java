import java.util.ArrayList;
/**
 * Write a description of class todoist here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Todoist
{
    // instance variables - replace the example below with your own
    private ArrayList<String> tareas;

    /**
     * Constructor for objects of class todoist
     */
    public Todoist()
    {
        tareas = new ArrayList<String>();
    }

    /**
     * añade tareas nuevas al final del Array
     */
    public void addTarea(String nombreTarea)
    {   
        tareas.add(nombreTarea);
    }

    /**
     * muestra todas las tareas en una linea
     */
    public void mostrarTareas()
    {
        System.out.println("Tareas existentes:");
        System.out.println(tareas);
    }

    /**
     * devuelve el numero de tareas
     */
    public int getNumeroTareasPendientes()
    {
        return tareas.size();
    }

    public void mostrarNumeroTareasPendientes()
    {
        System.out.println("Numero tareas pendientes " + tareas.size());
    }

    /** 
     * Elimina la tarea que ocupa la posicion indicada como
     * parametro (empezando en 0). Devuelve true si elimina una
     * tarea, false en caso contrario
     */
    public boolean eliminarTarea(int posicionTarea)
    {
        boolean valorADevolver = false;
        if(posicionTarea >= 0 && posicionTarea < tareas.size())
        {
            tareas.remove(posicionTarea);
            valorADevolver = true;
        }       
        return valorADevolver;
    }
}