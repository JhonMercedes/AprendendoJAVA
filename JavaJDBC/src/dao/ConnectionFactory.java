package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.util.logging.PlatformLogger;


public class ConnectionFactory {
    
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/registro";
    private static final String USER = "root";
    private static final String PASS = "root";
    
    
    public static  Connection getConexao() throws SQLException {
        try {
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL, USER, PASS);
        }catch (ClassNotFoundException ex) {
            throw new RuntimeException("Erro na conexao: ");
        }
}


}

/*
try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/registro", "root", "root");
        }catch (Exception erro) {
            throw new RuntimeException("Nao conectou ao banco de dados" +erro);
        }


    public static void closeConnection (Connection con){
        
            try {
                if (con != null){
                con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    public static void closeConnection(Connection con, PreparedStatement pstm) {
            closeConnection(con);
            
            try {
                if (pstm != null) {
                    pstm.close();
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    
    public static void closeConnection(Connection con, PreparedStatement pstm, ResultSet result) {
            
        closeConnection(con, pstm);
         try {
                if (result != null) {
                    result.close();
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
*/