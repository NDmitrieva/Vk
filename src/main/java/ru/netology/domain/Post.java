package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId; // поле из документации
    private String logoUrl;
    private String author;
    private int date;
    private String menu;
    private String text;
    private String imageUrl;
    // private String fav; в документации - boolean is_favorite;
    private boolean isFavorite; // поле из документации
    private String buttonRead;
    // private int like;в документации тип object
    private LikeInfo likeInfo; // поле из документации
    // private String comment; в документации тип object
    private CommentsInfo commentsInfo; // поле из документации
    // private String share; - в документации Repost, с типом object
    private RepostInfo repostInfo; // поле из документации
    // private int view; в документации тип object
    private ViewInfo viewInfo; // поле из документации

}
