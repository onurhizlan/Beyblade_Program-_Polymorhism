
package Beyblade_Programı_Polymorhism;

import java.util.Scanner;


public class Test {
    
    public static void main(String[] args) {
        
            System.out.println("Beyblade programına hosgeldiniz");
            System.out.println("Çıkış için q ye basınız");
            System.out.println("");
            Scanner input = new Scanner(System.in);
            
            
            while(true){
                System.out.println("Hangi beyblade i uretmek istiyorsunuz");
                String islem = input.nextLine();
                if (islem.equals("q")) {
                    System.out.println("Programdan çıkılıyor");
                    break;
                }else {
                    Beyblade_Fabrikası fabrika = new Beyblade_Fabrikası();
                    Beyblade beyblade = fabrika.beybladeUret(islem);
                    
                    if (beyblade == null) {
                        System.out.println("Dogru beyblade giriniz");
                    }else{
                        beyblade.bilgileriGoster();
                        beyblade.saldir();
                        beyblade.kutsalCanavarOrtayaCıkar();
                    }
                }
                
            }
            
        }
            
    }
    

