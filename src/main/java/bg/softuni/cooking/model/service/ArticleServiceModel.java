package bg.softuni.cooking.model.service;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ArticleServiceModel {
    private Long id;
    private String title;
    private LocalDate publishDate;
    private String description;

    public ArticleServiceModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
