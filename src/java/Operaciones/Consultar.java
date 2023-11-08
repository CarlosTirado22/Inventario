package Operaciones;

import java.util.Vector;
import java.sql.*;
import javax.swing.JOptionPane;


public class Consultar {
         private String id_vuelo;
         private String destino;
         private String hora;
         private String fecha;
    
    
    public Consultar( String id_vuelo,String destino,String hora, String fecha) {
        this.id_vuelo = id_vuelo.trim();
        this.destino = destino;
        this.hora = hora;
        this.fecha = fecha;
        
    }
     public static synchronized Vector Consultarvuelos(String id_vuelo)  throws SQLException
   {
       Vector cliente = null;
       DBManager dbm = new DBManager();
       Connection con = dbm.getConnection();
                                                        
       PreparedStatement st = con.prepareStatement("select * from t_vuelos where id_vuelo = ?");
       st.setString(1,id_vuelo);
       ResultSet rs=st.executeQuery();
       cliente = new Vector();
       
       if( rs.next() )
           cliente.add ( new Consultar(rs.getString(1), rs.getString(2), rs.getString(3),
                       rs.getString(4)));
       rs.close();
       st.close();
       dbm.closeConnection( con );
       return cliente;
       
   }

    public String getId_vuelo() {
        return id_vuelo;
    }   
    public void setId_vuelo(String id_vuelo) {
        this.id_vuelo = id_vuelo;
    }    
    public String getdestino() {
        return destino;
    }    
    public void setdestino(String destino) {
        this.destino = destino;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }  
   
   
    
}


    

