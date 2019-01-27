package Controller;

import bean.ThingBean;

import java.sql.SQLException;
import java.util.List;

/**
 * The interface Thing controller.
 *
 * @Author: zhuda
 * @Description:
 * @Date: Create in 19:02 2018/12/17
 */
public interface ThingController {

    /**
     * Query thing list.
     *
     * @return the list
     * @throws SQLException the sql exception
     */
    List<ThingBean> queryThing() throws SQLException;

    /**
     * Update thing.
     *
     * @param bean the bean
     * @throws SQLException the sql exception
     */
    void updateThing(ThingBean bean) throws SQLException;

    /**
     * Query thing number int.
     *
     * @param bean the bean
     * @return the int
     * @throws SQLException the sql exception
     */
    int queryThingNumber(ThingBean bean)throws  SQLException;

    /**
     * Gets thing detail.
     *
     * @param bean the bean
     * @return the thing detail
     * @throws SQLException the sql exception
     */
    List<ThingBean> getThingDetail(ThingBean bean) throws SQLException;
}
