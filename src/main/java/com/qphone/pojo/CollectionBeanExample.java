package com.qphone.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CollectionBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollectionBeanExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andPnameIsNull() {
            addCriterion("PNAME is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("PNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("PNAME =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("PNAME <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("PNAME >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("PNAME >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("PNAME <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("PNAME <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("PNAME like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("PNAME not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("PNAME in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("PNAME not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("PNAME between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("PNAME not between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPmoneyIsNull() {
            addCriterion("PMONEY is null");
            return (Criteria) this;
        }

        public Criteria andPmoneyIsNotNull() {
            addCriterion("PMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andPmoneyEqualTo(BigDecimal value) {
            addCriterion("PMONEY =", value, "pmoney");
            return (Criteria) this;
        }

        public Criteria andPmoneyNotEqualTo(BigDecimal value) {
            addCriterion("PMONEY <>", value, "pmoney");
            return (Criteria) this;
        }

        public Criteria andPmoneyGreaterThan(BigDecimal value) {
            addCriterion("PMONEY >", value, "pmoney");
            return (Criteria) this;
        }

        public Criteria andPmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PMONEY >=", value, "pmoney");
            return (Criteria) this;
        }

        public Criteria andPmoneyLessThan(BigDecimal value) {
            addCriterion("PMONEY <", value, "pmoney");
            return (Criteria) this;
        }

        public Criteria andPmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PMONEY <=", value, "pmoney");
            return (Criteria) this;
        }

        public Criteria andPmoneyIn(List<BigDecimal> values) {
            addCriterion("PMONEY in", values, "pmoney");
            return (Criteria) this;
        }

        public Criteria andPmoneyNotIn(List<BigDecimal> values) {
            addCriterion("PMONEY not in", values, "pmoney");
            return (Criteria) this;
        }

        public Criteria andPmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PMONEY between", value1, value2, "pmoney");
            return (Criteria) this;
        }

        public Criteria andPmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PMONEY not between", value1, value2, "pmoney");
            return (Criteria) this;
        }

        public Criteria andPdayIsNull() {
            addCriterion("PDAY is null");
            return (Criteria) this;
        }

        public Criteria andPdayIsNotNull() {
            addCriterion("PDAY is not null");
            return (Criteria) this;
        }

        public Criteria andPdayEqualTo(String value) {
            addCriterion("PDAY =", value, "pday");
            return (Criteria) this;
        }

        public Criteria andPdayNotEqualTo(String value) {
            addCriterion("PDAY <>", value, "pday");
            return (Criteria) this;
        }

        public Criteria andPdayGreaterThan(String value) {
            addCriterion("PDAY >", value, "pday");
            return (Criteria) this;
        }

        public Criteria andPdayGreaterThanOrEqualTo(String value) {
            addCriterion("PDAY >=", value, "pday");
            return (Criteria) this;
        }

        public Criteria andPdayLessThan(String value) {
            addCriterion("PDAY <", value, "pday");
            return (Criteria) this;
        }

        public Criteria andPdayLessThanOrEqualTo(String value) {
            addCriterion("PDAY <=", value, "pday");
            return (Criteria) this;
        }

        public Criteria andPdayLike(String value) {
            addCriterion("PDAY like", value, "pday");
            return (Criteria) this;
        }

        public Criteria andPdayNotLike(String value) {
            addCriterion("PDAY not like", value, "pday");
            return (Criteria) this;
        }

        public Criteria andPdayIn(List<String> values) {
            addCriterion("PDAY in", values, "pday");
            return (Criteria) this;
        }

        public Criteria andPdayNotIn(List<String> values) {
            addCriterion("PDAY not in", values, "pday");
            return (Criteria) this;
        }

        public Criteria andPdayBetween(String value1, String value2) {
            addCriterion("PDAY between", value1, value2, "pday");
            return (Criteria) this;
        }

        public Criteria andPdayNotBetween(String value1, String value2) {
            addCriterion("PDAY not between", value1, value2, "pday");
            return (Criteria) this;
        }

        public Criteria andPcreatetimeIsNull() {
            addCriterion("PCREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andPcreatetimeIsNotNull() {
            addCriterion("PCREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andPcreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("PCREATETIME =", value, "pcreatetime");
            return (Criteria) this;
        }

        public Criteria andPcreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("PCREATETIME <>", value, "pcreatetime");
            return (Criteria) this;
        }

        public Criteria andPcreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("PCREATETIME >", value, "pcreatetime");
            return (Criteria) this;
        }

        public Criteria andPcreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PCREATETIME >=", value, "pcreatetime");
            return (Criteria) this;
        }

        public Criteria andPcreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("PCREATETIME <", value, "pcreatetime");
            return (Criteria) this;
        }

        public Criteria andPcreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PCREATETIME <=", value, "pcreatetime");
            return (Criteria) this;
        }

        public Criteria andPcreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("PCREATETIME in", values, "pcreatetime");
            return (Criteria) this;
        }

        public Criteria andPcreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("PCREATETIME not in", values, "pcreatetime");
            return (Criteria) this;
        }

        public Criteria andPcreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PCREATETIME between", value1, value2, "pcreatetime");
            return (Criteria) this;
        }

        public Criteria andPcreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PCREATETIME not between", value1, value2, "pcreatetime");
            return (Criteria) this;
        }

        public Criteria andPdachenglvIsNull() {
            addCriterion("PDACHENGLV is null");
            return (Criteria) this;
        }

        public Criteria andPdachenglvIsNotNull() {
            addCriterion("PDACHENGLV is not null");
            return (Criteria) this;
        }

        public Criteria andPdachenglvEqualTo(String value) {
            addCriterion("PDACHENGLV =", value, "pdachenglv");
            return (Criteria) this;
        }

        public Criteria andPdachenglvNotEqualTo(String value) {
            addCriterion("PDACHENGLV <>", value, "pdachenglv");
            return (Criteria) this;
        }

        public Criteria andPdachenglvGreaterThan(String value) {
            addCriterion("PDACHENGLV >", value, "pdachenglv");
            return (Criteria) this;
        }

        public Criteria andPdachenglvGreaterThanOrEqualTo(String value) {
            addCriterion("PDACHENGLV >=", value, "pdachenglv");
            return (Criteria) this;
        }

        public Criteria andPdachenglvLessThan(String value) {
            addCriterion("PDACHENGLV <", value, "pdachenglv");
            return (Criteria) this;
        }

        public Criteria andPdachenglvLessThanOrEqualTo(String value) {
            addCriterion("PDACHENGLV <=", value, "pdachenglv");
            return (Criteria) this;
        }

        public Criteria andPdachenglvLike(String value) {
            addCriterion("PDACHENGLV like", value, "pdachenglv");
            return (Criteria) this;
        }

        public Criteria andPdachenglvNotLike(String value) {
            addCriterion("PDACHENGLV not like", value, "pdachenglv");
            return (Criteria) this;
        }

        public Criteria andPdachenglvIn(List<String> values) {
            addCriterion("PDACHENGLV in", values, "pdachenglv");
            return (Criteria) this;
        }

        public Criteria andPdachenglvNotIn(List<String> values) {
            addCriterion("PDACHENGLV not in", values, "pdachenglv");
            return (Criteria) this;
        }

        public Criteria andPdachenglvBetween(String value1, String value2) {
            addCriterion("PDACHENGLV between", value1, value2, "pdachenglv");
            return (Criteria) this;
        }

        public Criteria andPdachenglvNotBetween(String value1, String value2) {
            addCriterion("PDACHENGLV not between", value1, value2, "pdachenglv");
            return (Criteria) this;
        }

        public Criteria andPmiaoshuIsNull() {
            addCriterion("PMIAOSHU is null");
            return (Criteria) this;
        }

        public Criteria andPmiaoshuIsNotNull() {
            addCriterion("PMIAOSHU is not null");
            return (Criteria) this;
        }

        public Criteria andPmiaoshuEqualTo(String value) {
            addCriterion("PMIAOSHU =", value, "pmiaoshu");
            return (Criteria) this;
        }

        public Criteria andPmiaoshuNotEqualTo(String value) {
            addCriterion("PMIAOSHU <>", value, "pmiaoshu");
            return (Criteria) this;
        }

        public Criteria andPmiaoshuGreaterThan(String value) {
            addCriterion("PMIAOSHU >", value, "pmiaoshu");
            return (Criteria) this;
        }

        public Criteria andPmiaoshuGreaterThanOrEqualTo(String value) {
            addCriterion("PMIAOSHU >=", value, "pmiaoshu");
            return (Criteria) this;
        }

        public Criteria andPmiaoshuLessThan(String value) {
            addCriterion("PMIAOSHU <", value, "pmiaoshu");
            return (Criteria) this;
        }

        public Criteria andPmiaoshuLessThanOrEqualTo(String value) {
            addCriterion("PMIAOSHU <=", value, "pmiaoshu");
            return (Criteria) this;
        }

        public Criteria andPmiaoshuLike(String value) {
            addCriterion("PMIAOSHU like", value, "pmiaoshu");
            return (Criteria) this;
        }

        public Criteria andPmiaoshuNotLike(String value) {
            addCriterion("PMIAOSHU not like", value, "pmiaoshu");
            return (Criteria) this;
        }

        public Criteria andPmiaoshuIn(List<String> values) {
            addCriterion("PMIAOSHU in", values, "pmiaoshu");
            return (Criteria) this;
        }

        public Criteria andPmiaoshuNotIn(List<String> values) {
            addCriterion("PMIAOSHU not in", values, "pmiaoshu");
            return (Criteria) this;
        }

        public Criteria andPmiaoshuBetween(String value1, String value2) {
            addCriterion("PMIAOSHU between", value1, value2, "pmiaoshu");
            return (Criteria) this;
        }

        public Criteria andPmiaoshuNotBetween(String value1, String value2) {
            addCriterion("PMIAOSHU not between", value1, value2, "pmiaoshu");
            return (Criteria) this;
        }

        public Criteria andPtoutuIsNull() {
            addCriterion("PTOUTU is null");
            return (Criteria) this;
        }

        public Criteria andPtoutuIsNotNull() {
            addCriterion("PTOUTU is not null");
            return (Criteria) this;
        }

        public Criteria andPtoutuEqualTo(String value) {
            addCriterion("PTOUTU =", value, "ptoutu");
            return (Criteria) this;
        }

        public Criteria andPtoutuNotEqualTo(String value) {
            addCriterion("PTOUTU <>", value, "ptoutu");
            return (Criteria) this;
        }

        public Criteria andPtoutuGreaterThan(String value) {
            addCriterion("PTOUTU >", value, "ptoutu");
            return (Criteria) this;
        }

        public Criteria andPtoutuGreaterThanOrEqualTo(String value) {
            addCriterion("PTOUTU >=", value, "ptoutu");
            return (Criteria) this;
        }

        public Criteria andPtoutuLessThan(String value) {
            addCriterion("PTOUTU <", value, "ptoutu");
            return (Criteria) this;
        }

        public Criteria andPtoutuLessThanOrEqualTo(String value) {
            addCriterion("PTOUTU <=", value, "ptoutu");
            return (Criteria) this;
        }

        public Criteria andPtoutuLike(String value) {
            addCriterion("PTOUTU like", value, "ptoutu");
            return (Criteria) this;
        }

        public Criteria andPtoutuNotLike(String value) {
            addCriterion("PTOUTU not like", value, "ptoutu");
            return (Criteria) this;
        }

        public Criteria andPtoutuIn(List<String> values) {
            addCriterion("PTOUTU in", values, "ptoutu");
            return (Criteria) this;
        }

        public Criteria andPtoutuNotIn(List<String> values) {
            addCriterion("PTOUTU not in", values, "ptoutu");
            return (Criteria) this;
        }

        public Criteria andPtoutuBetween(String value1, String value2) {
            addCriterion("PTOUTU between", value1, value2, "ptoutu");
            return (Criteria) this;
        }

        public Criteria andPtoutuNotBetween(String value1, String value2) {
            addCriterion("PTOUTU not between", value1, value2, "ptoutu");
            return (Criteria) this;
        }

        public Criteria andPxiangtuIsNull() {
            addCriterion("PXIANGTU is null");
            return (Criteria) this;
        }

        public Criteria andPxiangtuIsNotNull() {
            addCriterion("PXIANGTU is not null");
            return (Criteria) this;
        }

        public Criteria andPxiangtuEqualTo(String value) {
            addCriterion("PXIANGTU =", value, "pxiangtu");
            return (Criteria) this;
        }

        public Criteria andPxiangtuNotEqualTo(String value) {
            addCriterion("PXIANGTU <>", value, "pxiangtu");
            return (Criteria) this;
        }

        public Criteria andPxiangtuGreaterThan(String value) {
            addCriterion("PXIANGTU >", value, "pxiangtu");
            return (Criteria) this;
        }

        public Criteria andPxiangtuGreaterThanOrEqualTo(String value) {
            addCriterion("PXIANGTU >=", value, "pxiangtu");
            return (Criteria) this;
        }

        public Criteria andPxiangtuLessThan(String value) {
            addCriterion("PXIANGTU <", value, "pxiangtu");
            return (Criteria) this;
        }

        public Criteria andPxiangtuLessThanOrEqualTo(String value) {
            addCriterion("PXIANGTU <=", value, "pxiangtu");
            return (Criteria) this;
        }

        public Criteria andPxiangtuLike(String value) {
            addCriterion("PXIANGTU like", value, "pxiangtu");
            return (Criteria) this;
        }

        public Criteria andPxiangtuNotLike(String value) {
            addCriterion("PXIANGTU not like", value, "pxiangtu");
            return (Criteria) this;
        }

        public Criteria andPxiangtuIn(List<String> values) {
            addCriterion("PXIANGTU in", values, "pxiangtu");
            return (Criteria) this;
        }

        public Criteria andPxiangtuNotIn(List<String> values) {
            addCriterion("PXIANGTU not in", values, "pxiangtu");
            return (Criteria) this;
        }

        public Criteria andPxiangtuBetween(String value1, String value2) {
            addCriterion("PXIANGTU between", value1, value2, "pxiangtu");
            return (Criteria) this;
        }

        public Criteria andPxiangtuNotBetween(String value1, String value2) {
            addCriterion("PXIANGTU not between", value1, value2, "pxiangtu");
            return (Criteria) this;
        }

        public Criteria andPjieshaoIsNull() {
            addCriterion("PJIESHAO is null");
            return (Criteria) this;
        }

        public Criteria andPjieshaoIsNotNull() {
            addCriterion("PJIESHAO is not null");
            return (Criteria) this;
        }

        public Criteria andPjieshaoEqualTo(String value) {
            addCriterion("PJIESHAO =", value, "pjieshao");
            return (Criteria) this;
        }

        public Criteria andPjieshaoNotEqualTo(String value) {
            addCriterion("PJIESHAO <>", value, "pjieshao");
            return (Criteria) this;
        }

        public Criteria andPjieshaoGreaterThan(String value) {
            addCriterion("PJIESHAO >", value, "pjieshao");
            return (Criteria) this;
        }

        public Criteria andPjieshaoGreaterThanOrEqualTo(String value) {
            addCriterion("PJIESHAO >=", value, "pjieshao");
            return (Criteria) this;
        }

        public Criteria andPjieshaoLessThan(String value) {
            addCriterion("PJIESHAO <", value, "pjieshao");
            return (Criteria) this;
        }

        public Criteria andPjieshaoLessThanOrEqualTo(String value) {
            addCriterion("PJIESHAO <=", value, "pjieshao");
            return (Criteria) this;
        }

        public Criteria andPjieshaoLike(String value) {
            addCriterion("PJIESHAO like", value, "pjieshao");
            return (Criteria) this;
        }

        public Criteria andPjieshaoNotLike(String value) {
            addCriterion("PJIESHAO not like", value, "pjieshao");
            return (Criteria) this;
        }

        public Criteria andPjieshaoIn(List<String> values) {
            addCriterion("PJIESHAO in", values, "pjieshao");
            return (Criteria) this;
        }

        public Criteria andPjieshaoNotIn(List<String> values) {
            addCriterion("PJIESHAO not in", values, "pjieshao");
            return (Criteria) this;
        }

        public Criteria andPjieshaoBetween(String value1, String value2) {
            addCriterion("PJIESHAO between", value1, value2, "pjieshao");
            return (Criteria) this;
        }

        public Criteria andPjieshaoNotBetween(String value1, String value2) {
            addCriterion("PJIESHAO not between", value1, value2, "pjieshao");
            return (Criteria) this;
        }

        public Criteria andPxiangxijieshaoIsNull() {
            addCriterion("PXIANGXIJIESHAO is null");
            return (Criteria) this;
        }

        public Criteria andPxiangxijieshaoIsNotNull() {
            addCriterion("PXIANGXIJIESHAO is not null");
            return (Criteria) this;
        }

        public Criteria andPxiangxijieshaoEqualTo(String value) {
            addCriterion("PXIANGXIJIESHAO =", value, "pxiangxijieshao");
            return (Criteria) this;
        }

        public Criteria andPxiangxijieshaoNotEqualTo(String value) {
            addCriterion("PXIANGXIJIESHAO <>", value, "pxiangxijieshao");
            return (Criteria) this;
        }

        public Criteria andPxiangxijieshaoGreaterThan(String value) {
            addCriterion("PXIANGXIJIESHAO >", value, "pxiangxijieshao");
            return (Criteria) this;
        }

        public Criteria andPxiangxijieshaoGreaterThanOrEqualTo(String value) {
            addCriterion("PXIANGXIJIESHAO >=", value, "pxiangxijieshao");
            return (Criteria) this;
        }

        public Criteria andPxiangxijieshaoLessThan(String value) {
            addCriterion("PXIANGXIJIESHAO <", value, "pxiangxijieshao");
            return (Criteria) this;
        }

        public Criteria andPxiangxijieshaoLessThanOrEqualTo(String value) {
            addCriterion("PXIANGXIJIESHAO <=", value, "pxiangxijieshao");
            return (Criteria) this;
        }

        public Criteria andPxiangxijieshaoLike(String value) {
            addCriterion("PXIANGXIJIESHAO like", value, "pxiangxijieshao");
            return (Criteria) this;
        }

        public Criteria andPxiangxijieshaoNotLike(String value) {
            addCriterion("PXIANGXIJIESHAO not like", value, "pxiangxijieshao");
            return (Criteria) this;
        }

        public Criteria andPxiangxijieshaoIn(List<String> values) {
            addCriterion("PXIANGXIJIESHAO in", values, "pxiangxijieshao");
            return (Criteria) this;
        }

        public Criteria andPxiangxijieshaoNotIn(List<String> values) {
            addCriterion("PXIANGXIJIESHAO not in", values, "pxiangxijieshao");
            return (Criteria) this;
        }

        public Criteria andPxiangxijieshaoBetween(String value1, String value2) {
            addCriterion("PXIANGXIJIESHAO between", value1, value2, "pxiangxijieshao");
            return (Criteria) this;
        }

        public Criteria andPxiangxijieshaoNotBetween(String value1, String value2) {
            addCriterion("PXIANGXIJIESHAO not between", value1, value2, "pxiangxijieshao");
            return (Criteria) this;
        }

        public Criteria andPphoneIsNull() {
            addCriterion("PPHONE is null");
            return (Criteria) this;
        }

        public Criteria andPphoneIsNotNull() {
            addCriterion("PPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPphoneEqualTo(String value) {
            addCriterion("PPHONE =", value, "pphone");
            return (Criteria) this;
        }

        public Criteria andPphoneNotEqualTo(String value) {
            addCriterion("PPHONE <>", value, "pphone");
            return (Criteria) this;
        }

        public Criteria andPphoneGreaterThan(String value) {
            addCriterion("PPHONE >", value, "pphone");
            return (Criteria) this;
        }

        public Criteria andPphoneGreaterThanOrEqualTo(String value) {
            addCriterion("PPHONE >=", value, "pphone");
            return (Criteria) this;
        }

        public Criteria andPphoneLessThan(String value) {
            addCriterion("PPHONE <", value, "pphone");
            return (Criteria) this;
        }

        public Criteria andPphoneLessThanOrEqualTo(String value) {
            addCriterion("PPHONE <=", value, "pphone");
            return (Criteria) this;
        }

        public Criteria andPphoneLike(String value) {
            addCriterion("PPHONE like", value, "pphone");
            return (Criteria) this;
        }

        public Criteria andPphoneNotLike(String value) {
            addCriterion("PPHONE not like", value, "pphone");
            return (Criteria) this;
        }

        public Criteria andPphoneIn(List<String> values) {
            addCriterion("PPHONE in", values, "pphone");
            return (Criteria) this;
        }

        public Criteria andPphoneNotIn(List<String> values) {
            addCriterion("PPHONE not in", values, "pphone");
            return (Criteria) this;
        }

        public Criteria andPphoneBetween(String value1, String value2) {
            addCriterion("PPHONE between", value1, value2, "pphone");
            return (Criteria) this;
        }

        public Criteria andPphoneNotBetween(String value1, String value2) {
            addCriterion("PPHONE not between", value1, value2, "pphone");
            return (Criteria) this;
        }

        public Criteria andPdianhuaIsNull() {
            addCriterion("PDIANHUA is null");
            return (Criteria) this;
        }

        public Criteria andPdianhuaIsNotNull() {
            addCriterion("PDIANHUA is not null");
            return (Criteria) this;
        }

        public Criteria andPdianhuaEqualTo(String value) {
            addCriterion("PDIANHUA =", value, "pdianhua");
            return (Criteria) this;
        }

        public Criteria andPdianhuaNotEqualTo(String value) {
            addCriterion("PDIANHUA <>", value, "pdianhua");
            return (Criteria) this;
        }

        public Criteria andPdianhuaGreaterThan(String value) {
            addCriterion("PDIANHUA >", value, "pdianhua");
            return (Criteria) this;
        }

        public Criteria andPdianhuaGreaterThanOrEqualTo(String value) {
            addCriterion("PDIANHUA >=", value, "pdianhua");
            return (Criteria) this;
        }

        public Criteria andPdianhuaLessThan(String value) {
            addCriterion("PDIANHUA <", value, "pdianhua");
            return (Criteria) this;
        }

        public Criteria andPdianhuaLessThanOrEqualTo(String value) {
            addCriterion("PDIANHUA <=", value, "pdianhua");
            return (Criteria) this;
        }

        public Criteria andPdianhuaLike(String value) {
            addCriterion("PDIANHUA like", value, "pdianhua");
            return (Criteria) this;
        }

        public Criteria andPdianhuaNotLike(String value) {
            addCriterion("PDIANHUA not like", value, "pdianhua");
            return (Criteria) this;
        }

        public Criteria andPdianhuaIn(List<String> values) {
            addCriterion("PDIANHUA in", values, "pdianhua");
            return (Criteria) this;
        }

        public Criteria andPdianhuaNotIn(List<String> values) {
            addCriterion("PDIANHUA not in", values, "pdianhua");
            return (Criteria) this;
        }

        public Criteria andPdianhuaBetween(String value1, String value2) {
            addCriterion("PDIANHUA between", value1, value2, "pdianhua");
            return (Criteria) this;
        }

        public Criteria andPdianhuaNotBetween(String value1, String value2) {
            addCriterion("PDIANHUA not between", value1, value2, "pdianhua");
            return (Criteria) this;
        }

        public Criteria andPzhanghaoIsNull() {
            addCriterion("PZHANGHAO is null");
            return (Criteria) this;
        }

        public Criteria andPzhanghaoIsNotNull() {
            addCriterion("PZHANGHAO is not null");
            return (Criteria) this;
        }

        public Criteria andPzhanghaoEqualTo(String value) {
            addCriterion("PZHANGHAO =", value, "pzhanghao");
            return (Criteria) this;
        }

        public Criteria andPzhanghaoNotEqualTo(String value) {
            addCriterion("PZHANGHAO <>", value, "pzhanghao");
            return (Criteria) this;
        }

        public Criteria andPzhanghaoGreaterThan(String value) {
            addCriterion("PZHANGHAO >", value, "pzhanghao");
            return (Criteria) this;
        }

        public Criteria andPzhanghaoGreaterThanOrEqualTo(String value) {
            addCriterion("PZHANGHAO >=", value, "pzhanghao");
            return (Criteria) this;
        }

        public Criteria andPzhanghaoLessThan(String value) {
            addCriterion("PZHANGHAO <", value, "pzhanghao");
            return (Criteria) this;
        }

        public Criteria andPzhanghaoLessThanOrEqualTo(String value) {
            addCriterion("PZHANGHAO <=", value, "pzhanghao");
            return (Criteria) this;
        }

        public Criteria andPzhanghaoLike(String value) {
            addCriterion("PZHANGHAO like", value, "pzhanghao");
            return (Criteria) this;
        }

        public Criteria andPzhanghaoNotLike(String value) {
            addCriterion("PZHANGHAO not like", value, "pzhanghao");
            return (Criteria) this;
        }

        public Criteria andPzhanghaoIn(List<String> values) {
            addCriterion("PZHANGHAO in", values, "pzhanghao");
            return (Criteria) this;
        }

        public Criteria andPzhanghaoNotIn(List<String> values) {
            addCriterion("PZHANGHAO not in", values, "pzhanghao");
            return (Criteria) this;
        }

        public Criteria andPzhanghaoBetween(String value1, String value2) {
            addCriterion("PZHANGHAO between", value1, value2, "pzhanghao");
            return (Criteria) this;
        }

        public Criteria andPzhanghaoNotBetween(String value1, String value2) {
            addCriterion("PZHANGHAO not between", value1, value2, "pzhanghao");
            return (Criteria) this;
        }

        public Criteria andPshenfenzhengIsNull() {
            addCriterion("PSHENFENZHENG is null");
            return (Criteria) this;
        }

        public Criteria andPshenfenzhengIsNotNull() {
            addCriterion("PSHENFENZHENG is not null");
            return (Criteria) this;
        }

        public Criteria andPshenfenzhengEqualTo(String value) {
            addCriterion("PSHENFENZHENG =", value, "pshenfenzheng");
            return (Criteria) this;
        }

        public Criteria andPshenfenzhengNotEqualTo(String value) {
            addCriterion("PSHENFENZHENG <>", value, "pshenfenzheng");
            return (Criteria) this;
        }

        public Criteria andPshenfenzhengGreaterThan(String value) {
            addCriterion("PSHENFENZHENG >", value, "pshenfenzheng");
            return (Criteria) this;
        }

        public Criteria andPshenfenzhengGreaterThanOrEqualTo(String value) {
            addCriterion("PSHENFENZHENG >=", value, "pshenfenzheng");
            return (Criteria) this;
        }

        public Criteria andPshenfenzhengLessThan(String value) {
            addCriterion("PSHENFENZHENG <", value, "pshenfenzheng");
            return (Criteria) this;
        }

        public Criteria andPshenfenzhengLessThanOrEqualTo(String value) {
            addCriterion("PSHENFENZHENG <=", value, "pshenfenzheng");
            return (Criteria) this;
        }

        public Criteria andPshenfenzhengLike(String value) {
            addCriterion("PSHENFENZHENG like", value, "pshenfenzheng");
            return (Criteria) this;
        }

        public Criteria andPshenfenzhengNotLike(String value) {
            addCriterion("PSHENFENZHENG not like", value, "pshenfenzheng");
            return (Criteria) this;
        }

        public Criteria andPshenfenzhengIn(List<String> values) {
            addCriterion("PSHENFENZHENG in", values, "pshenfenzheng");
            return (Criteria) this;
        }

        public Criteria andPshenfenzhengNotIn(List<String> values) {
            addCriterion("PSHENFENZHENG not in", values, "pshenfenzheng");
            return (Criteria) this;
        }

        public Criteria andPshenfenzhengBetween(String value1, String value2) {
            addCriterion("PSHENFENZHENG between", value1, value2, "pshenfenzheng");
            return (Criteria) this;
        }

        public Criteria andPshenfenzhengNotBetween(String value1, String value2) {
            addCriterion("PSHENFENZHENG not between", value1, value2, "pshenfenzheng");
            return (Criteria) this;
        }

        public Criteria andPhone1IsNull() {
            addCriterion("PHONE1 is null");
            return (Criteria) this;
        }

        public Criteria andPhone1IsNotNull() {
            addCriterion("PHONE1 is not null");
            return (Criteria) this;
        }

        public Criteria andPhone1EqualTo(String value) {
            addCriterion("PHONE1 =", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1NotEqualTo(String value) {
            addCriterion("PHONE1 <>", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1GreaterThan(String value) {
            addCriterion("PHONE1 >", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1GreaterThanOrEqualTo(String value) {
            addCriterion("PHONE1 >=", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1LessThan(String value) {
            addCriterion("PHONE1 <", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1LessThanOrEqualTo(String value) {
            addCriterion("PHONE1 <=", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1Like(String value) {
            addCriterion("PHONE1 like", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1NotLike(String value) {
            addCriterion("PHONE1 not like", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1In(List<String> values) {
            addCriterion("PHONE1 in", values, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1NotIn(List<String> values) {
            addCriterion("PHONE1 not in", values, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1Between(String value1, String value2) {
            addCriterion("PHONE1 between", value1, value2, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1NotBetween(String value1, String value2) {
            addCriterion("PHONE1 not between", value1, value2, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone2IsNull() {
            addCriterion("PHONE2 is null");
            return (Criteria) this;
        }

        public Criteria andPhone2IsNotNull() {
            addCriterion("PHONE2 is not null");
            return (Criteria) this;
        }

        public Criteria andPhone2EqualTo(String value) {
            addCriterion("PHONE2 =", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotEqualTo(String value) {
            addCriterion("PHONE2 <>", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2GreaterThan(String value) {
            addCriterion("PHONE2 >", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2GreaterThanOrEqualTo(String value) {
            addCriterion("PHONE2 >=", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2LessThan(String value) {
            addCriterion("PHONE2 <", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2LessThanOrEqualTo(String value) {
            addCriterion("PHONE2 <=", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2Like(String value) {
            addCriterion("PHONE2 like", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotLike(String value) {
            addCriterion("PHONE2 not like", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2In(List<String> values) {
            addCriterion("PHONE2 in", values, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotIn(List<String> values) {
            addCriterion("PHONE2 not in", values, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2Between(String value1, String value2) {
            addCriterion("PHONE2 between", value1, value2, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotBetween(String value1, String value2) {
            addCriterion("PHONE2 not between", value1, value2, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone3IsNull() {
            addCriterion("PHONE3 is null");
            return (Criteria) this;
        }

        public Criteria andPhone3IsNotNull() {
            addCriterion("PHONE3 is not null");
            return (Criteria) this;
        }

        public Criteria andPhone3EqualTo(String value) {
            addCriterion("PHONE3 =", value, "phone3");
            return (Criteria) this;
        }

        public Criteria andPhone3NotEqualTo(String value) {
            addCriterion("PHONE3 <>", value, "phone3");
            return (Criteria) this;
        }

        public Criteria andPhone3GreaterThan(String value) {
            addCriterion("PHONE3 >", value, "phone3");
            return (Criteria) this;
        }

        public Criteria andPhone3GreaterThanOrEqualTo(String value) {
            addCriterion("PHONE3 >=", value, "phone3");
            return (Criteria) this;
        }

        public Criteria andPhone3LessThan(String value) {
            addCriterion("PHONE3 <", value, "phone3");
            return (Criteria) this;
        }

        public Criteria andPhone3LessThanOrEqualTo(String value) {
            addCriterion("PHONE3 <=", value, "phone3");
            return (Criteria) this;
        }

        public Criteria andPhone3Like(String value) {
            addCriterion("PHONE3 like", value, "phone3");
            return (Criteria) this;
        }

        public Criteria andPhone3NotLike(String value) {
            addCriterion("PHONE3 not like", value, "phone3");
            return (Criteria) this;
        }

        public Criteria andPhone3In(List<String> values) {
            addCriterion("PHONE3 in", values, "phone3");
            return (Criteria) this;
        }

        public Criteria andPhone3NotIn(List<String> values) {
            addCriterion("PHONE3 not in", values, "phone3");
            return (Criteria) this;
        }

        public Criteria andPhone3Between(String value1, String value2) {
            addCriterion("PHONE3 between", value1, value2, "phone3");
            return (Criteria) this;
        }

        public Criteria andPhone3NotBetween(String value1, String value2) {
            addCriterion("PHONE3 not between", value1, value2, "phone3");
            return (Criteria) this;
        }

        public Criteria andPfenleiIsNull() {
            addCriterion("PFENLEI is null");
            return (Criteria) this;
        }

        public Criteria andPfenleiIsNotNull() {
            addCriterion("PFENLEI is not null");
            return (Criteria) this;
        }

        public Criteria andPfenleiEqualTo(String value) {
            addCriterion("PFENLEI =", value, "pfenlei");
            return (Criteria) this;
        }

        public Criteria andPfenleiNotEqualTo(String value) {
            addCriterion("PFENLEI <>", value, "pfenlei");
            return (Criteria) this;
        }

        public Criteria andPfenleiGreaterThan(String value) {
            addCriterion("PFENLEI >", value, "pfenlei");
            return (Criteria) this;
        }

        public Criteria andPfenleiGreaterThanOrEqualTo(String value) {
            addCriterion("PFENLEI >=", value, "pfenlei");
            return (Criteria) this;
        }

        public Criteria andPfenleiLessThan(String value) {
            addCriterion("PFENLEI <", value, "pfenlei");
            return (Criteria) this;
        }

        public Criteria andPfenleiLessThanOrEqualTo(String value) {
            addCriterion("PFENLEI <=", value, "pfenlei");
            return (Criteria) this;
        }

        public Criteria andPfenleiLike(String value) {
            addCriterion("PFENLEI like", value, "pfenlei");
            return (Criteria) this;
        }

        public Criteria andPfenleiNotLike(String value) {
            addCriterion("PFENLEI not like", value, "pfenlei");
            return (Criteria) this;
        }

        public Criteria andPfenleiIn(List<String> values) {
            addCriterion("PFENLEI in", values, "pfenlei");
            return (Criteria) this;
        }

        public Criteria andPfenleiNotIn(List<String> values) {
            addCriterion("PFENLEI not in", values, "pfenlei");
            return (Criteria) this;
        }

        public Criteria andPfenleiBetween(String value1, String value2) {
            addCriterion("PFENLEI between", value1, value2, "pfenlei");
            return (Criteria) this;
        }

        public Criteria andPfenleiNotBetween(String value1, String value2) {
            addCriterion("PFENLEI not between", value1, value2, "pfenlei");
            return (Criteria) this;
        }

        public Criteria andUuidIsNull() {
            addCriterion("UUID is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("UUID is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(BigDecimal value) {
            addCriterion("UUID =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(BigDecimal value) {
            addCriterion("UUID <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(BigDecimal value) {
            addCriterion("UUID >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UUID >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(BigDecimal value) {
            addCriterion("UUID <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UUID <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<BigDecimal> values) {
            addCriterion("UUID in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<BigDecimal> values) {
            addCriterion("UUID not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UUID between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UUID not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andPchouIsNull() {
            addCriterion("PCHOU is null");
            return (Criteria) this;
        }

        public Criteria andPchouIsNotNull() {
            addCriterion("PCHOU is not null");
            return (Criteria) this;
        }

        public Criteria andPchouEqualTo(BigDecimal value) {
            addCriterion("PCHOU =", value, "pchou");
            return (Criteria) this;
        }

        public Criteria andPchouNotEqualTo(BigDecimal value) {
            addCriterion("PCHOU <>", value, "pchou");
            return (Criteria) this;
        }

        public Criteria andPchouGreaterThan(BigDecimal value) {
            addCriterion("PCHOU >", value, "pchou");
            return (Criteria) this;
        }

        public Criteria andPchouGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PCHOU >=", value, "pchou");
            return (Criteria) this;
        }

        public Criteria andPchouLessThan(BigDecimal value) {
            addCriterion("PCHOU <", value, "pchou");
            return (Criteria) this;
        }

        public Criteria andPchouLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PCHOU <=", value, "pchou");
            return (Criteria) this;
        }

        public Criteria andPchouIn(List<BigDecimal> values) {
            addCriterion("PCHOU in", values, "pchou");
            return (Criteria) this;
        }

        public Criteria andPchouNotIn(List<BigDecimal> values) {
            addCriterion("PCHOU not in", values, "pchou");
            return (Criteria) this;
        }

        public Criteria andPchouBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PCHOU between", value1, value2, "pchou");
            return (Criteria) this;
        }

        public Criteria andPchouNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PCHOU not between", value1, value2, "pchou");
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