package control;

import com.mysql.jdbc.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private Statement stmt;
    private Connection conexao;
    private final String user = "root";
    private final String pass = "";
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private final String local = "jdbc:mysql://localhost:3306/projetoers";

    public void Conecta() {

        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(user, user, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
