
package Beyblade_Programı_Polymorhism;


public class Beyblade {

    private String beybladeci;
    private int donus_hizi;
    private int saldiri_gucu;

    public Beyblade(String beybladeci, int donus_hizi, int saldiri_gucu) {
        this.beybladeci = beybladeci;
        this.donus_hizi = donus_hizi;
        this.saldiri_gucu = saldiri_gucu;
    }

    public String getBeybladeci() {
        return beybladeci;
    }

    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    public int getDonus_hizi() {
        return donus_hizi;
    }

    public void setDonus_hizi(int donus_hizi) {
        this.donus_hizi = donus_hizi;
    }

    public int getSaldiri_gucu() {
        return saldiri_gucu;
    }

    public void setSaldiri_gucu(int saldiri_gucu) {
        this.saldiri_gucu = saldiri_gucu;
    }
    
    public void saldir(){
        System.out.println(beybladeci + "" + saldiri_gucu + " ve " +  donus_hizi + " ile saldiriyor");
    }
    public void kutsalCanavarOrtayaCıkar(){
        System.out.println("bu beybledicinin kutsal canavarı bulunmuyor");
    }
    public void bilgileriGoster(){
        System.out.println("Beybledici ismi : " + beybladeci);
        System.out.println("Saldırı gunu : " + saldiri_gucu );
        System.out.println("Donus hızı : " + donus_hizi);
        
    }
}
