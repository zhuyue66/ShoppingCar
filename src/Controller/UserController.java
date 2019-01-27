package Controller;

import bean.UserBean;

import java.sql.SQLException;

/**
 * The interface User controller.
 *
 * @Author: zhuda
 * @Description:
 * @Date: Create in 19:03 2018/12/17
 */
public interface UserController {

    /**
     * Sign in boolean.
     *
     * @param userBean the user bean
     * @return the boolean
     * @throws SQLException the sql exception
     */
    boolean signIn(UserBean userBean) throws SQLException;

    /**
     * Sign up.
     *
     * @param userBean the user bean
     * @throws SQLException the sql exception
     */
    void signUp(UserBean userBean) throws SQLException;

}
