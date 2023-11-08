package com.stage.youtubestreaminganalytics.Entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
@Data
public class CategorieKey implements  Serializable{
        private Long categoryid;
        private LocalDate date;


    }
