/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author th4tkh13m
 */
public class Favorites {
    private int UserId, AnimeId;

    public Favorites(int UserId, int AnimeId) {
        this.UserId = UserId;
        this.AnimeId = AnimeId;
    }

    public int getUserId() {
        return UserId;
    }

    public int getAnimeId() {
        return AnimeId;
    }
    
    
}
