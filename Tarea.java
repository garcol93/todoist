
/**
 * Write a description of class tarea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tarea
{
    // instance variables - replace the example below with your own
    private String descripcion;
    private boolean tareaCompletada;

    /**
     * Constructor for objects of class tarea
     */
    public Tarea(String tarea)
    {
        descripcion= tarea;
        tareaCompletada = false;
    }
    
    /**
     * devuelve el estado de la tarea
     */
    public boolean getTareaCompletada()
    {
        return tareaCompletada;
    }
}
