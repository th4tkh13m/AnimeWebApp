/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author th4tkh13m
 */
public class Rating {
    private int userId, animeId, ratingStar;

    public Rating(int userId, int animeId, int ratingStar) {
        this.userId = userId;
        this.animeId = animeId;
        this.ratingStar = ratingStar;
    }

    public int getUserId() {
        return userId;
    }

    public int getAnimeId() {
        return animeId;
    }

    public int getRatingStar() {
        return ratingStar;
    }


    
    
}
