/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author th4tkh13m
 */
public class Music {
    private int song_id, anime_id;
    private String song_name, type;

    public Music(int song_id, int anime_id, String song_name, String type) {
        this.song_id = song_id;
        this.anime_id = anime_id;
        this.song_name = song_name;
        this.type = type;
    }

    public int getSong_id() {
        return song_id;
    }

    public int getAnime_id() {
        return anime_id;
    }

    public String getSong_name() {
        return song_name;
    }

    public String getType() {
        return type;
    }
    
    
}
