package table;

import model.Aluno;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class AlunoTableModel extends AbstractTableModel{
    
    public static final int COL_ID_ALUNO = 0;
    public static final int COL_NOME_ALUNO = 1;
        
    public ArrayList <Aluno> lista;

    public AlunoTableModel (ArrayList<Aluno> l){
        lista = new ArrayList<Aluno> (l);
    }
    
    @Override
    public int getRowCount() {
      return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Aluno aluno = lista.get(linhas);
        if (colunas == COL_ID_ALUNO) return aluno.getId_aluno();
        if (colunas == COL_NOME_ALUNO) return aluno.getNome_aluno();
        return "";
    }
    
    @Override
    public String getColumnName(int colunas){
        if (colunas == COL_ID_ALUNO) return "Id";
        if (colunas == COL_NOME_ALUNO) return "Nome do aluno";
        return "";
    } 


}
