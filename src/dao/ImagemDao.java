package dao;

import model.Imagem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ImagemDao {
    
private Connection conn;
private PreparedStatement stmt;
private Statement st;
private ResultSet rs;
private ArrayList<Imagem> lista = new ArrayList<Imagem>();
    
public ImagemDao(){
 conn = new ConnectionFactory().getConexao();
}

public void inserir(Imagem imagem) {
    String sql = "INSERT INTO IMAGEM (NUMERO) VALUES (?) ";
    try {
        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, imagem.getNumero());
        stmt.execute();
        stmt.close();
        }
    catch(Exception erro){
        throw new RuntimeException("ERRO 2: " + erro);
    }
}
    
    public void alterar(Imagem imagem) {
        String sql = "UPDATE IMAGEM set NUMERO= ? WHERE ID_IMAGEM = ? ";
        try{
            stmt = conn.prepareStatement (sql);
            stmt.setInt(1, imagem.getNumero());
            stmt.setInt(2, imagem.getId_imagem());
            stmt.execute();
            stmt.close();
        }
        catch(Exception erro){
            throw new RuntimeException ("ERRO 3: " + erro);
        }
    }
    
    public void excluir (int valor) {
        String sql = "delete from imagem where id_imagem = " + valor ;
        try{
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        } 
        catch(Exception erro){
            throw new RuntimeException ("ERRO 4: " + erro);
        }
    }

    public ArrayList <Imagem> Listartodos(){
        String sql = "select * from imagem";
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Imagem imagem = new Imagem();
                imagem.setId_imagem(rs.getInt("id_imagem"));
                imagem.setNumero(rs.getInt("numero_imagem"));
                lista.add(imagem);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    }
    
     public ArrayList <Imagem> ListartodosNumero(String valor){
        String sql = "select * from imagem where descricao_produto like '%"+valor+"%' " ;
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Imagem imagem = new Imagem();
                imagem.setId_imagem(rs.getInt("id_imagem"));
                imagem.setNumero(rs.getInt("numero"));
                lista.add(imagem);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    } 
}



    
 