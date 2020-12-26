/*
 * This file is generated by jOOQ.
 */
package com.savagelearning.machete.core.tables.records;


import com.savagelearning.machete.core.tables.Transportcostrules;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TransportcostrulesRecord extends UpdatableRecordImpl<TransportcostrulesRecord> implements Record9<Integer, Integer, Integer, Integer, Double, LocalDateTime, LocalDateTime, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.TransportCostRules.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.TransportCostRules.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.TransportCostRules.transportRuleID</code>.
     */
    public void setTransportruleid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.TransportCostRules.transportRuleID</code>.
     */
    public Integer getTransportruleid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.TransportCostRules.minWorker</code>.
     */
    public void setMinworker(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.TransportCostRules.minWorker</code>.
     */
    public Integer getMinworker() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.TransportCostRules.maxWorker</code>.
     */
    public void setMaxworker(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.TransportCostRules.maxWorker</code>.
     */
    public Integer getMaxworker() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.TransportCostRules.cost</code>.
     */
    public void setCost(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.TransportCostRules.cost</code>.
     */
    public Double getCost() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>public.TransportCostRules.datecreated</code>.
     */
    public void setDatecreated(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.TransportCostRules.datecreated</code>.
     */
    public LocalDateTime getDatecreated() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>public.TransportCostRules.dateupdated</code>.
     */
    public void setDateupdated(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.TransportCostRules.dateupdated</code>.
     */
    public LocalDateTime getDateupdated() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>public.TransportCostRules.Createdby</code>.
     */
    public void setCreatedby(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.TransportCostRules.Createdby</code>.
     */
    public String getCreatedby() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.TransportCostRules.Updatedby</code>.
     */
    public void setUpdatedby(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.TransportCostRules.Updatedby</code>.
     */
    public String getUpdatedby() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, Integer, Integer, Integer, Double, LocalDateTime, LocalDateTime, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Integer, Integer, Integer, Integer, Double, LocalDateTime, LocalDateTime, String, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Transportcostrules.TRANSPORTCOSTRULES.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Transportcostrules.TRANSPORTCOSTRULES.TRANSPORTRULEID;
    }

    @Override
    public Field<Integer> field3() {
        return Transportcostrules.TRANSPORTCOSTRULES.MINWORKER;
    }

    @Override
    public Field<Integer> field4() {
        return Transportcostrules.TRANSPORTCOSTRULES.MAXWORKER;
    }

    @Override
    public Field<Double> field5() {
        return Transportcostrules.TRANSPORTCOSTRULES.COST;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return Transportcostrules.TRANSPORTCOSTRULES.DATECREATED;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return Transportcostrules.TRANSPORTCOSTRULES.DATEUPDATED;
    }

    @Override
    public Field<String> field8() {
        return Transportcostrules.TRANSPORTCOSTRULES.CREATEDBY;
    }

    @Override
    public Field<String> field9() {
        return Transportcostrules.TRANSPORTCOSTRULES.UPDATEDBY;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getTransportruleid();
    }

    @Override
    public Integer component3() {
        return getMinworker();
    }

    @Override
    public Integer component4() {
        return getMaxworker();
    }

    @Override
    public Double component5() {
        return getCost();
    }

    @Override
    public LocalDateTime component6() {
        return getDatecreated();
    }

    @Override
    public LocalDateTime component7() {
        return getDateupdated();
    }

    @Override
    public String component8() {
        return getCreatedby();
    }

    @Override
    public String component9() {
        return getUpdatedby();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getTransportruleid();
    }

    @Override
    public Integer value3() {
        return getMinworker();
    }

    @Override
    public Integer value4() {
        return getMaxworker();
    }

    @Override
    public Double value5() {
        return getCost();
    }

    @Override
    public LocalDateTime value6() {
        return getDatecreated();
    }

    @Override
    public LocalDateTime value7() {
        return getDateupdated();
    }

    @Override
    public String value8() {
        return getCreatedby();
    }

    @Override
    public String value9() {
        return getUpdatedby();
    }

    @Override
    public TransportcostrulesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public TransportcostrulesRecord value2(Integer value) {
        setTransportruleid(value);
        return this;
    }

    @Override
    public TransportcostrulesRecord value3(Integer value) {
        setMinworker(value);
        return this;
    }

    @Override
    public TransportcostrulesRecord value4(Integer value) {
        setMaxworker(value);
        return this;
    }

    @Override
    public TransportcostrulesRecord value5(Double value) {
        setCost(value);
        return this;
    }

    @Override
    public TransportcostrulesRecord value6(LocalDateTime value) {
        setDatecreated(value);
        return this;
    }

    @Override
    public TransportcostrulesRecord value7(LocalDateTime value) {
        setDateupdated(value);
        return this;
    }

    @Override
    public TransportcostrulesRecord value8(String value) {
        setCreatedby(value);
        return this;
    }

    @Override
    public TransportcostrulesRecord value9(String value) {
        setUpdatedby(value);
        return this;
    }

    @Override
    public TransportcostrulesRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Double value5, LocalDateTime value6, LocalDateTime value7, String value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TransportcostrulesRecord
     */
    public TransportcostrulesRecord() {
        super(Transportcostrules.TRANSPORTCOSTRULES);
    }

    /**
     * Create a detached, initialised TransportcostrulesRecord
     */
    public TransportcostrulesRecord(Integer id, Integer transportruleid, Integer minworker, Integer maxworker, Double cost, LocalDateTime datecreated, LocalDateTime dateupdated, String createdby, String updatedby) {
        super(Transportcostrules.TRANSPORTCOSTRULES);

        setId(id);
        setTransportruleid(transportruleid);
        setMinworker(minworker);
        setMaxworker(maxworker);
        setCost(cost);
        setDatecreated(datecreated);
        setDateupdated(dateupdated);
        setCreatedby(createdby);
        setUpdatedby(updatedby);
    }
}
