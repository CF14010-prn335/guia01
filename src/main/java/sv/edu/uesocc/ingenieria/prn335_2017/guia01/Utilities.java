
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
     return "";
 }   
    
  public int ContarCoincidencias(String frase, String texto){
     return 0; 
  }  
    
}
