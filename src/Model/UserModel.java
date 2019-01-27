package Model;

import Controller.UserController;
import bean.UserBean;
import util.JdbcUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 19:19 2018/12/17
 */
public class UserModel implements UserController {

    private static Connection connection = JdbcUtil.getMySqlConnection();

    @Override
    public boolean signIn(UserBean userBean) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("SELECT *from user where username=? and password=?");
        statement.setString(1, userBean.getUsername());
        statement.setString(2, userBean.getPassword());
        ResultSet set = statement.executeQuery();
        if (set.next()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void signUp(UserBean bean) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("INSERT into user VALUES (? ,?)");
        statement.setString(1, bean.getUsername());
        statement.setString(2, bean.getPassword());
        statement.execute();
    }
}
