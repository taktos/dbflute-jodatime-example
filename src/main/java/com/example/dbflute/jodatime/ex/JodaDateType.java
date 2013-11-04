package com.example.dbflute.jodatime.ex;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.joda.time.LocalDate;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.seasar.dbflute.s2dao.valuetype.TnAbstractValueType;
import org.seasar.dbflute.util.DfTypeUtil;

public class JodaDateType extends TnAbstractValueType {

    public JodaDateType() {
        super(Types.DATE);
    }

    @Override
    public Object getValue(final ResultSet rs, final int index) throws SQLException {
        final Date date = rs.getDate(index);
        return date == null ? null : LocalDate.fromDateFields(date);
    }

    @Override
    public Object getValue(final ResultSet rs, final String columnName) throws SQLException {
        final Date date = rs.getDate(columnName);
        return date == null ? null : LocalDate.fromDateFields(date);
    }

    @Override
    public Object getValue(final CallableStatement cs, final int index) throws SQLException {
        final Date date = cs.getDate(index);
        return date == null ? null : LocalDate.fromDateFields(date);
    }

    @Override
    public Object getValue(final CallableStatement cs, final String parameterName) throws SQLException {
        final Date date = cs.getDate(parameterName);
        return date == null ? null : LocalDate.fromDateFields(date);
    }

    @Override
    public void bindValue(final Connection conn, final PreparedStatement ps, final int index, final Object value) throws SQLException {
        if (value == null) {
            this.setNull(ps, index);
        } else {
            ps.setDate(index, this.toSqlDate(value));
        }

    }

    @Override
    public void bindValue(final Connection conn, final CallableStatement cs, final String parameterName, final Object value) throws SQLException {
        if (value == null) {
            this.setNull(cs, parameterName);
        } else {
            cs.setDate(parameterName, this.toSqlDate(value));
        }
    }

    private java.sql.Date toSqlDate(final Object value) {
        assert value != null;

        if (value instanceof ReadablePartial) {
            return new Date(((ReadablePartial) value).toDateTime(null).withTimeAtStartOfDay().getMillis());
        } else if (value instanceof ReadableInstant) {
            return new Date(((ReadableInstant) value).getMillis());
        }

        return DfTypeUtil.toSqlDate(value);
    }
}
