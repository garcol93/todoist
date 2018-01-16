import java.util.ArrayList;
/** 
 * Cabecera: luis
 * Atributos: Gian carlo
 * Constructor: Aitor
 * mostrarTareasNumeradas: Samuel
 * agregarTarea: Omar
 * marcarTareaComoCompletada: Cristian
 **/

public class Todoist2{

    private ArrayList<Tarea> listaDeTareas; 

    /**
     * Constructor de la clase Todoist2
     */
    public Todoist2(){
        listaDeTareas = new ArrayList<Tarea>();
    }

    /**
     * Mostrar tareas numeradas
     */
    public void mostrarTareasNumeradas()
    {
        int posicionTareaActual = 0;
        while (posicionTareaActual < listaDeTareas.size()) {
            System.out.println((posicionTareaActual+1) + ". " + listaDeTareas.get(posicionTareaActual).getDatosTarea());
            posicionTareaActual++;
        }
    }

    /**
     * crear Tarea
     */
    public void addTarea(String tarea)
    {
        Tarea nuevaTarea = new Tarea(tarea);
        listaDeTareas.add(nuevaTarea);
    }

    /**
     * Marca como completada la tarea indicada como parametro. Por ejemplo,
     * si el parámetro es 0 marca como completada la primera tarea, si es 1 la
     * segunda, etc.
     */
    public void marcarComoCompletada(int indiceTarea)
    {
        Tarea tareaActual = listaDeTareas.get(indiceTarea);
        tareaActual.tareaCompletada();
        listaDeTareas.set(indiceTarea, tareaActual);
    }

    public void cambiarPrioridad(int indiceTarea, int nuevaPrioridad)
    {
        Tarea tareaActual = listaDeTareas.get(indiceTarea);
        tareaActual.cambiaPrioridad(nuevaPrioridad);
    }

    public void informacionTareas()
    {int tareasCompletas = 0;
        int tareasPendientes = 0;
        for(Tarea tarea: listaDeTareas){
            if (tarea.getEstado() == true){
                tareasCompletas++;
            }
            else{
                tareasPendientes++;
            }
        }
        int porcentajeC = (tareasCompletas * 100) / listaDeTareas.size();
        int porcentajeP = (tareasPendientes *100) / listaDeTareas.size();
        System.out.println("tareas completadas " + tareasCompletas + " porcentaje " + porcentajeC +"%" );
        System.out.println("tareas pendientes " + tareasPendientes + " porcentaje " + porcentajeP +"%" );       
    }

    /**
     * Imprime todos los datos de la tarea con mayor prioridad. Si hay empate,
     * imprime la última encontrada. Si no hay tareas no imprime nada.
     */
    public void tareaDeMayorPrioridad(){
        Tarea tareaMasPrioritaria = listaDeTareas.get(0);
        if (listaDeTareas.size()>0){            
            for(Tarea tarea: listaDeTareas){
                if(tarea.getPrioridad()>= tareaMasPrioritaria.getPrioridad())
                {
                    tareaMasPrioritaria = tarea;
                }
            }
        }
        else {
            System.out.println("no hay tareas");
        }
        System.out.println (tareaMasPrioritaria.getDatosTarea());
    }

    /**
     * Imprime todos los datos de la tarea con menor prioridad. Si hay empate,
     * imprime por pantalla los datos de la última encontrada. Si no hay tareas,
     * no imprime nada
     */
    public void tareaDeMenorPrioridad(){
        Tarea tareaMenosPrioritaria = listaDeTareas.get(0);
        if (listaDeTareas.size()>0){            
            for(Tarea tarea: listaDeTareas){
                if(tarea.getPrioridad()<= tareaMenosPrioritaria.getPrioridad())
                {
                    tareaMenosPrioritaria = tarea;
                }
            }
        }
        else {
            System.out.println("no hay tareas");
        }
        System.out.println (tareaMenosPrioritaria.getDatosTarea());
    }
}

