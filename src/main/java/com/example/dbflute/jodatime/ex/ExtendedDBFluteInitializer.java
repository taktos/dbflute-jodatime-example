package com.example.dbflute.jodatime.ex;

import javax.sql.DataSource;

import org.joda.time.LocalDate;

import com.example.dbflute.jodatime.allcommon.DBFluteConfig;
import com.example.dbflute.jodatime.allcommon.DBFluteInitializer;

public class ExtendedDBFluteInitializer extends DBFluteInitializer {
	private static final JodaDateType DATE_TYPE = new JodaDateType();
	
	public ExtendedDBFluteInitializer(DataSource dataSource) {
		super(dataSource);
	}

	@Override
	protected void prologue() {
		super.prologue();
		DBFluteConfig config = DBFluteConfig.getInstance();
		if (config.isLocked()) {
			config.unlock();
		}
		config.registerBasicValueType(LocalDate.class, DATE_TYPE);
		config.lock();
	}
}
