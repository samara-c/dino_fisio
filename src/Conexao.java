import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class Conexao {
	
	static Connection connection;
	static ResultSet rs;
	static Statement stmt;
	
	public void conecta () throws ClassNotFoundException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto_java?useTimezone=true&serverTimezone=UTC","root","root");
			System.out.println("Conectou");
			
			 
			
			
		} catch (SQLException sqlException) {
			
			sqlException.printStackTrace();
		}
		
	}

	public void inserirValorTabela (String valorSql, String campoSql) {
		
		
		try {
			stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
	                ResultSet.CONCUR_UPDATABLE);
			String sql = "INSERT INTO user ("+campoSql+") VALUES ('"+valorSql+"')";
			
			stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}
}
