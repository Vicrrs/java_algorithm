package src;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoPostgresSQL {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/seu_banco_de_dados";
        String usuario = "seu_usuario";
        String senha = "sua_senha";

        try {
            // Estabelecer a conexão com o banco de dados PostgreSQL
            Connection conexao = DriverManager.getConnection(url, usuario, senha);

            // Criar uma declaração SQL
            Statement declaracao = conexao.createStatement();

            // Executar uma consulta SQL simples
            ResultSet resultado = declaracao.executeQuery("SELECT * FROM tabela_exemplo");

            // Iterar pelos resultados e imprimir-os
            while (resultado.next()) {
                String coluna1 = resultado.getString("coluna1");
                int coluna2 = resultado.getInt("coluna2");
                System.out.println("Coluna1: " + coluna1 + ", Coluna2: " + coluna2);
            }

            // Fechar recursos
            resultado.close();
            declaracao.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
