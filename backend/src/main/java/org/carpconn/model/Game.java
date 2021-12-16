package org.carpconn.model;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Game
 *
 * @author carpc on 11/23/2021
 */
public class Game extends GenericLogger {
    private Long gameId;
    private String name;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private List<Achievement> achievements;
    private List<Tag> tags;
    private Double hoursPlayed;
    private Double rating;

    public Game() {
    }

    public Long getGameId() {
        return gameId;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public List<Achievement> getAchievements() {
        return achievements;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public Double getHoursPlayed() {
        return hoursPlayed;
    }

    public Double getRating() {
        return rating;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public void setAchievements(List<Achievement> achievements) {
        this.achievements = achievements;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public void setHoursPlayed(Double hoursPlayed) {
        this.hoursPlayed = hoursPlayed;
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
        Game game = (Game) o;
        return gameId.equals(game.gameId) && name.equals(game.name) && Objects.equals(startDate, game.startDate) && Objects.equals(
                endDate, game.endDate) && Objects.equals(achievements, game.achievements) && Objects.equals(tags, game.tags)
                && hoursPlayed.equals(game.hoursPlayed) && Objects.equals(rating, game.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameId, name, startDate, endDate, achievements, hoursPlayed, rating);
    }

    @Override
    public String toString() {
        return "Game{" + "gameId=" + gameId + ", name='" + name + '\'' + ", startDate=" + startDate + ", endDate=" + endDate
                + ", achievements=" + achievements + ", tags=" + tags + ", hoursPlayed=" + hoursPlayed + ", rating=" + rating + '}';
    }
}
