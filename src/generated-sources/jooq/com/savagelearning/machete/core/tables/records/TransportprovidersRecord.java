/*
 * This file is generated by jOOQ.
 */
package com.savagelearning.machete.core.tables.records;


import com.savagelearning.machete.core.tables.Transportproviders;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TransportprovidersRecord extends UpdatableRecordImpl<TransportprovidersRecord> implements Record11<Integer, String, String, String, String, Integer, String, LocalDateTime, LocalDateTime, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.TransportProviders.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.TransportProviders.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.TransportProviders.key</code>.
     */
    public void setKey(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.TransportProviders.key</code>.
     */
    public String getKey() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.TransportProviders.text_EN</code>.
     */
    public void setTextEn(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.TransportProviders.text_EN</code>.
     */
    public String getTextEn() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.TransportProviders.text_ES</code>.
     */
    public void setTextEs(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.TransportProviders.text_ES</code>.
     */
    public String getTextEs() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.TransportProviders.defaultAttribute</code>.
     */
    public void setDefaultattribute(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.TransportProviders.defaultAttribute</code>.
     */
    public String getDefaultattribute() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.TransportProviders.sortorder</code>.
     */
    public void setSortorder(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.TransportProviders.sortorder</code>.
     */
    public Integer getSortorder() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.TransportProviders.active</code>.
     */
    public void setActive(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.TransportProviders.active</code>.
     */
    public String getActive() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.TransportProviders.datecreated</code>.
     */
    public void setDatecreated(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.TransportProviders.datecreated</code>.
     */
    public LocalDateTime getDatecreated() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>public.TransportProviders.dateupdated</code>.
     */
    public void setDateupdated(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.TransportProviders.dateupdated</code>.
     */
    public LocalDateTime getDateupdated() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>public.TransportProviders.Createdby</code>.
     */
    public void setCreatedby(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.TransportProviders.Createdby</code>.
     */
    public String getCreatedby() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.TransportProviders.Updatedby</code>.
     */
    public void setUpdatedby(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.TransportProviders.Updatedby</code>.
     */
    public String getUpdatedby() {
        return (String) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, String, String, String, String, Integer, String, LocalDateTime, LocalDateTime, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Integer, String, String, String, String, Integer, String, LocalDateTime, LocalDateTime, String, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Transportproviders.TRANSPORTPROVIDERS.ID;
    }

    @Override
    public Field<String> field2() {
        return Transportproviders.TRANSPORTPROVIDERS.KEY;
    }

    @Override
    public Field<String> field3() {
        return Transportproviders.TRANSPORTPROVIDERS.TEXT_EN;
    }

    @Override
    public Field<String> field4() {
        return Transportproviders.TRANSPORTPROVIDERS.TEXT_ES;
    }

    @Override
    public Field<String> field5() {
        return Transportproviders.TRANSPORTPROVIDERS.DEFAULTATTRIBUTE;
    }

    @Override
    public Field<Integer> field6() {
        return Transportproviders.TRANSPORTPROVIDERS.SORTORDER;
    }

    @Override
    public Field<String> field7() {
        return Transportproviders.TRANSPORTPROVIDERS.ACTIVE;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return Transportproviders.TRANSPORTPROVIDERS.DATECREATED;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return Transportproviders.TRANSPORTPROVIDERS.DATEUPDATED;
    }

    @Override
    public Field<String> field10() {
        return Transportproviders.TRANSPORTPROVIDERS.CREATEDBY;
    }

    @Override
    public Field<String> field11() {
        return Transportproviders.TRANSPORTPROVIDERS.UPDATEDBY;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getKey();
    }

    @Override
    public String component3() {
        return getTextEn();
    }

    @Override
    public String component4() {
        return getTextEs();
    }

    @Override
    public String component5() {
        return getDefaultattribute();
    }

    @Override
    public Integer component6() {
        return getSortorder();
    }

    @Override
    public String component7() {
        return getActive();
    }

    @Override
    public LocalDateTime component8() {
        return getDatecreated();
    }

    @Override
    public LocalDateTime component9() {
        return getDateupdated();
    }

    @Override
    public String component10() {
        return getCreatedby();
    }

    @Override
    public String component11() {
        return getUpdatedby();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getKey();
    }

    @Override
    public String value3() {
        return getTextEn();
    }

    @Override
    public String value4() {
        return getTextEs();
    }

    @Override
    public String value5() {
        return getDefaultattribute();
    }

    @Override
    public Integer value6() {
        return getSortorder();
    }

    @Override
    public String value7() {
        return getActive();
    }

    @Override
    public LocalDateTime value8() {
        return getDatecreated();
    }

    @Override
    public LocalDateTime value9() {
        return getDateupdated();
    }

    @Override
    public String value10() {
        return getCreatedby();
    }

    @Override
    public String value11() {
        return getUpdatedby();
    }

    @Override
    public TransportprovidersRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public TransportprovidersRecord value2(String value) {
        setKey(value);
        return this;
    }

    @Override
    public TransportprovidersRecord value3(String value) {
        setTextEn(value);
        return this;
    }

    @Override
    public TransportprovidersRecord value4(String value) {
        setTextEs(value);
        return this;
    }

    @Override
    public TransportprovidersRecord value5(String value) {
        setDefaultattribute(value);
        return this;
    }

    @Override
    public TransportprovidersRecord value6(Integer value) {
        setSortorder(value);
        return this;
    }

    @Override
    public TransportprovidersRecord value7(String value) {
        setActive(value);
        return this;
    }

    @Override
    public TransportprovidersRecord value8(LocalDateTime value) {
        setDatecreated(value);
        return this;
    }

    @Override
    public TransportprovidersRecord value9(LocalDateTime value) {
        setDateupdated(value);
        return this;
    }

    @Override
    public TransportprovidersRecord value10(String value) {
        setCreatedby(value);
        return this;
    }

    @Override
    public TransportprovidersRecord value11(String value) {
        setUpdatedby(value);
        return this;
    }

    @Override
    public TransportprovidersRecord values(Integer value1, String value2, String value3, String value4, String value5, Integer value6, String value7, LocalDateTime value8, LocalDateTime value9, String value10, String value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TransportprovidersRecord
     */
    public TransportprovidersRecord() {
        super(Transportproviders.TRANSPORTPROVIDERS);
    }

    /**
     * Create a detached, initialised TransportprovidersRecord
     */
    public TransportprovidersRecord(Integer id, String key, String textEn, String textEs, String defaultattribute, Integer sortorder, String active, LocalDateTime datecreated, LocalDateTime dateupdated, String createdby, String updatedby) {
        super(Transportproviders.TRANSPORTPROVIDERS);

        setId(id);
        setKey(key);
        setTextEn(textEn);
        setTextEs(textEs);
        setDefaultattribute(defaultattribute);
        setSortorder(sortorder);
        setActive(active);
        setDatecreated(datecreated);
        setDateupdated(dateupdated);
        setCreatedby(createdby);
        setUpdatedby(updatedby);
    }
}
