package com.example.demo.schedulings;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTasks {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    @Scheduled(cron = "*/5 * * * * *")
    public void reportCurrentTime() {
        System.out.print("现在时间：" + dateFormat.format(new Date()));
    }
}