package com.ezyy.tms.map.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MapAwayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MapAwayExample() {
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

        public Criteria andWayidIsNull() {
            addCriterion("wayid is null");
            return (Criteria) this;
        }

        public Criteria andWayidIsNotNull() {
            addCriterion("wayid is not null");
            return (Criteria) this;
        }

        public Criteria andWayidEqualTo(Integer value) {
            addCriterion("wayid =", value, "wayid");
            return (Criteria) this;
        }

        public Criteria andWayidNotEqualTo(Integer value) {
            addCriterion("wayid <>", value, "wayid");
            return (Criteria) this;
        }

        public Criteria andWayidGreaterThan(Integer value) {
            addCriterion("wayid >", value, "wayid");
            return (Criteria) this;
        }

        public Criteria andWayidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wayid >=", value, "wayid");
            return (Criteria) this;
        }

        public Criteria andWayidLessThan(Integer value) {
            addCriterion("wayid <", value, "wayid");
            return (Criteria) this;
        }

        public Criteria andWayidLessThanOrEqualTo(Integer value) {
            addCriterion("wayid <=", value, "wayid");
            return (Criteria) this;
        }

        public Criteria andWayidIn(List<Integer> values) {
            addCriterion("wayid in", values, "wayid");
            return (Criteria) this;
        }

        public Criteria andWayidNotIn(List<Integer> values) {
            addCriterion("wayid not in", values, "wayid");
            return (Criteria) this;
        }

        public Criteria andWayidBetween(Integer value1, Integer value2) {
            addCriterion("wayid between", value1, value2, "wayid");
            return (Criteria) this;
        }

        public Criteria andWayidNotBetween(Integer value1, Integer value2) {
            addCriterion("wayid not between", value1, value2, "wayid");
            return (Criteria) this;
        }

        public Criteria andOriginIsNull() {
            addCriterion("origin is null");
            return (Criteria) this;
        }

        public Criteria andOriginIsNotNull() {
            addCriterion("origin is not null");
            return (Criteria) this;
        }

        public Criteria andOriginEqualTo(String value) {
            addCriterion("origin =", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotEqualTo(String value) {
            addCriterion("origin <>", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThan(String value) {
            addCriterion("origin >", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThanOrEqualTo(String value) {
            addCriterion("origin >=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThan(String value) {
            addCriterion("origin <", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThanOrEqualTo(String value) {
            addCriterion("origin <=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLike(String value) {
            addCriterion("origin like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotLike(String value) {
            addCriterion("origin not like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginIn(List<String> values) {
            addCriterion("origin in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotIn(List<String> values) {
            addCriterion("origin not in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginBetween(String value1, String value2) {
            addCriterion("origin between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotBetween(String value1, String value2) {
            addCriterion("origin not between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNull() {
            addCriterion("destination is null");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNotNull() {
            addCriterion("destination is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationEqualTo(String value) {
            addCriterion("destination =", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotEqualTo(String value) {
            addCriterion("destination <>", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThan(String value) {
            addCriterion("destination >", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThanOrEqualTo(String value) {
            addCriterion("destination >=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThan(String value) {
            addCriterion("destination <", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThanOrEqualTo(String value) {
            addCriterion("destination <=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLike(String value) {
            addCriterion("destination like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotLike(String value) {
            addCriterion("destination not like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationIn(List<String> values) {
            addCriterion("destination in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotIn(List<String> values) {
            addCriterion("destination not in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationBetween(String value1, String value2) {
            addCriterion("destination between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotBetween(String value1, String value2) {
            addCriterion("destination not between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("duration is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("duration is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(Integer value) {
            addCriterion("duration =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(Integer value) {
            addCriterion("duration <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(Integer value) {
            addCriterion("duration >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("duration >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(Integer value) {
            addCriterion("duration <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(Integer value) {
            addCriterion("duration <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<Integer> values) {
            addCriterion("duration in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<Integer> values) {
            addCriterion("duration not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(Integer value1, Integer value2) {
            addCriterion("duration between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("duration not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDistanceIsNull() {
            addCriterion("distance is null");
            return (Criteria) this;
        }

        public Criteria andDistanceIsNotNull() {
            addCriterion("distance is not null");
            return (Criteria) this;
        }

        public Criteria andDistanceEqualTo(Integer value) {
            addCriterion("distance =", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotEqualTo(Integer value) {
            addCriterion("distance <>", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThan(Integer value) {
            addCriterion("distance >", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("distance >=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThan(Integer value) {
            addCriterion("distance <", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThanOrEqualTo(Integer value) {
            addCriterion("distance <=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceIn(List<Integer> values) {
            addCriterion("distance in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotIn(List<Integer> values) {
            addCriterion("distance not in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceBetween(Integer value1, Integer value2) {
            addCriterion("distance between", value1, value2, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotBetween(Integer value1, Integer value2) {
            addCriterion("distance not between", value1, value2, "distance");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("path like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("path not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("path not between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPolicyIsNull() {
            addCriterion("policy is null");
            return (Criteria) this;
        }

        public Criteria andPolicyIsNotNull() {
            addCriterion("policy is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyEqualTo(Integer value) {
            addCriterion("policy =", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyNotEqualTo(Integer value) {
            addCriterion("policy <>", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyGreaterThan(Integer value) {
            addCriterion("policy >", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyGreaterThanOrEqualTo(Integer value) {
            addCriterion("policy >=", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyLessThan(Integer value) {
            addCriterion("policy <", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyLessThanOrEqualTo(Integer value) {
            addCriterion("policy <=", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyIn(List<Integer> values) {
            addCriterion("policy in", values, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyNotIn(List<Integer> values) {
            addCriterion("policy not in", values, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyBetween(Integer value1, Integer value2) {
            addCriterion("policy between", value1, value2, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyNotBetween(Integer value1, Integer value2) {
            addCriterion("policy not between", value1, value2, "policy");
            return (Criteria) this;
        }

        public Criteria andCredateIsNull() {
            addCriterion("credate is null");
            return (Criteria) this;
        }

        public Criteria andCredateIsNotNull() {
            addCriterion("credate is not null");
            return (Criteria) this;
        }

        public Criteria andCredateEqualTo(Date value) {
            addCriterion("credate =", value, "credate");
            return (Criteria) this;
        }

        public Criteria andCredateNotEqualTo(Date value) {
            addCriterion("credate <>", value, "credate");
            return (Criteria) this;
        }

        public Criteria andCredateGreaterThan(Date value) {
            addCriterion("credate >", value, "credate");
            return (Criteria) this;
        }

        public Criteria andCredateGreaterThanOrEqualTo(Date value) {
            addCriterion("credate >=", value, "credate");
            return (Criteria) this;
        }

        public Criteria andCredateLessThan(Date value) {
            addCriterion("credate <", value, "credate");
            return (Criteria) this;
        }

        public Criteria andCredateLessThanOrEqualTo(Date value) {
            addCriterion("credate <=", value, "credate");
            return (Criteria) this;
        }

        public Criteria andCredateIn(List<Date> values) {
            addCriterion("credate in", values, "credate");
            return (Criteria) this;
        }

        public Criteria andCredateNotIn(List<Date> values) {
            addCriterion("credate not in", values, "credate");
            return (Criteria) this;
        }

        public Criteria andCredateBetween(Date value1, Date value2) {
            addCriterion("credate between", value1, value2, "credate");
            return (Criteria) this;
        }

        public Criteria andCredateNotBetween(Date value1, Date value2) {
            addCriterion("credate not between", value1, value2, "credate");
            return (Criteria) this;
        }

        public Criteria andStopflagIsNull() {
            addCriterion("stopflag is null");
            return (Criteria) this;
        }

        public Criteria andStopflagIsNotNull() {
            addCriterion("stopflag is not null");
            return (Criteria) this;
        }

        public Criteria andStopflagEqualTo(Integer value) {
            addCriterion("stopflag =", value, "stopflag");
            return (Criteria) this;
        }

        public Criteria andStopflagNotEqualTo(Integer value) {
            addCriterion("stopflag <>", value, "stopflag");
            return (Criteria) this;
        }

        public Criteria andStopflagGreaterThan(Integer value) {
            addCriterion("stopflag >", value, "stopflag");
            return (Criteria) this;
        }

        public Criteria andStopflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("stopflag >=", value, "stopflag");
            return (Criteria) this;
        }

        public Criteria andStopflagLessThan(Integer value) {
            addCriterion("stopflag <", value, "stopflag");
            return (Criteria) this;
        }

        public Criteria andStopflagLessThanOrEqualTo(Integer value) {
            addCriterion("stopflag <=", value, "stopflag");
            return (Criteria) this;
        }

        public Criteria andStopflagIn(List<Integer> values) {
            addCriterion("stopflag in", values, "stopflag");
            return (Criteria) this;
        }

        public Criteria andStopflagNotIn(List<Integer> values) {
            addCriterion("stopflag not in", values, "stopflag");
            return (Criteria) this;
        }

        public Criteria andStopflagBetween(Integer value1, Integer value2) {
            addCriterion("stopflag between", value1, value2, "stopflag");
            return (Criteria) this;
        }

        public Criteria andStopflagNotBetween(Integer value1, Integer value2) {
            addCriterion("stopflag not between", value1, value2, "stopflag");
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