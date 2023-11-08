package com.stage.youtubestreaminganalytics.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Categories")
public class Categories {
    @EmbeddedId
    private CategorieKey id;
    private Long nbvideo;
    private Long totalviewcount;
    private Long totallikecount;
    private Long totaldislikecount;
    private Long totalcommentcount;

}
