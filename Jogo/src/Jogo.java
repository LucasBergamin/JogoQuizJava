
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lberg
 */
public class Jogo extends javax.swing.JFrame {

    /**
     * Creates new form Jogo
     */
    public Jogo() {
        initComponents();
        
        perguntas[0] = "Quem é mais lindo ? ";
        
        perguntas[1] = "De onde é a invenção do chuveiro elétrico? ";
        
        perguntas[2] = "Quais o menor e o maior país do mundo? ";
        
        perguntas[3] = "Normalmente, quantos litros de sangue uma pessoa tem? ";
        
        perguntas[4] = "Qual o livro mais vendido no mundo a seguir à Bíblia?";
        
        perguntas[5] = "Quantas casas decimais tem o número pi?";
        
        perguntas[6] = "Quais as duas datas que são comemoradas em novembro? ";
        
        perguntas[7] = "Quanto tempo a luz do Sol demora para chegar à Terra?";
        
        perguntas[8] = "Qual personagem folclórico costuma ser agradado pelos caçadores com a oferta de fumo? ";
        
        perguntas[9] = "Qual a velocidade da luz?";
        
        perguntas[10] = "Qual o maior animal terrestre?";
        
        
        respostas[0] = "A";
        
        respostas[1] = "C";
        
        respostas[2] = "B";
        
        respostas[3] = "A";
        
        respostas[4] = "C";
        
        respostas[5] = "A";
        
        respostas[6] = "A";
        
        respostas[7] = "C";
        
        respostas[8] = "B";
        
        respostas[9] = "B";
        
        respostas[10] = "C";
        
        A[1] = "Austrália";
        B[1] = "Inglaterra";
        C[1] = "Brasil";
        
        A[2] = "São Marino e Índia";
        B[2] = "Vaticano e Rússia.";
        C[2] = "Nauru e China";
        
        A[3] = "Entre 4 a 6 litros";
        B[3] = "Tem 2 litros";
        C[3] = "Tem 8 litros";
        
        A[4] = "O Senhor dos Anéis";
        B[4] = "Um Conto de Duas Cidades";
        C[4] = " Dom Quixote.";
        
        A[5] = "Trilhares";
        B[5] = "Milhares";
        C[5] = "Centenas";
        
        A[6] = "Proclamação da República e Dia Nacional da Consciência Negra";
        B[6] = "Independência do Brasil e Dia da Bandeira";
        C[6] = "Black Friday e Dia da Árvore";
        
        A[7] = " 5 minutos.";
        B[7] = "1 dia";
        C[7] = " 8 minutos.";
        
        A[8] = "Saci";
        B[8] = "Caipora.";
        C[8] = "Negrinho do Pastoreio";
        
        A[9] = "30 000 000 metros por segundo (m/s)";
        B[9] = "299 792 458 metros por segundo (m/s).";
        C[9] = "300 000 000 metros por segundo (m/s)";
        
        A[10] = "Girafa";
        B[10] = "Baleia Azul";
        C[10] = "Elefante africano.";
        
        contador = 0;
        continuar = true;
        vida = 3;
    }

    String[] perguntas = new String[11];
    String[] respostas = new String[11];
    
    String[] A = new String[11];
    String[] B = new String[11];
    String[] C = new String[11];
    
    int contador;
    int vida;
    boolean continuar;
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        txtPerguntas = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnOpcao1 = new javax.swing.JButton();
        btnOpcao3 = new javax.swing.JButton();
        btnOpcao2 = new javax.swing.JButton();
        txtA = new javax.swing.JLabel();
        txtB = new javax.swing.JLabel();
        txtC = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtVidas = new javax.swing.JLabel();
        txtperguntas = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTextPane1);

        txtPerguntas.setText("peguntas");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        btnOpcao1.setText("A");
        btnOpcao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcao1ActionPerformed(evt);
            }
        });

        btnOpcao3.setText("C");
        btnOpcao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcao3ActionPerformed(evt);
            }
        });

        btnOpcao2.setText("B");
        btnOpcao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcao2ActionPerformed(evt);
            }
        });

        txtA.setForeground(new java.awt.Color(255, 255, 255));
        txtA.setText("Descartes");

        txtB.setForeground(new java.awt.Color(255, 255, 255));
        txtB.setText("Platão");

        txtC.setBackground(new java.awt.Color(255, 255, 255));
        txtC.setForeground(new java.awt.Color(255, 255, 255));
        txtC.setText("Francis Bacon");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Vidas");

        txtVidas.setText("3");

        txtperguntas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtperguntas.setForeground(new java.awt.Color(255, 255, 255));
        txtperguntas.setText(" De quem é a famosa frase “Penso, logo existo”?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVidas)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(txtA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnOpcao3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtC, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOpcao2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOpcao1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(txtB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(txtperguntas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtVidas))
                .addGap(11, 11, 11)
                .addComponent(txtperguntas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOpcao3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOpcao2)
                .addGap(8, 8, 8)
                .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOpcao1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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
    }// </editor-fold>//GEN-END:initComponents

    public void certo(){
        JOptionPane.showMessageDialog(null, "Resposta correta");
        contador++;
        txtperguntas.setText(perguntas[contador]);
        txtA.setText(A[contador]);
        txtB.setText(B[contador]);
        txtC.setText(C[contador]);
        
        if(contador == 11){
            JOptionPane.showMessageDialog(null, "Parabéns você ganhou o jogo");
            continuar = false;
            Inicial frame = new Inicial();
            frame.setVisible(true);
            dispose();
        }
    }
    
    public void errado(){
        JOptionPane.showMessageDialog(null, "Resposta incorreta");
        contador++;
        vida--;
        txtperguntas.setText(perguntas[contador]);
        txtA.setText(A[contador]);
        txtB.setText(B[contador]);
        txtC.setText(C[contador]);
        txtVidas.setText(vida + "");
        if(vida == 0){
            continuar = false;
            JOptionPane.showMessageDialog(null, "GAME OVER");
            Inicial frame = new Inicial();
            frame.setVisible(true);
            dispose();
        }
    }
    
    private void btnOpcao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcao1ActionPerformed
        while(continuar){
            
            if("A".equals(respostas[contador])){
                certo();
                break;
            }
            else{
                errado();
                break;
            }
            
            
        }
    }//GEN-LAST:event_btnOpcao1ActionPerformed

    private void btnOpcao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcao2ActionPerformed
        while(continuar){
            if("B".equals(respostas[contador])){
                certo();
                break;
            }
            else{
                errado();
                break;
                
            }
        
        }
    }//GEN-LAST:event_btnOpcao2ActionPerformed

    private void btnOpcao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcao3ActionPerformed
        while(continuar){
            if("C".equals(respostas[contador])){
                certo();
                break;
            }
            else{
                errado();
                break;
            }
        
        }
    }//GEN-LAST:event_btnOpcao3ActionPerformed

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
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOpcao1;
    private javax.swing.JButton btnOpcao2;
    private javax.swing.JButton btnOpcao3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel txtA;
    private javax.swing.JLabel txtB;
    private javax.swing.JLabel txtC;
    private javax.swing.JLabel txtPerguntas;
    private javax.swing.JLabel txtVidas;
    private javax.swing.JLabel txtperguntas;
    // End of variables declaration//GEN-END:variables
}
