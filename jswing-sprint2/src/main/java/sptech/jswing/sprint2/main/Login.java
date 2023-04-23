package sptech.jswing.sprint2.main;

import com.github.britooo.looca.api.core.Looca;
import sptech.jswing.sprint2.controllers.Totem;
import sptech.jswing.sprint2.models.TotemCRUD;

/**
 *
 * @author marcusgoncalves
 */
public class Login extends javax.swing.JFrame {

    Looca looca = new Looca();

    //Cria o formulário de login
    public Login() {
        initComponents();
    }

    //Não mexemos nesse código, pode quebrar o JFrame
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTituloInfo = new javax.swing.JLabel();
        iptToken = new javax.swing.JTextField();
        btnConectar = new javax.swing.JButton();
        imgBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Conecte seu totem");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 10, 23));
        setLocation(new java.awt.Point(25, 25));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setMixingCutoutShape(null);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jPanel1.setBounds(new java.awt.Rectangle(0, 0, 1280, 720));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setMixingCutoutShape(null);
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(null);

        lblTituloInfo.setFont(new java.awt.Font("Roboto Slab", 0, 64)); // NOI18N
        lblTituloInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloInfo.setText("Conecte o seu totem");
        jPanel1.add(lblTituloInfo);
        lblTituloInfo.setBounds(350, 160, 602, 86);

        iptToken.setBackground(new java.awt.Color(217, 217, 217));
        iptToken.setFont(new java.awt.Font("ABeeZee", 0, 32)); // NOI18N
        iptToken.setForeground(new java.awt.Color(0, 0, 0));
        iptToken.setText("Token:");
        iptToken.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        iptToken.setMaximumSize(new java.awt.Dimension(425, 82));
        iptToken.setMinimumSize(new java.awt.Dimension(425, 82));
        iptToken.setPreferredSize(new java.awt.Dimension(425, 82));
        iptToken.setSize(new java.awt.Dimension(425, 82));
        jPanel1.add(iptToken);
        iptToken.setBounds(430, 340, 425, 82);

        btnConectar.setBackground(new java.awt.Color(6, 83, 182));
        btnConectar.setFont(new java.awt.Font("Play", 1, 32)); // NOI18N
        btnConectar.setForeground(new java.awt.Color(255, 255, 255));
        btnConectar.setText("Conectar");
        btnConectar.setBorder(null);
        btnConectar.setContentAreaFilled(false);
        btnConectar.setBorderPainted(false);
        btnConectar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConectar.setMaximumSize(new java.awt.Dimension(425, 79));
        btnConectar.setMinimumSize(new java.awt.Dimension(425, 79));
        btnConectar.setOpaque(true);
        btnConectar.setSize(new java.awt.Dimension(425, 79));
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConectar);
        btnConectar.setBounds(430, 500, 425, 79);

        imgBackground.setBackground(new java.awt.Color(255, 255, 255));
        imgBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bg.png"))); // NOI18N
        imgBackground.setAlignmentY(0.0F);
        imgBackground.setMaximumSize(new java.awt.Dimension(1280, 720));
        imgBackground.setMinimumSize(new java.awt.Dimension(1280, 720));
        imgBackground.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.add(imgBackground);
        imgBackground.setBounds(-20, -20, 1330, 1040);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        TotemCRUD totemCrud = new TotemCRUD();
        Totem totem;

        String tokenDigitado = iptToken.getText();

        totem = totemCrud.getTotemByToken(tokenDigitado);

        if (totem != null) {
            System.out.println("Select feito!");
            if (tokenDigitado.equals(totem.getToken())) {
                System.out.println("Token válido! Redirecionando e iniciando capturas");

                Summary in = new Summary();

                in.setInfos(totem);

                in.setLocationRelativeTo(null);
                in.setVisible(true);
                in.setResizable(false);

                this.dispose();

            } else {
                System.out.println("Totem não encontrado com o token " + tokenDigitado);
            }
        } else {
            System.out.println("Token/Totem não encontrado no sistema, tente novamente!");
        }


    }//GEN-LAST:event_btnConectarActionPerformed

    public static void main(String args[]) {
        // Mostra a tela de login 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConectar;
    private javax.swing.JLabel imgBackground;
    private javax.swing.JTextField iptToken;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTituloInfo;
    // End of variables declaration//GEN-END:variables
}
