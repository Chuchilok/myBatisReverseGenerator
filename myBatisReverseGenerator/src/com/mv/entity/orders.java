package com.mv.entity;

import java.util.Date;

public class orders {
    private Integer id;

    private Integer cliId;

    private Integer sesId;

    private Date orderTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCliId() {
        return cliId;
    }

    public void setCliId(Integer cliId) {
        this.cliId = cliId;
    }

    public Integer getSesId() {
        return sesId;
    }

    public void setSesId(Integer sesId) {
        this.sesId = sesId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }
}