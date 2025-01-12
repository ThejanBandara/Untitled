/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package north_sussex_judo;

import java.util.jar.Attributes.Name;

import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        WeightInput = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TrainigProgrammeInput = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        NameInput = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        CompetitionWeightCategoryInput = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        CompetitionEntriesInput = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        PrivateCoachingInput = new javax.swing.JTextField();
        Submitbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        WeightInput.setBackground(new java.awt.Color(232, 232, 232));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Weight ");

        TrainigProgrammeInput.setBackground(new java.awt.Color(232, 232, 232));
        TrainigProgrammeInput.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Beginner", "Intermediate", "Elite" }));
        TrainigProgrammeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrainigProgrammeInputActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Training Programme");

        NameInput.setBackground(new java.awt.Color(232, 232, 232));
        NameInput.setToolTipText("hi ");
        NameInput.setAutoscrolls(false);

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Name");

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Competition Weight category");

        CompetitionWeightCategoryInput.setBackground(new java.awt.Color(232, 232, 232));
        CompetitionWeightCategoryInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Heavyweight (over 100 KG)", "Light-Heavyweight (92 - 100KG)", "Middleweight (82 - 90 KG)", "Light-Middleweight (74 - 81 KG)", "Lightweight (67 - 73 KG)", "Flyweight (Below 66 KG)" }));

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Competition entries");

        CompetitionEntriesInput.setBackground(new java.awt.Color(232, 232, 232));
        CompetitionEntriesInput.setText("0");

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("private coaching hours");

        PrivateCoachingInput.setBackground(new java.awt.Color(232, 232, 232));

        Submitbutton.setBackground(new java.awt.Color(232, 232, 232));
        Submitbutton.setForeground(new java.awt.Color(0, 0, 0));
        Submitbutton.setText("Submit");
        Submitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(CompetitionEntriesInput)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(CompetitionWeightCategoryInput, 0, 0, Short.MAX_VALUE)
                        .addComponent(PrivateCoachingInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14)
                    .addComponent(jLabel11)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel9)
                        .addComponent(WeightInput)
                        .addComponent(jLabel10)
                        .addComponent(TrainigProgrammeInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(Submitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(1, 1, 1)
                .addComponent(TrainigProgrammeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WeightInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(1, 1, 1)
                        .addComponent(CompetitionWeightCategoryInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CompetitionEntriesInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PrivateCoachingInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Submitbutton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public boolean Datavaidation(){
        boolean DatavaidationDone = true;
        int weight = Integer.parseInt(WeightInput.getText());
        int competitionEntriesInt = Integer.parseInt(CompetitionEntriesInput.getText());
        int PrivateCoahingHoursInt = Integer.parseInt(PrivateCoachingInput.getText());

        if (NameInput.getText().isEmpty() || TrainigProgrammeInput.getSelectedItem() == null || WeightInput.getText().isEmpty() || CompetitionWeightCategoryInput.getSelectedItem() == null || CompetitionEntriesInput.getText().isEmpty() || PrivateCoachingInput.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill in all fields");
            DatavaidationDone = false;
            return DatavaidationDone;
        }
        
        if(weight <= 0){
            JOptionPane.showMessageDialog(null, "Please enter a valid weight");
            DatavaidationDone = false;
            return DatavaidationDone;
        }
        if(competitionEntriesInt < 0){
            JOptionPane.showMessageDialog(null, "Please enter a valid number to competition entries");
            DatavaidationDone = false;
            return DatavaidationDone;
        }
        if(PrivateCoahingHoursInt < 0 || PrivateCoahingHoursInt > 6){
            JOptionPane.showMessageDialog(null, "Please enter a valid number to private coaching hours between 1 and 5");
            DatavaidationDone = false;
            return DatavaidationDone;
        }

        DatavaidationDone = true;
        return DatavaidationDone; 
    }

    public void TransferData(){

        String name = NameInput.getText();
        String TrainingProgram = TrainigProgrammeInput.getSelectedItem().toString();
        int weight = Integer.parseInt(WeightInput.getText());
        String CompetitionWeightCategory = CompetitionWeightCategoryInput.getSelectedItem().toString();
        int CompetitionEntries = Integer.parseInt(CompetitionEntriesInput.getText());
        int PrivateCoachingHours = Integer.parseInt(PrivateCoachingInput.getText());
        
        Data d = new Data(name, TrainingProgram, weight, CompetitionWeightCategory, CompetitionEntries, PrivateCoachingHours);

        Out o = new Out(d);
        o.setVisible(true);
        this.setVisible(false);

    }
    private void TrainigProgrammeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrainigProgrammeInputActionPerformed
        String response = TrainigProgrammeInput.getSelectedItem().toString();

        if (response == "Beginner"){
            CompetitionEntriesInput.setEnabled(false);
        }
        else{
            CompetitionEntriesInput.setEnabled(true);
        }

    }//GEN-LAST:event_TrainigProgrammeInputActionPerformed

    private void SubmitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitbuttonActionPerformed
        if (Datavaidation() == false){
            return;
        }
        else{
            TransferData();
        }
    }//GEN-LAST:event_SubmitbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CompetitionEntriesInput;
    private javax.swing.JComboBox<String> CompetitionWeightCategoryInput;
    private javax.swing.JTextField NameInput;
    private javax.swing.JTextField PrivateCoachingInput;
    private javax.swing.JButton Submitbutton;
    private javax.swing.JComboBox TrainigProgrammeInput;
    private javax.swing.JTextField WeightInput;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
