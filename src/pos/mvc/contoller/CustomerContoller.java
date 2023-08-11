/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.contoller;
import pos.mvc.model.CustomerModel;
import java.sql.Connection;
import pos.mvc.db.DBConnection;
import java.sql.SQLException;
import java.sql.PreparedStatement;


/**
 *
 * @author Hiran
 */
public class CustomerContoller {
    
    public String saveCustomer(CustomerModel customerModel)throws SQLException{
        
        Connection connection = DBConnection.getInstance().getConnection();
        
        String query = "INSERT INTO Customer VALUES(?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        
         preparedStatement.setString(1, customerModel.getCustId());
         preparedStatement.setString(2, customerModel.getTitle());
         preparedStatement.setString(3, customerModel.getName());
         preparedStatement.setString(4, customerModel.getDob());
         preparedStatement.setDouble(5, customerModel.getSalary());
         preparedStatement.setString(6, customerModel.getAddress());
         preparedStatement.setString(7, customerModel.getCity());
         preparedStatement.setString(8, customerModel.getProvince());
         preparedStatement.setString(9, customerModel.getZip());
         
         
         
            if (preparedStatement.executeUpdate() > 0) {
               return "Succes";
               
        }else{
                return "Fail";
            }
         
         
         
        
        
        
        
        
  
    }
    
    
    
}
