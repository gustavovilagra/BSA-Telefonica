package flow;

/**
 * Classe que define as consultas SQL utilizadas no sistema.
 */
public enum SqlQuery {
    // Constantes para consultas SQL
    INSERT_REGISTRO("INSERT INTO customers(crm_id, account_id, card_no, first_name, last_name, email, phone, gender, username, datetime) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, NOW())"),
    UPDATE_REGISTRO("UPDATE customers SET account_id = ?, card_no = ?, first_name = ?, last_name = ?, email = ?, phone = ?, gender = ?, username = ?, datetime = NOW() WHERE crm_id = ?"),
    VERIFICADOR_CRM_ID("SELECT * FROM customers WHERE crm_id = ?"),
    SELECT_REGISTRO("SELECT account_id, card_no, first_name, last_name, email, phone, gender, username FROM customers WHERE crm_id = ?");

    // Variável de membro privado para armazenar a consulta SQL
    private final String query;

    /**
     * Construtor da enum que recebe a consulta SQL como parâmetro.
     * @param query a consulta SQL da enum.
     */
    SqlQuery(String query) {
        this.query = query;
    }

    /**
     * Método para obter a consulta SQL como uma string.
     * @return a consulta SQL da enum como uma string.
     */
    public String getQuery() {
        return query;
    }
}
