package com.stage.youtubestreaminganalytics.Entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class trendsvideos {
    @EmbeddedId
    private ChannelsInTrendsKey id;
    private  String channelId;
    private Long viewCount;
    private Long likeCount;
    private Long dislikeCount;
    private Long commentCount;

}
