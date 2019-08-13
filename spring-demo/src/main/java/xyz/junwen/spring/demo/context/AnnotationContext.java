package xyz.junwen.spring.demo.context;

import com.alibaba.fastjson.JSON;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import xyz.junwen.spring.demo.bean.Person;

/**
 * Created by zhangjunwen on 2019-08-13
 *
 * @author zhangjunwen
 * @date 2019-08-13
 */
public class AnnotationContext {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("xyz.junwen");
		String[] beanNamesForType = annotationConfigApplicationContext.getBeanNamesForType(Person.class);
		System.out.println(JSON.toJSONString(beanNamesForType));
	}
}
