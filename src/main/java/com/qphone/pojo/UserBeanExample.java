package com.qphone.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UserBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserBeanExample() {
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

        public Criteria andUnameIsNull() {
            addCriterion("UNAME is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("UNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("UNAME =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("UNAME <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("UNAME >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("UNAME >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("UNAME <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("UNAME <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("UNAME like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("UNAME not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("UNAME in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("UNAME not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("UNAME between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("UNAME not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUpassIsNull() {
            addCriterion("UPASS is null");
            return (Criteria) this;
        }

        public Criteria andUpassIsNotNull() {
            addCriterion("UPASS is not null");
            return (Criteria) this;
        }

        public Criteria andUpassEqualTo(String value) {
            addCriterion("UPASS =", value, "upass");
            return (Criteria) this;
        }

        public Criteria andUpassNotEqualTo(String value) {
            addCriterion("UPASS <>", value, "upass");
            return (Criteria) this;
        }

        public Criteria andUpassGreaterThan(String value) {
            addCriterion("UPASS >", value, "upass");
            return (Criteria) this;
        }

        public Criteria andUpassGreaterThanOrEqualTo(String value) {
            addCriterion("UPASS >=", value, "upass");
            return (Criteria) this;
        }

        public Criteria andUpassLessThan(String value) {
            addCriterion("UPASS <", value, "upass");
            return (Criteria) this;
        }

        public Criteria andUpassLessThanOrEqualTo(String value) {
            addCriterion("UPASS <=", value, "upass");
            return (Criteria) this;
        }

        public Criteria andUpassLike(String value) {
            addCriterion("UPASS like", value, "upass");
            return (Criteria) this;
        }

        public Criteria andUpassNotLike(String value) {
            addCriterion("UPASS not like", value, "upass");
            return (Criteria) this;
        }

        public Criteria andUpassIn(List<String> values) {
            addCriterion("UPASS in", values, "upass");
            return (Criteria) this;
        }

        public Criteria andUpassNotIn(List<String> values) {
            addCriterion("UPASS not in", values, "upass");
            return (Criteria) this;
        }

        public Criteria andUpassBetween(String value1, String value2) {
            addCriterion("UPASS between", value1, value2, "upass");
            return (Criteria) this;
        }

        public Criteria andUpassNotBetween(String value1, String value2) {
            addCriterion("UPASS not between", value1, value2, "upass");
            return (Criteria) this;
        }

        public Criteria andUrealnameIsNull() {
            addCriterion("UREALNAME is null");
            return (Criteria) this;
        }

        public Criteria andUrealnameIsNotNull() {
            addCriterion("UREALNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUrealnameEqualTo(String value) {
            addCriterion("UREALNAME =", value, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameNotEqualTo(String value) {
            addCriterion("UREALNAME <>", value, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameGreaterThan(String value) {
            addCriterion("UREALNAME >", value, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameGreaterThanOrEqualTo(String value) {
            addCriterion("UREALNAME >=", value, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameLessThan(String value) {
            addCriterion("UREALNAME <", value, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameLessThanOrEqualTo(String value) {
            addCriterion("UREALNAME <=", value, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameLike(String value) {
            addCriterion("UREALNAME like", value, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameNotLike(String value) {
            addCriterion("UREALNAME not like", value, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameIn(List<String> values) {
            addCriterion("UREALNAME in", values, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameNotIn(List<String> values) {
            addCriterion("UREALNAME not in", values, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameBetween(String value1, String value2) {
            addCriterion("UREALNAME between", value1, value2, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameNotBetween(String value1, String value2) {
            addCriterion("UREALNAME not between", value1, value2, "urealname");
            return (Criteria) this;
        }

        public Criteria andUyouxiangIsNull() {
            addCriterion("UYOUXIANG is null");
            return (Criteria) this;
        }

        public Criteria andUyouxiangIsNotNull() {
            addCriterion("UYOUXIANG is not null");
            return (Criteria) this;
        }

        public Criteria andUyouxiangEqualTo(String value) {
            addCriterion("UYOUXIANG =", value, "uyouxiang");
            return (Criteria) this;
        }

        public Criteria andUyouxiangNotEqualTo(String value) {
            addCriterion("UYOUXIANG <>", value, "uyouxiang");
            return (Criteria) this;
        }

        public Criteria andUyouxiangGreaterThan(String value) {
            addCriterion("UYOUXIANG >", value, "uyouxiang");
            return (Criteria) this;
        }

        public Criteria andUyouxiangGreaterThanOrEqualTo(String value) {
            addCriterion("UYOUXIANG >=", value, "uyouxiang");
            return (Criteria) this;
        }

        public Criteria andUyouxiangLessThan(String value) {
            addCriterion("UYOUXIANG <", value, "uyouxiang");
            return (Criteria) this;
        }

        public Criteria andUyouxiangLessThanOrEqualTo(String value) {
            addCriterion("UYOUXIANG <=", value, "uyouxiang");
            return (Criteria) this;
        }

        public Criteria andUyouxiangLike(String value) {
            addCriterion("UYOUXIANG like", value, "uyouxiang");
            return (Criteria) this;
        }

        public Criteria andUyouxiangNotLike(String value) {
            addCriterion("UYOUXIANG not like", value, "uyouxiang");
            return (Criteria) this;
        }

        public Criteria andUyouxiangIn(List<String> values) {
            addCriterion("UYOUXIANG in", values, "uyouxiang");
            return (Criteria) this;
        }

        public Criteria andUyouxiangNotIn(List<String> values) {
            addCriterion("UYOUXIANG not in", values, "uyouxiang");
            return (Criteria) this;
        }

        public Criteria andUyouxiangBetween(String value1, String value2) {
            addCriterion("UYOUXIANG between", value1, value2, "uyouxiang");
            return (Criteria) this;
        }

        public Criteria andUyouxiangNotBetween(String value1, String value2) {
            addCriterion("UYOUXIANG not between", value1, value2, "uyouxiang");
            return (Criteria) this;
        }

        public Criteria andUphoneIsNull() {
            addCriterion("UPHONE is null");
            return (Criteria) this;
        }

        public Criteria andUphoneIsNotNull() {
            addCriterion("UPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andUphoneEqualTo(String value) {
            addCriterion("UPHONE =", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotEqualTo(String value) {
            addCriterion("UPHONE <>", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneGreaterThan(String value) {
            addCriterion("UPHONE >", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneGreaterThanOrEqualTo(String value) {
            addCriterion("UPHONE >=", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLessThan(String value) {
            addCriterion("UPHONE <", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLessThanOrEqualTo(String value) {
            addCriterion("UPHONE <=", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLike(String value) {
            addCriterion("UPHONE like", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotLike(String value) {
            addCriterion("UPHONE not like", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneIn(List<String> values) {
            addCriterion("UPHONE in", values, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotIn(List<String> values) {
            addCriterion("UPHONE not in", values, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneBetween(String value1, String value2) {
            addCriterion("UPHONE between", value1, value2, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotBetween(String value1, String value2) {
            addCriterion("UPHONE not between", value1, value2, "uphone");
            return (Criteria) this;
        }

        public Criteria andUtypeIsNull() {
            addCriterion("UTYPE is null");
            return (Criteria) this;
        }

        public Criteria andUtypeIsNotNull() {
            addCriterion("UTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUtypeEqualTo(String value) {
            addCriterion("UTYPE =", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeNotEqualTo(String value) {
            addCriterion("UTYPE <>", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeGreaterThan(String value) {
            addCriterion("UTYPE >", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeGreaterThanOrEqualTo(String value) {
            addCriterion("UTYPE >=", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeLessThan(String value) {
            addCriterion("UTYPE <", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeLessThanOrEqualTo(String value) {
            addCriterion("UTYPE <=", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeLike(String value) {
            addCriterion("UTYPE like", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeNotLike(String value) {
            addCriterion("UTYPE not like", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeIn(List<String> values) {
            addCriterion("UTYPE in", values, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeNotIn(List<String> values) {
            addCriterion("UTYPE not in", values, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeBetween(String value1, String value2) {
            addCriterion("UTYPE between", value1, value2, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeNotBetween(String value1, String value2) {
            addCriterion("UTYPE not between", value1, value2, "utype");
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