/*
 * This file is generated by jOOQ.
 */
package com.savagelearning.machete.core.tables;


import com.savagelearning.machete.core.Keys;
import com.savagelearning.machete.core.Public;
import com.savagelearning.machete.core.tables.records.EventsRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row12;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Events extends TableImpl<EventsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.Events</code>
     */
    public static final Events EVENTS = new Events();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsRecord> getRecordType() {
        return EventsRecord.class;
    }

    /**
     * The column <code>public.Events.id</code>.
     */
    public final TableField<EventsRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("nextval('\"Events_id_seq\"'::regclass)", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.Events.PersonID</code>.
     */
    public final TableField<EventsRecord, Integer> PERSONID = createField(DSL.name("PersonID"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.Events.eventType</code>.
     */
    public final TableField<EventsRecord, Integer> EVENTTYPE = createField(DSL.name("eventType"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.Events.dateFrom</code>.
     */
    public final TableField<EventsRecord, LocalDateTime> DATEFROM = createField(DSL.name("dateFrom"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    /**
     * The column <code>public.Events.dateTo</code>.
     */
    public final TableField<EventsRecord, LocalDateTime> DATETO = createField(DSL.name("dateTo"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.Events.notes</code>.
     */
    public final TableField<EventsRecord, String> NOTES = createField(DSL.name("notes"), SQLDataType.VARCHAR(4000), this, "");

    /**
     * The column <code>public.Events.datecreated</code>.
     */
    public final TableField<EventsRecord, LocalDateTime> DATECREATED = createField(DSL.name("datecreated"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    /**
     * The column <code>public.Events.dateupdated</code>.
     */
    public final TableField<EventsRecord, LocalDateTime> DATEUPDATED = createField(DSL.name("dateupdated"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    /**
     * The column <code>public.Events.Createdby</code>.
     */
    public final TableField<EventsRecord, String> CREATEDBY = createField(DSL.name("Createdby"), SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>public.Events.Updatedby</code>.
     */
    public final TableField<EventsRecord, String> UPDATEDBY = createField(DSL.name("Updatedby"), SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>public.Events.eventTypeEN</code>.
     */
    public final TableField<EventsRecord, String> EVENTTYPEEN = createField(DSL.name("eventTypeEN"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.Events.eventTypeES</code>.
     */
    public final TableField<EventsRecord, String> EVENTTYPEES = createField(DSL.name("eventTypeES"), SQLDataType.VARCHAR(50), this, "");

    private Events(Name alias, Table<EventsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Events(Name alias, Table<EventsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.Events</code> table reference
     */
    public Events(String alias) {
        this(DSL.name(alias), EVENTS);
    }

    /**
     * Create an aliased <code>public.Events</code> table reference
     */
    public Events(Name alias) {
        this(alias, EVENTS);
    }

    /**
     * Create a <code>public.Events</code> table reference
     */
    public Events() {
        this(DSL.name("Events"), null);
    }

    public <O extends Record> Events(Table<O> child, ForeignKey<O, EventsRecord> key) {
        super(child, key, EVENTS);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<EventsRecord> getPrimaryKey() {
        return Keys.PK__EVENTS__3214EC276981ADA8;
    }

    @Override
    public List<UniqueKey<EventsRecord>> getKeys() {
        return Arrays.<UniqueKey<EventsRecord>>asList(Keys.PK__EVENTS__3214EC276981ADA8);
    }

    @Override
    public List<ForeignKey<EventsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<EventsRecord, ?>>asList(Keys.EVENTS__EVENT_PERSON);
    }

    public Persons persons() {
        return new Persons(this, Keys.EVENTS__EVENT_PERSON);
    }

    @Override
    public Events as(String alias) {
        return new Events(DSL.name(alias), this);
    }

    @Override
    public Events as(Name alias) {
        return new Events(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Events rename(String name) {
        return new Events(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Events rename(Name name) {
        return new Events(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Integer, Integer, Integer, LocalDateTime, LocalDateTime, String, LocalDateTime, LocalDateTime, String, String, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}
