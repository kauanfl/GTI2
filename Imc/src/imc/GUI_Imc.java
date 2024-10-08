//Interface grafica
package imc;

public class GUI_Imc extends javax.swing.JFrame {

    public GUI_Imc() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JP_titulo = new javax.swing.JPanel();
        JL_titulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jb_Calcular = new javax.swing.JButton();
        jb_Limpar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jl_peso = new javax.swing.JLabel();
        jl_altura = new javax.swing.JLabel();
        jl_sexo = new javax.swing.JLabel();
        jtf_Peso = new javax.swing.JTextField();
        jtf_Altura = new javax.swing.JTextField();
        jtf_Sexo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jl_Imc = new javax.swing.JLabel();
        jl_Categoria = new javax.swing.JLabel();
        jtf_Imc = new javax.swing.JTextField();
        jtf_Categoria = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora IMC");
        setResizable(false);

        JP_titulo.setBackground(new java.awt.Color(204, 204, 204));
        JP_titulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JL_titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JL_titulo.setText("Calculo do IMC");

        javax.swing.GroupLayout JP_tituloLayout = new javax.swing.GroupLayout(JP_titulo);
        JP_titulo.setLayout(JP_tituloLayout);
        JP_tituloLayout.setHorizontalGroup(
            JP_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_tituloLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(JL_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JP_tituloLayout.setVerticalGroup(
            JP_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_tituloLayout.createSequentialGroup()
                .addComponent(JL_titulo)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jb_Calcular.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_Calcular.setText("Calcular");
        jb_Calcular.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_CalcularActionPerformed(evt);
            }
        });

        jb_Limpar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_Limpar.setText("Limpar");
        jb_Limpar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_LimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jb_Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jl_peso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jl_peso.setText("Peso(KG):");

        jl_altura.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jl_altura.setText("Altura(M):");

        jl_sexo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jl_sexo.setText("Sexo(M/F):");

        jtf_Peso.setColumns(10);
        jtf_Peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_PesoActionPerformed(evt);
            }
        });

        jtf_Altura.setColumns(10);
        jtf_Altura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_AlturaActionPerformed(evt);
            }
        });

        jtf_Sexo.setColumns(2);
        jtf_Sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_SexoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jl_sexo)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jl_altura)
                            .addComponent(jl_peso))
                        .addGap(44, 44, 44)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_Altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_peso)
                    .addComponent(jtf_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_Altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_altura))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_sexo)
                    .addComponent(jtf_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jl_Imc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jl_Imc.setText("IMC =");

        jl_Categoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jl_Categoria.setText("Categoria:");

        jtf_Imc.setColumns(10);
        jtf_Imc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_ImcActionPerformed(evt);
            }
        });

        jtf_Categoria.setColumns(20);
        jtf_Categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_CategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_Categoria)
                    .addComponent(jl_Imc))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jtf_Imc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jtf_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Imc)
                    .addComponent(jtf_Imc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Categoria)
                    .addComponent(jtf_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JP_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_PesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_PesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_PesoActionPerformed

    private void jtf_AlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_AlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_AlturaActionPerformed

    private void jtf_SexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_SexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_SexoActionPerformed

    private void jb_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_LimparActionPerformed
    
        //Limpar o modelo matematico
        calcularImc.setPeso(0);
        calcularImc.setAltura(0);
        calcularImc.setSexo(' ');
        calcularImc.setImc(' ');
        calcularImc.setImc(0);
        calcularImc.setCategoria("");
        
        //Limpar a interface grafica
        jtf_Peso.setText("");
        jtf_Altura.setText("");
        jtf_Sexo.setText("");
        jtf_Imc.setText("");
        jtf_Categoria.setText("");
        
    }//GEN-LAST:event_jb_LimparActionPerformed

    private void jtf_CategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_CategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_CategoriaActionPerformed

    private void jb_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_CalcularActionPerformed
        //Entrada de dados
        calcularImc.setPeso(
            Double.parseDouble(
                   jtf_Peso.getText()));
        
        calcularImc.setAltura(
           Double.parseDouble(
                   jtf_Altura.getText()));
        
        calcularImc.setSexo(
            jtf_Sexo.getText()
                    .toUpperCase()
                    .charAt(0));
        
        //Processamento 
        calcularImc.CalculoDoImc();
        calcularImc.classificacao();
        
        //Saida de dados
        jtf_Imc.setText(
                String.valueOf(
                        calcularImc.getImc()));
        jtf_Categoria.setText(
        calcularImc.getCategoria());
    }//GEN-LAST:event_jb_CalcularActionPerformed

    private void jtf_ImcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_ImcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_ImcActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(GUI_Imc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Imc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Imc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Imc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Imc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_titulo;
    private javax.swing.JPanel JP_titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jb_Calcular;
    private javax.swing.JButton jb_Limpar;
    private javax.swing.JLabel jl_Categoria;
    private javax.swing.JLabel jl_Imc;
    private javax.swing.JLabel jl_altura;
    private javax.swing.JLabel jl_peso;
    private javax.swing.JLabel jl_sexo;
    private javax.swing.JTextField jtf_Altura;
    private javax.swing.JTextField jtf_Categoria;
    private javax.swing.JTextField jtf_Imc;
    private javax.swing.JTextField jtf_Peso;
    private javax.swing.JTextField jtf_Sexo;
    // End of variables declaration//GEN-END:variables
   
    CalcularImc calcularImc = new CalcularImc();
}
