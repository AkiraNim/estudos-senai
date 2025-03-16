
package DAO;

import DTO.FuncionarioDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FuncionarioDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
   public void cadastrar(FuncionarioDTO funcionario){
       String sql = "INSERT INTO funcionarios (nome, email) VALUES (?, ?)";
       
       conn = new ConnectionDAO().connectDB();
       
       try {
           pstm = conn.prepareStatement(sql);
           pstm.setString(1, funcionario.getName());
           pstm.setString(2, funcionario.getEmail());
           
           pstm.execute();
           pstm.close();
           
           JOptionPane.showMessageDialog(null, funcionario.getName() + " cadastrado com sucesso");
           
       } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e.getMessage() + " nao foi possivel cadastrar o funcionario.");
       }
   }
   public ArrayList<FuncionarioDTO> listar(){
       String sql = "SELECT * FROM funcionarios";
       ArrayList<FuncionarioDTO> funcionarios = new ArrayList<>();
       
       conn = new ConnectionDAO().connectDB();
       
       try {
           pstm = conn.prepareStatement(sql);
           rs = pstm.executeQuery();
           
           while(rs.next()){
               FuncionarioDTO funcionario = new FuncionarioDTO(rs.getInt("id"),
                       rs.getString("nome"),
                       rs.getString("email")
               );
               funcionarios.add(funcionario);
           }
           
       } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e.getMessage() + " nao foi possivel listar.");
       }
       return funcionarios;
   }

    public void deletar(FuncionarioDTO funcionario){
        String sql = "DELETE FROM funcionarios WHERE id = ?";
        conn = new ConnectionDAO().connectDB();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, funcionario.getId());

            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Funcionario deletado com sucesso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    } 
   public void update(FuncionarioDTO funcionario){
       String sql = "UPDATE FUNCIONARIOS SET nome = ?, email = ? WHERE id = ?";
       
       conn = new ConnectionDAO().connectDB();
       
       try {
           pstm = conn.prepareStatement(sql);
           pstm.setString(1, funcionario.getName());
           pstm.setString(2, funcionario.getEmail());
           pstm.setInt(3, funcionario.getId());
           
           pstm.execute();
           pstm.close();
           
           JOptionPane.showMessageDialog(null, "Funcionario atualizado com sucesso");
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage());
       }
       
   }
   
}
