package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Enfermeiro;

/**
 *
 * @author Aluno
 */
public class EnfermeiroDAO {
    
    private static EnfermeiroDAO instance = new EnfermeiroDAO();
    
    private EnfermeiroDAO() {
        
    }
    
    public static EnfermeiroDAO getInstance() {
        return instance;
    }
    
    public void save(Enfermeiro enfermeiro) throws SQLException,
            ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("insert into enfermeiro (nome,cpf,cep,numero,complemento,endereco,bairro,cidade,estado,email,dataNasc,sexo,telefone,celular,status)"
                    + " values ('" + enfermeiro.getNome() + "', '" + enfermeiro.getCpf() + "', '" + enfermeiro.getCep() + "'"
                    + ", '" + enfermeiro.getNumero() + "', '" + enfermeiro.getComplemento() + "', '" + enfermeiro.getEndereco() + "'"
                    + ", '" + enfermeiro.getBairro() + "', '" + enfermeiro.getCidade() + "', '" + enfermeiro.getUf() + "'"
                    + ", '" + enfermeiro.getEmail() + "', '" + enfermeiro.getDataNasc() + "', '" + enfermeiro.getSexo() + "'"
                    + ", '" + enfermeiro.getTel() + "', '" + enfermeiro.getCel() + "', '" + enfermeiro.getStatus()+ "')");
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);
        }
    }
    
    public void delete(Enfermeiro enfermeiro) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("delete from enfermeiro where id ='" + enfermeiro.getId() + "'");
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);
        }
    }
    
    public static List<Enfermeiro> obterEnfermeiros() throws ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        List<Enfermeiro> enfermeiros = new ArrayList<Enfermeiro>();
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from enfermeiro");
            while (rs.next()) {
                Enfermeiro enfermeiro = new Enfermeiro(rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getInt("cpf"),
                        rs.getInt("cep"),
                        rs.getInt("numero"),
                        rs.getString("complemento"),
                        rs.getString("endereco"),
                        rs.getString("bairro"),
                        rs.getString("cidade"),
                        rs.getString("estado"),
                        rs.getString("email"),
                        rs.getString("dataNasc"),
                        rs.getString("sexo"),
                        rs.getInt("telefone"),
                        rs.getInt("celular"),
                        rs.getString("status"));
                enfermeiros.add(enfermeiro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources(conn, st);
        }
        return enfermeiros;
    }
    
    public static Enfermeiro obterEnfermeiro(int codigo) throws ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        Enfermeiro enfermeiro = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from enfermeiro where id = " + codigo);
            rs.first();
            enfermeiro = new Enfermeiro(rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getInt("cpf"),
                    rs.getInt("cep"),
                    rs.getInt("numero"),
                    rs.getString("complemento"),
                    rs.getString("endereco"),
                    rs.getString("bairro"),
                    rs.getString("cidade"),
                    rs.getString("estado"),
                    rs.getString("email"),
                    rs.getString("dataNasc"),
                    rs.getString("sexo"),
                    rs.getInt("telefone"),
                    rs.getInt("celular"),
                    rs.getString("status"));
            //NULL PARA SER SETADO
            //turma.setMatriculaProfessorCoordenador(rs.getInt("professorCoordenador")); CASO TENHA CHAVE ESTRANGEIRA
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources(conn, st);
        }
        return enfermeiro;
    }
    
    public static void alterar(Enfermeiro enfermeiro) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            String sql = "update enfermeiro set nome = ?,cpf =?,cep=?, numero=?,complemento=?,endereco=?,bairro=?,cidade=?,"
                    + "estado=?,email = ?,dataNasc=?,sexo=?,telefone=?,celular=?,status=? where id = ?";
            PreparedStatement comando = conn.prepareStatement(sql);
            comando.setString(1, enfermeiro.getNome());
            comando.setInt(2, enfermeiro.getCpf());
            comando.setInt(3, enfermeiro.getCep());
            comando.setInt(4, enfermeiro.getNumero());
            comando.setString(5, enfermeiro.getComplemento());
            comando.setString(6, enfermeiro.getEndereco());
            comando.setString(7, enfermeiro.getBairro());
            comando.setString(8, enfermeiro.getCidade());
            comando.setString(9, enfermeiro.getUf());
            comando.setString(10, enfermeiro.getEmail());
            comando.setString(11, enfermeiro.getDataNasc());
            comando.setString(12, enfermeiro.getSexo());
            comando.setInt(13, enfermeiro.getTel());
            comando.setInt(14, enfermeiro.getCel());
            comando.setString(15, enfermeiro.getStatus());
            comando.setInt(16, enfermeiro.getId());
            comando.execute();
            comando.close();
            conn.close();
            
        } catch (SQLException e) {
            throw e;
        }
    }
    
    private static void closeResources(Connection conn, Statement st) {
        try {
            if (st != null) {
                st.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            
        }
    }
    
}
