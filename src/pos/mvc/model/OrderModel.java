/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.model;

/**
 *
 * @author Hiran
 */
public class OrderModel {
    private String ordeId;
     private String orderDate;
      private String custId;

    public OrderModel() {
    }

    public OrderModel(String ordeId, String orderDate, String custId) {
        this.ordeId = ordeId;
        this.orderDate = orderDate;
        this.custId = custId;
    }

    /**
     * @return the ordeId
     */
    public String getOrdeId() {
        return ordeId;
    }

    /**
     * @param ordeId the ordeId to set
     */
    public void setOrdeId(String ordeId) {
        this.ordeId = ordeId;
    }

    /**
     * @return the orderDate
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * @return the custId
     */
    public String getCustId() {
        return custId;
    }

    /**
     * @param custId the custId to set
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    @Override
    public String toString() {
        return "OrdeModel{" + "ordeId=" + ordeId + ", orderDate=" + orderDate + ", custId=" + custId + '}';
    }
      
      
      
    
}
