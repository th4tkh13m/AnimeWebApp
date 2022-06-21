/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.sql.Date;

/**
 *
 * @author th4tkh13m
 */
public class Anime {

    private int animeId;
    private String title, title_english, title_japanese, title_synonyms, image_url, type, source;
    private int episodes;
    private String status, duration, rating;
    private float score;
    private int scored_by;
    private float rank;
    private int popularity, members, favorites;
    private String premiered, licensor, studio;
    private Date airedFrom, airedTo;

    public Anime(int animeId, String title, String title_english, String title_japanese, String title_synonyms, String image_url, String type, String source, int episodes, String status, String duration, String rating, float score, int scored_by, float rank, int popularity, int members, int favorites, String premiered, String licensor, String studio, Date airedFrom, Date airedTo) {
        this.animeId = animeId;
        this.title = title;
        this.title_english = title_english;
        this.title_japanese = title_japanese;
        this.title_synonyms = title_synonyms;
        this.image_url = image_url;
        this.type = type;
        this.source = source;
        this.episodes = episodes;
        this.status = status;
        this.duration = duration;
        this.rating = rating;
        this.score = score;
        this.scored_by = scored_by;
        this.rank = rank;
        this.popularity = popularity;
        this.members = members;
        this.favorites = favorites;
        this.premiered = premiered;
        this.licensor = licensor;
        this.studio = studio;
        this.airedFrom = airedFrom;
        this.airedTo = airedTo;
    }

    public int getAnimeId() {
        return animeId;
    }

    public String getTitle() {
        return title;
    }

    public String getTitle_english() {
        return title_english;
    }

    public String getTitle_japanese() {
        return title_japanese;
    }

    public String getTitle_synonyms() {
        return title_synonyms;
    }

    public String getImage_url() {
        return image_url;
    }

    public String getType() {
        return type;
    }

    public String getSource() {
        return source;
    }

    public int getEpisodes() {
        return episodes;
    }

    public String getStatus() {
        return status;
    }

    public String getDuration() {
        return duration;
    }

    public String getRating() {
        return rating;
    }

    public float getScore() {
        return score;
    }

    public int getScored_by() {
        return scored_by;
    }

    public float getRank() {
        return rank;
    }

    public int getPopularity() {
        return popularity;
    }

    public int getMembers() {
        return members;
    }

    public int getFavorites() {
        return favorites;
    }

    public String getPremiered() {
        return premiered;
    }

    public String getLicensor() {
        return licensor;
    }

    public String getStudio() {
        return studio;
    }

    public Date getAiredFrom() {
        return airedFrom;
    }

    public Date getAiredTo() {
        return airedTo;
    }

}
