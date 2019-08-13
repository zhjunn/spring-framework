package xyz.junwen.spring.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zhangjunwen on 2019-08-13
 *
 * @author zhangjunwen
 * @date 2019-08-13
 */
@Component
public class Police implements Person {

	@Autowired
	BadMan badMan;

	@Override
	public String getName() {
		return "我是警察";
	}
}
