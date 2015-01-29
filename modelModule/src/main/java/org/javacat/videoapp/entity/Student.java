package org.javacat.videoapp.entity;

/**
 *
 */
public class Student {
    private String id;
    private String name;
    private Faculty faculty;

    public Student(String name, Faculty faculty) {
        this.name = name;
        this.faculty = faculty;
    }

    public Student() {
    }

    private String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
}
