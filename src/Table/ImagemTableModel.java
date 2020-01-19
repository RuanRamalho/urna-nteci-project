package table;

import model.Imagem;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ImagemTableModel extends AbstractTableModel{
    
    public static final int COL_ID_IMAGEM = 0;
    public static final int COL_NUMERO = 1;
    public ArrayList <Imagem> lista;

    public ImagemTableModel (ArrayList<Imagem> l){
        lista = new ArrayList<Imagem> (l);
    }
    
    @Override
    public int getRowCount() {
      return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Imagem imagem = lista.get(linhas);
        if (colunas == COL_ID_IMAGEM) return imagem.getId_imagem();
        if (colunas == COL_NUMERO) return imagem.getNumero();
        return "";
    }
    
    @Override
    public String getColumnName(int colunas){
        if (colunas == COL_ID_IMAGEM) return "ID";
        if (colunas == COL_NUMERO) return "Numero da imagem";
        return "";
    } 


}
