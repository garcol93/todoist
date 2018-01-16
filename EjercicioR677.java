import java.util.ArrayList;

class EjercicioR677
{
    public ArrayList<String> devolverPalabraMasLarga(ArrayList<String> palabras)
    {        
        ArrayList<String> palabrasMasLargas = new ArrayList<String>();
        int numeroDeLetras = 0;            
        if (palabras.size()>0){  
            String devolverPalabraMasLarga = palabras.get(0);
            for(String palabra: palabras){
                if(palabra.length()>= devolverPalabraMasLarga.length())
                {
                    numeroDeLetras = palabra.length();
                    devolverPalabraMasLarga = palabra;
                }
            }
            for(String palabra: palabras){
                if(palabra.length()== numeroDeLetras)
                {
                    palabrasMasLargas.add(palabra);
                }
            }
        }
        return palabrasMasLargas;
    }

}
