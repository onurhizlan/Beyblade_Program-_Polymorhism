
package Beyblade_Programı_Polymorhism;

public class Dragon extends Beyblade{
    
    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String beybladeci, int donus_hizi, int saldiri_gucu, String kutsalCanavar, String gizliYetenek) {
        super(beybladeci, donus_hizi, saldiri_gucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); //To change body of generated methods, choose Tools | Templates.
                System.out.println("Kutsal canavar adı: " + kutsalCanavar );
                 System.out.println("Gizli yetenek: " + gizliYetenek );

    }

    @Override
    public void kutsalCanavarOrtayaCıkar() {
         System.out.println(getBeybladeci() + " " + kutsalCanavar + "ı çıkartıyor");
        System.out.println(getBeybladeci() + " sladırısı :  hayalet kasırga");
    }
    
}
