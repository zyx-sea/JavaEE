package spring3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置bean，相当于工厂<br>
 * create:2016-12-23 19:11
 *
 * @author zhou
 */
@Configuration
public class BeanConfig {

    @Bean("car")
    public Car initCar() {
        Car car=new Car();
        car.setName("大众");
        car.setPrice(100000000);
        return car;
    }

    @Bean("product")
    public Product initPro() {
        Product product=new Product();
        product.setPname("玩具狗");
        product.setPnum(100);
        return product;
    }
}
