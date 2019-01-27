package util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

/**
 * The type Jdbc util.
 *
 * @Author: zhuda
 * @Description:
 * @Date: Create in 21:50 2018/12/5
 */
public class JdbcUtil {

    /**
     * Gets my sql connection.
     *
     * @return the my sql connection
     * @throws Exception the exception
     */
    public static Connection getMySqlConnection(){

        InputStream inputStream = JdbcUtil.class.getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();
        Connection connection = null;

        try {
            properties.load(inputStream);
            Class.forName(properties.getProperty("driver"));
            connection = DriverManager.getConnection(properties.getProperty("jdbcUrl"),properties.getProperty("user"),properties.getProperty("password"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    /**
     * Close connection.
     *
     * @param connection the connection
     * @param statement  the statement
     * @param resultSet  the result set
     */
    public static void closeConnection(Connection connection, Statement statement, ResultSet resultSet) {
        if (connection != null) {
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (statement != null) {
            try {
                statement.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
