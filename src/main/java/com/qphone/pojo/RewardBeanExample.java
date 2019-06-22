package com.qphone.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RewardBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RewardBeanExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRidIsNull() {
            addCriterion("RID is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("RID is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(BigDecimal value) {
            addCriterion("RID =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(BigDecimal value) {
            addCriterion("RID <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(BigDecimal value) {
            addCriterion("RID >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RID >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(BigDecimal value) {
            addCriterion("RID <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RID <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<BigDecimal> values) {
            addCriterion("RID in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<BigDecimal> values) {
            addCriterion("RID not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RID between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RID not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("PID is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("PID is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(BigDecimal value) {
            addCriterion("PID =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(BigDecimal value) {
            addCriterion("PID <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(BigDecimal value) {
            addCriterion("PID >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PID >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(BigDecimal value) {
            addCriterion("PID <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PID <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<BigDecimal> values) {
            addCriterion("PID in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<BigDecimal> values) {
            addCriterion("PID not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PID between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PID not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andRtypeIsNull() {
            addCriterion("RTYPE is null");
            return (Criteria) this;
        }

        public Criteria andRtypeIsNotNull() {
            addCriterion("RTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRtypeEqualTo(String value) {
            addCriterion("RTYPE =", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeNotEqualTo(String value) {
            addCriterion("RTYPE <>", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeGreaterThan(String value) {
            addCriterion("RTYPE >", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeGreaterThanOrEqualTo(String value) {
            addCriterion("RTYPE >=", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeLessThan(String value) {
            addCriterion("RTYPE <", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeLessThanOrEqualTo(String value) {
            addCriterion("RTYPE <=", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeLike(String value) {
            addCriterion("RTYPE like", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeNotLike(String value) {
            addCriterion("RTYPE not like", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeIn(List<String> values) {
            addCriterion("RTYPE in", values, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeNotIn(List<String> values) {
            addCriterion("RTYPE not in", values, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeBetween(String value1, String value2) {
            addCriterion("RTYPE between", value1, value2, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeNotBetween(String value1, String value2) {
            addCriterion("RTYPE not between", value1, value2, "rtype");
            return (Criteria) this;
        }

        public Criteria andRmoneyIsNull() {
            addCriterion("RMONEY is null");
            return (Criteria) this;
        }

        public Criteria andRmoneyIsNotNull() {
            addCriterion("RMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andRmoneyEqualTo(String value) {
            addCriterion("RMONEY =", value, "rmoney");
            return (Criteria) this;
        }

        public Criteria andRmoneyNotEqualTo(String value) {
            addCriterion("RMONEY <>", value, "rmoney");
            return (Criteria) this;
        }

        public Criteria andRmoneyGreaterThan(String value) {
            addCriterion("RMONEY >", value, "rmoney");
            return (Criteria) this;
        }

        public Criteria andRmoneyGreaterThanOrEqualTo(String value) {
            addCriterion("RMONEY >=", value, "rmoney");
            return (Criteria) this;
        }

        public Criteria andRmoneyLessThan(String value) {
            addCriterion("RMONEY <", value, "rmoney");
            return (Criteria) this;
        }

        public Criteria andRmoneyLessThanOrEqualTo(String value) {
            addCriterion("RMONEY <=", value, "rmoney");
            return (Criteria) this;
        }

        public Criteria andRmoneyLike(String value) {
            addCriterion("RMONEY like", value, "rmoney");
            return (Criteria) this;
        }

        public Criteria andRmoneyNotLike(String value) {
            addCriterion("RMONEY not like", value, "rmoney");
            return (Criteria) this;
        }

        public Criteria andRmoneyIn(List<String> values) {
            addCriterion("RMONEY in", values, "rmoney");
            return (Criteria) this;
        }

        public Criteria andRmoneyNotIn(List<String> values) {
            addCriterion("RMONEY not in", values, "rmoney");
            return (Criteria) this;
        }

        public Criteria andRmoneyBetween(String value1, String value2) {
            addCriterion("RMONEY between", value1, value2, "rmoney");
            return (Criteria) this;
        }

        public Criteria andRmoneyNotBetween(String value1, String value2) {
            addCriterion("RMONEY not between", value1, value2, "rmoney");
            return (Criteria) this;
        }

        public Criteria andRjieshaoIsNull() {
            addCriterion("RJIESHAO is null");
            return (Criteria) this;
        }

        public Criteria andRjieshaoIsNotNull() {
            addCriterion("RJIESHAO is not null");
            return (Criteria) this;
        }

        public Criteria andRjieshaoEqualTo(String value) {
            addCriterion("RJIESHAO =", value, "rjieshao");
            return (Criteria) this;
        }

        public Criteria andRjieshaoNotEqualTo(String value) {
            addCriterion("RJIESHAO <>", value, "rjieshao");
            return (Criteria) this;
        }

        public Criteria andRjieshaoGreaterThan(String value) {
            addCriterion("RJIESHAO >", value, "rjieshao");
            return (Criteria) this;
        }

        public Criteria andRjieshaoGreaterThanOrEqualTo(String value) {
            addCriterion("RJIESHAO >=", value, "rjieshao");
            return (Criteria) this;
        }

        public Criteria andRjieshaoLessThan(String value) {
            addCriterion("RJIESHAO <", value, "rjieshao");
            return (Criteria) this;
        }

        public Criteria andRjieshaoLessThanOrEqualTo(String value) {
            addCriterion("RJIESHAO <=", value, "rjieshao");
            return (Criteria) this;
        }

        public Criteria andRjieshaoLike(String value) {
            addCriterion("RJIESHAO like", value, "rjieshao");
            return (Criteria) this;
        }

        public Criteria andRjieshaoNotLike(String value) {
            addCriterion("RJIESHAO not like", value, "rjieshao");
            return (Criteria) this;
        }

        public Criteria andRjieshaoIn(List<String> values) {
            addCriterion("RJIESHAO in", values, "rjieshao");
            return (Criteria) this;
        }

        public Criteria andRjieshaoNotIn(List<String> values) {
            addCriterion("RJIESHAO not in", values, "rjieshao");
            return (Criteria) this;
        }

        public Criteria andRjieshaoBetween(String value1, String value2) {
            addCriterion("RJIESHAO between", value1, value2, "rjieshao");
            return (Criteria) this;
        }

        public Criteria andRjieshaoNotBetween(String value1, String value2) {
            addCriterion("RJIESHAO not between", value1, value2, "rjieshao");
            return (Criteria) this;
        }

        public Criteria andRphotoIsNull() {
            addCriterion("RPHOTO is null");
            return (Criteria) this;
        }

        public Criteria andRphotoIsNotNull() {
            addCriterion("RPHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andRphotoEqualTo(String value) {
            addCriterion("RPHOTO =", value, "rphoto");
            return (Criteria) this;
        }

        public Criteria andRphotoNotEqualTo(String value) {
            addCriterion("RPHOTO <>", value, "rphoto");
            return (Criteria) this;
        }

        public Criteria andRphotoGreaterThan(String value) {
            addCriterion("RPHOTO >", value, "rphoto");
            return (Criteria) this;
        }

        public Criteria andRphotoGreaterThanOrEqualTo(String value) {
            addCriterion("RPHOTO >=", value, "rphoto");
            return (Criteria) this;
        }

        public Criteria andRphotoLessThan(String value) {
            addCriterion("RPHOTO <", value, "rphoto");
            return (Criteria) this;
        }

        public Criteria andRphotoLessThanOrEqualTo(String value) {
            addCriterion("RPHOTO <=", value, "rphoto");
            return (Criteria) this;
        }

        public Criteria andRphotoLike(String value) {
            addCriterion("RPHOTO like", value, "rphoto");
            return (Criteria) this;
        }

        public Criteria andRphotoNotLike(String value) {
            addCriterion("RPHOTO not like", value, "rphoto");
            return (Criteria) this;
        }

        public Criteria andRphotoIn(List<String> values) {
            addCriterion("RPHOTO in", values, "rphoto");
            return (Criteria) this;
        }

        public Criteria andRphotoNotIn(List<String> values) {
            addCriterion("RPHOTO not in", values, "rphoto");
            return (Criteria) this;
        }

        public Criteria andRphotoBetween(String value1, String value2) {
            addCriterion("RPHOTO between", value1, value2, "rphoto");
            return (Criteria) this;
        }

        public Criteria andRphotoNotBetween(String value1, String value2) {
            addCriterion("RPHOTO not between", value1, value2, "rphoto");
            return (Criteria) this;
        }

        public Criteria andRnumberIsNull() {
            addCriterion("RNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andRnumberIsNotNull() {
            addCriterion("RNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andRnumberEqualTo(String value) {
            addCriterion("RNUMBER =", value, "rnumber");
            return (Criteria) this;
        }

        public Criteria andRnumberNotEqualTo(String value) {
            addCriterion("RNUMBER <>", value, "rnumber");
            return (Criteria) this;
        }

        public Criteria andRnumberGreaterThan(String value) {
            addCriterion("RNUMBER >", value, "rnumber");
            return (Criteria) this;
        }

        public Criteria andRnumberGreaterThanOrEqualTo(String value) {
            addCriterion("RNUMBER >=", value, "rnumber");
            return (Criteria) this;
        }

        public Criteria andRnumberLessThan(String value) {
            addCriterion("RNUMBER <", value, "rnumber");
            return (Criteria) this;
        }

        public Criteria andRnumberLessThanOrEqualTo(String value) {
            addCriterion("RNUMBER <=", value, "rnumber");
            return (Criteria) this;
        }

        public Criteria andRnumberLike(String value) {
            addCriterion("RNUMBER like", value, "rnumber");
            return (Criteria) this;
        }

        public Criteria andRnumberNotLike(String value) {
            addCriterion("RNUMBER not like", value, "rnumber");
            return (Criteria) this;
        }

        public Criteria andRnumberIn(List<String> values) {
            addCriterion("RNUMBER in", values, "rnumber");
            return (Criteria) this;
        }

        public Criteria andRnumberNotIn(List<String> values) {
            addCriterion("RNUMBER not in", values, "rnumber");
            return (Criteria) this;
        }

        public Criteria andRnumberBetween(String value1, String value2) {
            addCriterion("RNUMBER between", value1, value2, "rnumber");
            return (Criteria) this;
        }

        public Criteria andRnumberNotBetween(String value1, String value2) {
            addCriterion("RNUMBER not between", value1, value2, "rnumber");
            return (Criteria) this;
        }

        public Criteria andRxiangouIsNull() {
            addCriterion("RXIANGOU is null");
            return (Criteria) this;
        }

        public Criteria andRxiangouIsNotNull() {
            addCriterion("RXIANGOU is not null");
            return (Criteria) this;
        }

        public Criteria andRxiangouEqualTo(String value) {
            addCriterion("RXIANGOU =", value, "rxiangou");
            return (Criteria) this;
        }

        public Criteria andRxiangouNotEqualTo(String value) {
            addCriterion("RXIANGOU <>", value, "rxiangou");
            return (Criteria) this;
        }

        public Criteria andRxiangouGreaterThan(String value) {
            addCriterion("RXIANGOU >", value, "rxiangou");
            return (Criteria) this;
        }

        public Criteria andRxiangouGreaterThanOrEqualTo(String value) {
            addCriterion("RXIANGOU >=", value, "rxiangou");
            return (Criteria) this;
        }

        public Criteria andRxiangouLessThan(String value) {
            addCriterion("RXIANGOU <", value, "rxiangou");
            return (Criteria) this;
        }

        public Criteria andRxiangouLessThanOrEqualTo(String value) {
            addCriterion("RXIANGOU <=", value, "rxiangou");
            return (Criteria) this;
        }

        public Criteria andRxiangouLike(String value) {
            addCriterion("RXIANGOU like", value, "rxiangou");
            return (Criteria) this;
        }

        public Criteria andRxiangouNotLike(String value) {
            addCriterion("RXIANGOU not like", value, "rxiangou");
            return (Criteria) this;
        }

        public Criteria andRxiangouIn(List<String> values) {
            addCriterion("RXIANGOU in", values, "rxiangou");
            return (Criteria) this;
        }

        public Criteria andRxiangouNotIn(List<String> values) {
            addCriterion("RXIANGOU not in", values, "rxiangou");
            return (Criteria) this;
        }

        public Criteria andRxiangouBetween(String value1, String value2) {
            addCriterion("RXIANGOU between", value1, value2, "rxiangou");
            return (Criteria) this;
        }

        public Criteria andRxiangouNotBetween(String value1, String value2) {
            addCriterion("RXIANGOU not between", value1, value2, "rxiangou");
            return (Criteria) this;
        }

        public Criteria andRyunfeiIsNull() {
            addCriterion("RYUNFEI is null");
            return (Criteria) this;
        }

        public Criteria andRyunfeiIsNotNull() {
            addCriterion("RYUNFEI is not null");
            return (Criteria) this;
        }

        public Criteria andRyunfeiEqualTo(String value) {
            addCriterion("RYUNFEI =", value, "ryunfei");
            return (Criteria) this;
        }

        public Criteria andRyunfeiNotEqualTo(String value) {
            addCriterion("RYUNFEI <>", value, "ryunfei");
            return (Criteria) this;
        }

        public Criteria andRyunfeiGreaterThan(String value) {
            addCriterion("RYUNFEI >", value, "ryunfei");
            return (Criteria) this;
        }

        public Criteria andRyunfeiGreaterThanOrEqualTo(String value) {
            addCriterion("RYUNFEI >=", value, "ryunfei");
            return (Criteria) this;
        }

        public Criteria andRyunfeiLessThan(String value) {
            addCriterion("RYUNFEI <", value, "ryunfei");
            return (Criteria) this;
        }

        public Criteria andRyunfeiLessThanOrEqualTo(String value) {
            addCriterion("RYUNFEI <=", value, "ryunfei");
            return (Criteria) this;
        }

        public Criteria andRyunfeiLike(String value) {
            addCriterion("RYUNFEI like", value, "ryunfei");
            return (Criteria) this;
        }

        public Criteria andRyunfeiNotLike(String value) {
            addCriterion("RYUNFEI not like", value, "ryunfei");
            return (Criteria) this;
        }

        public Criteria andRyunfeiIn(List<String> values) {
            addCriterion("RYUNFEI in", values, "ryunfei");
            return (Criteria) this;
        }

        public Criteria andRyunfeiNotIn(List<String> values) {
            addCriterion("RYUNFEI not in", values, "ryunfei");
            return (Criteria) this;
        }

        public Criteria andRyunfeiBetween(String value1, String value2) {
            addCriterion("RYUNFEI between", value1, value2, "ryunfei");
            return (Criteria) this;
        }

        public Criteria andRyunfeiNotBetween(String value1, String value2) {
            addCriterion("RYUNFEI not between", value1, value2, "ryunfei");
            return (Criteria) this;
        }

        public Criteria andRfapiaoIsNull() {
            addCriterion("RFAPIAO is null");
            return (Criteria) this;
        }

        public Criteria andRfapiaoIsNotNull() {
            addCriterion("RFAPIAO is not null");
            return (Criteria) this;
        }

        public Criteria andRfapiaoEqualTo(String value) {
            addCriterion("RFAPIAO =", value, "rfapiao");
            return (Criteria) this;
        }

        public Criteria andRfapiaoNotEqualTo(String value) {
            addCriterion("RFAPIAO <>", value, "rfapiao");
            return (Criteria) this;
        }

        public Criteria andRfapiaoGreaterThan(String value) {
            addCriterion("RFAPIAO >", value, "rfapiao");
            return (Criteria) this;
        }

        public Criteria andRfapiaoGreaterThanOrEqualTo(String value) {
            addCriterion("RFAPIAO >=", value, "rfapiao");
            return (Criteria) this;
        }

        public Criteria andRfapiaoLessThan(String value) {
            addCriterion("RFAPIAO <", value, "rfapiao");
            return (Criteria) this;
        }

        public Criteria andRfapiaoLessThanOrEqualTo(String value) {
            addCriterion("RFAPIAO <=", value, "rfapiao");
            return (Criteria) this;
        }

        public Criteria andRfapiaoLike(String value) {
            addCriterion("RFAPIAO like", value, "rfapiao");
            return (Criteria) this;
        }

        public Criteria andRfapiaoNotLike(String value) {
            addCriterion("RFAPIAO not like", value, "rfapiao");
            return (Criteria) this;
        }

        public Criteria andRfapiaoIn(List<String> values) {
            addCriterion("RFAPIAO in", values, "rfapiao");
            return (Criteria) this;
        }

        public Criteria andRfapiaoNotIn(List<String> values) {
            addCriterion("RFAPIAO not in", values, "rfapiao");
            return (Criteria) this;
        }

        public Criteria andRfapiaoBetween(String value1, String value2) {
            addCriterion("RFAPIAO between", value1, value2, "rfapiao");
            return (Criteria) this;
        }

        public Criteria andRfapiaoNotBetween(String value1, String value2) {
            addCriterion("RFAPIAO not between", value1, value2, "rfapiao");
            return (Criteria) this;
        }

        public Criteria andRdayIsNull() {
            addCriterion("RDAY is null");
            return (Criteria) this;
        }

        public Criteria andRdayIsNotNull() {
            addCriterion("RDAY is not null");
            return (Criteria) this;
        }

        public Criteria andRdayEqualTo(String value) {
            addCriterion("RDAY =", value, "rday");
            return (Criteria) this;
        }

        public Criteria andRdayNotEqualTo(String value) {
            addCriterion("RDAY <>", value, "rday");
            return (Criteria) this;
        }

        public Criteria andRdayGreaterThan(String value) {
            addCriterion("RDAY >", value, "rday");
            return (Criteria) this;
        }

        public Criteria andRdayGreaterThanOrEqualTo(String value) {
            addCriterion("RDAY >=", value, "rday");
            return (Criteria) this;
        }

        public Criteria andRdayLessThan(String value) {
            addCriterion("RDAY <", value, "rday");
            return (Criteria) this;
        }

        public Criteria andRdayLessThanOrEqualTo(String value) {
            addCriterion("RDAY <=", value, "rday");
            return (Criteria) this;
        }

        public Criteria andRdayLike(String value) {
            addCriterion("RDAY like", value, "rday");
            return (Criteria) this;
        }

        public Criteria andRdayNotLike(String value) {
            addCriterion("RDAY not like", value, "rday");
            return (Criteria) this;
        }

        public Criteria andRdayIn(List<String> values) {
            addCriterion("RDAY in", values, "rday");
            return (Criteria) this;
        }

        public Criteria andRdayNotIn(List<String> values) {
            addCriterion("RDAY not in", values, "rday");
            return (Criteria) this;
        }

        public Criteria andRdayBetween(String value1, String value2) {
            addCriterion("RDAY between", value1, value2, "rday");
            return (Criteria) this;
        }

        public Criteria andRdayNotBetween(String value1, String value2) {
            addCriterion("RDAY not between", value1, value2, "rday");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}