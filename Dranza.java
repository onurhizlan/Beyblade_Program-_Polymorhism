
package Beyblade_Programı_Polymorhism;


public class Dranza extends Beyblade {
    
    private String kutsalCanavar;

    public Dranza( String beybladeci, int donus_hizi, int saldiri_gucu, String kutsalCanavar) {
        super(beybladeci, donus_hizi, saldiri_gucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Kutsal canavar adı: " + kutsalCanavar );
    }

    @Override
    public void kutsalCanavarOrtayaCıkar() {
         System.out.println(getBeybladeci() + " " + kutsalCanavar + "ı çıkartıyor");
        System.out.println(getBeybladeci() + " sladırısı :  alev kılıcı");
    }

  
    
}
