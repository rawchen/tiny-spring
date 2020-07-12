/*
 * Github: https://github.com/yoyling
 * Created by yoyling on 2020/07/12.
 * All rights reserved.
 */

package com.yoyling.spring.pojo;

// 首都
public class Capital {

    // 名字
    private String name;

    // 首都是有很多人的
    private People people;

    // 哪个国家的首都
    private Country country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Capital{" +
                "name='" + name + '\'' +
                ", people=" + people +
                ", country=" + country.getName() +
                '}';
    }
}
