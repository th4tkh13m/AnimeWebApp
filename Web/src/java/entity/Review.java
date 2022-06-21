/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author th4tkh13m
 */
public class Review {
    private int userId, animeId;
    private String content;

    public Review(int userId, int animeId, String content) {
        this.userId = userId;
        this.animeId = animeId;
        this.content = content;
    }

    public int getUserId() {
        return userId;
    }

    public int getAnimeId() {
        return animeId;
    }

    public String getContent() {
        return content;
    }
    
    
}
