
/**
 * Crea un objeto que almacena una tarea y su estado (completada o no).
 * 
 * @author 1ºDAM 2017/2018
 * @version 10/11/2018
 */
public class Tarea 
{
    private String descripcion;
    // El estado de la tarea: True: Completada; False: No Completada. 
    private boolean estado;
    private int prioridad;

    /**
     * Constructor de la clase Tarea.
     * @param descripcion La descripción de la tarea
     * Sergio
     */
    public Tarea(String descripcion)
    {
        this.descripcion = descripcion;
        estado = false;
        prioridad = 1;
    }

    /**
     * Devuelve si el estado es true o false.
     */
    public boolean getEstado()
    {
        return estado;  
    }

    public int getPrioridad()
    {
        return prioridad;
    }

    /**
     * Devuelve la descripción de la tarea.
     */
    public String getDescripcion()
    {
        return descripcion;
    }

    /**
     * Devuelve toda la informacion de la tarea en formato String
     */
    public String getDatosTarea()
    {
        String aDevolver = descripcion;
        if (estado) {
            aDevolver = "[X]" + aDevolver + " prioridad: " + prioridad;;
        }
        else {
            aDevolver = "[ ]" + aDevolver + " prioridad: " + prioridad;
        }
        return aDevolver; 
    }

    
    /**
     * Metodos setter
     * Javier y Jorge
     */
    public void tareaCompletada() {
        estado = true;
    }

    public void cambiaPrioridad(int nuevaPrioridad){
        if (nuevaPrioridad<1){
            prioridad = 1;
        }
        else if(nuevaPrioridad>5){
            prioridad = 5;
        }
        else {
            prioridad = nuevaPrioridad;
        }
    }
}

 
