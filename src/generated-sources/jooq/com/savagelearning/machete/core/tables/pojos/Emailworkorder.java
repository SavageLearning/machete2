/*
 * This file is generated by jOOQ.
 */
package com.savagelearning.machete.core.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Emailworkorder implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       workorderId;
    private Integer       emailId;
    private Integer       id;
    private LocalDateTime datecreated;
    private LocalDateTime dateupdated;
    private String        createdby;
    private String        updatedby;

    public Emailworkorder() {}

    public Emailworkorder(Emailworkorder value) {
        this.workorderId = value.workorderId;
        this.emailId = value.emailId;
        this.id = value.id;
        this.datecreated = value.datecreated;
        this.dateupdated = value.dateupdated;
        this.createdby = value.createdby;
        this.updatedby = value.updatedby;
    }

    public Emailworkorder(
        Integer       workorderId,
        Integer       emailId,
        Integer       id,
        LocalDateTime datecreated,
        LocalDateTime dateupdated,
        String        createdby,
        String        updatedby
    ) {
        this.workorderId = workorderId;
        this.emailId = emailId;
        this.id = id;
        this.datecreated = datecreated;
        this.dateupdated = dateupdated;
        this.createdby = createdby;
        this.updatedby = updatedby;
    }

    /**
     * Getter for <code>public.EmailWorkOrder.WorkOrder_ID</code>.
     */
    public Integer getWorkorderId() {
        return this.workorderId;
    }

    /**
     * Setter for <code>public.EmailWorkOrder.WorkOrder_ID</code>.
     */
    public void setWorkorderId(Integer workorderId) {
        this.workorderId = workorderId;
    }

    /**
     * Getter for <code>public.EmailWorkOrder.Email_ID</code>.
     */
    public Integer getEmailId() {
        return this.emailId;
    }

    /**
     * Setter for <code>public.EmailWorkOrder.Email_ID</code>.
     */
    public void setEmailId(Integer emailId) {
        this.emailId = emailId;
    }

    /**
     * Getter for <code>public.EmailWorkOrder.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>public.EmailWorkOrder.id</code>.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>public.EmailWorkOrder.datecreated</code>.
     */
    public LocalDateTime getDatecreated() {
        return this.datecreated;
    }

    /**
     * Setter for <code>public.EmailWorkOrder.datecreated</code>.
     */
    public void setDatecreated(LocalDateTime datecreated) {
        this.datecreated = datecreated;
    }

    /**
     * Getter for <code>public.EmailWorkOrder.dateupdated</code>.
     */
    public LocalDateTime getDateupdated() {
        return this.dateupdated;
    }

    /**
     * Setter for <code>public.EmailWorkOrder.dateupdated</code>.
     */
    public void setDateupdated(LocalDateTime dateupdated) {
        this.dateupdated = dateupdated;
    }

    /**
     * Getter for <code>public.EmailWorkOrder.Createdby</code>.
     */
    public String getCreatedby() {
        return this.createdby;
    }

    /**
     * Setter for <code>public.EmailWorkOrder.Createdby</code>.
     */
    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    /**
     * Getter for <code>public.EmailWorkOrder.Updatedby</code>.
     */
    public String getUpdatedby() {
        return this.updatedby;
    }

    /**
     * Setter for <code>public.EmailWorkOrder.Updatedby</code>.
     */
    public void setUpdatedby(String updatedby) {
        this.updatedby = updatedby;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Emailworkorder (");

        sb.append(workorderId);
        sb.append(", ").append(emailId);
        sb.append(", ").append(id);
        sb.append(", ").append(datecreated);
        sb.append(", ").append(dateupdated);
        sb.append(", ").append(createdby);
        sb.append(", ").append(updatedby);

        sb.append(")");
        return sb.toString();
    }
}
