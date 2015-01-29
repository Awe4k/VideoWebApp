package org.javacat.videoapp.entity;

/**
 *
 */
public class Faculty {
    private String id;
    private String name;
    private Integer years;

    public Faculty() {

    }

    public Faculty(String name, Integer years) {
        this.name = name;
        this.years = years;
    }

    
    public String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYears() {
        return years;
    }

    public void setYears(Integer years) {
        this.years = years;
    }
}
