package Controller;

import bean.CarBean;
import bean.ThingBean;

import java.sql.SQLException;
import java.util.List;

/**
 * The interface Car controller.
 *
 * @Author: zhuda
 * @Description:
 * @Date: Create in 19:03 2018/12/17
 */
public interface CarController {

    /**
     * Add to car.
     *
     * @param bean the bean
     * @throws SQLException the sql exception
     */
    void addToCar(ThingBean bean) throws SQLException;

    /**
     * Query car list.
     *
     * @return the list
     * @throws SQLException the sql exception
     */
    List<CarBean> queryCar() throws SQLException;

    /**
     * Car sum float.
     *
     * @return the float
     */
    float carSum();

    /**
     * Delete thing boolean.
     *
     * @param bean the bean
     * @return the boolean
     * @throws SQLException the sql exception
     */
    boolean deleteThing(ThingBean bean) throws SQLException;


}
