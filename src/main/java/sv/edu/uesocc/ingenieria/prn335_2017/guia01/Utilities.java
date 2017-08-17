
package sv.edu.uesocc.ingenieria.prn335_2017.guia01;

public class Utilities {
 /**
  * 
  * @param texto
  * @return Metodo que devuelve los primeros 30 caracteres del texto
  */
public String getResume (String texto){
    String caracter ="";
    int incremento =0;
    boolean existencia = false;
    do{
      caracter=caracter+texto.charAt(incremento);
      if (incremento<=texto.length()){
          existencia=false;
      } else{
       existencia=true;
 }
      
    }while(existencia==false);
    return caracter;
}    
  /**
   * 
   * @param texto
   * @return Capitaliza cada palabra del texto 
   */ 
 public String Capitalizar (String texto){
    String espacio = null, numero;
     
    texto.toCharArray();
    if(texto.contains(espacio)){
     texto.matches(texto.replaceAll(texto, espacio).toUpperCase());
        
    }
    return "";
 }   
    /**
     * 
     * @param frase
     * @param texto
     * @return Compara frases con el texto para observar si tienen coincidencias
     */
  public int ContarCoincidencias(String frase, String texto){
     int coincidencia=0;
     frase.getBytes();
     if(frase.equals(texto)){
         coincidencia++;
     }else{
         coincidencia=0;
     }
     return coincidencia; 
  }  
    
}
