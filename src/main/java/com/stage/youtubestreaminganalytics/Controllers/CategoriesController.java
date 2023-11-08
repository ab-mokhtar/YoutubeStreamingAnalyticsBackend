package com.stage.youtubestreaminganalytics.Controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stage.youtubestreaminganalytics.Entity.Categories;
import com.stage.youtubestreaminganalytics.Entity.Channels;
import com.stage.youtubestreaminganalytics.Services.CategoriesService;
import com.stage.youtubestreaminganalytics.Services.ChannelsintrendsService;
import lombok.AllArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@RestController
@AllArgsConstructor
@RequestMapping("/categories")
public class CategoriesController {
    private final SimpMessagingTemplate template;
    private final ObjectMapper objectMapper;

    private CategoriesService categoriesService;
    @GetMapping()
    public List<Categories> getAllCategories(){
        return categoriesService.getAll();
    }
    @GetMapping("/Today")
    public List<Categories> getTodayIsStat(){
        return categoriesService.getToday();
    }

@PostConstruct
    public void onReceivedMesage() throws JsonProcessingException {
        ScheduledExecutorService service= Executors.newSingleThreadScheduledExecutor();
     //   String json = objectMapper.writeValueAsString(categoriesService.getAll());
        Runnable task=()->{this.template.convertAndSend("/topic/categories",categoriesService.getAll() );
            this.template.convertAndSend("/topic/categories/today",categoriesService.getToday() );
            System.out.println("new data");

        };
        service.scheduleAtFixedRate(task,0,3, TimeUnit.MINUTES);
     }
}
