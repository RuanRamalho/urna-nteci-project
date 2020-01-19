package table;

import model.Urna;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class UrnaTableModel extends AbstractTableModel{
    public static final int COL_ID_URNA = 0;
    public static final int COL_DATAHORA = 1;
    public static final int COL_ID_IMAGEM = 2;
    public static final int COL_ID_ALUNO = 3;
    public static final  int COL_VOTO = 4;
    
    public ArrayList <Urna> lista;
     
      public UrnaTableModel (ArrayList<Urna> l){
        lista = new ArrayList<Urna> (l);
    }
    
    @Override
    public int getRowCount() {
      return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Urna urna = lista.get(linhas);
        if (colunas == COL_ID_URNA) return urna.getId_urna();
        if (colunas == COL_DATAHORA) return urna.getDatahora();
        if (colunas == COL_ID_IMAGEM) return urna.getId_imagem();
        if (colunas == COL_ID_ALUNO) return urna.getId_aluno();
        if (colunas == COL_VOTO) return urna.getVoto();
        return "";
    }
    
    @Override
    public String getColumnName(int colunas){
        if (colunas == COL_ID_ALUNO) return "Id de aluno";
        if (colunas == COL_ID_IMAGEM) return "Id da imagem";
        if (colunas == COL_DATAHORA) return "Data e Hora";
        if (colunas == COL_VOTO) return "Voto";
        return "";
    } 
}