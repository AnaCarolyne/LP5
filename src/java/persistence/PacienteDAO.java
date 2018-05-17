package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Paciente;

/**
 *
 * @author Aluno
 */
public class PacienteDAO {

    private static PacienteDAO instance = new PacienteDAO();

    private PacienteDAO() {

    }

    public static PacienteDAO getInstance() {
        return instance;
    }

    public void save(Paciente paciente) throws SQLException,
            ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("insert into paciente (nome,cpf,cep,numero,complemento,endereco,bairro,cidade,estado,email,dataNasc,sexo,telefone,celular,convenio,status,instituicao)"
                    + " values ('" + paciente.getNome() + "', '" + paciente.getCpf() + "', '" + paciente.getCep() + "'"
                    + ", '" + paciente.getNumero() + "', '" + paciente.getComplemento() + "', '" + paciente.getEndereco() + "'"
                    + ", '" + paciente.getBairro() + "', '" + paciente.getCidade() + "', '" + paciente.getEstado() + "'"
                    + ", '" + paciente.getEmail() + "', '" + paciente.getDataNasc() + "', '" + paciente.getSexo() + "'"
                    + ", '" + paciente.getTel() + "', '" + paciente.getCel() + "', '" + paciente.getConvenio() + "','" + paciente.getStatus() + "','" + paciente.getInstituicao() + "')");
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);
        }
    }

    public void delete(Paciente paciente) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("delete from paciente where id ='" + paciente.getId() + "'");
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);
        }
    }

    public static List<Paciente> obterPacientes() throws ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        List<Paciente> pacientes = new ArrayList<Paciente>();
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from paciente");
            while (rs.next()) {
                Paciente paciente = new Paciente(rs.getInt("id"),
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
                        rs.getString("convenio"),
                        rs.getString("status"),
                        rs.getString("instituicao"));
                pacientes.add(paciente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources(conn, st);
        }
        return pacientes;
    }

    public static Paciente obterPaciente(int codigo) throws ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        Paciente paciente = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from paciente where id = " + codigo);
            rs.first();
            paciente = new Paciente(rs.getInt("id"),
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
                    rs.getString("convenio"),
                    rs.getString("status"),
            rs.getString("instituicao"));
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources(conn, st);
        }
        return paciente;
    }

    public static void alterar(Paciente paciente) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            String sql = "update paciente set nome = ?,cpf =?,cep=?, numero=?,complemento=?,endereco=?,bairro=?,cidade=?,"
                    + "estado=?,email = ?,dataNasc=?,sexo=?,telefone=?,celular=?,convenio=?, status=? where id = ?";
            PreparedStatement comando = conn.prepareStatement(sql);
            comando.setString(1, paciente.getNome());
            comando.setInt(2, paciente.getCpf());
            comando.setInt(3, paciente.getCep());
            comando.setInt(4, paciente.getNumero());
            comando.setString(5, paciente.getComplemento());
            comando.setString(6, paciente.getEndereco());
            comando.setString(7, paciente.getBairro());
            comando.setString(8, paciente.getCidade());
            comando.setString(9, paciente.getEstado());
            comando.setString(10, paciente.getEmail());
            comando.setString(11, paciente.getDataNasc());
            comando.setString(12, paciente.getSexo());
            comando.setInt(13, paciente.getTel());
            comando.setInt(14, paciente.getCel());
            comando.setString(15, paciente.getConvenio());
            comando.setString(16, paciente.getStatus());
            comando.setInt(17, paciente.getId());
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
