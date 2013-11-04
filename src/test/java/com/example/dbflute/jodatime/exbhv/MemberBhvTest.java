package com.example.dbflute.jodatime.exbhv;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.example.dbflute.jodatime.exentity.Member;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:jdbcBeans.xml", "classpath:dbfluteBeans.xml" })
@Transactional
public class MemberBhvTest {

	@Autowired
	private MemberBhv memberBhv;
	
	@Test
	public void testConnect() {
		Member member = memberBhv.selectByPKValue(1);
		assertThat(member, is(notNullValue()));
	}

}
