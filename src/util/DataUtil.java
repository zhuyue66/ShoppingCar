package util;


import java.sql.*;

/**
 * The type Date util.
 *
 * @Author: zhuda
 * @Description:
 * @Date: Create in 21:44 2018/12/5
 */
public class DataUtil {


    private static Connection connection = JdbcUtil.getMySqlConnection();


    /**
     * Sign in.
     * <p>
     * INSERT INTO 表名称 VALUES (值1, 值2,....)
     *
     * @param username the username
     * @param password the password
     * @return the boolean
     */
    /*public static void signUp(String username, String password) {
       PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("INSERT into user VALUES (? ,?)");
            statement.setString(1, username);
            statement.setString(2, password);
            statement.execute();
        } catch (Exception e) {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }*/

    /**
     * Sign in boolean.
     *
     * @param username the username
     * @param password the password
     * @return the boolean
     * @throws SQLException the sql exception
     */
    /*public static boolean signIn(String username, String password) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("SELECT *from user where username=? and password=?");
        statement.setString(1, username);
        statement.setString(2, password);
        ResultSet set = statement.executeQuery();
        if (set.next()) {
            return true;
        } else {
            return false;
        }
    }*/

    /**
     * Add to car.
     *
     * @param thingName   the thing name
     * @param thingPrice  the thing price
     * @param thingNumber the thing number
     * @throws SQLException the sql exception
     */
    /*public static void addToCar(String thingName, float thingPrice, int thingNumber) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("INSERT into car VALUES (?,?,?,?)");
        statement.setString(1, thingName);
        statement.setFloat(2, thingPrice);
        statement.setInt(3, thingNumber);
        statement.setInt(4, 0);
        statement.executeUpdate();
    }*/

    /**
     * Query car result set.
     *
     * @return the result set
     * @throws SQLException the sql exception
     */
    /*public static ResultSet queryCar() throws SQLException {
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM car");
        System.out.println(statement.executeQuery());
        return statement.executeQuery();
    }*/

    /**
     * Query thing result set.
     *
     * @return the result set
     * @throws SQLException the sql exception
     */
    /*public static ResultSet queryThing() throws SQLException {
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM thing");
        return statement.executeQuery();
    }*/

    /**
     * Update thing.
     *
     * @param id          the id
     * @param thingNumber the thing number
     * @throws SQLException the sql exception
     */
    /*public static void updateThing(int id, int thingNumber) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("UPDATE thing SET thingNumber=? WHERE id=?");
        statement.setInt(1, thingNumber);
        statement.setInt(2, id);
        statement.execute();
    }*/

    /**
     * Query thing number int.
     *
     * @param thingId the thing id
     * @return the int
     * @throws SQLException the sql exception
     */
    /*public static int queryThingNumber(int thingId) throws SQLException{
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM `thing` WHERE id=?;");
        statement.setInt(1, thingId);
        ResultSet set = statement.executeQuery();
        System.out.println(set);
        set.next();
        int number = set.getInt("thingNumber");
        System.out.println(number);
        return number;
    }*/

    /**
     * Sum float.
     *
     * @return the float
     */
    /*public static float sum() {
        float sum = 0f;
        ResultSet resultSet = null;
        try {
            resultSet = queryCar();
            while (resultSet.next()) {
                sum += resultSet.getInt(3) * resultSet.getFloat(2);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sum;
    }*/


    /**
     * Gets one thing.
     *
     * @param id the id
     * @return the one thing
     * @throws SQLException the sql exception
     */
    /*public static ResultSet getThingDetail(int id) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM thing where id=?");
        statement.setInt(1, id);
        return statement.executeQuery();
    }*/


    /**
     * Delete thing from car.
     *
     * @param id the id
     * @throws SQLException the sql exception
     */
    /*public static boolean deleteThingFromCar(int id) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("DELETE FROM car WHERE id=?");
        statement.setInt(1, id);
        return statement.execute();
    }*/

}
