package org.carpconn.model;

import java.util.Date;
import java.util.List;

/**
 * Game
 *
 * @author carpc on 11/23/2021
 */
public class Game {
    private int gameId;
    private String name;
    private Date startDate;
    private Date endDate;
    private List<Achievement> achievements;
    private List<Tag> tags;
    private double hoursPlayed;
    private short rating;

    public Game(int gameId, String name, Date startDate, Date endDate, List<Achievement> achievements, List<Tag> tags,
                double hoursPlayed, short rating) {
        this.gameId = gameId;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.achievements = achievements;
        this.tags = tags;
        this.hoursPlayed = hoursPlayed;
        this.rating = rating;
    }

    public int getGameId() {
        return gameId;
    }

    public String getName() {
        return name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public List<Achievement> getAchievements() {
        return achievements;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public double getHoursPlayed() {
        return hoursPlayed;
    }

    public short getRating() {
        return rating;
    }

    public static final class Builder {
        private int gameId;
        private String name;
        private Date startDate;
        private Date endDate;
        private List<Achievement> achievements;
        private List<Tag> tags;
        private double hoursPlayed;
        private short rating;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder gameId(int gameId) {
            this.gameId = gameId;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder startDate(Date startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder endDate(Date endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder achievements(List<Achievement> achievements) {
            this.achievements = achievements;
            return this;
        }

        public Builder tags(List<Tag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder hoursPlayed(double hoursPlayed) {
            this.hoursPlayed = hoursPlayed;
            return this;
        }

        public Builder rating(short rating) {
            this.rating = rating;
            return this;
        }

        public Game build() {
            return new Game(gameId, name, startDate, endDate, achievements, tags, hoursPlayed, rating);
        }
    }
}
