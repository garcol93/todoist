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
        String tareaSinCompletar = "[ ]"+ nombreTarea;
        tareas.add(tareaSinCompletar);
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
        if(esValidoElIndice(posicionTarea))
        {
            tareas.remove(posicionTarea);
            valorADevolver = true;
        }       
        return valorADevolver;
    }

    /**
     * Metodo que comprueba si una posicion es valida y devuelve true
     * en caso afirmativo o false en otro caso.
     */
    public boolean esValidoElIndice(int indice)
    {
        return(indice >= 0 && indice < tareas.size());
    }

    /**
     * Metodo que devuelve true en caso de que haya tareas por hacer, false
     * en otro caso
     */  
    public boolean hayTareasPendientes()
    {
        return (getNumeroTareasPendientes() > 0);
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
        for (String tarea : tareas){
            System.out.println(numeroPosicion + ". " + tarea);
            numeroPosicion = numeroPosicion + 1;
        }
    }

    /**
     * Muestra solo las tareas en posiciones impares sin numero delante ni nada,
     * solo la tarea
     */
    public void mostrarTareasEnPosicionImpar()
    {
        int numeroPosicion = 1;
        for (String tarea : tareas){
            System.out.println(numeroPosicion + ". " + tarea);
            numeroPosicion = numeroPosicion + 2;

        }
    }

    /**
     * Muestra por pantalla todas las tareas que contienen el texto indicado
     * como parámetro
     */
    public void mostrarCoincidentes(String textoQueBuscamos)
    {
        int numeroPosicion = 1;
        boolean Coincidecias = false; 
        int numCoincidencias = 0;
        for(String tarea : tareas){
            if(tarea.toLowerCase().contains(textoQueBuscamos.toLowerCase())){
                System.out.println(numeroPosicion + ". " + tarea);
                numeroPosicion = numeroPosicion + 1;
                Coincidecias = true;
                numCoincidencias++;
            }            

        }
        if(!Coincidecias){
            System.out.println("No hay tareas coincidentes");
        }
        else {
            System.out.println("Hay " + numCoincidencias + " tareas coincidentes");
        }
    }

    /**
     * Muestra por pantalla la primera tarea que contenga el texto indicado como 
     * parametro. En caso de que no haya ninguna coincidencia no muestra nada
     */
    public void mostrarPrimeraCoincidente(String textoQueBuscamos)
    { boolean coincidencias = false;
        for(String tarea : tareas){
            if(tarea.toLowerCase().contains(textoQueBuscamos.toLowerCase())){
                coincidencias = true;
                if(coincidencias){
                    System.out.println(tarea);
                }
            }
        }
    }

    /**
     * Muestra por pantalla todas las tareas existentes, una por línea,
     * usando un bucle while
     */
    public void mostrarTareas2()
    {
        int posicionTareaActual = 0;
        while (posicionTareaActual < tareas.size()) {
            System.out.println(tareas.get(posicionTareaActual));
            posicionTareaActual++;
        }
    }

    /**
     * Muestra las tareas numeradas usando un bucle while empezando en 1
     */
    public void mostrarTareasNumeradas2()
    { int posicionTareaActual = 0;;
        while (posicionTareaActual < tareas.size()) {
            System.out.println((posicionTareaActual+1) + ". " + tareas.get(posicionTareaActual));
            posicionTareaActual++;

        }

    }

    /**
     * Muestra por pantalla las primeras n tareas (siendo n un parametro). En
     * caso de que no haya suficientes tareas muestra solo las que haya.
     */
    public void mostrarNPrimeras(int numero)
    {
        int posicionTareaActual = 0;;
        while (posicionTareaActual < numero) {
            if(tareas.get(posicionTareaActual) != null)
            {
                System.out.println((posicionTareaActual+1) + ". " + tareas.get(posicionTareaActual));
                posicionTareaActual++;
            }
        }
    }

    /**
     * Devuelve true si hay al menos una tarea que contenga el texto indicado
     * como parámetro y false en caso contrario. El metodo se debe ejecutar de la
     * forma mas rapida posible
     */
    public boolean hayTareaCoincidente(String textoABuscar)
    {
        boolean coincidencias = false;
        int posicion = 0;

        while(coincidencias == false && tareas.size()< posicion){            
            if(tareas.get(posicion).toLowerCase().contains(textoABuscar.toLowerCase())){
                coincidencias = true;
            }
            posicion++;
        }

        return coincidencias;
    }

    /**
     * Elimina la primera tarea que contiene el texto indicado por parámetro
     */
    public void eliminaPrimeraTareaCoincidente(String textoABuscar)
    {
        boolean coincidencias = false;
        int posicion = 0;
        while(coincidencias == false && tareas.size()< posicion){            
            if(tareas.get(posicion).toLowerCase().contains(textoABuscar.toLowerCase())){
                tareas.remove(posicion);
                coincidencias = true;
            }
            posicion++;
        }      
    }
       
    /**
     * Elimina todas las tareas que contienen el texto a buscar
     */
    public void eliminaTodasTareasCoincidentes(String textoABuscar) 
    {     
        int posicion = 0;
        while(tareas.size()> posicion){            
            if(tareas.get(posicion).toLowerCase().contains(textoABuscar.toLowerCase())){
                tareas.remove(posicion);               
            }
            posicion++;
        }      
    }
    
    /**
     * Marca como completada la tarea indicada como parametro. Por ejemplo,
     * si el parámetro es 0 marca como completada la primera tarea, si es 1 la
     * segunda, etc.
     */
    public void marcarComoCompletada(int indiceTarea)
    {
      String tareaCompletada = tareas.get(indiceTarea);      
      tareaCompletada ="[X]" + tareas.get(indiceTarea).substring(3,tareas.get(indiceTarea).length());
      tareas.set(indiceTarea,tareaCompletada);
    }
}