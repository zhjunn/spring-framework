package xyz.junwen.spring.demo.context;

import com.alibaba.fastjson.JSON;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.junwen.spring.demo.bean.Person;

/**
 * Created by zhangjunwen on 2019-08-12
 *
 * @author zhangjunwen
 * @date 2019-08-12
 */
public class XmlContext {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:application-context.xml");
//		classPathXmlApplicationContext.refresh();

		String[] beanNamesForType = classPathXmlApplicationContext.getBeanNamesForType(Person.class);
		System.out.println(JSON.toJSONString(beanNamesForType));

	}


}
