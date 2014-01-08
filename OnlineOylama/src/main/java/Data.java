
import javax.faces.bean.ManagedBean;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zeynep
 */

@ManagedBean( name = "data" )
public class Data {
    private int tc;
    private int adres;
    private int gorevli_id;
    private String sifre;
    private int ekransecimi;
    
    
    public String adresal(){
    if(ekransecimi == 1){
       adres  = 123;
       return "oyVer";
    }
    else if(ekransecimi == 2){ 
       adres = 234;
       return "gorevli";
    }
    else return "index";
    }
    
    
   
    /**
     * @return the tc
     */
    public int getTc() {
        return tc;
    }

    /**
     * @param tc the tc to set
     */
    public void setTc(int tc) {
        this.tc = tc;
    }

    /**
     * @return the adres
     */
    public int getAdres() {
        return adres;
    }

    /**
     * @param adres the adres to set
     */
    public void setAdres(int adres) {
        this.adres = adres;
    }

    /**
     * @return the gorevli_id
     */
    public int getGorevli_id() {
        return gorevli_id;
    }

    /**
     * @param gorevli_id the gorevli_id to set
     */
    public void setGorevli_id(int gorevli_id) {
        this.gorevli_id = gorevli_id;
    }

    /**
     * @return the sifre
     */
    public String getSifre() {
        return sifre;
    }

    /**
     * @param sifre the sifre to set
     */
    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    /**
     * @return the ekransecimi
     */
    public int getEkransecimi() {
        return ekransecimi;
    }

    /**
     * @param ekransecimi the ekransecimi to set
     */
    public void setEkransecimi(int ekransecimi) {
        this.ekransecimi = ekransecimi;
    }
    
    
}
