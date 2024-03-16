import model.User;
import org.postgresql.Driver;

import java.sql.*;

public class Main {
    private final static String url = "jdbc:postgresql://localhost:5432/postgres";
    private final static String name = "postgres";
    private final static String password = "root";

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try {
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(url, name, password);
            String query = "SELECT * FROM myusers";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                User user = new User();
                user.setId(resultSet.getInt(1));
                user.setName(resultSet.getString(2));
                user.setAge(resultSet.getInt(3));
                user.setEmail(resultSet.getString(4));
                System.out.println(user);
            }

        }catch (SQLException e){
            System.err.println("you dont have driver");
        }finally {
            if(connection != null){
                connection.close();
            }
        }
    }
}
