
package jokenpo;

/**
 *
 * @author Kauan Ferreira Lemos
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GUI_Jokenpo extends javax.swing.JFrame {

   
    // 1 = Pedra, 2 = Papel, 3 = Tesoura
    private int jogadorEscolha; 
    private JokenpoLogica logica;
    
    //Objeto para obter escolha aleatoria da maquina
    private Random random = new Random();
      
      // Variáveis de placar
private int jogadorVitorias    = 0;
private int computadorVitorias = 0;
private int empates            = 0;



      
    public GUI_Jokenpo() {
        initComponents();
        // Inicia a logica do jogo
         logica = new JokenpoLogica();
          
         
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JL_titulo = new javax.swing.JLabel();
        JL_escolha = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnPedra = new javax.swing.JButton();
        btnpapel = new javax.swing.JButton();
        btntesoura = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JL_placarMaquina = new javax.swing.JLabel();
        JL_rusuario = new javax.swing.JLabel();
        JL_rmaquina = new javax.swing.JLabel();
        JL_placarjogador = new javax.swing.JLabel();
        btnsair = new javax.swing.JButton();
        JL_Empates = new javax.swing.JLabel();
        JB_reiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jokenpô");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        JL_titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JL_titulo.setForeground(new java.awt.Color(255, 255, 255));
        JL_titulo.setText("JOKENPÔ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(JL_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JL_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JL_escolha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JL_escolha.setText("Escolha sua jogada:");

        btnPedra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pedra.png"))); // NOI18N
        btnPedra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedraActionPerformed(evt);
            }
        });

        btnpapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/papel-de-mao (2).png"))); // NOI18N
        btnpapel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnpapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpapelActionPerformed(evt);
            }
        });

        btntesoura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tesouras (1).png"))); // NOI18N
        btntesoura.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btntesoura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntesouraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnPedra)
                .addGap(49, 49, 49)
                .addComponent(btnpapel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btntesoura)
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btntesoura, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPedra)
                    .addComponent(btnpapel))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Escolha da maquina:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Resultado:");

        JL_placarMaquina.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JL_placarMaquina.setText("Vitórias maquina: 0");

        JL_placarjogador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JL_placarjogador.setText("Vitórias Usuario: 0");

        btnsair.setBackground(new java.awt.Color(0, 0, 255));
        btnsair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsair.setForeground(new java.awt.Color(255, 255, 255));
        btnsair.setText("Sair");
        btnsair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });

        JL_Empates.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JL_Empates.setText("Empates: 0");

        JB_reiniciar.setBackground(new java.awt.Color(0, 0, 255));
        JB_reiniciar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JB_reiniciar.setForeground(new java.awt.Color(255, 255, 255));
        JB_reiniciar.setText("Novo Jogo");
        JB_reiniciar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JB_reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_reiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(JL_rusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JL_rmaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(JL_escolha))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JL_placarMaquina)
                        .addGap(275, 275, 275))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JL_Empates)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnsair, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JL_placarjogador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JB_reiniciar)))
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JL_escolha)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(51, 51, 51)
                .addComponent(jLabel6)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_placarjogador)
                    .addComponent(JB_reiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(JL_placarMaquina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_Empates)
                    .addComponent(btnsair, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JL_rmaquina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_rusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedraActionPerformed
        // Pedra
         jogadorEscolha = 1;
    jogar();
    }//GEN-LAST:event_btnPedraActionPerformed

    private void btnpapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpapelActionPerformed
        // Papel
        jogadorEscolha = 2; 
    jogar();
    }//GEN-LAST:event_btnpapelActionPerformed

    private void btntesouraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntesouraActionPerformed
       // Tesoura
         jogadorEscolha = 3; 
    jogar();
    }//GEN-LAST:event_btntesouraActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnsairActionPerformed

    private void JB_reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_reiniciarActionPerformed
        // TODO add your handling code here:
          jogadorVitorias    = 0;
          computadorVitorias = 0;
          empates            = 0;
          
           // Atualiza o placar
    JL_placarjogador.setText("Placar Jogador: " + jogadorVitorias);
    JL_placarMaquina.setText("Placar Computador: " + computadorVitorias);
    JL_Empates.setText("Empates: " + empates);
     
      // Limpa resultados anteriores
    jLabel5.setText("Escolha da máquina:");
    jLabel6.setText("Resultado:");
    
     //Exibir uma mensagem informando que o jogo foi reiniciado
    JOptionPane.showMessageDialog(this, "O jogo foi reiniciado, Boa sorte!");
        
        
    }//GEN-LAST:event_JB_reiniciarActionPerformed

      private void jogar() {
          
    //Gerar a escolha aleatória da máquina
    int computadorEscolha = random.nextInt(3) + 1;

    //Mostrar a escolha da máquina
    jLabel5.setText("Escolha da máquina: " + logica.getEscolhaNome(computadorEscolha));

    //Determina o vencedor
    String resultado = logica.determinarVencedor(jogadorEscolha, computadorEscolha);
    jLabel6.setText(resultado); 

      //Atualiza o placar 
    if (resultado.equals("Você Ganhou")) {
        jogadorVitorias++;
    } else if (resultado.equals("Você Perdeu")) {
        computadorVitorias++;
    } else if (resultado.equals("Empate")) {
        empates++;
    }

       
        JL_placarjogador.setText("Placar Jogador: " + jogadorVitorias);
        JL_placarMaquina.setText("Placar Computador: " + computadorVitorias);
        JL_Empates.setText("Empates: " + empates);
    }


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
            java.util.logging.Logger.getLogger(GUI_Jokenpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Jokenpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Jokenpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Jokenpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Jokenpo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_reiniciar;
    private javax.swing.JLabel JL_Empates;
    private javax.swing.JLabel JL_escolha;
    private javax.swing.JLabel JL_placarMaquina;
    private javax.swing.JLabel JL_placarjogador;
    private javax.swing.JLabel JL_rmaquina;
    private javax.swing.JLabel JL_rusuario;
    private javax.swing.JLabel JL_titulo;
    private javax.swing.JButton btnPedra;
    private javax.swing.JButton btnpapel;
    private javax.swing.JButton btnsair;
    private javax.swing.JButton btntesoura;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
