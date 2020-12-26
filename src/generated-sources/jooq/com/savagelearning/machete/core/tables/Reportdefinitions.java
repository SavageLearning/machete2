/*
 * This file is generated by jOOQ.
 */
package com.savagelearning.machete.core.tables;


import com.savagelearning.machete.core.Keys;
import com.savagelearning.machete.core.Public;
import com.savagelearning.machete.core.tables.records.ReportdefinitionsRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row14;
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
public class Reportdefinitions extends TableImpl<ReportdefinitionsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.ReportDefinitions</code>
     */
    public static final Reportdefinitions REPORTDEFINITIONS = new Reportdefinitions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReportdefinitionsRecord> getRecordType() {
        return ReportdefinitionsRecord.class;
    }

    /**
     * The column <code>public.ReportDefinitions.id</code>.
     */
    public final TableField<ReportdefinitionsRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("nextval('\"ReportDefinitions_id_seq\"'::regclass)", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.ReportDefinitions.name</code>.
     */
    public final TableField<ReportdefinitionsRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.ReportDefinitions.commonName</code>.
     */
    public final TableField<ReportdefinitionsRecord, String> COMMONNAME = createField(DSL.name("commonName"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.ReportDefinitions.title</code>.
     */
    public final TableField<ReportdefinitionsRecord, String> TITLE = createField(DSL.name("title"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.ReportDefinitions.description</code>.
     */
    public final TableField<ReportdefinitionsRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.ReportDefinitions.sqlquery</code>.
     */
    public final TableField<ReportdefinitionsRecord, String> SQLQUERY = createField(DSL.name("sqlquery"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.ReportDefinitions.category</code>.
     */
    public final TableField<ReportdefinitionsRecord, String> CATEGORY = createField(DSL.name("category"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.ReportDefinitions.subcategory</code>.
     */
    public final TableField<ReportdefinitionsRecord, String> SUBCATEGORY = createField(DSL.name("subcategory"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.ReportDefinitions.inputsJson</code>.
     */
    public final TableField<ReportdefinitionsRecord, String> INPUTSJSON = createField(DSL.name("inputsJson"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.ReportDefinitions.columnsJson</code>.
     */
    public final TableField<ReportdefinitionsRecord, String> COLUMNSJSON = createField(DSL.name("columnsJson"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.ReportDefinitions.datecreated</code>.
     */
    public final TableField<ReportdefinitionsRecord, LocalDateTime> DATECREATED = createField(DSL.name("datecreated"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    /**
     * The column <code>public.ReportDefinitions.dateupdated</code>.
     */
    public final TableField<ReportdefinitionsRecord, LocalDateTime> DATEUPDATED = createField(DSL.name("dateupdated"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    /**
     * The column <code>public.ReportDefinitions.Createdby</code>.
     */
    public final TableField<ReportdefinitionsRecord, String> CREATEDBY = createField(DSL.name("Createdby"), SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>public.ReportDefinitions.Updatedby</code>.
     */
    public final TableField<ReportdefinitionsRecord, String> UPDATEDBY = createField(DSL.name("Updatedby"), SQLDataType.VARCHAR(30), this, "");

    private Reportdefinitions(Name alias, Table<ReportdefinitionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Reportdefinitions(Name alias, Table<ReportdefinitionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.ReportDefinitions</code> table reference
     */
    public Reportdefinitions(String alias) {
        this(DSL.name(alias), REPORTDEFINITIONS);
    }

    /**
     * Create an aliased <code>public.ReportDefinitions</code> table reference
     */
    public Reportdefinitions(Name alias) {
        this(alias, REPORTDEFINITIONS);
    }

    /**
     * Create a <code>public.ReportDefinitions</code> table reference
     */
    public Reportdefinitions() {
        this(DSL.name("ReportDefinitions"), null);
    }

    public <O extends Record> Reportdefinitions(Table<O> child, ForeignKey<O, ReportdefinitionsRecord> key) {
        super(child, key, REPORTDEFINITIONS);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<ReportdefinitionsRecord> getPrimaryKey() {
        return Keys.PK_DBO_REPORTDEFINITIONS;
    }

    @Override
    public List<UniqueKey<ReportdefinitionsRecord>> getKeys() {
        return Arrays.<UniqueKey<ReportdefinitionsRecord>>asList(Keys.PK_DBO_REPORTDEFINITIONS);
    }

    @Override
    public Reportdefinitions as(String alias) {
        return new Reportdefinitions(DSL.name(alias), this);
    }

    @Override
    public Reportdefinitions as(Name alias) {
        return new Reportdefinitions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Reportdefinitions rename(String name) {
        return new Reportdefinitions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Reportdefinitions rename(Name name) {
        return new Reportdefinitions(name, null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<Integer, String, String, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime, String, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }
}
