/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import entity.Anime;
import entity.Genre;
import entity.Producer;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author th4tkh13m
 */
public class AnimeDAO {
    private Connection connection;
    private ArrayList<Anime> animes;
    private ArrayList<Genre> genres;
    private ArrayList<Producer> producers;

    public AnimeDAO(Connection connection) {
        this.connection = connection;
    }
    
    
    
    public void loadAllAnimes() {
        try {
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM Anime;";
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {                
                int animeId = resultSet.getInt(1);
                String title = resultSet.getString(2);
                String title_english = resultSet.getString(3);
                String title_japanese = resultSet.getString(4); 
                String title_synonyms = resultSet.getString(5);
                String image_url = resultSet.getString(6);
                String type = resultSet.getString(7);
                String source = resultSet.getString(8);
                int episodes = resultSet.getInt(9);
                String status = resultSet.getString(10);
                String duration = resultSet.getString(11);
                String rating = resultSet.getString(12);
                float score = resultSet.getFloat(13);
                int scored_by = resultSet.getInt(14);
                float rank = resultSet.getFloat(15);
                int popularity = resultSet.getInt(16);
                int members = resultSet.getInt(17);
                int favorites = resultSet.getInt(18);
                String premiered = resultSet.getString(19);
                String licensor = resultSet.getString(20);
                String studio = resultSet.getString(21);
                Date airedFrom = resultSet.getDate(22);
                Date airedTo = resultSet.getDate(23);
                
                animes.add(new Anime(animeId, title, title_english, title_japanese, title_synonyms, image_url, type, source, episodes, status, duration, rating, score, scored_by, rank, popularity, members, favorites, premiered, licensor, studio, airedFrom, airedTo));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnimeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Genre> getGenre(Anime anime) {
        ArrayList<Genre> animeGenre = new ArrayList<>();
        try {
            int animeId = anime.getAnimeId();
            String query = "SELECT Genre.genre_id, genre_name FROM Genre INNER JOIN (SELECT genre_id FROM Classifies WHERE anime_id = ?) AS a ON Genre.genre_id = a.genre_id";
            PreparedStatement preparedStatement = connection.prepareCall(query);
            preparedStatement.setInt(1, animeId);
            
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {                
                animeGenre.add(new Genre(resultSet.getInt(1), resultSet.getString(2)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnimeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return animeGenre;
    }
}
