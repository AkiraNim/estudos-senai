
package VIEW;

import DAO.ConnectionDAO;

public class Main {
    public static void main(String[] args) {
        ConnectionDAO conn = new ConnectionDAO();
        
        conn.connectDB();
    }
}
