package com.stage.youtubestreaminganalytics.Entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
@Data
public class ChannelsInTrendsKey implements Serializable {
    private String id;
    private LocalDate date;


}
