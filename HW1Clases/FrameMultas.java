
package HW1Clases;

import javax.swing.JOptionPane;

public class FrameMultas extends javax.swing.JFrame {
private Transito transito;

    public FrameMultas() {
        initComponents();
        transito = new Transito(0);
    }
    
    @SuppressWarnings("unchecked")
         
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        info = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        pagar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        mostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 245, 238));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sistema de Multas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 60));

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(197, 76, 71));
        jLabel2.setText("Bienvenido, seleccione una opcion:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        info.setBackground(new java.awt.Color(255, 204, 204));
        info.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        info.setForeground(new java.awt.Color(182, 83, 99));
        info.setText("Cantidad Multas");
        info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoActionPerformed(evt);
            }
        });
        jPanel1.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 120, 30));

        agregar.setBackground(new java.awt.Color(255, 204, 204));
        agregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agregar.setForeground(new java.awt.Color(182, 83, 99));
        agregar.setText("Agregar Multa");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        jPanel1.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 120, 30));

        pagar.setBackground(new java.awt.Color(255, 204, 204));
        pagar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pagar.setForeground(new java.awt.Color(182, 83, 99));
        pagar.setText("Pagar Multa");
        pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarActionPerformed(evt);
            }
        });
        jPanel1.add(pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 120, 30));

        salir.setBackground(new java.awt.Color(255, 204, 204));
        salir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        salir.setForeground(new java.awt.Color(182, 83, 99));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 120, 30));

        mostrar.setBackground(new java.awt.Color(255, 204, 204));
        mostrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mostrar.setForeground(new java.awt.Color(182, 83, 99));
        mostrar.setText("Mostrar Multas");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });
        jPanel1.add(mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoActionPerformed
        int[] estadisticas = transito.printInfo();
        int total = estadisticas[0];
        int pagadas = estadisticas[1];
        int pendientes = estadisticas[2];

        String mensaje = "Cantidad de Multas: " + total + "\n" +
            "Multas Pagadas: " + pagadas + "\n" +
            "Multas Pendientes: " + pendientes;
        JOptionPane.showMessageDialog( null, mensaje);
        
    }//GEN-LAST:event_infoActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
       try {
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese código:"));
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del infractor:");
        String tipo = JOptionPane.showInputDialog("Ingrese tipo de infraccion (Leve-Medio-Grave):");
            if (transito.agregarMulta(codigo, nombre, tipo)) {
                JOptionPane.showMessageDialog(null, "Multa agregada exitosamente.");

            } else {
                JOptionPane.showMessageDialog(null, "Multa no agregada.");
            }
       }catch (NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Error: Ingrese un entero");
       }
    }//GEN-LAST:event_agregarActionPerformed

    private void pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarActionPerformed
       try{
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese código de la multa a pagar:"));
            double montoPagado = transito.pagarMulta(codigo);
            if (montoPagado != -1) {
                JOptionPane.showMessageDialog(null, "Multa pagada exitosamente. Monto: Lps " + montoPagado);
            } else {
                JOptionPane.showMessageDialog(null, "Código de multa no encontrado.");
            }
       } catch (NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Error: Ingrese un entero");
       }
    }//GEN-LAST:event_pagarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        JOptionPane.showMessageDialog(null,"Programa Finalizado.");
            System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        String mostrarLista = "Lista de multas:\n";
                        for (int i = 0; i < 100; i++) {
                            Multa multa = transito.getMulta(i);
                            if (multa != null) {
                                mostrarLista += multa.print() + "\n";
                            }
                        }
                        JOptionPane.showMessageDialog(null, mostrarLista);
    }//GEN-LAST:event_mostrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton mostrar;
    private javax.swing.JButton pagar;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
