package table;

import model.Chamado;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ChamadoTableModel extends AbstractTableModel{

    public static final int COL_CODIGO_CHAMADO = 0;
    public static final int COL_DESCRICAO = 1;
    public static final int COL_FILIAL = 2;
    
    public ArrayList<Chamado> lista;
    
    public ChamadoTableModel(ArrayList<Chamado> lis) {
        lista = new ArrayList<Chamado>(lis);
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
        Chamado chamado = lista.get(linhas);
        if(colunas == COL_CODIGO_CHAMADO) return chamado.getCodigo_chamado();
        if(colunas == COL_DESCRICAO) return chamado.getDescricao();
        if(colunas == COL_FILIAL) return chamado.getFilial();
       
        return "";
    }
    
    @Override 
    public String getColumnName(int colunas) {
        if(colunas == COL_CODIGO_CHAMADO) return "codigo_chamado";
        if(colunas == COL_DESCRICAO) return "descricao";
        if(colunas == COL_FILIAL) return "filial";
       
        return "";
    }

}
