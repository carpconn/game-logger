package org.carpconn.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Anime
 *
 * @author carpc on 11/23/2021
 */
public class Anime extends GenericLogger {
    private Integer animeId;
    private List<Tag> tags;
    private Integer totalEpisodes;
    private Integer currentEpisode;
    private String name;
    private Date startDate;
    private Date endDate;
    private Double rating;

    public Anime() {
    }

    public Integer getAnimeId() {
        return animeId;
    }

    public void setAnimeId(Integer animeId) {
        this.animeId = animeId;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Integer getTotalEpisodes() {
        return totalEpisodes;
    }

    public void setTotalEpisodes(Integer totalEpisodes) {
        this.totalEpisodes = totalEpisodes;
    }

    public Integer getCurrentEpisode() {
        return currentEpisode;
    }

    public void setCurrentEpisode(Integer currentEpisode) {
        this.currentEpisode = currentEpisode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = this.formatRating(rating);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Anime anime = (Anime) o;
        return animeId.equals(anime.animeId) && Objects.equals(tags, anime.tags) && totalEpisodes.equals(anime.totalEpisodes)
                && currentEpisode.equals(anime.currentEpisode) && name.equals(anime.name) && Objects.equals(startDate, anime.startDate)
                && Objects.equals(endDate, anime.endDate) && Objects.equals(rating, anime.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animeId, totalEpisodes, currentEpisode, name, startDate, endDate, rating);
    }

    @Override
    public String toString() {
        return "Anime{" + "animeId=" + animeId + ", tags=" + tags + ", totalEpisodes=" + totalEpisodes + ", currentEpisode="
                + currentEpisode + ", name='" + name + '\'' + ", startDate=" + startDate + ", endDate=" + endDate + ", rating="
                + rating + '}';
    }
}
