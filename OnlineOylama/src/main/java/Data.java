
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

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
    @ManagedProperty(value="#{tc}")
    public int tc;
    public int adres;
    @ManagedProperty(value="#{gorevli_id}")
    public int gorevli_id;
    @ManagedProperty(value="#{sifre}")
    public String sifre;
    
    public int sorgula (){
    
        adres = 1234;
        return adres;
    }
    
    
}
