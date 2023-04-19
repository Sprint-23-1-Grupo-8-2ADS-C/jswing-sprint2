package sptech.jswing.sprint2.main;

/**
 *
 * @author marcusgoncalves
 */
public class Login extends javax.swing.JFrame {    
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
        setMaximumSize(new java.awt.Dimension(1440, 1024));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setMixingCutoutShape(null);
        setPreferredSize(new java.awt.Dimension(1440, 1024));
        setSize(new java.awt.Dimension(1440, 1024));

        jPanel1.setMaximumSize(new java.awt.Dimension(1440, 1024));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 1024));
        jPanel1.setSize(new java.awt.Dimension(1440, 1024));
        jPanel1.setLayout(null);

        lblTituloInfo.setFont(new java.awt.Font("Roboto Slab", 0, 64)); // NOI18N
        lblTituloInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloInfo.setText("Conecte o seu totem");
        jPanel1.add(lblTituloInfo);
        lblTituloInfo.setBounds(400, 180, 602, 86);

        iptToken.setBackground(new java.awt.Color(217, 217, 217));
        iptToken.setFont(new java.awt.Font("ABeeZee", 0, 32)); // NOI18N
        iptToken.setForeground(new java.awt.Color(255, 255, 255));
        iptToken.setText("Token:");
        iptToken.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        iptToken.setMaximumSize(new java.awt.Dimension(425, 82));
        iptToken.setMinimumSize(new java.awt.Dimension(425, 82));
        iptToken.setPreferredSize(new java.awt.Dimension(425, 82));
        iptToken.setSize(new java.awt.Dimension(425, 82));
        jPanel1.add(iptToken);
        iptToken.setBounds(480, 360, 425, 82);

        btnConectar.setBackground(new java.awt.Color(6, 83, 182));
        btnConectar.setFont(new java.awt.Font("Play", 1, 32)); // NOI18N
        btnConectar.setForeground(new java.awt.Color(255, 255, 255));
        btnConectar.setText("Conectar");
        btnConectar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConectar.setMaximumSize(new java.awt.Dimension(425, 79));
        btnConectar.setMinimumSize(new java.awt.Dimension(425, 79));
        btnConectar.setSize(new java.awt.Dimension(425, 79));
        jPanel1.add(btnConectar);
        btnConectar.setBounds(480, 520, 425, 79);

        imgBackground.setBackground(new java.awt.Color(255, 255, 255));
        imgBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bg.png"))); // NOI18N
        imgBackground.setText("jLabel2");
        imgBackground.setMaximumSize(new java.awt.Dimension(1444, 1024));
        imgBackground.setMinimumSize(new java.awt.Dimension(1280, 720));
        imgBackground.setPreferredSize(new java.awt.Dimension(1440, 1024));
        imgBackground.setSize(new java.awt.Dimension(1440, 1024));
        jPanel1.add(imgBackground);
        imgBackground.setBounds(0, 0, 1440, 1024);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Mostra a tela de login */
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
