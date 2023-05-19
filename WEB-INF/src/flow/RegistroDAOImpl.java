package flow;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Esta classe implementa a interface RegistroDAO e é responsável por inserir ou atualizar um registro de cliente 
 * no banco de dados.
 */
public class RegistroDAOImpl implements RegistroDAO {
    private ConnectionBanco conexion;
    /**
     * Construtor da classe. Recebe um objeto ConnectionBanco como parâmetro e atribui a este objeto à variável conexao.
     * 
     * @param conexao Objeto que representa a conexão com o banco de dados.
     */
    public RegistroDAOImpl(ConnectionBanco conexion) {
        this.conexion = conexion;
    }
    /**
     * Método que insere ou atualiza um registro de cliente no banco de dados.
     * 
     * @param crmId ID do cliente.
     * @param accountId ID da conta do cliente.
     * @param cardNo Número do cartão de crédito do cliente.
     * @param firstName Primeiro nome do cliente.
     * @param lastName Sobrenome do cliente.
     * @param email Endereço de e-mail do cliente.
     * @param phone Número de telefone do cliente.
     * @param gender Gênero do cliente.
     * @param username Nome de usuário do cliente.
     */
    @Override
    public void InsertUpdate(String crmId, String accountId, String cardNo, String firstName, String lastName, String email, String phone, String gender, String username) {
    	try (Connection connection = ConnectionBanco.getConnection();
    		     PreparedStatement existStatement = connection.prepareStatement(SqlQuery.VERIFICADOR_CRM_ID.getQuery());
    		     PreparedStatement selectStatement = connection.prepareStatement(SqlQuery.SELECT_REGISTRO.getQuery());
    		     PreparedStatement insertStatement = connection.prepareStatement(SqlQuery.INSERT_REGISTRO.getQuery());
    		     PreparedStatement updateStatement = connection.prepareStatement(SqlQuery.UPDATE_REGISTRO.getQuery())) {

    		    // Verificar se o registro já existe
    		    existStatement.setString(1, crmId);
    		    ResultSet existResultSet = existStatement.executeQuery();
    		    boolean exist = existResultSet.next();
    		    existResultSet.close();

    		    // Se existir, verificar se há mudanças e atualizar se necessário
    		    if (exist) {
    		        selectStatement.setString(1, crmId);
    		        ResultSet selectResultSet = selectStatement.executeQuery();
    		        if (selectResultSet.next()) {
    		            String currentAccountId = selectResultSet.getString("account_id");
    		            String currentCardNo = selectResultSet.getString("card_no");
    		            String currentFirstName = selectResultSet.getString("first_name");
    		            String currentLastName = selectResultSet.getString("last_name");
    		            String currentEmail = selectResultSet.getString("email");
    		            String currentPhone = selectResultSet.getString("phone");
    		            String currentGender = selectResultSet.getString("gender");
    		            String currentUsername = selectResultSet.getString("username");

    		            // Verificar se houve mudanças
    		            boolean needUpdate = !currentAccountId.equals(accountId) || !currentCardNo.equals(cardNo) ||
    		                    !currentFirstName.equals(firstName) || !currentLastName.equals(lastName) ||
    		                    !currentEmail.equals(email) || !currentPhone.equals(phone) ||
    		                    !currentGender.equals(gender) || !currentUsername.equals(username);

    		            // Se houve mudanças, atualizar registro
    		            if (needUpdate) {
    		                updateStatement.setString(1, accountId);
    		                updateStatement.setString(2, cardNo);
    		                updateStatement.setString(3, firstName);
    		                updateStatement.setString(4, lastName);
    		                updateStatement.setString(5, email);
    		                updateStatement.setString(6, phone);
    		                updateStatement.setString(7, gender);
    		                updateStatement.setString(8, username);
    		                updateStatement.setString(9, crmId);
    		                updateStatement.executeUpdate();
    		                System.out.println("dados atualizados");
    		            }
    		        }
    		        selectResultSet.close();
    		    } else {
    		        // Se não existir, inserir novo registro
    		        insertStatement.setString(1, crmId);
    		        insertStatement.setString(2, accountId);
    		        insertStatement.setString(3, cardNo);
    		        insertStatement.setString(4, firstName);
    		        insertStatement.setString(5, lastName);
    		        insertStatement.setString(6, email);
    		        insertStatement.setString(7, phone);
    		        insertStatement.setString(8, gender);
    		        insertStatement.setString(9, username);
    		        insertStatement.executeUpdate();
    		        System.out.println("\n dados inseridos \n");
    		    }

    		} catch (SQLException e) {
    		    System.out.println("erro na consulta SQL "+e.getMessage() );
    		}

    }
}

