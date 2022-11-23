package br.uscs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUD_curso {
	public static void main(String[] args) {
		

		try {
			String user = "root";
			String password = "";
			String url = "jdbc:mariadb://localhost:3306/curso";
			Connection con = null;
			
			con = DriverManager.getConnection(url,user,password); //essa função conecta no banco de dados

			System.out.println("\nConexao no Servidor MySQL feita com sucesso...");
			Statement stmt = con.createStatement(); //criando um objeto da classe statement
			String command = "INSERT INTO tabcurso VALUES(2,'Matematica')" ;

			stmt.executeUpdate(command); //executar o comando e gravar no banco de dados
			System.out.println("\nGravacao no Banco de Dados feita com sucesso...");

		} 
		catch  (SQLException ex) {  

			System.out.println ("**** ERRO DE ACESSO AO BANCO DE DADOS...\n");
			System.out.println ("****SQLException: " + ex);

		}

		catch (Exception ex) { 

			System.out.println("*****Exception: " + ex);

		}
	}
}