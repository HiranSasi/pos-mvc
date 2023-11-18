/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pos.mvc.view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pos.mvc.contoller.ItemContoller;
import pos.mvc.model.ItemModel;

/**
 *
 * @author Hiran
 */
public class ItemView extends javax.swing.JFrame {
    
    ItemContoller itemContoller;

    /**
     * Creates new form ItemView
     */
    public ItemView() {
        initComponents();
        itemContoller = new ItemContoller();
        loadAllItems();
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
        itemcodeLabel = new javax.swing.JLabel();
        itemcodeText = new javax.swing.JTextField();
        descriptionLabel1 = new javax.swing.JLabel();
        itemdescriptionText = new javax.swing.JTextField();
        packsizeLabel = new javax.swing.JLabel();
        itempackSizeText = new javax.swing.JTextField();
        unitpriceLabel = new javax.swing.JLabel();
        itemunitpriceText = new javax.swing.JTextField();
        itemqohText = new javax.swing.JTextField();
        qohLabel = new javax.swing.JLabel();
        addbotton = new javax.swing.JButton();
        deletebotton = new javax.swing.JButton();
        updatebotton = new javax.swing.JButton();
        tablepanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemsTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        basePanel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        headerlabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        headerlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerlabel.setText(" Manage Items");

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

        itemcodeLabel.setText("Item Code");

        itemcodeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemcodeTextActionPerformed(evt);
            }
        });

        descriptionLabel1.setText("Description");

        packsizeLabel.setText("Pack Size");

        unitpriceLabel.setText(" Unit Price");

        itemunitpriceText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemunitpriceTextActionPerformed(evt);
            }
        });

        qohLabel.setText("QOH");

        addbotton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addbotton.setText("Save Item");
        addbotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbottonActionPerformed(evt);
            }
        });

        deletebotton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deletebotton.setText("Delete Item");
        deletebotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebottonActionPerformed(evt);
            }
        });

        updatebotton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updatebotton.setText("Update Item");
        updatebotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebottonActionPerformed(evt);
            }
        });

        itemsTable.setBackground(new java.awt.Color(204, 204, 255));
        itemsTable.setBorder(new javax.swing.border.MatteBorder(null));
        itemsTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itemsTable.setForeground(new java.awt.Color(0, 0, 0));
        itemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        itemsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(itemsTable);

        javax.swing.GroupLayout tablepanelLayout = new javax.swing.GroupLayout(tablepanel);
        tablepanel.setLayout(tablepanelLayout);
        tablepanelLayout.setHorizontalGroup(
            tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablepanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        tablepanelLayout.setVerticalGroup(
            tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fromPanelLayout = new javax.swing.GroupLayout(fromPanel);
        fromPanel.setLayout(fromPanelLayout);
        fromPanelLayout.setHorizontalGroup(
            fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fromPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(fromPanelLayout.createSequentialGroup()
                        .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fromPanelLayout.createSequentialGroup()
                                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(descriptionLabel1)
                                    .addComponent(itemcodeLabel))
                                .addGap(37, 37, 37)
                                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(itemcodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(itemdescriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(fromPanelLayout.createSequentialGroup()
                                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(packsizeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(unitpriceLabel)
                                    .addComponent(qohLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(43, 43, 43)
                                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(itemunitpriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(itempackSizeText, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(itemqohText, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(268, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fromPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fromPanelLayout.createSequentialGroup()
                                .addComponent(deletebotton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(updatebotton)
                                .addGap(12, 12, 12)
                                .addComponent(addbotton)
                                .addGap(86, 86, 86))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fromPanelLayout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(56, 56, 56))))))
        );
        fromPanelLayout.setVerticalGroup(
            fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fromPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemcodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemcodeText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descriptionLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemdescriptionText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(packsizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itempackSizeText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unitpriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemunitpriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qohLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemqohText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbotton)
                    .addComponent(deletebotton)
                    .addComponent(updatebotton))
                .addGap(18, 18, 18)
                .addComponent(tablepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnBack)
                .addGap(25, 25, 25))
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
                .addComponent(fromPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(basePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbottonActionPerformed
        // TODO add your handling code here:
        saveItems();
    }//GEN-LAST:event_addbottonActionPerformed

    private void deletebottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebottonActionPerformed
        // TODO add your handling code here:
        deletItem();
    }//GEN-LAST:event_deletebottonActionPerformed

    private void updatebottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebottonActionPerformed
        // TODO add your handling code here:
        updateItems();
    }//GEN-LAST:event_updatebottonActionPerformed

    private void itemsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemsTableMouseClicked
        // TODO add your handling code here:
        searchItems();
    }//GEN-LAST:event_itemsTableMouseClicked

    private void itemcodeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemcodeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemcodeTextActionPerformed

    private void itemunitpriceTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemunitpriceTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemunitpriceTextActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
           this.setVisible(false);
        new MainView().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    
     //* @param args the command line arguments
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbotton;
    private javax.swing.JPanel basePanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton deletebotton;
    private javax.swing.JLabel descriptionLabel1;
    private javax.swing.JPanel fromPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel headerlabel;
    private javax.swing.JLabel itemcodeLabel;
    private javax.swing.JTextField itemcodeText;
    private javax.swing.JTextField itemdescriptionText;
    private javax.swing.JTextField itempackSizeText;
    private javax.swing.JTextField itemqohText;
    private javax.swing.JTable itemsTable;
    private javax.swing.JTextField itemunitpriceText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel packsizeLabel;
    private javax.swing.JLabel qohLabel;
    private javax.swing.JPanel tablepanel;
    private javax.swing.JLabel unitpriceLabel;
    private javax.swing.JButton updatebotton;
    // End of variables declaration//GEN-END:variables
public void  loadAllItems(){

        try {
            String [] columns = { "ItemCode", "Description","PackSize"," UnitPrice","QtyOnHand"};
            DefaultTableModel dtm = new DefaultTableModel(columns, 0){
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
                
                
            };
            itemsTable.setModel(dtm);
            
            ArrayList<ItemModel> itemModels =itemContoller.getAllItems();
            
            for (ItemModel itemModel : itemModels) {
        
                Object[] rowData = {itemModel.getItemCode(),itemModel.getDescription(),itemModel.getPackSize(),itemModel.getUnitPrice(),itemModel.getQoh()};
                dtm.addRow(rowData);
            }   } catch (SQLException ex) {
            Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
      JOptionPane.showMessageDialog(this, ex);
            }
                  


}
   private void saveItems(){
   
        try {
            ItemModel itemModel = new ItemModel(itemcodeText.getText(),
                    itemdescriptionText.getText(),
                    itempackSizeText.getText(),
                    Double.parseDouble(itemunitpriceText.getText()),
                    Integer.parseInt(itemqohText.getText()));
            
            String resp = itemContoller.saveCustomer(itemModel);
            JOptionPane.showMessageDialog(this, resp);
            clear();
            loadAllItems();
            
        } catch (SQLException ex) {
            Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        }
   
   
   
   
   }
   
    private void clear(){
            
            itemcodeText.setText("");
            itemdescriptionText.setText("");
            itempackSizeText.setText("");
            itemunitpriceText.setText("");
            itemqohText.setText("");
            
                 
        }
    
    private void searchItems(){
    
        try {
            String itemCode = itemsTable.getValueAt(itemsTable.getSelectedRow(), 0).toString();
            
            ItemModel itemModel = itemContoller.searchItems(itemCode);
            
            
             if(itemModel != null){
            
              itemcodeText.setText(itemModel.getItemCode());
            itemdescriptionText.setText(itemModel.getDescription());
            itempackSizeText.setText(itemModel.getPackSize());
            itemunitpriceText.setText(Double.toString(itemModel.getUnitPrice()));
            itemqohText.setText(Integer.toString(itemModel.getQoh()));
              
            
            }else{
            
            
            JOptionPane.showMessageDialog(this,"Item Not Found");
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(this, ex);
        }
    
    
    }
    
    private void updateItems(){
    
    
        try {
            ItemModel itemModel = new ItemModel(itemcodeText.getText(),
                    itemdescriptionText.getText(),
                    itempackSizeText.getText(),
                    Double.parseDouble(itemunitpriceText.getText()),
                    Integer.parseInt(itemqohText.getText()));
            
            String resp = itemContoller.updateItems(itemModel);
            JOptionPane.showMessageDialog(this, resp);
            clear();
            loadAllItems();
            
        } catch (SQLException ex) {
            Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        }
            
    
    }
    
    private void deletItem(){
    
        try {
            String itemCode = itemcodeText.getText();
            String resp = itemContoller.deleteItem(itemCode);
            JOptionPane.showMessageDialog(this, resp);
            clear();
            loadAllItems();
        } catch (SQLException ex) {
            Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(this, ex);
        }
    
    
    
    }
    
    
}