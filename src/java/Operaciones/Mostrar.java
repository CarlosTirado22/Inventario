package Operaciones;

import java.util.Vector;
import java.sql.*;
import javax.swing.JOptionPane;


public class Mostrar {
         private String id;
         private String descripcion;
         private String precio;
         private String cantidad;
         private String foto;
         private String activo;

    public Mostrar(String id, String descripcion, String precio, String cantidad, String foto, String activo) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.foto = foto;
        this.activo = activo;
    }
    
    
    
     public static synchronized Vector mostrarProductos(String id)  throws SQLException
   {
       Vector cliente = null;
       DBManager dbm = new DBManager();
       Connection con = dbm.getConnection();
                                                        
       PreparedStatement st = con.prepareStatement("select * from productos where id=1");
       st.setString(1,id);
       ResultSet rs=st.executeQuery();
       cliente = new Vector();
       
       if( rs.next() )
           cliente.add ( new Mostrar(rs.getString(1), rs.getString(2), rs.getString(3),
                       rs.getString(4),rs.getString(5),rs.getString(6)));
       rs.close();
       st.close();
       dbm.closeConnection( con );
       return cliente;
       
   }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    
   
    
}

