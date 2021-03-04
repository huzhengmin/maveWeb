package com.gaotai;

/**
 * @author： hzm
 * @date： 2021/2/26 9:09
 * @description： TODO
 * @modifiedBy：
 * @version:
 */

public enum WeekDay {
    SUNDAY(0,"星期日"),
    MONDAY(1,"星期一"),
    TUESDAY(2,"星期二"),
    WEDNESDAY(3,"星期三"),
    THURSDAY(4,"星期四"),
    FRIDAY(5,"星期五"),
    SATURDAY(6,"星期六");

    private int id;
    private String meaning;

    WeekDay(int id,String meaning) {
        this.id = id;
        this.meaning = meaning;
    }

    public int getId() {
        return id;
    }

    public String getMeaning() {
        return meaning;
    }
}
