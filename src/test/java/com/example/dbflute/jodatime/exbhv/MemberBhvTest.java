package com.example.dbflute.jodatime.exbhv;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

import java.util.Collections;
import java.util.List;

import org.joda.time.LocalDate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.seasar.dbflute.cbean.ListResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.example.dbflute.jodatime.cbean.MemberCB;
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

	@Test
	public void testSelectLocalDate() throws Exception {
		Member member = memberBhv.selectByPKValue(1);
		assertThat(member, is(notNullValue()));
		LocalDate birthdate = member.getBirthdate();
		assertThat(birthdate, is(new LocalDate(1965, 3, 3)));
	}
	
	@Test
	public void testQueryByLocalDate() throws Exception {
		MemberCB cb = new MemberCB();
		cb.query().setBirthdate_Equal(new LocalDate(1965, 3, 3));
		List<Member> list = memberBhv.selectList(cb);
		
		assertThat(list.size(), is(1));
		assertThat(list.get(0).getMemberId(), is(1));
	}

	@Test
	public void testUpdateLocalDate() throws Exception {
		MemberCB cb = new MemberCB();
		cb.query().setBirthdate_Equal(new LocalDate(1965, 3, 3));
		Member member = memberBhv.selectEntity(cb);
		LocalDate birthdate = member.getBirthdate();
		assertThat(birthdate, is(new LocalDate(1965, 3, 3)));
		
		member.setBirthdate(new LocalDate(2013, 1, 2));
		memberBhv.update(member);
		
		Member updated = memberBhv.selectByPKValue(member.getMemberId());
		
		assertThat(updated, is(notNullValue()));
		assertThat(updated.getBirthdate(), is(new LocalDate(2013, 1, 2)));
	}
}
