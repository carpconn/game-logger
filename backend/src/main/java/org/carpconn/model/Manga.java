package org.carpconn.model;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Manga
 *
 * @author carpc on 11/23/2021
 */
public class Manga extends GenericLogger {
    private Long mangaId;
    private List<Tag> tags;
    private Integer currentChapter;
    private Integer totalChapters;
    private String name;
    private Double rating;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public Manga() {
    }

    public Long getMangaId() {
        return mangaId;
    }

    public void setMangaId(Long mangaId) {
        this.mangaId = mangaId;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Integer getCurrentChapter() {
        return currentChapter;
    }

    public void setCurrentChapter(Integer currentChapter) {
        this.currentChapter = currentChapter;
    }

    public Integer getTotalChapters() {
        return totalChapters;
    }

    public void setTotalChapters(Integer totalChapters) {
        this.totalChapters = totalChapters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = this.formatRating(rating);
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Manga manga = (Manga) o;
        return mangaId.equals(manga.mangaId) && Objects.equals(tags, manga.tags) && currentChapter.equals(manga.currentChapter)
                && totalChapters.equals(manga.totalChapters) && name.equals(manga.name) && Objects.equals(rating, manga.rating)
                && Objects.equals(startDate, manga.startDate) && Objects.equals(endDate, manga.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mangaId, currentChapter, totalChapters, name, rating, startDate, endDate);
    }

    @Override
    public String toString() {
        return "Manga{" + "mangaId=" + mangaId + ", tags=" + tags + ", currentChapter=" + currentChapter + ", totalChapters="
                + totalChapters + ", name='" + name + '\'' + ", rating=" + rating + ", startDate=" + startDate + ", endDate=" + endDate
                + '}';
    }
}
