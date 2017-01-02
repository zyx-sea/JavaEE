package xmlcompl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 客户Service<br>
 * create:2016-12-23 19:38
 *
 * @author zhou
 */
@Component("custom")
public class CustomService {

    private CustomDao customDao;
    private OrderDao orderDao;

    @Autowired()
    public void setCustomDao(CustomDao customDao) {
        this.customDao = customDao;
    }

    @Autowired()
    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }
    @Override
    public String toString() {
        return "CustomService{" +
                "customDao=" + customDao +
                ", orderDao=" + orderDao +
                '}';
    }



}
