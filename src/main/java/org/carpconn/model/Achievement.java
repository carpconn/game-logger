package org.carpconn.model;

import java.util.Objects;

/**
 * Achievement
 *
 * @author carpc on 11/23/2021
 */
public class Achievement {
    private Integer achievementId;
    private String title;
    private String description;

    public Achievement() {
    }

    public Integer getAchievementId() {
        return achievementId;
    }

    public void setAchievementId(Integer achievementId) {
        this.achievementId = achievementId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Achievement that = (Achievement) o;
        return achievementId.equals(that.achievementId) && title.equals(that.title) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(achievementId, title, description);
    }

    @Override
    public String toString() {
        return "Achievement{" + "achievementId=" + achievementId + ", title='" + title + '\'' + ", description='" + description + '\''
                + '}';
    }
}
