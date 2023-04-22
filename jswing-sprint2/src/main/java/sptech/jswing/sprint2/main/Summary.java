package sptech.jswing.sprint2.main;


public class Summary extends javax.swing.JFrame {

 
    public Summary() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTituloInfos = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblNomeValue = new javax.swing.JLabel();
        lblSO = new javax.swing.JLabel();
        lblSOValue = new javax.swing.JLabel();
        lblRam = new javax.swing.JLabel();
        lblRamValue = new javax.swing.JLabel();
        lblIP = new javax.swing.JLabel();
        lblIPValue = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblEstadoValue = new javax.swing.JLabel();
        lblProcessador = new javax.swing.JLabel();
        lblProcessadorValue = new javax.swing.JLabel();
        lblDisco = new javax.swing.JLabel();
        lblDiscoValue = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblBgSummary = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setSize(new java.awt.Dimension(1280, 720));

        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(null);

        lblTituloInfos.setFont(new java.awt.Font("Roboto Slab", 0, 64)); // NOI18N
        lblTituloInfos.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloInfos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloInfos.setText("Informações do Totem");
        lblTituloInfos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblTituloInfos);
        lblTituloInfos.setBounds(220, 100, 690, 80);

        lblNome.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblNome.setForeground(new java.awt.Color(190, 212, 227));
        lblNome.setText("Nome");
        jPanel1.add(lblNome);
        lblNome.setBounds(240, 210, 42, 19);

        lblNomeValue.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        lblNomeValue.setForeground(new java.awt.Color(248, 252, 255));
        lblNomeValue.setText("Totem 01");
        jPanel1.add(lblNomeValue);
        lblNomeValue.setBounds(240, 230, 250, 40);

        lblSO.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblSO.setForeground(new java.awt.Color(190, 212, 227));
        lblSO.setText("Sistema Operacional");
        jPanel1.add(lblSO);
        lblSO.setBounds(240, 310, 160, 19);

        lblSOValue.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        lblSOValue.setForeground(new java.awt.Color(248, 252, 255));
        lblSOValue.setText("Linux");
        jPanel1.add(lblSOValue);
        lblSOValue.setBounds(240, 330, 200, 50);

        lblRam.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblRam.setForeground(new java.awt.Color(190, 212, 227));
        lblRam.setText("Total Ram");
        jPanel1.add(lblRam);
        lblRam.setBounds(240, 420, 80, 19);

        lblRamValue.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        lblRamValue.setForeground(new java.awt.Color(248, 252, 255));
        lblRamValue.setText("16gb");
        jPanel1.add(lblRamValue);
        lblRamValue.setBounds(240, 440, 130, 50);

        lblIP.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblIP.setForeground(new java.awt.Color(190, 212, 227));
        lblIP.setText("IPv4");
        jPanel1.add(lblIP);
        lblIP.setBounds(240, 530, 50, 19);

        lblIPValue.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        lblIPValue.setForeground(new java.awt.Color(248, 255, 255));
        lblIPValue.setText("00.000.000.00");
        jPanel1.add(lblIPValue);
        lblIPValue.setBounds(240, 550, 350, 40);

        lblEstado.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(190, 212, 227));
        lblEstado.setText("Estado");
        jPanel1.add(lblEstado);
        lblEstado.setBounds(770, 210, 60, 19);

        lblEstadoValue.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        lblEstadoValue.setForeground(new java.awt.Color(171, 234, 149));
        lblEstadoValue.setText("Ativo");
        jPanel1.add(lblEstadoValue);
        lblEstadoValue.setBounds(770, 230, 290, 50);

        lblProcessador.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblProcessador.setForeground(new java.awt.Color(190, 212, 227));
        lblProcessador.setText("Processador");
        jPanel1.add(lblProcessador);
        lblProcessador.setBounds(770, 310, 100, 19);

        lblProcessadorValue.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        lblProcessadorValue.setForeground(new java.awt.Color(248, 255, 255));
        lblProcessadorValue.setText("i5-1000");
        jPanel1.add(lblProcessadorValue);
        lblProcessadorValue.setBounds(770, 320, 270, 60);

        lblDisco.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblDisco.setForeground(new java.awt.Color(190, 212, 227));
        lblDisco.setText("Total Disco");
        jPanel1.add(lblDisco);
        lblDisco.setBounds(770, 410, 80, 19);

        lblDiscoValue.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        lblDiscoValue.setForeground(new java.awt.Color(248, 255, 255));
        lblDiscoValue.setText("128gb");
        jPanel1.add(lblDiscoValue);
        lblDiscoValue.setBounds(770, 420, 200, 70);

        jButton1.setBackground(new java.awt.Color(236, 38, 38));
        jButton1.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon-exit.png"))); // NOI18N
        jButton1.setText("Desconectar");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 10, true));
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.setMixingCutoutShape(null);
        jPanel1.add(jButton1);
        jButton1.setBounds(1018, 30, 200, 50);

        lblBgSummary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bg-summary.png"))); // NOI18N
        lblBgSummary.setText("0");
        jPanel1.add(lblBgSummary);
        lblBgSummary.setBounds(0, 0, 1280, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Summary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBgSummary;
    private javax.swing.JLabel lblDisco;
    private javax.swing.JLabel lblDiscoValue;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblEstadoValue;
    private javax.swing.JLabel lblIP;
    private javax.swing.JLabel lblIPValue;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeValue;
    private javax.swing.JLabel lblProcessador;
    private javax.swing.JLabel lblProcessadorValue;
    private javax.swing.JLabel lblRam;
    private javax.swing.JLabel lblRamValue;
    private javax.swing.JLabel lblSO;
    private javax.swing.JLabel lblSOValue;
    private javax.swing.JLabel lblTituloInfos;
    // End of variables declaration//GEN-END:variables
}
