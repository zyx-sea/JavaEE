package spring;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 类的配置文件上下文路径<br>
 * create:2016-12-04 21:00
 *
 * @author zhou
 * @version 1.0
 */
public class ClassPathXmlApplocationContext implements BeanFactory {

    Map<String, Object> beans = new HashMap<String, Object>();

    public ClassPathXmlApplocationContext() throws IOException, JDOMException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        SAXBuilder sb = new SAXBuilder();
        Document doc = sb.build(this.getClass().getClassLoader().getResourceAsStream("bean.xml")); //构造文档对象
        Element root = doc.getRootElement(); //获取根元素
        List list = root.getChildren("bean");//取名字为bean的所有元素
        for (int i = 0; i < list.size(); i++) {
            Element element = (Element) list.get(i);
            String id = element.getAttributeValue("id");
            String clazz = element.getAttributeValue("class");
            System.out.println(id + ":" + clazz);
                Object o = Class.forName(clazz).newInstance();//将clazz生成一个对象
                beans.put(id, o);

                for(Element propertyElement : (List<Element>)element.getChild("property")){
                  String name=propertyElement.getAttributeValue("name");//设置bean.xml中的userDao
                    String bean=propertyElement.getAttributeValue("bean");//设置bean.xml中的user
                    Object beanObject=beans.get(bean);
                    String methodname="set"+name.substring(0,1).toUpperCase()+name.substring(1);
                    System.out.println("方法名："+methodname);
                    Method method=o.getClass().getMethod(methodname,beanObject.getClass().getInterfaces()[0]);
                    method.invoke(o,beanObject);
                }

        }
    }

    @Override
    public Object getBean(String name) {
        return beans.get(name);
    }
}
