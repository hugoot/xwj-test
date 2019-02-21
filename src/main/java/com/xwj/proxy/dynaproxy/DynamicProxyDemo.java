package com.xwj.proxy.dynaproxy;

import com.xwj.proxy.RealSubject;
import com.xwj.proxy.Subject;

/**
 * 测试动态代理
 * 
 * @author XU.WJ 2018年2月26日
 */
public class DynamicProxyDemo {
	
	public static void main(String[] args) {
		//实例化代理操作类
		MyHandler handler = new MyHandler();
		//绑定实际对象
		Subject sub = (Subject) handler.bind(new RealSubject());
		sub.say("xuwenjin", 25);
	}

}
