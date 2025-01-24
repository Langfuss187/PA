package org.pa.fobidb.teacher;

public class Teacher {
    private Long id;
    private String name;
    private String lastName;
    private String kuerzel;

    public Teacher(Long id, String name, String lastName, String kuerzel) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.kuerzel = kuerzel;
    }

    public Teacher(String kuerzel, String lastName, String name) {
        this.kuerzel = kuerzel;
        this.lastName = lastName;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getkuerzel() {
        return kuerzel;
    }

    public void setkuerzel(String kuerzel) {
        this.kuerzel = kuerzel;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", LastName='" + lastName + '\'' +
                ", kuerzel=" + kuerzel +
                '}';
    }
}



