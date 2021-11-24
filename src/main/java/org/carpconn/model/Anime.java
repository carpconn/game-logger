package org.carpconn.model;

import java.util.Date;
import java.util.List;

/**
 * Anime
 *
 * @author carpc on 11/23/2021
 */
public class Anime {
    private int animeId;
    private List<Tag> tags;
    private int totalEpisodes;
    private int currentEpisode;
    private String name;
    private Date startDate;
    private Date endDate;
    private short rating;

    public Anime(int animeId, List<Tag> tags, int totalEpisodes, int currentEpisode, String name, Date startDate, Date endDate,
                 short rating) {
        this.animeId = animeId;
        this.tags = tags;
        this.totalEpisodes = totalEpisodes;
        this.currentEpisode = currentEpisode;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.rating = rating;
    }

    public int getAnimeId() {
        return animeId;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public int getTotalEpisodes() {
        return totalEpisodes;
    }

    public int getCurrentEpisode() {
        return currentEpisode;
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

    public short getRating() {
        return rating;
    }

    public static final class Builder {
        private int animeId;
        private List<Tag> tags;
        private int totalEpisodes;
        private int currentEpisode;
        private String name;
        private Date startDate;
        private Date endDate;
        private short rating;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder animeId(int animeId) {
            this.animeId = animeId;
            return this;
        }

        public Builder tags(List<Tag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder totalEpisodes(int totalEpisodes) {
            this.totalEpisodes = totalEpisodes;
            return this;
        }

        public Builder currentEpisode(int currentEpisode) {
            this.currentEpisode = currentEpisode;
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

        public Builder rating(short rating) {
            this.rating = rating;
            return this;
        }

        public Anime build() {
            return new Anime(animeId, tags, totalEpisodes, currentEpisode, name, startDate, endDate, rating);
        }
    }
}
