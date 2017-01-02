package attribute;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * bean的范围<br>
 * create:2016-12-23 18:52
 *
 * @author zhou
 */
@Component("scopeBean")/*若没指定scope默认是singleton*/
@Scope("prototype")  /*配制成多类*/
public class ScopBean {

}
