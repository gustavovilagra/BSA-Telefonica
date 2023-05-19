package flow;



public interface RegistroDAO {
	
    void InsertUpdate(String crmId, String accountId, String cardNo, String firstName, String lastName, String email, String phone, String gender, String username);
}
