package org.carpconn.model;

/**
 * Achievement
 *
 * @author carpc on 11/23/2021
 */
public class Achievement {
    private String title;
    private String description;

    public Achievement(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public static final class Builder {
        private String title;
        private String description;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Achievement build() {
            return new Achievement(title, description);
        }
    }
}
