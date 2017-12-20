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
    private ArrayList<Tarea> tareas;

    /**
     * Constructor for objects of class todoist
     */
    public Todoist()
    {
        tareas = new ArrayList<Tarea>();
    }

    /**
     * añade tareas nuevas al final del Array
     */
    public void addTarea(Tarea tarea)
    {   
      tareas.add(tarea);
    }
            
   /** 
     * Metodo que imprime todas las tareas existentes, una por linea.
     * El metodo imprime el numero de posicion de la tarea antes del
     * nombre de la tarea. Si la tarea esta completada, entonces muestra
     * un "[X]" delante de la tarea; si no esta completada muestra un "[ ]"
     */
    public void mostrarTareasNumeradas()
    {
        int numeroPosicion = 1;
        for (Tarea tarea : tareas){
            System.out.println(numeroPosicion + ". " + tarea);
            numeroPosicion = numeroPosicion + 1;
        }
    }
   
    /**
     * Marca como completada la tarea indicada como parametro. Por ejemplo,
     * si el parámetro es 0 marca como completada la primera tarea, si es 1 la
     * segunda, etc.
     */
    public void marcarComoCompletada(int indiceTarea)
    {
     
      
    }
}