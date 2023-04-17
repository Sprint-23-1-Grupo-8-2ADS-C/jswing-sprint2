package sptech.jswing.sprint2.main;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.sistema.Sistema;
import java.util.List;
import sptech.jswing.sprint2.controller.Totem;

/**
 *
 * @author marcusgoncalves
 */
public class Login extends javax.swing.JFrame {

    Looca looca;
    Models models;
    Totem totem;

    public Login() {
        initComponents();
        this.models = new Models();
        this.looca = new Looca();
        this.totem = new Totem();

        this.testSystem();
        this.estabelecerConexao();
    }

    private void estabelecerConexao() {
        models.getConnection();
        System.out.println("Conectado!");
    }

    private void testSystem() {
        Sistema sistema = looca.getSistema();
        String frase = String.format("Teste do sistema: %s", sistema.getSistemaOperacional());
        System.out.println(frase);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        iptIdTotem = new javax.swing.JTextField();
        btnConectar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 10, 28));
        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 1024));

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo.png"))); // NOI18N
        lblLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblTitulo.setFont(new java.awt.Font("Roboto Slab", 0, 52)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Conecte seu totem");

        iptIdTotem.setBackground(new java.awt.Color(217, 217, 217));
        iptIdTotem.setFont(new java.awt.Font("ABeeZee", 0, 28)); // NOI18N
        iptIdTotem.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        iptIdTotem.setText("Tokem:");
        iptIdTotem.setActionCommand("<Not Set>");
        iptIdTotem.setPreferredSize(new java.awt.Dimension(350, 70));

        btnConectar.setText("Conectar");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iptIdTotem, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConectar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(iptIdTotem, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(196, 196, 196)
                        .addComponent(btnConectar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        // TODO add your handling code here:
        System.out.println("Função chamada!");
        String tokenDigitado = iptIdTotem.getText();

        List<Totem> totens = totem.buscarTotemPeloToken(tokenDigitado);

        if (!totens.isEmpty()) {
            for (int i = 0; i < totens.size(); i++) {
                Totem totemAtual = totens.get(i);

                if (totemAtual.getTokem().equals(tokenDigitado)) {
                    System.out.println("Totem encontrado! Capturando dados.");
                } else {
                    System.out.println("O token não é igual!");
                }
            }
        } else {
            System.out.println("Não achei nenhum totem com o token " + tokenDigitado + " :(");
        }
    }//GEN-LAST:event_btnConectarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConectar;
    private javax.swing.JTextField iptIdTotem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
