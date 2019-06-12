
package Beyblade_Programı_Polymorhism;


public class Beyblade_Fabrikası {
        
   public Beyblade beybladeUret(String beyblade_turu){
   
       if (beyblade_turu.equals("Draciel")) {
           return new Dragon("Tako", 800, 300,  "mavi ejderha", "kutsal canavarla konusma");
       }else if (beyblade_turu.equals("Dranza")) {
           return new Dranza("Kai",600, 400, "kırmızı anka kusu");
       }else if (beyblade_turu.equals("Drayga")) {
           return new Drayga("Rei",800, 200, "beyaz kaplan");
       }else if (beyblade_turu.equals("Draciel")) {
           return new Draciel("Max",400, 1000, "kara kaplumbaga");
       }else
           return null;
       
       }
   }

