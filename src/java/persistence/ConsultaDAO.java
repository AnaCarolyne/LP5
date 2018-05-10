package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Consulta;

/**
 *
 * @author Aluno
 */
public class ConsultaDAO {

    private static ConsultaDAO instance = new ConsultaDAO();

    private ConsultaDAO() {

    }

    public static ConsultaDAO getInstance() {
        return instance;
    }

    public void save(Consulta consulta) throws SQLException,
            ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("insert into consulta (medico,paciente,data,inicio,terminio,obs)"
                    + " values ('" + consulta.getMedico() + "', '" + consulta.getPaciente() + "', '" + consulta.getData() + "'"
                    + ", '" + consulta.getHoraInicio() + "', '" + consulta.getHoraTerminio() + "', '" + consulta.getObservacao()+ "')");
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);
        }
    }

    public void delete(Consulta consulta) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("delete from consulta where id ='" + consulta.getId() + "'");
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);
        }
    }

    public static List<Consulta> obterConsultas() throws ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        List<Consulta> consultas = new ArrayList<Consulta>();
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from consulta");
            while (rs.next()) {
                Consulta consulta = new Consulta(rs.getInt("id"),
                        rs.getString("medico"),
                        rs.getString("paciente"),
                        rs.getString("data"),
                        rs.getString("inicio"),
                        rs.getString("terminio"),
                        rs.getString("obs"));
                consultas.add(consulta);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources(conn, st);
        }
        return consultas;
    }

    public static Consulta obterConsulta(int codigo) throws ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        Consulta consulta = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from consulta where id = " + codigo);
            rs.first();
            consulta = new Consulta(rs.getInt("id"),
                        rs.getString("medico"),
                        rs.getString("paciente"),
                        rs.getString("data"),
                        rs.getString("inicio"),
                        rs.getString("terminio"),
                        rs.getString("obs"));
            //NULL PARA SER SETADO
            //turma.setMatriculaProfessorCoordenador(rs.getInt("professorCoordenador")); CASO TENHA CHAVE ESTRANGEIRA
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources(conn, st);
        }
        return consulta;
    }

    public static void alterar(Consulta consulta) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            String sql = "update consulta set medico = ?,paciente =?,data=?, inicio=?,terminio=?,obs=? where id = ?";
            PreparedStatement comando = conn.prepareStatement(sql);
            comando.setString(1, consulta.getMedico());
            comando.setString(2, consulta.getPaciente());
            comando.setString(3, consulta.getData());
            comando.setString(4, consulta.getHoraInicio());
            comando.setString(5, consulta.getHoraTerminio());
            comando.setString(6, consulta.getObservacao());
            comando.setInt(7,consulta.getId());
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
