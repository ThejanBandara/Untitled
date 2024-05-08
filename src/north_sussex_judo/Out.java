/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package north_sussex_judo;

import java.security.PublicKey;

import javax.swing.JLabel;

public class Out extends javax.swing.JFrame {

    private static  Data data;

    public Out(Data data) {
        initComponents();
        this.data = data;
        DisplayData();
    }

    public void DisplayData(){
        String name = data.name;
        String TrainingProgram = data.TrainingProgram;
        int weight = data.weight;
        String CompetitionWeightCategory = data.CompetitionWeightCategory;
        int CompetitionEntries = data.CompetitionEntries;
        int PrivateCoachingHours = data.PrivateCoachingHours;

        double TrainingCost =0;
        double TrainingWeeklyCost;
        double CompetitionEntryCost;
        double CompetitionEntryFee = 22.00;
        double PrivateCoachingCost;
        double PrivateCoachingFee = 19.50;
        double TotalCost;

        if(TrainingProgram == "Beginner"){
            TrainingWeeklyCost = 25.00;
            TrainingCost = TrainingWeeklyCost * 4;
        }
        else if (TrainingProgram == "Intermediate"){
            TrainingWeeklyCost = 30.00;
            TrainingCost = TrainingWeeklyCost * 4;
        }
        else if (TrainingProgram == "Elite"){ 
            TrainingWeeklyCost = 35.00;
            TrainingCost = TrainingWeeklyCost * 4;
        }

        CompetitionEntryCost = CompetitionEntries * CompetitionEntryFee;

        PrivateCoachingCost = PrivateCoachingHours * PrivateCoachingFee;

        TotalCost = TrainingCost + CompetitionEntryCost + PrivateCoachingCost;


        jLabel1.setText("<html>Name: " + name 
        +"<br>Training Program: " + TrainingProgram
        +"<br>Weight: " + weight
        +"<br>Competition Weight Category: " + CompetitionWeightCategory
        +"<br>Competition Entries: " + CompetitionEntries
        +"<br>Private Coaching Hours: " + PrivateCoachingHours
        +"<br>Training Cost: " + TrainingCost
        +"<br>Competition Entry Cost: " + CompetitionEntryCost
        +"<br>Private Coaching Cost: " + PrivateCoachingCost
        +"<br>Total Cost: " + TotalCost);

     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(342, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(267, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Out.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Out.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Out.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Out.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Out(data).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
