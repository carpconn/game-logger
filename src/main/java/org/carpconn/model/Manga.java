package org.carpconn.model;

import java.util.List;

/**
 * Manga
 *
 * @author carpc on 11/23/2021
 */
public class Manga {
    private int mangaId;
    private List<Tag> tags;
    private int currentChapter;
    private int totalChapters;
    private String name;
    private int rating;

    public Manga(int mangaId, List<Tag> tags, int currentChapter, int totalChapters, String name, int rating) {
        this.mangaId = mangaId;
        this.tags = tags;
        this.currentChapter = currentChapter;
        this.totalChapters = totalChapters;
        this.name = name;
        this.rating = rating;
    }

    public int getMangaId() {
        return mangaId;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public int getCurrentChapter() {
        return currentChapter;
    }

    public int getTotalChapters() {
        return totalChapters;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public static final class Builder {
        private int mangaId;
        private List<Tag> tags;
        private int currentChapter;
        private int totalChapters;
        private String name;
        private int rating;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder mangaId(int mangaId) {
            this.mangaId = mangaId;
            return this;
        }

        public Builder tags(List<Tag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder currentChapter(int currentChapter) {
            this.currentChapter = currentChapter;
            return this;
        }

        public Builder totalChapters(int totalChapters) {
            this.totalChapters = totalChapters;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder rating(int rating) {
            this.rating = rating;
            return this;
        }

        public Manga build() {
            return new Manga(mangaId, tags, currentChapter, totalChapters, name, rating);
        }
    }
}
