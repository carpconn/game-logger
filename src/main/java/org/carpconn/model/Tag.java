/*
 * This file is copyright (c) 2021 of Sheetz Inc.
 */
package org.carpconn.model;

/**
 * Tag
 * <p>
 * [insert class comment here...]
 *
 * @author carpc on 11/23/2021
 */
public class Tag {
    private String name;

    public Tag(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static final class Builder {
        private String name;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Tag build() {
            return new Tag(name);
        }
    }
}
