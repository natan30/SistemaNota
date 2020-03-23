package ConexaoBanco;

import java.sql.*;

public class ModuloConexao {

    //método responsável pra conectar ao banco.

    public static Connection conector() {
        java.sql.Connection conexao = null;
        //  a linha a baixo chama o drive
        String driver = "com.mysql.jdbc.Driver";
        //armazenando informações refente ao banco
        String url = "jdbc:mysql://localhost:3306/dbnotas";
        String user = "root";
        String password = "";
        //estabelecendo conexao com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

} 
