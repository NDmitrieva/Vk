package ru.netology.domain;

public class Info {
    private String text;
    private String imageUrl;
    // private String fav; в документации - boolean is_favorite;
    private boolean isFavorite; // поле из документации
    private String buttonRead;
    // private int like;в документации тип object
    private Like like; // поле из документации
    // private String comment; в документации тип object
    private CommentsInfo commentsInfo; // поле из документации
    // private String share; - в документации Repost, с типом object
    private Repost repost; // поле из документации
    // private int view; в документации тип object
    private View view; // поле из документации
    
}
