/*
 * This file is generated by jOOQ.
 */
package com.savagelearning.machete.core.tables.daos;


import com.savagelearning.machete.core.tables.Schedulerules;
import com.savagelearning.machete.core.tables.records.SchedulerulesRecord;

import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SchedulerulesDao extends DAOImpl<SchedulerulesRecord, com.savagelearning.machete.core.tables.pojos.Schedulerules, Integer> {

    /**
     * Create a new SchedulerulesDao without any configuration
     */
    public SchedulerulesDao() {
        super(Schedulerules.SCHEDULERULES, com.savagelearning.machete.core.tables.pojos.Schedulerules.class);
    }

    /**
     * Create a new SchedulerulesDao with an attached configuration
     */
    public SchedulerulesDao(Configuration configuration) {
        super(Schedulerules.SCHEDULERULES, com.savagelearning.machete.core.tables.pojos.Schedulerules.class, configuration);
    }

    @Override
    public Integer getId(com.savagelearning.machete.core.tables.pojos.Schedulerules object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.savagelearning.machete.core.tables.pojos.Schedulerules> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Schedulerules.SCHEDULERULES.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.savagelearning.machete.core.tables.pojos.Schedulerules> fetchById(Integer... values) {
        return fetch(Schedulerules.SCHEDULERULES.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.savagelearning.machete.core.tables.pojos.Schedulerules fetchOneById(Integer value) {
        return fetchOne(Schedulerules.SCHEDULERULES.ID, value);
    }

    /**
     * Fetch records that have <code>day BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.savagelearning.machete.core.tables.pojos.Schedulerules> fetchRangeOfDay(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Schedulerules.SCHEDULERULES.DAY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>day IN (values)</code>
     */
    public List<com.savagelearning.machete.core.tables.pojos.Schedulerules> fetchByDay(Integer... values) {
        return fetch(Schedulerules.SCHEDULERULES.DAY, values);
    }

    /**
     * Fetch records that have <code>leadHours BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.savagelearning.machete.core.tables.pojos.Schedulerules> fetchRangeOfLeadhours(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Schedulerules.SCHEDULERULES.LEADHOURS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>leadHours IN (values)</code>
     */
    public List<com.savagelearning.machete.core.tables.pojos.Schedulerules> fetchByLeadhours(Integer... values) {
        return fetch(Schedulerules.SCHEDULERULES.LEADHOURS, values);
    }

    /**
     * Fetch records that have <code>minStartMin BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.savagelearning.machete.core.tables.pojos.Schedulerules> fetchRangeOfMinstartmin(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Schedulerules.SCHEDULERULES.MINSTARTMIN, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>minStartMin IN (values)</code>
     */
    public List<com.savagelearning.machete.core.tables.pojos.Schedulerules> fetchByMinstartmin(Integer... values) {
        return fetch(Schedulerules.SCHEDULERULES.MINSTARTMIN, values);
    }

    /**
     * Fetch records that have <code>maxEndMin BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.savagelearning.machete.core.tables.pojos.Schedulerules> fetchRangeOfMaxendmin(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Schedulerules.SCHEDULERULES.MAXENDMIN, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>maxEndMin IN (values)</code>
     */
    public List<com.savagelearning.machete.core.tables.pojos.Schedulerules> fetchByMaxendmin(Integer... values) {
        return fetch(Schedulerules.SCHEDULERULES.MAXENDMIN, values);
    }

    /**
     * Fetch records that have <code>datecreated BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.savagelearning.machete.core.tables.pojos.Schedulerules> fetchRangeOfDatecreated(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Schedulerules.SCHEDULERULES.DATECREATED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>datecreated IN (values)</code>
     */
    public List<com.savagelearning.machete.core.tables.pojos.Schedulerules> fetchByDatecreated(LocalDateTime... values) {
        return fetch(Schedulerules.SCHEDULERULES.DATECREATED, values);
    }

    /**
     * Fetch records that have <code>dateupdated BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.savagelearning.machete.core.tables.pojos.Schedulerules> fetchRangeOfDateupdated(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Schedulerules.SCHEDULERULES.DATEUPDATED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>dateupdated IN (values)</code>
     */
    public List<com.savagelearning.machete.core.tables.pojos.Schedulerules> fetchByDateupdated(LocalDateTime... values) {
        return fetch(Schedulerules.SCHEDULERULES.DATEUPDATED, values);
    }

    /**
     * Fetch records that have <code>Createdby BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.savagelearning.machete.core.tables.pojos.Schedulerules> fetchRangeOfCreatedby(String lowerInclusive, String upperInclusive) {
        return fetchRange(Schedulerules.SCHEDULERULES.CREATEDBY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>Createdby IN (values)</code>
     */
    public List<com.savagelearning.machete.core.tables.pojos.Schedulerules> fetchByCreatedby(String... values) {
        return fetch(Schedulerules.SCHEDULERULES.CREATEDBY, values);
    }

    /**
     * Fetch records that have <code>Updatedby BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.savagelearning.machete.core.tables.pojos.Schedulerules> fetchRangeOfUpdatedby(String lowerInclusive, String upperInclusive) {
        return fetchRange(Schedulerules.SCHEDULERULES.UPDATEDBY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>Updatedby IN (values)</code>
     */
    public List<com.savagelearning.machete.core.tables.pojos.Schedulerules> fetchByUpdatedby(String... values) {
        return fetch(Schedulerules.SCHEDULERULES.UPDATEDBY, values);
    }
}
