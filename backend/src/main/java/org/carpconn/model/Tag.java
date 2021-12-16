package org.carpconn.model;

import java.util.Objects;

/**
 * Tag
 *
 * @author carpc on 11/23/2021
 */
public class Tag {
    private Long tagId;
    private String name;

    public Tag() {
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tag tag = (Tag) o;
        return tagId.equals(tag.tagId) && name.equals(tag.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagId, name);
    }

    @Override
    public String toString() {
        return "Tag{" + "tagId=" + tagId + ", name='" + name + '\'' + '}';
    }
}
