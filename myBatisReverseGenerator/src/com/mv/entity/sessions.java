package com.mv.entity;

import java.util.Date;

public class sessions {
    private Integer id;

    private Integer movId;

    private Integer screensId;

    private Date startTime;

    private Long price;

    private String view;

    private Integer totalSold;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMovId() {
        return movId;
    }

    public void setMovId(Integer movId) {
        this.movId = movId;
    }

    public Integer getScreensId() {
        return screensId;
    }

    public void setScreensId(Integer screensId) {
        this.screensId = screensId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view == null ? null : view.trim();
    }

    public Integer getTotalSold() {
        return totalSold;
    }

    public void setTotalSold(Integer totalSold) {
        this.totalSold = totalSold;
    }
}