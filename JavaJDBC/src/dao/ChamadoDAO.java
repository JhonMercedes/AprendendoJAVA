package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Chamado;



public class ChamadoDAO {
	
    private Connection conn;
    private PreparedStatement pstm;
    private Statement st;
    private ResultSet result;
    private ArrayList<Chamado> lista = new ArrayList<Chamado>();
    
    public ChamadoDAO() throws SQLException {
        conn = ConnectionFactory.getConexao();
    }

    public void inserir(Chamado chamado) {
        String sql = "INSERT INTO chamado(descricao, filial) VALUES (?, ?)";
        try {
            // Create PreparedStatement para executar uma query
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, chamado.getDescricao());
            pstm.setInt(2, chamado.getFilial());
        }catch(Exception erro) {
            throw new RuntimeException("Erro Inserir Chamado "+ erro);
        }
    }
    public void alterar(Chamado chamado) {
        String sql = "UPDATE chamado SET descricao = ?, filial = ?,  WHERE codigo_chamado = ?";
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, chamado.getDescricao());
            pstm.setInt(2, chamado.getFilial());
            pstm.setInt(3, chamado.getCodigo_chamado());
            pstm.execute();
            pstm.close();
            
        }catch(Exception erro) {
            throw new RuntimeException("Erro Alterar Chamado "+ erro);
        }
    }
    public void excluir (int valor) {
        String sql = "DELETE * FROM chamado WHERE codigo_chamado = "+valor;
        try {
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        }catch(Exception erro) {
            throw new RuntimeException("Erro ao deletar Chamado "+ erro);
        }
        
    }
    public ArrayList<Chamado> listarTodos() {
        String sql = "SELECT * FROM chamado";
            try {
                st = conn.createStatement();
                result = st.executeQuery(sql);
                while(result.next()) {
                    Chamado chamado = new Chamado();
                    chamado.setCodigo_chamado(result.getInt("codigo_chamado"));
                    chamado.setDescricao(result.getString("descricao"));
                    chamado.setFilial(result.getInt("filial"));
                    lista.add(chamado);
                }
            }catch(Exception erro) {
                throw new RuntimeException("Erro ao listar Chamado." + erro);
        }
            return lista;
    }
    public ArrayList<Chamado> listarTodosDescricao(String valor) {
        String sql = "SELECT * FROM chamado WHERE descricao LIKE '%"+valor+"%' ";
            try {
                st = conn.createStatement();
                result = st.executeQuery(sql);
                while(result.next()) {
                    Chamado chamado = new Chamado();
                    chamado.setCodigo_chamado(result.getInt("codigo_chamado"));
                    chamado.setDescricao(result.getString("descricao"));
                    chamado.setFilial(result.getInt("filial"));
                    lista.add(chamado);
                }
            }catch(Exception erro) {
                throw new RuntimeException("Erro ao listar Chamados." + erro);
        }
            return lista;
    }
}

