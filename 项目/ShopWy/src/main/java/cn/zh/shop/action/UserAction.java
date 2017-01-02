package cn.zh.shop.action;

import cn.zh.shop.model.Person;
import cn.zh.shop.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ModelDriven;

import java.io.IOException;

/**
 * 用户action类<br>
 * create:2016-11-23 16:14
 *
 * @author zhou
 * @version 1.0
 */
public class UserAction implements ModelDriven<Person> {

    private Person person = new Person();
    private UserServiceImpl userServiceImpl;
/*
    private String message="輸入密碼或賬號錯誤";
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }*/


    public String check() {
        try {
            userServiceImpl = new UserServiceImpl();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Person p = userServiceImpl.check(this.person.getUserName());
 /*       ActionContext ac=ActionContext.getContext();
        Map<String,Object> session=ac.getSession();
        session.put("userType",p.getUserType());
*/
        if (p != null)
            if (p.getUserName().equals(this.person.getUserName()) && p.getPassword().equals(this.person.getPassword()))
                return "success";
            else
                return "none";
        else
            return "none";
    }

    @Override
    public Person getModel() {

        return person;
    }
}

