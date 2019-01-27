package bean;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 18:39 2018/12/12
 */
public class ThingBean {

    private int id;
    private String thingName;
    private float thingPrice;
    private int thingNumber;
    private String thingImg;

    public String getThingImg() {
        return thingImg;
    }

    public void setThingImg(String thingImg) {
        this.thingImg = thingImg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getThingName() {
        return thingName;
    }

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    public float getThingPrice() {
        return thingPrice;
    }

    public void setThingPrice(float thingPrice) {
        this.thingPrice = thingPrice;
    }

    public int getThingNumber() {
        return thingNumber;
    }

    public void setThingNumber(int thingNumber) {
        this.thingNumber = thingNumber;
    }
}

