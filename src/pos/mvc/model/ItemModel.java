/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.model;

/**
 *
 * @author Hiran
 */
public class ItemModel {
    
    private String itemCode;
    private String description;
    private String PackSize;
    private Double  unitPrice;
    private Integer qoh;

    public ItemModel() {
    }

    public ItemModel(String itemCode, String description, String PackSize, Double unitPrice, Integer qoh) {
        this.itemCode = itemCode;
        this.description = description;
        this.PackSize = PackSize;
        this.unitPrice = unitPrice;
        this.qoh = qoh;
    }
    
    
    

    /**
     * @return the itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the PackSize
     */
    public String getPackSize() {
        return PackSize;
    }

    /**
     * @param PackSize the PackSize to set
     */
    public void setPackSize(String PackSize) {
        this.PackSize = PackSize;
    }

    /**
     * @return the unitPrice
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return the qoh
     */
    public Integer getQoh() {
        return qoh;
    }

    /**
     * @param qoh the qoh to set
     */
    public void setQoh(Integer qoh) {
        this.qoh = qoh;
    }

    @Override
    public String toString() {
        return "ItemModel{" + "itemCode=" + itemCode + ", description=" + description + ", PackSize=" + PackSize + ", unitPrice=" + unitPrice + ", qoh=" + qoh + '}';
    }
    
    
    
    
}
