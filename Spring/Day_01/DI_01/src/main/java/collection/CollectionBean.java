package collection;

import java.util.List;
import java.util.Map;

/**
 * list属性注入<br>
 * create:2016-12-23 15:29
 *
 * @author zhou
 */
public class CollectionBean {
    private List<String> hobby;

    public void setStudent(Map<String, String> student) {
        this.student = student;
    }

    private Map<String,String> student;

    @Override
    public String toString() {
        return "CollectionBean{" +
                "hobby=" + hobby +
                ", student=" + student +
                '}';
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }
}
