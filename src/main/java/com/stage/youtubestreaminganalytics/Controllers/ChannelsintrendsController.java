package com.stage.youtubestreaminganalytics.Controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.stage.youtubestreaminganalytics.Entity.Channels;
import com.stage.youtubestreaminganalytics.Services.ChannelsintrendsService;
import lombok.AllArgsConstructor;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@AllArgsConstructor
@RestController
@RequestMapping("/channels")

public class ChannelsintrendsController {
    private final SimpMessagingTemplate template;
    private ChannelsintrendsService channelsService;
    @GetMapping()
    public List<Channels>getAllChannels(){
        return channelsService.getAll();
    }
    @PostConstruct
    public void onReceivedMesage() throws JsonProcessingException {
        ScheduledExecutorService service= Executors.newSingleThreadScheduledExecutor();
        //   String json = objectMapper.writeValueAsString(categoriesService.getAll());
        Runnable task=()->{this.template.convertAndSend("/topic/channels",channelsService.getAll() );
            System.out.println("new data");
        };
        service.scheduleAtFixedRate(task,0,3, TimeUnit.MINUTES);
    }
}
