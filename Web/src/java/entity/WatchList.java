/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author th4tkh13m
 */
public class WatchList {
    private int userId, animeId, episode;

    public WatchList(int userId, int animeId, int episode) {
        this.userId = userId;
        this.animeId = animeId;
        this.episode = episode;
    }

    public int getUserId() {
        return userId;
    }

    public int getAnimeId() {
        return animeId;
    }

    public int getEpisode() {
        return episode;
    }
    
    
}
