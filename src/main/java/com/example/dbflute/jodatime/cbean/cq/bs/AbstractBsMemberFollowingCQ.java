package com.example.dbflute.jodatime.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.jodatime.allcommon.*;
import com.example.dbflute.jodatime.cbean.*;
import com.example.dbflute.jodatime.cbean.cq.*;

/**
 * The abstract condition-query of MEMBER_FOLLOWING.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMemberFollowingCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMemberFollowingCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "MEMBER_FOLLOWING";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberFollowingId The value of memberFollowingId as equal. (NullAllowed: if null, no condition)
     */
    public void setMemberFollowingId_Equal(Long memberFollowingId) {
        doSetMemberFollowingId_Equal(memberFollowingId);
    }

    protected void doSetMemberFollowingId_Equal(Long memberFollowingId) {
        regMemberFollowingId(CK_EQ, memberFollowingId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberFollowingId The value of memberFollowingId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberFollowingId_NotEqual(Long memberFollowingId) {
        doSetMemberFollowingId_NotEqual(memberFollowingId);
    }

    protected void doSetMemberFollowingId_NotEqual(Long memberFollowingId) {
        regMemberFollowingId(CK_NES, memberFollowingId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberFollowingId The value of memberFollowingId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMemberFollowingId_GreaterThan(Long memberFollowingId) {
        regMemberFollowingId(CK_GT, memberFollowingId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberFollowingId The value of memberFollowingId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMemberFollowingId_LessThan(Long memberFollowingId) {
        regMemberFollowingId(CK_LT, memberFollowingId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberFollowingId The value of memberFollowingId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberFollowingId_GreaterEqual(Long memberFollowingId) {
        regMemberFollowingId(CK_GE, memberFollowingId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberFollowingId The value of memberFollowingId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberFollowingId_LessEqual(Long memberFollowingId) {
        regMemberFollowingId(CK_LE, memberFollowingId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of memberFollowingId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberFollowingId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMemberFollowingId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMemberFollowingId(), "MEMBER_FOLLOWING_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberFollowingIdList The collection of memberFollowingId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberFollowingId_InScope(Collection<Long> memberFollowingIdList) {
        doSetMemberFollowingId_InScope(memberFollowingIdList);
    }

    protected void doSetMemberFollowingId_InScope(Collection<Long> memberFollowingIdList) {
        regINS(CK_INS, cTL(memberFollowingIdList), getCValueMemberFollowingId(), "MEMBER_FOLLOWING_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberFollowingIdList The collection of memberFollowingId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberFollowingId_NotInScope(Collection<Long> memberFollowingIdList) {
        doSetMemberFollowingId_NotInScope(memberFollowingIdList);
    }

    protected void doSetMemberFollowingId_NotInScope(Collection<Long> memberFollowingIdList) {
        regINS(CK_NINS, cTL(memberFollowingIdList), getCValueMemberFollowingId(), "MEMBER_FOLLOWING_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setMemberFollowingId_IsNull() { regMemberFollowingId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setMemberFollowingId_IsNotNull() { regMemberFollowingId(CK_ISNN, DOBJ); }

    protected void regMemberFollowingId(ConditionKey k, Object v) { regQ(k, v, getCValueMemberFollowingId(), "MEMBER_FOLLOWING_ID"); }
    abstract protected ConditionValue getCValueMemberFollowingId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MY_MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param myMemberId The value of myMemberId as equal. (NullAllowed: if null, no condition)
     */
    public void setMyMemberId_Equal(Integer myMemberId) {
        doSetMyMemberId_Equal(myMemberId);
    }

    protected void doSetMyMemberId_Equal(Integer myMemberId) {
        regMyMemberId(CK_EQ, myMemberId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MY_MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param myMemberId The value of myMemberId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setMyMemberId_NotEqual(Integer myMemberId) {
        doSetMyMemberId_NotEqual(myMemberId);
    }

    protected void doSetMyMemberId_NotEqual(Integer myMemberId) {
        regMyMemberId(CK_NES, myMemberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MY_MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param myMemberId The value of myMemberId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMyMemberId_GreaterThan(Integer myMemberId) {
        regMyMemberId(CK_GT, myMemberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MY_MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param myMemberId The value of myMemberId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMyMemberId_LessThan(Integer myMemberId) {
        regMyMemberId(CK_LT, myMemberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MY_MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param myMemberId The value of myMemberId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMyMemberId_GreaterEqual(Integer myMemberId) {
        regMyMemberId(CK_GE, myMemberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MY_MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param myMemberId The value of myMemberId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMyMemberId_LessEqual(Integer myMemberId) {
        regMyMemberId(CK_LE, myMemberId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MY_MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param minNumber The min number of myMemberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of myMemberId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMyMemberId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMyMemberId(), "MY_MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MY_MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param myMemberIdList The collection of myMemberId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyMemberId_InScope(Collection<Integer> myMemberIdList) {
        doSetMyMemberId_InScope(myMemberIdList);
    }

    protected void doSetMyMemberId_InScope(Collection<Integer> myMemberIdList) {
        regINS(CK_INS, cTL(myMemberIdList), getCValueMyMemberId(), "MY_MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MY_MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param myMemberIdList The collection of myMemberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyMemberId_NotInScope(Collection<Integer> myMemberIdList) {
        doSetMyMemberId_NotInScope(myMemberIdList);
    }

    protected void doSetMyMemberId_NotInScope(Collection<Integer> myMemberIdList) {
        regINS(CK_NINS, cTL(myMemberIdList), getCValueMyMemberId(), "MY_MEMBER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MY_MEMBER_ID from MEMBER where ...)} <br />
     * MEMBER by my MY_MEMBER_ID, named 'memberByMyMemberId'.
     * @param subQuery The sub-query of MemberByMyMemberId for 'in-scope'. (NotNull)
     */
    public void inScopeMemberByMyMemberId(SubQuery<MemberCB> subQuery) {
        assertObjectNotNull("subQuery<MemberCB>", subQuery);
        MemberCB cb = new MemberCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyMemberId_InScopeRelation_MemberByMyMemberId(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "MY_MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberByMyMemberId");
    }
    public abstract String keepMyMemberId_InScopeRelation_MemberByMyMemberId(MemberCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MY_MEMBER_ID from MEMBER where ...)} <br />
     * MEMBER by my MY_MEMBER_ID, named 'memberByMyMemberId'.
     * @param subQuery The sub-query of MemberByMyMemberId for 'not in-scope'. (NotNull)
     */
    public void notInScopeMemberByMyMemberId(SubQuery<MemberCB> subQuery) {
        assertObjectNotNull("subQuery<MemberCB>", subQuery);
        MemberCB cb = new MemberCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyMemberId_NotInScopeRelation_MemberByMyMemberId(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "MY_MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberByMyMemberId");
    }
    public abstract String keepMyMemberId_NotInScopeRelation_MemberByMyMemberId(MemberCQ subQuery);

    protected void regMyMemberId(ConditionKey k, Object v) { regQ(k, v, getCValueMyMemberId(), "MY_MEMBER_ID"); }
    abstract protected ConditionValue getCValueMyMemberId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * YOUR_MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param yourMemberId The value of yourMemberId as equal. (NullAllowed: if null, no condition)
     */
    public void setYourMemberId_Equal(Integer yourMemberId) {
        doSetYourMemberId_Equal(yourMemberId);
    }

    protected void doSetYourMemberId_Equal(Integer yourMemberId) {
        regYourMemberId(CK_EQ, yourMemberId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * YOUR_MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param yourMemberId The value of yourMemberId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setYourMemberId_NotEqual(Integer yourMemberId) {
        doSetYourMemberId_NotEqual(yourMemberId);
    }

    protected void doSetYourMemberId_NotEqual(Integer yourMemberId) {
        regYourMemberId(CK_NES, yourMemberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * YOUR_MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param yourMemberId The value of yourMemberId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setYourMemberId_GreaterThan(Integer yourMemberId) {
        regYourMemberId(CK_GT, yourMemberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * YOUR_MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param yourMemberId The value of yourMemberId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setYourMemberId_LessThan(Integer yourMemberId) {
        regYourMemberId(CK_LT, yourMemberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * YOUR_MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param yourMemberId The value of yourMemberId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setYourMemberId_GreaterEqual(Integer yourMemberId) {
        regYourMemberId(CK_GE, yourMemberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * YOUR_MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param yourMemberId The value of yourMemberId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setYourMemberId_LessEqual(Integer yourMemberId) {
        regYourMemberId(CK_LE, yourMemberId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * YOUR_MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param minNumber The min number of yourMemberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of yourMemberId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setYourMemberId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueYourMemberId(), "YOUR_MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * YOUR_MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param yourMemberIdList The collection of yourMemberId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setYourMemberId_InScope(Collection<Integer> yourMemberIdList) {
        doSetYourMemberId_InScope(yourMemberIdList);
    }

    protected void doSetYourMemberId_InScope(Collection<Integer> yourMemberIdList) {
        regINS(CK_INS, cTL(yourMemberIdList), getCValueYourMemberId(), "YOUR_MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * YOUR_MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param yourMemberIdList The collection of yourMemberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setYourMemberId_NotInScope(Collection<Integer> yourMemberIdList) {
        doSetYourMemberId_NotInScope(yourMemberIdList);
    }

    protected void doSetYourMemberId_NotInScope(Collection<Integer> yourMemberIdList) {
        regINS(CK_NINS, cTL(yourMemberIdList), getCValueYourMemberId(), "YOUR_MEMBER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select YOUR_MEMBER_ID from MEMBER where ...)} <br />
     * MEMBER by my YOUR_MEMBER_ID, named 'memberByYourMemberId'.
     * @param subQuery The sub-query of MemberByYourMemberId for 'in-scope'. (NotNull)
     */
    public void inScopeMemberByYourMemberId(SubQuery<MemberCB> subQuery) {
        assertObjectNotNull("subQuery<MemberCB>", subQuery);
        MemberCB cb = new MemberCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepYourMemberId_InScopeRelation_MemberByYourMemberId(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "YOUR_MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberByYourMemberId");
    }
    public abstract String keepYourMemberId_InScopeRelation_MemberByYourMemberId(MemberCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select YOUR_MEMBER_ID from MEMBER where ...)} <br />
     * MEMBER by my YOUR_MEMBER_ID, named 'memberByYourMemberId'.
     * @param subQuery The sub-query of MemberByYourMemberId for 'not in-scope'. (NotNull)
     */
    public void notInScopeMemberByYourMemberId(SubQuery<MemberCB> subQuery) {
        assertObjectNotNull("subQuery<MemberCB>", subQuery);
        MemberCB cb = new MemberCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepYourMemberId_NotInScopeRelation_MemberByYourMemberId(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "YOUR_MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberByYourMemberId");
    }
    public abstract String keepYourMemberId_NotInScopeRelation_MemberByYourMemberId(MemberCQ subQuery);

    protected void regYourMemberId(ConditionKey k, Object v) { regQ(k, v, getCValueYourMemberId(), "YOUR_MEMBER_ID"); }
    abstract protected ConditionValue getCValueYourMemberId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(23, 10)}
     * @param followDatetime The value of followDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setFollowDatetime_Equal(java.sql.Timestamp followDatetime) {
        regFollowDatetime(CK_EQ,  followDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(23, 10)}
     * @param followDatetime The value of followDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setFollowDatetime_GreaterThan(java.sql.Timestamp followDatetime) {
        regFollowDatetime(CK_GT,  followDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(23, 10)}
     * @param followDatetime The value of followDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setFollowDatetime_LessThan(java.sql.Timestamp followDatetime) {
        regFollowDatetime(CK_LT,  followDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(23, 10)}
     * @param followDatetime The value of followDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setFollowDatetime_GreaterEqual(java.sql.Timestamp followDatetime) {
        regFollowDatetime(CK_GE,  followDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(23, 10)}
     * @param followDatetime The value of followDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setFollowDatetime_LessEqual(java.sql.Timestamp followDatetime) {
        regFollowDatetime(CK_LE, followDatetime);
    }

    protected void regFollowDatetime(ConditionKey k, Object v) { regQ(k, v, getCValueFollowDatetime(), "FOLLOW_DATETIME"); }
    abstract protected ConditionValue getCValueFollowDatetime();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberFollowingCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberFollowingCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberFollowingCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberFollowingCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberFollowingCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberFollowingCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<MemberFollowingCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<MemberFollowingCB>(new HpSSQSetupper<MemberFollowingCB>() {
            public void setup(String function, SubQuery<MemberFollowingCB> subQuery, HpSSQOption<MemberFollowingCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<MemberFollowingCB> subQuery, String operand, HpSSQOption<MemberFollowingCB> option) {
        assertObjectNotNull("subQuery<MemberFollowingCB>", subQuery);
        MemberFollowingCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(MemberFollowingCQ subQuery);

    protected MemberFollowingCB xcreateScalarConditionCB() {
        MemberFollowingCB cb = new MemberFollowingCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected MemberFollowingCB xcreateScalarConditionPartitionByCB() {
        MemberFollowingCB cb = new MemberFollowingCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<MemberFollowingCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MemberFollowingCB>", subQuery);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "MEMBER_FOLLOWING_ID", "MEMBER_FOLLOWING_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(MemberFollowingCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MemberFollowingCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<MemberFollowingCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<MemberFollowingCB>(new HpQDRSetupper<MemberFollowingCB>() {
            public void setup(String function, SubQuery<MemberFollowingCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<MemberFollowingCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MemberFollowingCB>", subQuery);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "MEMBER_FOLLOWING_ID", "MEMBER_FOLLOWING_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(MemberFollowingCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<MemberFollowingCB> subQuery) {
        assertObjectNotNull("subQuery<MemberFollowingCB>", subQuery);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(MemberFollowingCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<MemberFollowingCB> subQuery) {
        assertObjectNotNull("subQuery<MemberFollowingCB>", subQuery);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(MemberFollowingCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return MemberFollowingCB.class.getName(); }
    protected String xabCQ() { return MemberFollowingCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
