package Operaciones;

import java.sql.*;

public class Producto {
         private String id;
         private String descripcion;
         private String precio;
         private String cantidad;
         private String foto;
         private String activo;

    public Producto(String id, String descripcion, String precio, String cantidad, String foto, String activo) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.foto = foto;
        this.activo = activo;
    }
    
    
     public static synchronized boolean insertar(Producto p)  throws SQLException
   {                    
              DBManager dbm = new DBManager();
              Connection con = dbm.getConnection();

              PreparedStatement st=con.prepareStatement("INSERT INTO productos(descripcion,"+
                                                "precio,cantidad,foto)"+
                                                "VALUES(?,?,?,?)");
             st.setString(1, p.getDescripcion());
             st.setString(2, p.getPrecio());
             st.setString(3, p.getCantidad());
              st.setString(4, p.getFoto());
             int res=st.executeUpdate();
             st.close();
             dbm.closeConnection( con );
             return res==1;      
   }
     
     public static synchronized boolean actualizar(Producto p)  throws SQLException
   {                    
              DBManager dbm = new DBManager();
              Connection con = dbm.getConnection();

              PreparedStatement st=con.prepareStatement("INSERT INTO tclientes(cedula,nombres,"+
                                                "apellidos,direccion,email,celular)"+
                                                "VALUES(?,?,?,?,?,?)");
             st.setString(1, p.getId());
             st.setString(2, p.getDescripcion());
             st.setString(3, p.getPrecio());
             st.setString(4, p.getCantidad());
              st.setString(5, p.getFoto());
             st.setString(6, p.getActivo());
             int res=st.executeUpdate();
             st.close();
             dbm.closeConnection( con );
             return res==1;      
   }
     
     public static synchronized boolean eliminar(Producto p)  throws SQLException
   {                    
              DBManager dbm = new DBManager();
              Connection con = dbm.getConnection();

              PreparedStatement st=con.prepareStatement("INSERT INTO tclientes(cedula,nombres,"+
                                                "apellidos,direccion,email,celular)"+
                                                "VALUES(?,?,?,?,?,?)");
             st.setString(1, p.getId());
             st.setString(2, p.getDescripcion());
             st.setString(3, p.getPrecio());
             st.setString(4, p.getCantidad());
              st.setString(5, p.getFoto());
             st.setString(6, p.getActivo());
             int res=st.executeUpdate();
             st.close();
             dbm.closeConnection( con );
             return res==1;      
   }
     
     public static synchronized boolean consultar(Producto p)  throws SQLException
   {                    
              DBManager dbm = new DBManager();
              Connection con = dbm.getConnection();

              PreparedStatement st=con.prepareStatement("INSERT INTO tclientes(cedula,nombres,"+
                                                "apellidos,direccion,email,celular)"+
                                                "VALUES(?,?,?,?,?,?)");
             st.setString(1, p.getId());
             st.setString(2, p.getDescripcion());
             st.setString(3, p.getPrecio());
             st.setString(4, p.getCantidad());
              st.setString(5, p.getFoto());
             st.setString(6, p.getActivo());
             int res=st.executeUpdate();
             st.close();
             dbm.closeConnection( con );
             return res==1;      
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
