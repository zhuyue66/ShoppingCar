package Model;

import Controller.CarController;
import bean.CarBean;
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
public class CarModel implements CarController {

    private static Connection connection = JdbcUtil.getMySqlConnection();

    @Override
    public void addToCar(ThingBean bean) throws SQLException {

        PreparedStatement statement = connection.prepareStatement("INSERT into car VALUES (?,?,?,?)");
        statement.setInt(1, 0);
        statement.setString(2, bean.getThingName());
        statement.setFloat(3, bean.getThingPrice());
        statement.setInt(4,bean.getThingNumber());
        statement.executeUpdate();
    }

    @Override
    public List<CarBean> queryCar() throws SQLException {
        List<CarBean> list = new ArrayList<>();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM car");
        ResultSet set = statement.executeQuery();
        while (set.next()) {
            CarBean bean = new CarBean();
            bean.setId(set.getInt("id"));
            bean.setCarThingName(set.getString("carThingName"));
            bean.setCarThingPrice(set.getFloat("carThingPrice"));
            bean.setCarThingNumber(set.getInt("carThingNumber"));
            list.add(bean);
        }
        return list;
    }

    @Override
    public float carSum(){
        float sum = 0f;
        try {
            for (CarBean bean : queryCar() ) {
                sum += bean.getCarThingPrice() * bean.getCarThingNumber();
            }
        } catch (SQLException e){

        }
        return sum;
    }

    @Override
    public boolean deleteThing(ThingBean bean) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("DELETE FROM car WHERE id=?");
        statement.setInt(1, bean.getId());
        return statement.execute();
    }
}
