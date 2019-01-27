package Model;

import Controller.ThingController;
import bean.ThingBean;
import util.JdbcUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 19:19 2018/12/17
 */
public class ThingModel implements ThingController {

    private static Connection connection = JdbcUtil.getMySqlConnection();


    @Override
    public List<ThingBean> queryThing() throws SQLException {
        List<ThingBean> list = new ArrayList<>();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM thing");
        ResultSet thingSet = statement.executeQuery();
        while (thingSet.next()) {
            ThingBean bean = new ThingBean();
            bean.setThingName(thingSet.getString("thingName"));
            bean.setThingPrice(thingSet.getFloat("thingPrice"));
            bean.setThingNumber(thingSet.getInt("thingNumber"));
            bean.setId(thingSet.getInt("id"));
            list.add(bean);
        }
        return list;
    }

    @Override
    public void updateThing(ThingBean bean) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("UPDATE thing SET thingNumber=? WHERE id=?");
        statement.setInt(1, bean.getThingNumber());
        statement.setInt(2, bean.getId());
        statement.execute();
    }

    @Override
    public int queryThingNumber(ThingBean bean) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM `thing` WHERE id=?;");
        statement.setInt(1, bean.getId());
        ResultSet set = statement.executeQuery();
        System.out.println(set);
        set.next();
        int number = set.getInt("thingNumber");
        System.out.println(number);
        return number;
    }

    @Override
    public List<ThingBean> getThingDetail(ThingBean bean) throws SQLException {
        List<ThingBean> list = new ArrayList<>();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM thing where id=?");
        statement.setInt(1, bean.getId());
        ResultSet thingSet =  statement.executeQuery();
        while (thingSet.next()) {
            ThingBean tempBean = new ThingBean();
            tempBean.setId(thingSet.getInt("id"));
            tempBean.setThingName(thingSet.getString("thingName"));
            tempBean.setThingPrice(thingSet.getFloat("thingPrice"));
            tempBean.setThingNumber(thingSet.getInt("thingNumber"));
            tempBean.setThingImg(thingSet.getString("thingImg"));
            list.add(tempBean);
        }
         return list;
    }
}
