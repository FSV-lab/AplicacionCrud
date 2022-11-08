
package aplicacioncrud;



import com.mysql.jdbc.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Producto extends javax.swing.JFrame {
public static final String URL="jdbc:mysql://localhost:3306/tienda?autoReconnect=true";
public static final String usuario="root";
public static final String contraseña="1234";
PreparedStatement ps;
ResultSet rs;
public Connection getConnection(){
       Connection conexion=null; 
        try {
            Class.forName("com.mysql.jdbc.Driver");
           conexion=(Connection) DriverManager.getConnection(URL,usuario,contraseña);
            //JOptionPane.showMessageDialog(null,"Conexión Exitosa!");
        } catch (Exception e) {
            System.err.println("Error, "+e);
        }
        return conexion;
    }
    public Producto() {
        initComponents();
         cajaId.setVisible(false);
         setLocationRelativeTo(null);
       
    }
    
    public void limpiarCajas(){
        cajaBuscar.setText(null);
        cajaClave.setText(null);
        cajaNombre.setText(null);
        cajaPrecio.setText(null);
        cajafecha.setText(null);
        cajaIdCategoria.setText(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonBuscar = new javax.swing.JButton();
        cajaBuscar = new javax.swing.JTextField();
        cajaId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cajaClave = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cajaPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cajafecha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cajaIdCategoria = new javax.swing.JTextField();
        botonInsertar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Clave:");

        jLabel2.setText("Nombre del Producto:");

        jLabel3.setText("Precio:");

        jLabel4.setText("Fecha Venta:");

        jLabel5.setText("Id Categoria:");

        botonInsertar.setBackground(new java.awt.Color(204, 204, 204));
        botonInsertar.setText("Insertar");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        botonModificar.setBackground(new java.awt.Color(204, 204, 204));
        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonEliminar.setBackground(new java.awt.Color(204, 204, 204));
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        botonLimpiar.setText("Limpiar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("PRODUCTO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cajaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cajaId)
                            .addComponent(botonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cajaClave)
                            .addComponent(cajaNombre)
                            .addComponent(cajaPrecio)
                            .addComponent(cajafecha)
                            .addComponent(cajaIdCategoria)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonInsertar)
                                .addGap(28, 28, 28)
                                .addComponent(botonModificar)
                                .addGap(28, 28, 28)
                                .addComponent(botonEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(botonLimpiar)))))
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cajaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cajaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cajaClave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(12, 12, 12)
                        .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cajaPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cajafecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(cajaIdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonInsertar)
                    .addComponent(botonModificar)
                    .addComponent(botonEliminar)
                    .addComponent(botonLimpiar))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonConectarActionPerformed(java.awt.event.ActionEvent evt) {                                              
       Connection conexion= getConnection();
    }                                             

  
    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
     Connection conexion = null;
     
        try {
            conexion=getConnection();
            ps=conexion.prepareStatement("select * from producto where clave=?");
            ps.setString(1,cajaBuscar.getText());
            rs = ps.executeQuery();
            if(rs.next()){
                cajaId.setText(String.valueOf(rs.getInt("idproducto")));
                cajaClave.setText(rs.getString("clave"));
                cajaNombre.setText(rs.getString("nombre"));
                cajaPrecio.setText(rs.getString("precio"));
                cajafecha.setText(String.valueOf(rs.getDate("fecha_venta" )));
                cajaIdCategoria.setText(String.valueOf(rs.getInt("idcategoria")));
            }
            else{
                JOptionPane.showMessageDialog(null,"No existe un producto con esa clave!");
            }
            conexion.close();
            
        } catch (Exception e) {
            System.err.println("Error, "+e);
        }
             
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
       Connection conexion = null;
       
        try {
            conexion = getConnection();
          ps = conexion.prepareStatement("insert into producto(clave,nombre,precio,fecha_venta,idcategoria)values(?,?,?,?,?)");  
          ps.setString(1,cajaClave.getText());
          ps.setString(2,cajaNombre.getText());
          ps.setDouble(3,Double.parseDouble(cajaPrecio.getText()));
          ps.setDate(4,Date.valueOf(cajafecha.getText()));
          ps.setInt(5,Integer.parseInt(cajaIdCategoria.getText()));
         
          int resultado = ps.executeUpdate();
        
         if(resultado > 0 ){
          JOptionPane.showMessageDialog(null,"Registro insertado correctamente");   
         }
         else{
          JOptionPane.showMessageDialog(null,"El registro no fue insertado correctamente!");
         }
         conexion.close();
         
         
        } catch (Exception e) {
            System.err.println("Error "+e);
        }
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
      Connection conexion = null;
        try {
          conexion = getConnection();
          ps=conexion.prepareStatement("delete from producto where idProducto=?");
          ps.setInt(1,Integer.parseInt(cajaId.getText()));
          
          int resultado = ps.executeUpdate();
         if(resultado>0){
          JOptionPane.showMessageDialog(null,"Registro eliminado correctamente");
          limpiarCajas();
         }
         else{
          JOptionPane.showMessageDialog(null,"Error al eliminar el registro!");
         }
         conexion.close(); 
        } catch (Exception e) {
            System.err.println("Error ,"+e);
        }
      
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
      limpiarCajas();
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        Connection conexion = null;
        try {
              conexion = getConnection();
            ps = conexion.prepareStatement("update producto set clave=?,nombre=?,precio=?,fecha_venta=?,idcategoria=? where idProducto=?");
            ps.setString(1,cajaClave.getText());
            ps.setString(2,cajaNombre.getText());
            ps.setDouble(3,Double.parseDouble(cajaPrecio.getText()));
            ps.setDate(4,Date.valueOf(cajafecha.getText()));
            ps.setInt(5,Integer.parseInt(cajaIdCategoria.getText())); 
            ps.setInt(6,Integer.parseInt(cajaId.getText()));
            
         int resultado = ps.executeUpdate();
         if(resultado>0){
          JOptionPane.showMessageDialog(null,"Registro modificado correctamente");
          limpiarCajas();
         }
         else{
          JOptionPane.showMessageDialog(null,"El registro no fue modificado correctamente!");
         }
         conexion.close();  
        } catch (Exception e) {
            System.err.println("Error ,"+e);
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JTextField cajaBuscar;
    private javax.swing.JTextField cajaClave;
    private javax.swing.JTextField cajaId;
    private javax.swing.JTextField cajaIdCategoria;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaPrecio;
    private javax.swing.JTextField cajafecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
