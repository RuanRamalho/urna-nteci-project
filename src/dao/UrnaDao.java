package dao;

import model.Urna;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UrnaDao {

private Connection conn;
private PreparedStatement stmt;
private Statement st;
private ResultSet rs;
private ArrayList<Urna> lista = new ArrayList<Urna>();

public UrnaDao(){
 conn = new ConnectionFactory().getConexao();
}

public void inserir(Urna urna) {
    String sql = "INSERT INTO Urna "
              + "(ID_URNA, DATAHORA,"
              + "ID_IMAGEM, ID_ALUNO "
              + "VOTO)"
              + "VALUES (?, ?, ?, ?, ?) ";
    try {
        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, urna.getId_urna());
        stmt.setDate(2, (Date) urna.getDatahora());
        stmt.setInt(3, urna.getId_imagem());
        stmt.setInt(4, urna.getId_aluno());
        stmt.setInt(5, urna.getVoto());
        stmt.execute();
        stmt.close();
        }
    catch(Exception erro){
        throw new RuntimeException("ERRO 2: " + erro);
    }
}
    
    public void excluir (int valor) {
        String sql = "delete from urna where Id_urna= " + valor ;
        try{
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        } 
        catch(Exception erro){
            throw new RuntimeException ("ERRO 4: " + erro);
        }
    }
    
    public void esvaziar() {
        String sql = "truncate urna";
        try{
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        } 
        catch(Exception erro){
            throw new RuntimeException ("ERRO 4: " + erro);
        }
    }
    
    public ArrayList <Urna> Listartodos(int codigo){
        String sql = "select * from urna where Id_aluno= "+codigo;
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Urna urna = new Urna();
                urna.setDatahora(rs.getDate("datahora"));
                urna.setId_imagem(rs.getInt("id_imagem"));
                urna.setId_aluno(rs.getInt("id_aluno"));
                urna.setVoto(rs.getInt("voto"));
                lista.add(urna);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    }
    
     public ArrayList <Urna> ListartodosDescricao(String valor){
        String sql = "select * from Aluno where nome_aluno like '%"+valor+"%' " ;
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Urna urna = new Urna();
                urna.setId_aluno(rs.getInt("id_aluno"));
                urna.setDatahora(rs.getDate("datahora"));
                urna.setId_imagem(rs.getInt("id_imagem"));
                urna.setVoto(rs.getInt("voto"));
                lista.add(urna);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    } 
}
