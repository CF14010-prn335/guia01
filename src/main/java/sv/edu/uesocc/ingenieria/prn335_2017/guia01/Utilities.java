
package sv.edu.uesocc.ingenieria.prn335_2017.guia01;

public class Utilities {
 
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
    
 public String Capitalizar (String texto){
    String espacio = null, numero;
     
    texto.toCharArray();
    if(texto.contains(espacio)){
     texto.matches(texto.replaceAll(texto, espacio).toUpperCase());
        
    }
    return "";
 }   
    
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
