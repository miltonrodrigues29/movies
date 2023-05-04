package com.milton.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;
//data annotation used for getters and setters
//all args and no args are constructers for these variables
@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;

    private String trailerLink;
    private String poster;
    private List<String> genres;

    private List<String> backdrops;

//    the below annotation will cause database to store only the ids,and the reviews will be in separate collection
    @DocumentReference
    private List<Review> reviewIds;
}
