package xyz.junwen.spring.demo.bean;

import org.springframework.stereotype.Component;

/**
 * Created by zhangjunwen on 2019-08-13
 *
 * @author zhangjunwen
 * @date 2019-08-13
 */
@Component
public class BadMan implements Person {
	@Override
	public String getName() {
		return "woshihuairen";
	}
}
