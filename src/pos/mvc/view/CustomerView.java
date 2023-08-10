/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pos.mvc.view;

/**
 *
 * @author Hiran
 */
public class CustomerView extends javax.swing.JFrame {

    /**
     * Creates new form customerView
     */
    public CustomerView() {
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

        basePanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        headerlabel = new javax.swing.JLabel();
        fromPanel = new javax.swing.JPanel();
        custidLabel = new javax.swing.JLabel();
        custidText = new javax.swing.JTextField();
        custtitleLabel1 = new javax.swing.JLabel();
        custtitleText = new javax.swing.JTextField();
        custnameLabel = new javax.swing.JLabel();
        custnameText = new javax.swing.JTextField();
        custdobLabel = new javax.swing.JLabel();
        custdobText = new javax.swing.JTextField();
        custaddressLabel = new javax.swing.JLabel();
        custaddressText = new javax.swing.JTextField();
        custcityText = new javax.swing.JTextField();
        custcityLabel = new javax.swing.JLabel();
        custprovinceText = new javax.swing.JTextField();
        custprovinceLabel = new javax.swing.JLabel();
        custpostcodeText = new javax.swing.JTextField();
        custpostcodeLabel = new javax.swing.JLabel();
        addbotton = new javax.swing.JButton();
        deletebotton = new javax.swing.JButton();
        updatebotton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        basePanel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        headerlabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        headerlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerlabel.setText(" Manage Customer");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        custidLabel.setText("Customer Id ");

        custtitleLabel1.setText("Customer Title ");

        custnameLabel.setText("Customer Name");

        custnameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custnameTextActionPerformed(evt);
            }
        });

        custdobLabel.setText("Customer DOB");

        custaddressLabel.setText("Address");

        custcityLabel.setText("City");

        custprovinceText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custprovinceTextActionPerformed(evt);
            }
        });

        custprovinceLabel.setText("Province");

        custpostcodeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custpostcodeTextActionPerformed(evt);
            }
        });

        custpostcodeLabel.setText("Post Code");

        addbotton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addbotton.setText("Save customer");

        deletebotton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deletebotton.setText("Delete customer");

        updatebotton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updatebotton.setText("Update customer");

        javax.swing.GroupLayout fromPanelLayout = new javax.swing.GroupLayout(fromPanel);
        fromPanel.setLayout(fromPanelLayout);
        fromPanelLayout.setHorizontalGroup(
            fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fromPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fromPanelLayout.createSequentialGroup()
                        .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(custtitleLabel1)
                            .addComponent(custidLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(custtitleText, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(custidText))
                        .addGap(18, 18, 18)
                        .addComponent(custnameLabel)
                        .addGap(5, 5, 5)
                        .addComponent(custnameText, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fromPanelLayout.createSequentialGroup()
                        .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(custdobLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(custaddressLabel)
                                .addComponent(custcityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(custpostcodeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(custaddressText, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(fromPanelLayout.createSequentialGroup()
                                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(custcityText, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(custpostcodeText))
                                .addGap(26, 26, 26)
                                .addComponent(custprovinceLabel)
                                .addGap(18, 18, 18)
                                .addComponent(custprovinceText, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(custdobText, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fromPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deletebotton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updatebotton)
                .addGap(12, 12, 12)
                .addComponent(addbotton)
                .addGap(86, 86, 86))
        );
        fromPanelLayout.setVerticalGroup(
            fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fromPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custidText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custtitleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custtitleText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(custnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(custnameText)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custdobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custdobText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custaddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custaddressText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(custcityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(custcityText)
                        .addComponent(custprovinceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(custprovinceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custpostcodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custpostcodeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbotton)
                    .addComponent(deletebotton)
                    .addComponent(updatebotton))
                .addContainerGap())
        );

        javax.swing.GroupLayout basePanelLayout = new javax.swing.GroupLayout(basePanel);
        basePanel.setLayout(basePanelLayout);
        basePanelLayout.setHorizontalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fromPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        basePanelLayout.setVerticalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fromPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 208, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void custnameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custnameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custnameTextActionPerformed

    private void custprovinceTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custprovinceTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custprovinceTextActionPerformed

    private void custpostcodeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custpostcodeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custpostcodeTextActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbotton;
    private javax.swing.JPanel basePanel;
    private javax.swing.JLabel custaddressLabel;
    private javax.swing.JTextField custaddressText;
    private javax.swing.JLabel custcityLabel;
    private javax.swing.JTextField custcityText;
    private javax.swing.JLabel custdobLabel;
    private javax.swing.JTextField custdobText;
    private javax.swing.JLabel custidLabel;
    private javax.swing.JTextField custidText;
    private javax.swing.JLabel custnameLabel;
    private javax.swing.JTextField custnameText;
    private javax.swing.JLabel custpostcodeLabel;
    private javax.swing.JTextField custpostcodeText;
    private javax.swing.JLabel custprovinceLabel;
    private javax.swing.JTextField custprovinceText;
    private javax.swing.JLabel custtitleLabel1;
    private javax.swing.JTextField custtitleText;
    private javax.swing.JButton deletebotton;
    private javax.swing.JPanel fromPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel headerlabel;
    private javax.swing.JButton updatebotton;
    // End of variables declaration//GEN-END:variables
}
