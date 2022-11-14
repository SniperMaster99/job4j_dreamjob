package ru.job4j.dream.model;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Objects;

public class Candidate {
    private int id;
    private String name;
    private String description;
    private String date;
    private byte[] photo;

    public Candidate(int id, String name, String desc, String date, byte[] photo) {
        this.id = id;
        this.name = name;
        this.description = desc;
        this.date = date;
        this.photo = photo;
    }

    public Candidate() {
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return description;
    }

    public void setDesc(String desc) {
        this.description = desc;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Candidate candidate = (Candidate) o;
        return id == candidate.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
