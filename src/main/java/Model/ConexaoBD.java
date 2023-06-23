package Model;

import java.sql.*;

public class ConexaoBD {
    public static Connection ConexaoBD(){

        Connection conexao = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3307/bank", "root", "28312515");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conexao;
    }
}
