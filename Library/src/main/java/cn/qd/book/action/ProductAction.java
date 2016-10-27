package cn.qd.book.action;

import cn.qd.book.dao.impl.ProductDaoImpl;
import cn.qd.book.model.Product;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * 商品action类<br>
 * create:2016-10-24 23:11
 *
 * @author zhou
 * @version 1.0
 */
public class ProductAction extends ActionSupport {

    private Product product = null;
    List<Product> products =new ArrayList<Product>();

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }



    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    public String findall(){
        try {
            ProductDaoImpl productimpl= new ProductDaoImpl();
            products=productimpl.findProductAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "findall";
    }

    public String findpic( ){
        try {
            ProductDaoImpl productimpl= new ProductDaoImpl();
            String pic=productimpl.findProductPic(product.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "findall";

    }
}
