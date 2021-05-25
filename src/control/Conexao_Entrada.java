package control;

import java.sql.ResultSet;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Connection;
import entities.Entrada;
import entities.Produto;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Conexao_Entrada {

    Connection con;
    PreparedStatement stmt;
    Conexao conecta = new Conexao();

    public void inserir(Entrada entrada) {

        String sql = "INSERT INTO entrada(unidades,data_entrada,id_item) VALUES(?,?,?)";

        try {
            conecta.Conecta();
            stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setInt(1, entrada.getUnidades());
            stmt.setDate(2, (Date) entrada.getData_entrada());
            stmt.setInt(3, entrada.getProduto().getId_item());
            stmt.execute();

        } catch (SQLException ex) {

            ex.printStackTrace();
        }

    }

    public void excluir(Entrada entrada) {

        String sql = "DELETE FROM entrada WHERE id_entrada = ?";

        try {
            conecta.Conecta();
            stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setInt(1, entrada.getId_entrada());
            stmt.execute();

        } catch (SQLException ex) {

            ex.printStackTrace();

        }

    }

    public void alterar(Entrada entrada) {

        String sql = "UPDATE entrada SET unidades = ?,data_entrada = ?,id_item = ? WHERE id_entrada = ?";

        try {
            conecta.Conecta();
            stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setInt(1, entrada.getUnidades());
            stmt.setDate(2, (Date) entrada.getData_entrada());
            stmt.setInt(3, entrada.getProduto().getId_item());
            stmt.setInt(4, entrada.getId_entrada());
            stmt.execute();

        } catch (SQLException ex) {

            ex.printStackTrace();

        }

    }

    public List<Entrada> listar() {

        String sql = "SELECT * FROM entrada";

        List<Entrada> lista = new ArrayList<>();

        try {
            conecta.Conecta();
            stmt = (PreparedStatement) con.prepareStatement(sql);
            ResultSet response = stmt.executeQuery();

            while (response.next()) {
                Entrada entrada = new Entrada();
                entrada.setId_entrada(response.getInt("id_entrada"));
                entrada.setUnidades(response.getInt("unidades"));
                entrada.setData_entrada(response.getDate("data_entrada"));
                entrada.setProduto(response.getObject("id_item", Produto.class));

                lista.add(entrada);

            }

        } catch (SQLException ex) {

            ex.printStackTrace();

        }

        return lista;
    }

}
