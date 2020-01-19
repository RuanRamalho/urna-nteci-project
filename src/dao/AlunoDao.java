package dao;

import model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AlunoDao {
    
private Connection conn;
private PreparedStatement stmt;
private Statement st;
private ResultSet rs;
boolean check = false;
private ArrayList<Aluno> lista = new ArrayList<Aluno>();
    
public AlunoDao(){
 conn = new ConnectionFactory().getConexao();
}

public void inserir(Aluno aluno) {
    String sql = "INSERT INTO ALUNO "
              + "(NOME_ALUNO)"
              + "VALUES (?) ";
    try {
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, aluno.getNome_aluno());
        stmt.execute();
        stmt.close();
        }
    catch(Exception erro){
        throw new RuntimeException("ERRO 2: " + erro);
    }
}
    
    public void alterar(Aluno aluno) {
        String sql = "UPDATE ALUNO set NOME_ALUNO = ? WHERE ID_ALUNO = ? ";
        try{
            stmt = conn.prepareStatement (sql);
            stmt.setString(1, aluno.getNome_aluno());
            stmt.execute();
            stmt.close();
        }
        catch(Exception erro){
            throw new RuntimeException ("ERRO 3: " + erro);
        }
    }
    
    public void excluir (int valor) {
        String sql = "delete from aluno where id_aluno = " + valor ;
        try{
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        } 
        catch(Exception erro){
            throw new RuntimeException ("ERRO 4: " + erro);
        }
    }

    public ArrayList <Aluno> Listartodos(){
        String sql = "select * from aluno";
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Aluno aluno = new Aluno();
                aluno.setId_aluno(rs.getInt("id_aluno"));
                aluno.setNome_aluno(rs.getString("nome_aluno"));
                lista.add(aluno);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    }
    
     public ArrayList <Aluno> ListartodosDescricao(String valor){
        String sql = "select * from aluno where nome_aluno like '%"+valor+"%' " ;
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Aluno aluno = new Aluno();
                aluno.setId_aluno(rs.getInt("id_aluno"));
                aluno.setNome_aluno(rs.getString("nome_aluno"));
                lista.add(aluno);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    } 
}



    
 