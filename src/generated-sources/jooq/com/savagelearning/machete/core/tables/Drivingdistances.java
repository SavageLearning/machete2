/*
 * This file is generated by jOOQ.
 */
package com.savagelearning.machete.core.tables;


import com.savagelearning.machete.core.Keys;
import com.savagelearning.machete.core.Public;
import com.savagelearning.machete.core.tables.records.DrivingdistancesRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
public class Drivingdistances extends TableImpl<DrivingdistancesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.DrivingDistances</code>
     */
    public static final Drivingdistances DRIVINGDISTANCES = new Drivingdistances();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DrivingdistancesRecord> getRecordType() {
        return DrivingdistancesRecord.class;
    }

    /**
     * The column <code>public.DrivingDistances.distancesID</code>.
     */
    public final TableField<DrivingdistancesRecord, Integer> DISTANCESID = createField(DSL.name("distancesID"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.DrivingDistances.workOrderId</code>.
     */
    public final TableField<DrivingdistancesRecord, Integer> WORKORDERID = createField(DSL.name("workOrderId"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.DrivingDistances.drivingDistanceInMiles</code>.
     */
    public final TableField<DrivingdistancesRecord, Double> DRIVINGDISTANCEINMILES = createField(DSL.name("drivingDistanceInMiles"), SQLDataType.DOUBLE, this, "");

    private Drivingdistances(Name alias, Table<DrivingdistancesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Drivingdistances(Name alias, Table<DrivingdistancesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.DrivingDistances</code> table reference
     */
    public Drivingdistances(String alias) {
        this(DSL.name(alias), DRIVINGDISTANCES);
    }

    /**
     * Create an aliased <code>public.DrivingDistances</code> table reference
     */
    public Drivingdistances(Name alias) {
        this(alias, DRIVINGDISTANCES);
    }

    /**
     * Create a <code>public.DrivingDistances</code> table reference
     */
    public Drivingdistances() {
        this(DSL.name("DrivingDistances"), null);
    }

    public <O extends Record> Drivingdistances(Table<O> child, ForeignKey<O, DrivingdistancesRecord> key) {
        super(child, key, DRIVINGDISTANCES);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<DrivingdistancesRecord> getPrimaryKey() {
        return Keys.PK__DRIVINGD__92BED8411077B92E;
    }

    @Override
    public List<UniqueKey<DrivingdistancesRecord>> getKeys() {
        return Arrays.<UniqueKey<DrivingdistancesRecord>>asList(Keys.PK__DRIVINGD__92BED8411077B92E, Keys.UNIQUEWOID);
    }

    @Override
    public Drivingdistances as(String alias) {
        return new Drivingdistances(DSL.name(alias), this);
    }

    @Override
    public Drivingdistances as(Name alias) {
        return new Drivingdistances(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Drivingdistances rename(String name) {
        return new Drivingdistances(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Drivingdistances rename(Name name) {
        return new Drivingdistances(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, Double> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
