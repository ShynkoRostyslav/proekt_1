package JDBC;
import java.sql.SQLException;


public interface Connector {

    final static String name = "root";
    final static String password = "";
    final static String url = "jdbc:mysql://localhost:3306/trucker?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    public void connect(String name, int age) throws SQLException;

}
