package Interfaz;

import Recursos.Colores;
import Recursos.TamanioPantalla;
import java.awt.Desktop;
import java.awt.Dimension;
import java.net.URI;
import javax.swing.JOptionPane;

public class DashboardUser extends javax.swing.JFrame {

    private TamanioPantalla tamanioPantalla;
    private Colores colores;
    private Dimension dimensionPanelIzquierdo;
    private Dimension dimensionPanelDerecho;
    
    public DashboardUser() {
        this.tamanioPantalla = new TamanioPantalla();
        this.colores = new Colores();
        setDimensionPaneles();
        initComponents();
        iniciarPaneles();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelIzquierdo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        dashboardPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        labelDolarOficial = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        labelDolarOficial1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        labelDolarOficial2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        reportesPanel = new javax.swing.JPanel();
        clientesPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        panelUndecorated = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        TituloDashboardUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(this.tamanioPantalla.getAnchoVentana(), this.tamanioPantalla.getAltoVentana());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelIzquierdo.setBackground(new java.awt.Color(52, 50, 98));
        panelIzquierdo.setPreferredSize(this.dimensionPanelIzquierdo);
        panelIzquierdo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Harrington", 2, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Powered by");
        panelIzquierdo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 60, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(this.colores.getColorLetraTitulos());
        jLabel2.setText("Forexample");
        panelIzquierdo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jToggleButton1.setBackground(this.colores.getColorFondoBoton());
        buttonGroup1.add(jToggleButton1);
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("Reportes");
        jToggleButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        panelIzquierdo.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 120, 30));

        jToggleButton2.setBackground(this.colores.getColorFondoBoton());
        buttonGroup1.add(jToggleButton2);
        jToggleButton2.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton2.setSelected(true);
        jToggleButton2.setText("Dashboard");
        jToggleButton2.setBorder(new javax.swing.border.MatteBorder(null));
        jToggleButton2.setBorderPainted(false);
        jToggleButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton2.setMargin(new java.awt.Insets(7, 14, 7, 14));
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        panelIzquierdo.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 120, 30));

        jToggleButton3.setBackground(this.colores.getColorFondoBoton());
        buttonGroup1.add(jToggleButton3);
        jToggleButton3.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton3.setText("Clientes");
        jToggleButton3.setBorder(new javax.swing.border.MatteBorder(null));
        jToggleButton3.setBorderPainted(false);
        jToggleButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        panelIzquierdo.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 120, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/problema.png"))); // NOI18N
        panelIzquierdo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 20, 20));

        jButton1.setText("Soporte");
        panelIzquierdo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 130, 40));

        jLabel3.setFont(new java.awt.Font("Harrington", 2, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Powered by");
        panelIzquierdo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-upward-ConvertImage.png"))); // NOI18N
        panelIzquierdo.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 373, -1, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/get-money.png"))); // NOI18N
        panelIzquierdo.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        getContentPane().add(panelIzquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 410));

        dashboardPanel.setBackground(this.colores.getColorFondo());
        dashboardPanel.setPreferredSize(this.dimensionPanelDerecho);
        dashboardPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(this.colores.getColorFondo());
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/coin-7.png"))); // NOI18N
        jLabel5.setText("Dolar Oficial");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
        });
        dashboardPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 110, 30));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("72,15");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel19MouseEntered(evt);
            }
        });
        dashboardPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        labelDolarOficial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        labelDolarOficial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelDolarOficialMouseEntered(evt);
            }
        });
        dashboardPanel.add(labelDolarOficial, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 150, 90));

        jLabel6.setBackground(this.colores.getColorFondo());
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/change.png"))); // NOI18N
        jLabel6.setText("Dolar Oficial");
        dashboardPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 150, 30));

        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setText("Compra");
        dashboardPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        dashboardPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 10, 20));

        jLabel17.setForeground(new java.awt.Color(153, 153, 153));
        jLabel17.setText("Venta");
        dashboardPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("72,15");
        dashboardPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("72,15");
        dashboardPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        labelDolarOficial1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        labelDolarOficial1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelDolarOficial1MouseEntered(evt);
            }
        });
        dashboardPanel.add(labelDolarOficial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 150, 90));

        jLabel10.setBackground(this.colores.getColorFondo());
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rich.png"))); // NOI18N
        jLabel10.setText("Dolar Bolsa");
        dashboardPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 150, 30));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("72,15");
        dashboardPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        labelDolarOficial2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        labelDolarOficial2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelDolarOficial2MouseEntered(evt);
            }
        });
        dashboardPanel.add(labelDolarOficial2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 150, 90));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Cliente", "Fecha de Vencimiento"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        dashboardPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 290, 180));

        jLabel11.setBackground(this.colores.getColorFondo());
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/coins.png"))); // NOI18N
        jLabel11.setText("Capital Total en Cuenta");
        dashboardPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 170, 40));

        jButton2.setText("Ver Calendario Económico");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        dashboardPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 300, -1));

        jLabel4.setBackground(this.colores.getColorFondo());
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/graph-1.png"))); // NOI18N
        jLabel4.setText("Beneficio a Hoy");
        dashboardPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 150, 40));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contract.png"))); // NOI18N
        jLabel16.setText("Próximos contratos a vencer");
        dashboardPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 260, -1));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        dashboardPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 370));

        jSeparator4.setBackground(new java.awt.Color(102, 102, 102));
        dashboardPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 10));

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        dashboardPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 640, 10));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("$50.000");
        dashboardPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, -1, -1));

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(153, 153, 153));
        jLabel23.setText("$50.000");
        dashboardPanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, -1));

        getContentPane().add(dashboardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 680, 370));

        reportesPanel.setBackground(this.colores.getColorFondo());
        reportesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(reportesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 680, 370));

        clientesPanel.setBackground(this.colores.getColorFondo());
        clientesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        clientesPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 10, 650, 310));

        getContentPane().add(clientesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 680, 370));

        panelUndecorated.setBackground(new java.awt.Color(52, 50, 98));
        panelUndecorated.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        jLabel9.setToolTipText("Cerrar");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        panelUndecorated.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minimize.png"))); // NOI18N
        jLabel12.setToolTipText("Minimizar");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        panelUndecorated.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logout.png"))); // NOI18N
        jLabel13.setToolTipText("Cerra Sesión");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        panelUndecorated.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 40));

        TituloDashboardUser.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        TituloDashboardUser.setForeground(this.colores.getColorLetraTitulos());
        TituloDashboardUser.setText("Dashboard principal");
        panelUndecorated.add(TituloDashboardUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 440, 40));

        getContentPane().add(panelUndecorated, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 680, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        this.clientesPanel.setVisible(false);
        this.dashboardPanel.setVisible(true);
        this.reportesPanel.setVisible(false);
        this.TituloDashboardUser.setText("Dashboard principal");
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        this.clientesPanel.setVisible(true);
        this.dashboardPanel.setVisible(false);
        this.reportesPanel.setVisible(false);
        this.TituloDashboardUser.setText("Monitor de clientes");
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        this.clientesPanel.setVisible(false);
        this.dashboardPanel.setVisible(false);
        this.reportesPanel.setVisible(true);
        this.TituloDashboardUser.setText("Mis reportes");
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.OpenInternet();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(null, "¿Deseas salir?", "Salir", dialog);
        if (resultado == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        Login login = new Login();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void labelDolarOficialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDolarOficialMouseEntered
        this.labelDolarOficial.setBackground(new java.awt.Color(52, 50, 98));
    }//GEN-LAST:event_labelDolarOficialMouseEntered

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        this.labelDolarOficial.setBackground(new java.awt.Color(52, 50, 98));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseEntered
        this.labelDolarOficial.setBackground(new java.awt.Color(52, 50, 98));
    }//GEN-LAST:event_jLabel19MouseEntered

    private void labelDolarOficial1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDolarOficial1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelDolarOficial1MouseEntered

    private void labelDolarOficial2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDolarOficial2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelDolarOficial2MouseEntered

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DashboardUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TituloDashboardUser;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel clientesPanel;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JLabel labelDolarOficial;
    private javax.swing.JLabel labelDolarOficial1;
    private javax.swing.JLabel labelDolarOficial2;
    private javax.swing.JPanel panelIzquierdo;
    private javax.swing.JPanel panelUndecorated;
    private javax.swing.JPanel reportesPanel;
    // End of variables declaration//GEN-END:variables

    private void setDimensionPaneles() {
        this.dimensionPanelIzquierdo = new Dimension(this.tamanioPantalla.getAnchoVentana() / 6, this.tamanioPantalla.getAltoVentana());
        this.dimensionPanelDerecho = new Dimension(this.tamanioPantalla.getAnchoVentana() - (this.tamanioPantalla.getAnchoVentana() / 6), this.tamanioPantalla.getAltoVentana() - (this.tamanioPantalla.getAltoVentana() / 7));
    }

    private void iniciarPaneles() {
        this.clientesPanel.setVisible(false);
        this.dashboardPanel.setVisible(true);
        this.reportesPanel.setVisible(false);
    }
    
        public void OpenInternet(){
        try {
            Desktop.getDesktop().browse(URI.create("https://es.investing.com/economic-calendar/"));
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "No se puede ingresar a internet", "Error", 0);
        }
    }
}
