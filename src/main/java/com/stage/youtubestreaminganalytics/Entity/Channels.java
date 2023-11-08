package com.stage.youtubestreaminganalytics.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "channelsintrends")
public class Channels {
    @EmbeddedId
    private ChannelsInTrendsKey id;
    @Column(name = "title")
    private String title;

    private Long subscribercount;

    private Long viewcount;

    private Long videocount;

    private Long commentcount;

    private LocalDate publishedat;

}
