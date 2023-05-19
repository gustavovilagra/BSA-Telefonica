package flow;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Teste {

	/*public static void main(String[] args) {
		String crmId = "1230";
        String accountId = "5679";
        String cardNo = "1121";   
        String firstName = "facundo";
        String lastName = "villagra";
        String email = "facundoExcequiel@example.com";
        String phone = "+5581989621762";
        String gender = "M";
        String username = "facuV";

        

	try {
		Connection connection = ConnectionBanco.getConnection();
	    PreparedStatement existStatement = connection.prepareStatement(SqlQuery.VERIFICADOR_CRM_ID.getQuery());
	    PreparedStatement selectStatement = connection.prepareStatement(SqlQuery.SELECT_REGISTRO.getQuery());
	    PreparedStatement insertStatement = connection.prepareStatement(SqlQuery.INSERT_REGISTRO.getQuery());
	    PreparedStatement updateStatement = connection.prepareStatement(SqlQuery.UPDATE_REGISTRO.getQuery());
	    
	    existStatement.setString(1, crmId);
	    ResultSet existResultSet = existStatement.executeQuery();
	    boolean exist = existResultSet.next();
	    existResultSet.close();
	   try { 
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
	            
	            boolean verificarSeExiste = currentAccountId.equals(accountId) && currentCardNo.equals(cardNo) &&
	                    currentFirstName.equals(firstName) && currentLastName.equals(lastName) &&
	                    currentEmail.equals(email) && currentPhone.equals(phone) &&
	                    currentGender.equals(gender) && currentUsername.equals(username);
	            if(verificarSeExiste) {
	            	System.out.println("dados ja existente no banco");
	            }

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
	   }catch(Exception e) {
		   System.out.println("dados enviados ao banco invalidos= "+e.getMessage());
	   }

	}catch(Exception e){
			System.out.println("erro na conexao "+e.getMessage());
			}
		
	}*/

}
