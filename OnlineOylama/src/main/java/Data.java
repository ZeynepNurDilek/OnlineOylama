
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
    private int bilg_adres;
    private int oy_adres;
    private int gorevli_id;
    private int sifre;
    private int ekransecimi;
    
    
    public String tcSorgula(){
       
        if(tc==123)
            oy_adres = 12344566 ;
        
        return "gorevli";        
    }
    
    
    
    
    public String yonlendir(){
    
     //dbden gorevli_idnin sifresini çek    
     
    if(sifre == 123){   //buraya databaseden çekilecek değer gelecek
        
        if(ekransecimi == 1){
           return "oyVer";
        }
        else if(ekransecimi == 2){ 
           return "gorevli";
        }
        else return "index";
    }
    
    else 
        return "index";
    
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
    public int getSifre() {
        return sifre;
    }

    /**
     * @param sifre the sifre to set
     */
    public void setSifre(int sifre) {
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

    /**
     * @return the bilg_adres
     */
    public int getBilg_adres() {
        return bilg_adres;
    }

    /**
     * @param bilg_adres the bilg_adres to set
     */
    public void setBilg_adres(int bilg_adres) {
        this.bilg_adres = bilg_adres;
    }

    /**
     * @return the oy_adres
     */
    public int getOy_adres() {
        return oy_adres;
    }

    /**
     * @param oy_adres the oy_adres to set
     */
    public void setOy_adres(int oy_adres) {
        this.oy_adres = oy_adres;
    }
    
    
}
