package com.zxy.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ElkApplicationTests {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	public void contextLoads() {
	}
	@Test
	public void testLog() {
		logger.info("message:你好啊，我是谁谁谁，nihaoa ,woshi ni ge ge ege!");
		logger.info("msg:[********20181002===upload to logstash and elasticsearch,kibana view!!!********]");
		logger.info("3333");
		logger.info("msg:today view kibana");
	}
}
