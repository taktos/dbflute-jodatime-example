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
 * The abstract condition-query of MEMBER.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMemberCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMemberCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "MEMBER";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberId The value of memberId as equal. (NullAllowed: if null, no condition)
     */
    public void setMemberId_Equal(Integer memberId) {
        doSetMemberId_Equal(memberId);
    }

    protected void doSetMemberId_Equal(Integer memberId) {
        regMemberId(CK_EQ, memberId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberId The value of memberId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_NotEqual(Integer memberId) {
        doSetMemberId_NotEqual(memberId);
    }

    protected void doSetMemberId_NotEqual(Integer memberId) {
        regMemberId(CK_NES, memberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberId The value of memberId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterThan(Integer memberId) {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberId The value of memberId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessThan(Integer memberId) {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberId The value of memberId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterEqual(Integer memberId) {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberId The value of memberId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessEqual(Integer memberId) {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMemberId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMemberId(), "MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberIdList The collection of memberId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_InScope(Collection<Integer> memberIdList) {
        doSetMemberId_InScope(memberIdList);
    }

    protected void doSetMemberId_InScope(Collection<Integer> memberIdList) {
        regINS(CK_INS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberIdList The collection of memberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_NotInScope(Collection<Integer> memberIdList) {
        doSetMemberId_NotInScope(memberIdList);
    }

    protected void doSetMemberId_NotInScope(Collection<Integer> memberIdList) {
        regINS(CK_NINS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select MEMBER_ID from MEMBER_ADDRESS where ...)} <br />
     * MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsMemberAddressList</span>(new SubQuery&lt;MemberAddressCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberAddressList for 'exists'. (NotNull)
     */
    public void existsMemberAddressList(SubQuery<MemberAddressCB> subQuery) {
        assertObjectNotNull("subQuery<MemberAddressCB>", subQuery);
        MemberAddressCB cb = new MemberAddressCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_ExistsReferrer_MemberAddressList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberAddressList");
    }
    public abstract String keepMemberId_ExistsReferrer_MemberAddressList(MemberAddressCQ subQuery);

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select MY_MEMBER_ID from MEMBER_FOLLOWING where ...)} <br />
     * MEMBER_FOLLOWING by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsMemberFollowingByMyMemberIdList</span>(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberFollowingByMyMemberIdList for 'exists'. (NotNull)
     */
    public void existsMemberFollowingByMyMemberIdList(SubQuery<MemberFollowingCB> subQuery) {
        assertObjectNotNull("subQuery<MemberFollowingCB>", subQuery);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_ExistsReferrer_MemberFollowingByMyMemberIdList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MY_MEMBER_ID", subQueryPropertyName, "memberFollowingByMyMemberIdList");
    }
    public abstract String keepMemberId_ExistsReferrer_MemberFollowingByMyMemberIdList(MemberFollowingCQ subQuery);

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select YOUR_MEMBER_ID from MEMBER_FOLLOWING where ...)} <br />
     * MEMBER_FOLLOWING by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsMemberFollowingByYourMemberIdList</span>(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberFollowingByYourMemberIdList for 'exists'. (NotNull)
     */
    public void existsMemberFollowingByYourMemberIdList(SubQuery<MemberFollowingCB> subQuery) {
        assertObjectNotNull("subQuery<MemberFollowingCB>", subQuery);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_ExistsReferrer_MemberFollowingByYourMemberIdList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "MEMBER_ID", "YOUR_MEMBER_ID", subQueryPropertyName, "memberFollowingByYourMemberIdList");
    }
    public abstract String keepMemberId_ExistsReferrer_MemberFollowingByYourMemberIdList(MemberFollowingCQ subQuery);

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select MEMBER_ID from MEMBER_LOGIN where ...)} <br />
     * MEMBER_LOGIN by MEMBER_ID, named 'memberLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsMemberLoginList</span>(new SubQuery&lt;MemberLoginCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberLoginList for 'exists'. (NotNull)
     */
    public void existsMemberLoginList(SubQuery<MemberLoginCB> subQuery) {
        assertObjectNotNull("subQuery<MemberLoginCB>", subQuery);
        MemberLoginCB cb = new MemberLoginCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_ExistsReferrer_MemberLoginList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberLoginList");
    }
    public abstract String keepMemberId_ExistsReferrer_MemberLoginList(MemberLoginCQ subQuery);

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select MEMBER_ID from MEMBER_SECURITY where ...)} <br />
     * MEMBER_SECURITY by MEMBER_ID, named 'memberSecurityAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsMemberSecurityAsOne</span>(new SubQuery&lt;MemberSecurityCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberSecurityAsOne for 'exists'. (NotNull)
     */
    public void existsMemberSecurityAsOne(SubQuery<MemberSecurityCB> subQuery) {
        assertObjectNotNull("subQuery<MemberSecurityCB>", subQuery);
        MemberSecurityCB cb = new MemberSecurityCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_ExistsReferrer_MemberSecurityAsOne(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberSecurityAsOne");
    }
    public abstract String keepMemberId_ExistsReferrer_MemberSecurityAsOne(MemberSecurityCQ subQuery);

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select MEMBER_ID from MEMBER_SERVICE where ...)} <br />
     * MEMBER_SERVICE by MEMBER_ID, named 'memberServiceAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsMemberServiceAsOne</span>(new SubQuery&lt;MemberServiceCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberServiceAsOne for 'exists'. (NotNull)
     */
    public void existsMemberServiceAsOne(SubQuery<MemberServiceCB> subQuery) {
        assertObjectNotNull("subQuery<MemberServiceCB>", subQuery);
        MemberServiceCB cb = new MemberServiceCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_ExistsReferrer_MemberServiceAsOne(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberServiceAsOne");
    }
    public abstract String keepMemberId_ExistsReferrer_MemberServiceAsOne(MemberServiceCQ subQuery);

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select MEMBER_ID from MEMBER_WITHDRAWAL where ...)} <br />
     * MEMBER_WITHDRAWAL by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsMemberWithdrawalAsOne</span>(new SubQuery&lt;MemberWithdrawalCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberWithdrawalAsOne for 'exists'. (NotNull)
     */
    public void existsMemberWithdrawalAsOne(SubQuery<MemberWithdrawalCB> subQuery) {
        assertObjectNotNull("subQuery<MemberWithdrawalCB>", subQuery);
        MemberWithdrawalCB cb = new MemberWithdrawalCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_ExistsReferrer_MemberWithdrawalAsOne(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberWithdrawalAsOne");
    }
    public abstract String keepMemberId_ExistsReferrer_MemberWithdrawalAsOne(MemberWithdrawalCQ subQuery);

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select MEMBER_ID from PURCHASE where ...)} <br />
     * PURCHASE by MEMBER_ID, named 'purchaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsPurchaseList</span>(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of PurchaseList for 'exists'. (NotNull)
     */
    public void existsPurchaseList(SubQuery<PurchaseCB> subQuery) {
        assertObjectNotNull("subQuery<PurchaseCB>", subQuery);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_ExistsReferrer_PurchaseList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "purchaseList");
    }
    public abstract String keepMemberId_ExistsReferrer_PurchaseList(PurchaseCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select MEMBER_ID from MEMBER_ADDRESS where ...)} <br />
     * MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsMemberAddressList</span>(new SubQuery&lt;MemberAddressCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberId_NotExistsReferrer_MemberAddressList for 'not exists'. (NotNull)
     */
    public void notExistsMemberAddressList(SubQuery<MemberAddressCB> subQuery) {
        assertObjectNotNull("subQuery<MemberAddressCB>", subQuery);
        MemberAddressCB cb = new MemberAddressCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_NotExistsReferrer_MemberAddressList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberAddressList");
    }
    public abstract String keepMemberId_NotExistsReferrer_MemberAddressList(MemberAddressCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select MY_MEMBER_ID from MEMBER_FOLLOWING where ...)} <br />
     * MEMBER_FOLLOWING by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsMemberFollowingByMyMemberIdList</span>(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberId_NotExistsReferrer_MemberFollowingByMyMemberIdList for 'not exists'. (NotNull)
     */
    public void notExistsMemberFollowingByMyMemberIdList(SubQuery<MemberFollowingCB> subQuery) {
        assertObjectNotNull("subQuery<MemberFollowingCB>", subQuery);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_NotExistsReferrer_MemberFollowingByMyMemberIdList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MY_MEMBER_ID", subQueryPropertyName, "memberFollowingByMyMemberIdList");
    }
    public abstract String keepMemberId_NotExistsReferrer_MemberFollowingByMyMemberIdList(MemberFollowingCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select YOUR_MEMBER_ID from MEMBER_FOLLOWING where ...)} <br />
     * MEMBER_FOLLOWING by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsMemberFollowingByYourMemberIdList</span>(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberId_NotExistsReferrer_MemberFollowingByYourMemberIdList for 'not exists'. (NotNull)
     */
    public void notExistsMemberFollowingByYourMemberIdList(SubQuery<MemberFollowingCB> subQuery) {
        assertObjectNotNull("subQuery<MemberFollowingCB>", subQuery);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_NotExistsReferrer_MemberFollowingByYourMemberIdList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "YOUR_MEMBER_ID", subQueryPropertyName, "memberFollowingByYourMemberIdList");
    }
    public abstract String keepMemberId_NotExistsReferrer_MemberFollowingByYourMemberIdList(MemberFollowingCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select MEMBER_ID from MEMBER_LOGIN where ...)} <br />
     * MEMBER_LOGIN by MEMBER_ID, named 'memberLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsMemberLoginList</span>(new SubQuery&lt;MemberLoginCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberId_NotExistsReferrer_MemberLoginList for 'not exists'. (NotNull)
     */
    public void notExistsMemberLoginList(SubQuery<MemberLoginCB> subQuery) {
        assertObjectNotNull("subQuery<MemberLoginCB>", subQuery);
        MemberLoginCB cb = new MemberLoginCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_NotExistsReferrer_MemberLoginList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberLoginList");
    }
    public abstract String keepMemberId_NotExistsReferrer_MemberLoginList(MemberLoginCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select MEMBER_ID from MEMBER_SECURITY where ...)} <br />
     * MEMBER_SECURITY by MEMBER_ID, named 'memberSecurityAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsMemberSecurityAsOne</span>(new SubQuery&lt;MemberSecurityCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberId_NotExistsReferrer_MemberSecurityAsOne for 'not exists'. (NotNull)
     */
    public void notExistsMemberSecurityAsOne(SubQuery<MemberSecurityCB> subQuery) {
        assertObjectNotNull("subQuery<MemberSecurityCB>", subQuery);
        MemberSecurityCB cb = new MemberSecurityCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_NotExistsReferrer_MemberSecurityAsOne(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberSecurityAsOne");
    }
    public abstract String keepMemberId_NotExistsReferrer_MemberSecurityAsOne(MemberSecurityCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select MEMBER_ID from MEMBER_SERVICE where ...)} <br />
     * MEMBER_SERVICE by MEMBER_ID, named 'memberServiceAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsMemberServiceAsOne</span>(new SubQuery&lt;MemberServiceCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberId_NotExistsReferrer_MemberServiceAsOne for 'not exists'. (NotNull)
     */
    public void notExistsMemberServiceAsOne(SubQuery<MemberServiceCB> subQuery) {
        assertObjectNotNull("subQuery<MemberServiceCB>", subQuery);
        MemberServiceCB cb = new MemberServiceCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_NotExistsReferrer_MemberServiceAsOne(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberServiceAsOne");
    }
    public abstract String keepMemberId_NotExistsReferrer_MemberServiceAsOne(MemberServiceCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select MEMBER_ID from MEMBER_WITHDRAWAL where ...)} <br />
     * MEMBER_WITHDRAWAL by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsMemberWithdrawalAsOne</span>(new SubQuery&lt;MemberWithdrawalCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberId_NotExistsReferrer_MemberWithdrawalAsOne for 'not exists'. (NotNull)
     */
    public void notExistsMemberWithdrawalAsOne(SubQuery<MemberWithdrawalCB> subQuery) {
        assertObjectNotNull("subQuery<MemberWithdrawalCB>", subQuery);
        MemberWithdrawalCB cb = new MemberWithdrawalCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_NotExistsReferrer_MemberWithdrawalAsOne(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberWithdrawalAsOne");
    }
    public abstract String keepMemberId_NotExistsReferrer_MemberWithdrawalAsOne(MemberWithdrawalCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select MEMBER_ID from PURCHASE where ...)} <br />
     * PURCHASE by MEMBER_ID, named 'purchaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsPurchaseList</span>(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberId_NotExistsReferrer_PurchaseList for 'not exists'. (NotNull)
     */
    public void notExistsPurchaseList(SubQuery<PurchaseCB> subQuery) {
        assertObjectNotNull("subQuery<PurchaseCB>", subQuery);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_NotExistsReferrer_PurchaseList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "purchaseList");
    }
    public abstract String keepMemberId_NotExistsReferrer_PurchaseList(PurchaseCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MEMBER_ID from MEMBER_ADDRESS where ...)} <br />
     * MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressAsOne'.
     * @param subQuery The sub-query of MemberAddressList for 'in-scope'. (NotNull)
     */
    public void inScopeMemberAddressList(SubQuery<MemberAddressCB> subQuery) {
        assertObjectNotNull("subQuery<MemberAddressCB>", subQuery);
        MemberAddressCB cb = new MemberAddressCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_InScopeRelation_MemberAddressList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberAddressList");
    }
    public abstract String keepMemberId_InScopeRelation_MemberAddressList(MemberAddressCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MY_MEMBER_ID from MEMBER_FOLLOWING where ...)} <br />
     * MEMBER_FOLLOWING by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdAsOne'.
     * @param subQuery The sub-query of MemberFollowingByMyMemberIdList for 'in-scope'. (NotNull)
     */
    public void inScopeMemberFollowingByMyMemberIdList(SubQuery<MemberFollowingCB> subQuery) {
        assertObjectNotNull("subQuery<MemberFollowingCB>", subQuery);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_InScopeRelation_MemberFollowingByMyMemberIdList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "MEMBER_ID", "MY_MEMBER_ID", subQueryPropertyName, "memberFollowingByMyMemberIdList");
    }
    public abstract String keepMemberId_InScopeRelation_MemberFollowingByMyMemberIdList(MemberFollowingCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select YOUR_MEMBER_ID from MEMBER_FOLLOWING where ...)} <br />
     * MEMBER_FOLLOWING by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdAsOne'.
     * @param subQuery The sub-query of MemberFollowingByYourMemberIdList for 'in-scope'. (NotNull)
     */
    public void inScopeMemberFollowingByYourMemberIdList(SubQuery<MemberFollowingCB> subQuery) {
        assertObjectNotNull("subQuery<MemberFollowingCB>", subQuery);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_InScopeRelation_MemberFollowingByYourMemberIdList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "MEMBER_ID", "YOUR_MEMBER_ID", subQueryPropertyName, "memberFollowingByYourMemberIdList");
    }
    public abstract String keepMemberId_InScopeRelation_MemberFollowingByYourMemberIdList(MemberFollowingCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MEMBER_ID from MEMBER_LOGIN where ...)} <br />
     * MEMBER_LOGIN by MEMBER_ID, named 'memberLoginAsOne'.
     * @param subQuery The sub-query of MemberLoginList for 'in-scope'. (NotNull)
     */
    public void inScopeMemberLoginList(SubQuery<MemberLoginCB> subQuery) {
        assertObjectNotNull("subQuery<MemberLoginCB>", subQuery);
        MemberLoginCB cb = new MemberLoginCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_InScopeRelation_MemberLoginList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberLoginList");
    }
    public abstract String keepMemberId_InScopeRelation_MemberLoginList(MemberLoginCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MEMBER_ID from MEMBER_SECURITY where ...)} <br />
     * MEMBER_SECURITY by MEMBER_ID, named 'memberSecurityAsOne'.
     * @param subQuery The sub-query of MemberSecurityAsOne for 'in-scope'. (NotNull)
     */
    public void inScopeMemberSecurityAsOne(SubQuery<MemberSecurityCB> subQuery) {
        assertObjectNotNull("subQuery<MemberSecurityCB>", subQuery);
        MemberSecurityCB cb = new MemberSecurityCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_InScopeRelation_MemberSecurityAsOne(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberSecurityAsOne");
    }
    public abstract String keepMemberId_InScopeRelation_MemberSecurityAsOne(MemberSecurityCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MEMBER_ID from MEMBER_SERVICE where ...)} <br />
     * MEMBER_SERVICE by MEMBER_ID, named 'memberServiceAsOne'.
     * @param subQuery The sub-query of MemberServiceAsOne for 'in-scope'. (NotNull)
     */
    public void inScopeMemberServiceAsOne(SubQuery<MemberServiceCB> subQuery) {
        assertObjectNotNull("subQuery<MemberServiceCB>", subQuery);
        MemberServiceCB cb = new MemberServiceCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_InScopeRelation_MemberServiceAsOne(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberServiceAsOne");
    }
    public abstract String keepMemberId_InScopeRelation_MemberServiceAsOne(MemberServiceCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MEMBER_ID from MEMBER_WITHDRAWAL where ...)} <br />
     * MEMBER_WITHDRAWAL by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * @param subQuery The sub-query of MemberWithdrawalAsOne for 'in-scope'. (NotNull)
     */
    public void inScopeMemberWithdrawalAsOne(SubQuery<MemberWithdrawalCB> subQuery) {
        assertObjectNotNull("subQuery<MemberWithdrawalCB>", subQuery);
        MemberWithdrawalCB cb = new MemberWithdrawalCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_InScopeRelation_MemberWithdrawalAsOne(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberWithdrawalAsOne");
    }
    public abstract String keepMemberId_InScopeRelation_MemberWithdrawalAsOne(MemberWithdrawalCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MEMBER_ID from PURCHASE where ...)} <br />
     * PURCHASE by MEMBER_ID, named 'purchaseAsOne'.
     * @param subQuery The sub-query of PurchaseList for 'in-scope'. (NotNull)
     */
    public void inScopePurchaseList(SubQuery<PurchaseCB> subQuery) {
        assertObjectNotNull("subQuery<PurchaseCB>", subQuery);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_InScopeRelation_PurchaseList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "purchaseList");
    }
    public abstract String keepMemberId_InScopeRelation_PurchaseList(PurchaseCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MEMBER_ID from MEMBER_ADDRESS where ...)} <br />
     * MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressAsOne'.
     * @param subQuery The sub-query of MemberAddressList for 'not in-scope'. (NotNull)
     */
    public void notInScopeMemberAddressList(SubQuery<MemberAddressCB> subQuery) {
        assertObjectNotNull("subQuery<MemberAddressCB>", subQuery);
        MemberAddressCB cb = new MemberAddressCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_NotInScopeRelation_MemberAddressList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberAddressList");
    }
    public abstract String keepMemberId_NotInScopeRelation_MemberAddressList(MemberAddressCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MY_MEMBER_ID from MEMBER_FOLLOWING where ...)} <br />
     * MEMBER_FOLLOWING by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdAsOne'.
     * @param subQuery The sub-query of MemberFollowingByMyMemberIdList for 'not in-scope'. (NotNull)
     */
    public void notInScopeMemberFollowingByMyMemberIdList(SubQuery<MemberFollowingCB> subQuery) {
        assertObjectNotNull("subQuery<MemberFollowingCB>", subQuery);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_NotInScopeRelation_MemberFollowingByMyMemberIdList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "MEMBER_ID", "MY_MEMBER_ID", subQueryPropertyName, "memberFollowingByMyMemberIdList");
    }
    public abstract String keepMemberId_NotInScopeRelation_MemberFollowingByMyMemberIdList(MemberFollowingCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select YOUR_MEMBER_ID from MEMBER_FOLLOWING where ...)} <br />
     * MEMBER_FOLLOWING by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdAsOne'.
     * @param subQuery The sub-query of MemberFollowingByYourMemberIdList for 'not in-scope'. (NotNull)
     */
    public void notInScopeMemberFollowingByYourMemberIdList(SubQuery<MemberFollowingCB> subQuery) {
        assertObjectNotNull("subQuery<MemberFollowingCB>", subQuery);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_NotInScopeRelation_MemberFollowingByYourMemberIdList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "MEMBER_ID", "YOUR_MEMBER_ID", subQueryPropertyName, "memberFollowingByYourMemberIdList");
    }
    public abstract String keepMemberId_NotInScopeRelation_MemberFollowingByYourMemberIdList(MemberFollowingCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MEMBER_ID from MEMBER_LOGIN where ...)} <br />
     * MEMBER_LOGIN by MEMBER_ID, named 'memberLoginAsOne'.
     * @param subQuery The sub-query of MemberLoginList for 'not in-scope'. (NotNull)
     */
    public void notInScopeMemberLoginList(SubQuery<MemberLoginCB> subQuery) {
        assertObjectNotNull("subQuery<MemberLoginCB>", subQuery);
        MemberLoginCB cb = new MemberLoginCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_NotInScopeRelation_MemberLoginList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberLoginList");
    }
    public abstract String keepMemberId_NotInScopeRelation_MemberLoginList(MemberLoginCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MEMBER_ID from MEMBER_SECURITY where ...)} <br />
     * MEMBER_SECURITY by MEMBER_ID, named 'memberSecurityAsOne'.
     * @param subQuery The sub-query of MemberSecurityAsOne for 'not in-scope'. (NotNull)
     */
    public void notInScopeMemberSecurityAsOne(SubQuery<MemberSecurityCB> subQuery) {
        assertObjectNotNull("subQuery<MemberSecurityCB>", subQuery);
        MemberSecurityCB cb = new MemberSecurityCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_NotInScopeRelation_MemberSecurityAsOne(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberSecurityAsOne");
    }
    public abstract String keepMemberId_NotInScopeRelation_MemberSecurityAsOne(MemberSecurityCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MEMBER_ID from MEMBER_SERVICE where ...)} <br />
     * MEMBER_SERVICE by MEMBER_ID, named 'memberServiceAsOne'.
     * @param subQuery The sub-query of MemberServiceAsOne for 'not in-scope'. (NotNull)
     */
    public void notInScopeMemberServiceAsOne(SubQuery<MemberServiceCB> subQuery) {
        assertObjectNotNull("subQuery<MemberServiceCB>", subQuery);
        MemberServiceCB cb = new MemberServiceCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_NotInScopeRelation_MemberServiceAsOne(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberServiceAsOne");
    }
    public abstract String keepMemberId_NotInScopeRelation_MemberServiceAsOne(MemberServiceCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MEMBER_ID from MEMBER_WITHDRAWAL where ...)} <br />
     * MEMBER_WITHDRAWAL by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * @param subQuery The sub-query of MemberWithdrawalAsOne for 'not in-scope'. (NotNull)
     */
    public void notInScopeMemberWithdrawalAsOne(SubQuery<MemberWithdrawalCB> subQuery) {
        assertObjectNotNull("subQuery<MemberWithdrawalCB>", subQuery);
        MemberWithdrawalCB cb = new MemberWithdrawalCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_NotInScopeRelation_MemberWithdrawalAsOne(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberWithdrawalAsOne");
    }
    public abstract String keepMemberId_NotInScopeRelation_MemberWithdrawalAsOne(MemberWithdrawalCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MEMBER_ID from PURCHASE where ...)} <br />
     * PURCHASE by MEMBER_ID, named 'purchaseAsOne'.
     * @param subQuery The sub-query of PurchaseList for 'not in-scope'. (NotNull)
     */
    public void notInScopePurchaseList(SubQuery<PurchaseCB> subQuery) {
        assertObjectNotNull("subQuery<PurchaseCB>", subQuery);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_NotInScopeRelation_PurchaseList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "purchaseList");
    }
    public abstract String keepMemberId_NotInScopeRelation_PurchaseList(PurchaseCQ subQuery);

    public void xsderiveMemberAddressList(String function, SubQuery<MemberAddressCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MemberAddressCB>", subQuery);
        MemberAddressCB cb = new MemberAddressCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_SpecifyDerivedReferrer_MemberAddressList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberAddressList", aliasName, option);
    }
    public abstract String keepMemberId_SpecifyDerivedReferrer_MemberAddressList(MemberAddressCQ subQuery);

    public void xsderiveMemberFollowingByMyMemberIdList(String function, SubQuery<MemberFollowingCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MemberFollowingCB>", subQuery);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_SpecifyDerivedReferrer_MemberFollowingByMyMemberIdList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "MEMBER_ID", "MY_MEMBER_ID", subQueryPropertyName, "memberFollowingByMyMemberIdList", aliasName, option);
    }
    public abstract String keepMemberId_SpecifyDerivedReferrer_MemberFollowingByMyMemberIdList(MemberFollowingCQ subQuery);

    public void xsderiveMemberFollowingByYourMemberIdList(String function, SubQuery<MemberFollowingCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MemberFollowingCB>", subQuery);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_SpecifyDerivedReferrer_MemberFollowingByYourMemberIdList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "MEMBER_ID", "YOUR_MEMBER_ID", subQueryPropertyName, "memberFollowingByYourMemberIdList", aliasName, option);
    }
    public abstract String keepMemberId_SpecifyDerivedReferrer_MemberFollowingByYourMemberIdList(MemberFollowingCQ subQuery);

    public void xsderiveMemberLoginList(String function, SubQuery<MemberLoginCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MemberLoginCB>", subQuery);
        MemberLoginCB cb = new MemberLoginCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_SpecifyDerivedReferrer_MemberLoginList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberLoginList", aliasName, option);
    }
    public abstract String keepMemberId_SpecifyDerivedReferrer_MemberLoginList(MemberLoginCQ subQuery);

    public void xsderivePurchaseList(String function, SubQuery<PurchaseCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<PurchaseCB>", subQuery);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_SpecifyDerivedReferrer_PurchaseList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "purchaseList", aliasName, option);
    }
    public abstract String keepMemberId_SpecifyDerivedReferrer_PurchaseList(PurchaseCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from MEMBER_ADDRESS where ...)} <br />
     * MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedMemberAddressList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;MemberAddressCB&gt;() {
     *     public void query(MemberAddressCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MemberAddressCB> derivedMemberAddressList() {
        return xcreateQDRFunctionMemberAddressList();
    }
    protected HpQDRFunction<MemberAddressCB> xcreateQDRFunctionMemberAddressList() {
        return new HpQDRFunction<MemberAddressCB>(new HpQDRSetupper<MemberAddressCB>() {
            public void setup(String function, SubQuery<MemberAddressCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMemberAddressList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMemberAddressList(String function, SubQuery<MemberAddressCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MemberAddressCB>", subQuery);
        MemberAddressCB cb = new MemberAddressCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_QueryDerivedReferrer_MemberAddressList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepMemberId_QueryDerivedReferrer_MemberAddressListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberAddressList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepMemberId_QueryDerivedReferrer_MemberAddressList(MemberAddressCQ subQuery);
    public abstract String keepMemberId_QueryDerivedReferrer_MemberAddressListParameter(Object parameterValue);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from MEMBER_FOLLOWING where ...)} <br />
     * MEMBER_FOLLOWING by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedMemberFollowingByMyMemberIdList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MemberFollowingCB> derivedMemberFollowingByMyMemberIdList() {
        return xcreateQDRFunctionMemberFollowingByMyMemberIdList();
    }
    protected HpQDRFunction<MemberFollowingCB> xcreateQDRFunctionMemberFollowingByMyMemberIdList() {
        return new HpQDRFunction<MemberFollowingCB>(new HpQDRSetupper<MemberFollowingCB>() {
            public void setup(String function, SubQuery<MemberFollowingCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMemberFollowingByMyMemberIdList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMemberFollowingByMyMemberIdList(String function, SubQuery<MemberFollowingCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MemberFollowingCB>", subQuery);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepMemberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "MEMBER_ID", "MY_MEMBER_ID", subQueryPropertyName, "memberFollowingByMyMemberIdList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepMemberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdList(MemberFollowingCQ subQuery);
    public abstract String keepMemberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdListParameter(Object parameterValue);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from MEMBER_FOLLOWING where ...)} <br />
     * MEMBER_FOLLOWING by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedMemberFollowingByYourMemberIdList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MemberFollowingCB> derivedMemberFollowingByYourMemberIdList() {
        return xcreateQDRFunctionMemberFollowingByYourMemberIdList();
    }
    protected HpQDRFunction<MemberFollowingCB> xcreateQDRFunctionMemberFollowingByYourMemberIdList() {
        return new HpQDRFunction<MemberFollowingCB>(new HpQDRSetupper<MemberFollowingCB>() {
            public void setup(String function, SubQuery<MemberFollowingCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMemberFollowingByYourMemberIdList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMemberFollowingByYourMemberIdList(String function, SubQuery<MemberFollowingCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MemberFollowingCB>", subQuery);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepMemberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "MEMBER_ID", "YOUR_MEMBER_ID", subQueryPropertyName, "memberFollowingByYourMemberIdList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepMemberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdList(MemberFollowingCQ subQuery);
    public abstract String keepMemberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdListParameter(Object parameterValue);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from MEMBER_LOGIN where ...)} <br />
     * MEMBER_LOGIN by MEMBER_ID, named 'memberLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedMemberLoginList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;MemberLoginCB&gt;() {
     *     public void query(MemberLoginCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MemberLoginCB> derivedMemberLoginList() {
        return xcreateQDRFunctionMemberLoginList();
    }
    protected HpQDRFunction<MemberLoginCB> xcreateQDRFunctionMemberLoginList() {
        return new HpQDRFunction<MemberLoginCB>(new HpQDRSetupper<MemberLoginCB>() {
            public void setup(String function, SubQuery<MemberLoginCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMemberLoginList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMemberLoginList(String function, SubQuery<MemberLoginCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MemberLoginCB>", subQuery);
        MemberLoginCB cb = new MemberLoginCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_QueryDerivedReferrer_MemberLoginList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepMemberId_QueryDerivedReferrer_MemberLoginListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberLoginList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepMemberId_QueryDerivedReferrer_MemberLoginList(MemberLoginCQ subQuery);
    public abstract String keepMemberId_QueryDerivedReferrer_MemberLoginListParameter(Object parameterValue);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from PURCHASE where ...)} <br />
     * PURCHASE by MEMBER_ID, named 'purchaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedPurchaseList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<PurchaseCB> derivedPurchaseList() {
        return xcreateQDRFunctionPurchaseList();
    }
    protected HpQDRFunction<PurchaseCB> xcreateQDRFunctionPurchaseList() {
        return new HpQDRFunction<PurchaseCB>(new HpQDRSetupper<PurchaseCB>() {
            public void setup(String function, SubQuery<PurchaseCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderivePurchaseList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderivePurchaseList(String function, SubQuery<PurchaseCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<PurchaseCB>", subQuery);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_QueryDerivedReferrer_PurchaseList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepMemberId_QueryDerivedReferrer_PurchaseListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "purchaseList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepMemberId_QueryDerivedReferrer_PurchaseList(PurchaseCQ subQuery);
    public abstract String keepMemberId_QueryDerivedReferrer_PurchaseListParameter(Object parameterValue);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(10)}
     */
    public void setMemberId_IsNull() { regMemberId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(10)}
     */
    public void setMemberId_IsNotNull() { regMemberId(CK_ISNN, DOBJ); }

    protected void regMemberId(ConditionKey k, Object v) { regQ(k, v, getCValueMemberId(), "MEMBER_ID"); }
    abstract protected ConditionValue getCValueMemberId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_NAME: {IX, NotNull, VARCHAR(200)}
     * @param memberName The value of memberName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_Equal(String memberName) {
        doSetMemberName_Equal(fRES(memberName));
    }

    protected void doSetMemberName_Equal(String memberName) {
        regMemberName(CK_EQ, memberName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_NAME: {IX, NotNull, VARCHAR(200)}
     * @param memberName The value of memberName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_NotEqual(String memberName) {
        doSetMemberName_NotEqual(fRES(memberName));
    }

    protected void doSetMemberName_NotEqual(String memberName) {
        regMemberName(CK_NES, memberName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_NAME: {IX, NotNull, VARCHAR(200)}
     * @param memberName The value of memberName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_GreaterThan(String memberName) {
        regMemberName(CK_GT, fRES(memberName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_NAME: {IX, NotNull, VARCHAR(200)}
     * @param memberName The value of memberName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_LessThan(String memberName) {
        regMemberName(CK_LT, fRES(memberName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_NAME: {IX, NotNull, VARCHAR(200)}
     * @param memberName The value of memberName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_GreaterEqual(String memberName) {
        regMemberName(CK_GE, fRES(memberName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_NAME: {IX, NotNull, VARCHAR(200)}
     * @param memberName The value of memberName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_LessEqual(String memberName) {
        regMemberName(CK_LE, fRES(memberName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_NAME: {IX, NotNull, VARCHAR(200)}
     * @param memberNameList The collection of memberName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_InScope(Collection<String> memberNameList) {
        doSetMemberName_InScope(memberNameList);
    }

    public void doSetMemberName_InScope(Collection<String> memberNameList) {
        regINS(CK_INS, cTL(memberNameList), getCValueMemberName(), "MEMBER_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_NAME: {IX, NotNull, VARCHAR(200)}
     * @param memberNameList The collection of memberName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_NotInScope(Collection<String> memberNameList) {
        doSetMemberName_NotInScope(memberNameList);
    }

    public void doSetMemberName_NotInScope(Collection<String> memberNameList) {
        regINS(CK_NINS, cTL(memberNameList), getCValueMemberName(), "MEMBER_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_NAME: {IX, NotNull, VARCHAR(200)}
     * @param memberName The value of memberName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_PrefixSearch(String memberName) {
        setMemberName_LikeSearch(memberName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_NAME: {IX, NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setMemberName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memberName The value of memberName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMemberName_LikeSearch(String memberName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memberName), getCValueMemberName(), "MEMBER_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_NAME: {IX, NotNull, VARCHAR(200)}
     * @param memberName The value of memberName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMemberName_NotLikeSearch(String memberName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memberName), getCValueMemberName(), "MEMBER_NAME", likeSearchOption);
    }

    protected void regMemberName(ConditionKey k, Object v) { regQ(k, v, getCValueMemberName(), "MEMBER_NAME"); }
    abstract protected ConditionValue getCValueMemberName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
     * @param memberAccount The value of memberAccount as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberAccount_Equal(String memberAccount) {
        doSetMemberAccount_Equal(fRES(memberAccount));
    }

    protected void doSetMemberAccount_Equal(String memberAccount) {
        regMemberAccount(CK_EQ, memberAccount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
     * @param memberAccount The value of memberAccount as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberAccount_NotEqual(String memberAccount) {
        doSetMemberAccount_NotEqual(fRES(memberAccount));
    }

    protected void doSetMemberAccount_NotEqual(String memberAccount) {
        regMemberAccount(CK_NES, memberAccount);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
     * @param memberAccount The value of memberAccount as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberAccount_GreaterThan(String memberAccount) {
        regMemberAccount(CK_GT, fRES(memberAccount));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
     * @param memberAccount The value of memberAccount as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberAccount_LessThan(String memberAccount) {
        regMemberAccount(CK_LT, fRES(memberAccount));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
     * @param memberAccount The value of memberAccount as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberAccount_GreaterEqual(String memberAccount) {
        regMemberAccount(CK_GE, fRES(memberAccount));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
     * @param memberAccount The value of memberAccount as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberAccount_LessEqual(String memberAccount) {
        regMemberAccount(CK_LE, fRES(memberAccount));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
     * @param memberAccountList The collection of memberAccount as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberAccount_InScope(Collection<String> memberAccountList) {
        doSetMemberAccount_InScope(memberAccountList);
    }

    public void doSetMemberAccount_InScope(Collection<String> memberAccountList) {
        regINS(CK_INS, cTL(memberAccountList), getCValueMemberAccount(), "MEMBER_ACCOUNT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
     * @param memberAccountList The collection of memberAccount as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberAccount_NotInScope(Collection<String> memberAccountList) {
        doSetMemberAccount_NotInScope(memberAccountList);
    }

    public void doSetMemberAccount_NotInScope(Collection<String> memberAccountList) {
        regINS(CK_NINS, cTL(memberAccountList), getCValueMemberAccount(), "MEMBER_ACCOUNT");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
     * @param memberAccount The value of memberAccount as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberAccount_PrefixSearch(String memberAccount) {
        setMemberAccount_LikeSearch(memberAccount, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)} <br />
     * <pre>e.g. setMemberAccount_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memberAccount The value of memberAccount as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMemberAccount_LikeSearch(String memberAccount, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memberAccount), getCValueMemberAccount(), "MEMBER_ACCOUNT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
     * @param memberAccount The value of memberAccount as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMemberAccount_NotLikeSearch(String memberAccount, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memberAccount), getCValueMemberAccount(), "MEMBER_ACCOUNT", likeSearchOption);
    }

    protected void regMemberAccount(ConditionKey k, Object v) { regQ(k, v, getCValueMemberAccount(), "MEMBER_ACCOUNT"); }
    abstract protected ConditionValue getCValueMemberAccount();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS}
     * @param memberStatusCode The value of memberStatusCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_Equal(String memberStatusCode) {
        doSetMemberStatusCode_Equal(fRES(memberStatusCode));
    }

    protected void doSetMemberStatusCode_Equal(String memberStatusCode) {
        regMemberStatusCode(CK_EQ, memberStatusCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS}
     * @param memberStatusCode The value of memberStatusCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_NotEqual(String memberStatusCode) {
        doSetMemberStatusCode_NotEqual(fRES(memberStatusCode));
    }

    protected void doSetMemberStatusCode_NotEqual(String memberStatusCode) {
        regMemberStatusCode(CK_NES, memberStatusCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS}
     * @param memberStatusCode The value of memberStatusCode as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_GreaterThan(String memberStatusCode) {
        regMemberStatusCode(CK_GT, fRES(memberStatusCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS}
     * @param memberStatusCode The value of memberStatusCode as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_LessThan(String memberStatusCode) {
        regMemberStatusCode(CK_LT, fRES(memberStatusCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS}
     * @param memberStatusCode The value of memberStatusCode as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_GreaterEqual(String memberStatusCode) {
        regMemberStatusCode(CK_GE, fRES(memberStatusCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS}
     * @param memberStatusCode The value of memberStatusCode as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_LessEqual(String memberStatusCode) {
        regMemberStatusCode(CK_LE, fRES(memberStatusCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS}
     * @param memberStatusCodeList The collection of memberStatusCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_InScope(Collection<String> memberStatusCodeList) {
        doSetMemberStatusCode_InScope(memberStatusCodeList);
    }

    public void doSetMemberStatusCode_InScope(Collection<String> memberStatusCodeList) {
        regINS(CK_INS, cTL(memberStatusCodeList), getCValueMemberStatusCode(), "MEMBER_STATUS_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS}
     * @param memberStatusCodeList The collection of memberStatusCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_NotInScope(Collection<String> memberStatusCodeList) {
        doSetMemberStatusCode_NotInScope(memberStatusCodeList);
    }

    public void doSetMemberStatusCode_NotInScope(Collection<String> memberStatusCodeList) {
        regINS(CK_NINS, cTL(memberStatusCodeList), getCValueMemberStatusCode(), "MEMBER_STATUS_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS}
     * @param memberStatusCode The value of memberStatusCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_PrefixSearch(String memberStatusCode) {
        setMemberStatusCode_LikeSearch(memberStatusCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS} <br />
     * <pre>e.g. setMemberStatusCode_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memberStatusCode The value of memberStatusCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMemberStatusCode_LikeSearch(String memberStatusCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memberStatusCode), getCValueMemberStatusCode(), "MEMBER_STATUS_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS}
     * @param memberStatusCode The value of memberStatusCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMemberStatusCode_NotLikeSearch(String memberStatusCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memberStatusCode), getCValueMemberStatusCode(), "MEMBER_STATUS_CODE", likeSearchOption);
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MEMBER_STATUS_CODE from MEMBER_STATUS where ...)} <br />
     * MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @param subQuery The sub-query of MemberStatus for 'in-scope'. (NotNull)
     */
    public void inScopeMemberStatus(SubQuery<MemberStatusCB> subQuery) {
        assertObjectNotNull("subQuery<MemberStatusCB>", subQuery);
        MemberStatusCB cb = new MemberStatusCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberStatusCode_InScopeRelation_MemberStatus(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", subQueryPropertyName, "memberStatus");
    }
    public abstract String keepMemberStatusCode_InScopeRelation_MemberStatus(MemberStatusCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MEMBER_STATUS_CODE from MEMBER_STATUS where ...)} <br />
     * MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @param subQuery The sub-query of MemberStatus for 'not in-scope'. (NotNull)
     */
    public void notInScopeMemberStatus(SubQuery<MemberStatusCB> subQuery) {
        assertObjectNotNull("subQuery<MemberStatusCB>", subQuery);
        MemberStatusCB cb = new MemberStatusCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberStatusCode_NotInScopeRelation_MemberStatus(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", subQueryPropertyName, "memberStatus");
    }
    public abstract String keepMemberStatusCode_NotInScopeRelation_MemberStatus(MemberStatusCQ subQuery);

    protected void regMemberStatusCode(ConditionKey k, Object v) { regQ(k, v, getCValueMemberStatusCode(), "MEMBER_STATUS_CODE"); }
    abstract protected ConditionValue getCValueMemberStatusCode();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)}
     * @param formalizedDatetime The value of formalizedDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setFormalizedDatetime_Equal(java.sql.Timestamp formalizedDatetime) {
        regFormalizedDatetime(CK_EQ,  formalizedDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)}
     * @param formalizedDatetime The value of formalizedDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setFormalizedDatetime_GreaterThan(java.sql.Timestamp formalizedDatetime) {
        regFormalizedDatetime(CK_GT,  formalizedDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)}
     * @param formalizedDatetime The value of formalizedDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setFormalizedDatetime_LessThan(java.sql.Timestamp formalizedDatetime) {
        regFormalizedDatetime(CK_LT,  formalizedDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)}
     * @param formalizedDatetime The value of formalizedDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setFormalizedDatetime_GreaterEqual(java.sql.Timestamp formalizedDatetime) {
        regFormalizedDatetime(CK_GE,  formalizedDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)}
     * @param formalizedDatetime The value of formalizedDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setFormalizedDatetime_LessEqual(java.sql.Timestamp formalizedDatetime) {
        regFormalizedDatetime(CK_LE, formalizedDatetime);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)}
     */
    public void setFormalizedDatetime_IsNull() { regFormalizedDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)}
     */
    public void setFormalizedDatetime_IsNotNull() { regFormalizedDatetime(CK_ISNN, DOBJ); }

    protected void regFormalizedDatetime(ConditionKey k, Object v) { regQ(k, v, getCValueFormalizedDatetime(), "FORMALIZED_DATETIME"); }
    abstract protected ConditionValue getCValueFormalizedDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * BIRTHDATE: {DATE(8)}
     * @param birthdate The value of birthdate as equal. (NullAllowed: if null, no condition)
     */
    public void setBirthdate_Equal(org.joda.time.LocalDate birthdate) {
        regBirthdate(CK_EQ,  birthdate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BIRTHDATE: {DATE(8)}
     * @param birthdate The value of birthdate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setBirthdate_GreaterThan(org.joda.time.LocalDate birthdate) {
        regBirthdate(CK_GT,  birthdate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BIRTHDATE: {DATE(8)}
     * @param birthdate The value of birthdate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setBirthdate_LessThan(org.joda.time.LocalDate birthdate) {
        regBirthdate(CK_LT,  birthdate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BIRTHDATE: {DATE(8)}
     * @param birthdate The value of birthdate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setBirthdate_GreaterEqual(org.joda.time.LocalDate birthdate) {
        regBirthdate(CK_GE,  birthdate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BIRTHDATE: {DATE(8)}
     * @param birthdate The value of birthdate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setBirthdate_LessEqual(org.joda.time.LocalDate birthdate) {
        regBirthdate(CK_LE, birthdate);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * BIRTHDATE: {DATE(8)}
     */
    public void setBirthdate_IsNull() { regBirthdate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * BIRTHDATE: {DATE(8)}
     */
    public void setBirthdate_IsNotNull() { regBirthdate(CK_ISNN, DOBJ); }

    protected void regBirthdate(ConditionKey k, Object v) { regQ(k, v, getCValueBirthdate(), "BIRTHDATE"); }
    abstract protected ConditionValue getCValueBirthdate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @param registerDatetime The value of registerDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_Equal(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @param registerDatetime The value of registerDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_GreaterThan(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_GT,  registerDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @param registerDatetime The value of registerDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_LessThan(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_LT,  registerDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @param registerDatetime The value of registerDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_GreaterEqual(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_GE,  registerDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @param registerDatetime The value of registerDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_LessEqual(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_LE, registerDatetime);
    }

    protected void regRegisterDatetime(ConditionKey k, Object v) { regQ(k, v, getCValueRegisterDatetime(), "REGISTER_DATETIME"); }
    abstract protected ConditionValue getCValueRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUser The value of registerUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_Equal(String registerUser) {
        doSetRegisterUser_Equal(fRES(registerUser));
    }

    protected void doSetRegisterUser_Equal(String registerUser) {
        regRegisterUser(CK_EQ, registerUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUser The value of registerUser as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_NotEqual(String registerUser) {
        doSetRegisterUser_NotEqual(fRES(registerUser));
    }

    protected void doSetRegisterUser_NotEqual(String registerUser) {
        regRegisterUser(CK_NES, registerUser);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUser The value of registerUser as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_GreaterThan(String registerUser) {
        regRegisterUser(CK_GT, fRES(registerUser));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUser The value of registerUser as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_LessThan(String registerUser) {
        regRegisterUser(CK_LT, fRES(registerUser));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUser The value of registerUser as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_GreaterEqual(String registerUser) {
        regRegisterUser(CK_GE, fRES(registerUser));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUser The value of registerUser as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_LessEqual(String registerUser) {
        regRegisterUser(CK_LE, fRES(registerUser));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUserList The collection of registerUser as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_InScope(Collection<String> registerUserList) {
        doSetRegisterUser_InScope(registerUserList);
    }

    public void doSetRegisterUser_InScope(Collection<String> registerUserList) {
        regINS(CK_INS, cTL(registerUserList), getCValueRegisterUser(), "REGISTER_USER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUserList The collection of registerUser as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_NotInScope(Collection<String> registerUserList) {
        doSetRegisterUser_NotInScope(registerUserList);
    }

    public void doSetRegisterUser_NotInScope(Collection<String> registerUserList) {
        regINS(CK_NINS, cTL(registerUserList), getCValueRegisterUser(), "REGISTER_USER");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUser The value of registerUser as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_PrefixSearch(String registerUser) {
        setRegisterUser_LikeSearch(registerUser, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setRegisterUser_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param registerUser The value of registerUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRegisterUser_LikeSearch(String registerUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(registerUser), getCValueRegisterUser(), "REGISTER_USER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUser The value of registerUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRegisterUser_NotLikeSearch(String registerUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(registerUser), getCValueRegisterUser(), "REGISTER_USER", likeSearchOption);
    }

    protected void regRegisterUser(ConditionKey k, Object v) { regQ(k, v, getCValueRegisterUser(), "REGISTER_USER"); }
    abstract protected ConditionValue getCValueRegisterUser();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @param updateDatetime The value of updateDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_Equal(java.sql.Timestamp updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @param updateDatetime The value of updateDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_GreaterThan(java.sql.Timestamp updateDatetime) {
        regUpdateDatetime(CK_GT,  updateDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @param updateDatetime The value of updateDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_LessThan(java.sql.Timestamp updateDatetime) {
        regUpdateDatetime(CK_LT,  updateDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @param updateDatetime The value of updateDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_GreaterEqual(java.sql.Timestamp updateDatetime) {
        regUpdateDatetime(CK_GE,  updateDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @param updateDatetime The value of updateDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_LessEqual(java.sql.Timestamp updateDatetime) {
        regUpdateDatetime(CK_LE, updateDatetime);
    }

    protected void regUpdateDatetime(ConditionKey k, Object v) { regQ(k, v, getCValueUpdateDatetime(), "UPDATE_DATETIME"); }
    abstract protected ConditionValue getCValueUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUser The value of updateUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_Equal(String updateUser) {
        doSetUpdateUser_Equal(fRES(updateUser));
    }

    protected void doSetUpdateUser_Equal(String updateUser) {
        regUpdateUser(CK_EQ, updateUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUser The value of updateUser as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_NotEqual(String updateUser) {
        doSetUpdateUser_NotEqual(fRES(updateUser));
    }

    protected void doSetUpdateUser_NotEqual(String updateUser) {
        regUpdateUser(CK_NES, updateUser);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUser The value of updateUser as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_GreaterThan(String updateUser) {
        regUpdateUser(CK_GT, fRES(updateUser));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUser The value of updateUser as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_LessThan(String updateUser) {
        regUpdateUser(CK_LT, fRES(updateUser));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUser The value of updateUser as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_GreaterEqual(String updateUser) {
        regUpdateUser(CK_GE, fRES(updateUser));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUser The value of updateUser as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_LessEqual(String updateUser) {
        regUpdateUser(CK_LE, fRES(updateUser));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUserList The collection of updateUser as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_InScope(Collection<String> updateUserList) {
        doSetUpdateUser_InScope(updateUserList);
    }

    public void doSetUpdateUser_InScope(Collection<String> updateUserList) {
        regINS(CK_INS, cTL(updateUserList), getCValueUpdateUser(), "UPDATE_USER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUserList The collection of updateUser as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_NotInScope(Collection<String> updateUserList) {
        doSetUpdateUser_NotInScope(updateUserList);
    }

    public void doSetUpdateUser_NotInScope(Collection<String> updateUserList) {
        regINS(CK_NINS, cTL(updateUserList), getCValueUpdateUser(), "UPDATE_USER");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUser The value of updateUser as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_PrefixSearch(String updateUser) {
        setUpdateUser_LikeSearch(updateUser, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setUpdateUser_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updateUser The value of updateUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUpdateUser_LikeSearch(String updateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updateUser), getCValueUpdateUser(), "UPDATE_USER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUser The value of updateUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUpdateUser_NotLikeSearch(String updateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updateUser), getCValueUpdateUser(), "UPDATE_USER", likeSearchOption);
    }

    protected void regUpdateUser(ConditionKey k, Object v) { regQ(k, v, getCValueUpdateUser(), "UPDATE_USER"); }
    abstract protected ConditionValue getCValueUpdateUser();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @param versionNo The value of versionNo as equal. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_Equal(Long versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Long versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @param versionNo The value of versionNo as notEqual. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_NotEqual(Long versionNo) {
        doSetVersionNo_NotEqual(versionNo);
    }

    protected void doSetVersionNo_NotEqual(Long versionNo) {
        regVersionNo(CK_NES, versionNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @param versionNo The value of versionNo as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_GreaterThan(Long versionNo) {
        regVersionNo(CK_GT, versionNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @param versionNo The value of versionNo as lessThan. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_LessThan(Long versionNo) {
        regVersionNo(CK_LT, versionNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @param versionNo The value of versionNo as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_GreaterEqual(Long versionNo) {
        regVersionNo(CK_GE, versionNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @param versionNo The value of versionNo as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_LessEqual(Long versionNo) {
        regVersionNo(CK_LE, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @param versionNoList The collection of versionNo as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVersionNo_InScope(Collection<Long> versionNoList) {
        doSetVersionNo_InScope(versionNoList);
    }

    protected void doSetVersionNo_InScope(Collection<Long> versionNoList) {
        regINS(CK_INS, cTL(versionNoList), getCValueVersionNo(), "VERSION_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @param versionNoList The collection of versionNo as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVersionNo_NotInScope(Collection<Long> versionNoList) {
        doSetVersionNo_NotInScope(versionNoList);
    }

    protected void doSetVersionNo_NotInScope(Collection<Long> versionNoList) {
        regINS(CK_NINS, cTL(versionNoList), getCValueVersionNo(), "VERSION_NO");
    }

    protected void regVersionNo(ConditionKey k, Object v) { regQ(k, v, getCValueVersionNo(), "VERSION_NO"); }
    abstract protected ConditionValue getCValueVersionNo();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<MemberCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<MemberCB>(new HpSSQSetupper<MemberCB>() {
            public void setup(String function, SubQuery<MemberCB> subQuery, HpSSQOption<MemberCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<MemberCB> subQuery, String operand, HpSSQOption<MemberCB> option) {
        assertObjectNotNull("subQuery<MemberCB>", subQuery);
        MemberCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(MemberCQ subQuery);

    protected MemberCB xcreateScalarConditionCB() {
        MemberCB cb = new MemberCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected MemberCB xcreateScalarConditionPartitionByCB() {
        MemberCB cb = new MemberCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<MemberCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MemberCB>", subQuery);
        MemberCB cb = new MemberCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(MemberCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MemberCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<MemberCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<MemberCB>(new HpQDRSetupper<MemberCB>() {
            public void setup(String function, SubQuery<MemberCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<MemberCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MemberCB>", subQuery);
        MemberCB cb = new MemberCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(MemberCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<MemberCB> subQuery) {
        assertObjectNotNull("subQuery<MemberCB>", subQuery);
        MemberCB cb = new MemberCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(MemberCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<MemberCB> subQuery) {
        assertObjectNotNull("subQuery<MemberCB>", subQuery);
        MemberCB cb = new MemberCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(MemberCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return MemberCB.class.getName(); }
    protected String xabCQ() { return MemberCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
