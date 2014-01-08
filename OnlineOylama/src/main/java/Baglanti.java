/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author zeynep
 */

import java.sql.*;

public final class Baglanti
{
    private Connection _con;
    private String _dbname="Oy"; //veritabanı adımız
    private String _dbusername="root"; //Veritabanı kullanıcı adımız
    private String _dbpassword="123123"; //veritabanı şifremiz
    private String _host="jdbc:mysql://127.0.0.1:3306/";
    private String _drivername="com.mysql.jdbc.Driver";

    //Bağlantı için gereken connection ın oluşturulduğu metod
    public Baglanti()
    {
        try {
         Class.forName(_drivername).newInstance();
        setCon((Connection)DriverManager.getConnection(_host+ _dbname,_dbusername,_dbpassword));

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
            System.out.println(e);
        }
     }
    public Connection getCon() {
        return _con;
    }
    public void setCon(Connection _con) {
        this._con = _con;
    }
    
    public void closeConnection (){
        try{
            if(_con!=null && !_con.isClosed())
                _con.close();
        }
        catch (Exception e )
        {}
    }
    
    
}