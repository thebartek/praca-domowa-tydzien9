package it.marczuk.pracadomowa_tydzien9.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class MongoDbAspect {

    private StopWatch readWatch;
    private StopWatch saveWatch;

    public MongoDbAspect() {
        this.readWatch = new StopWatch();
        this.saveWatch = new StopWatch();
    }

    @Before("@annotation(ReadTimeMeasure)")
    public void startReadTime() {
        readWatch.start();
    }

    @After("@annotation(ReadTimeMeasure)")
    public void stopReadTime() {
        readWatch.stop();
        System.out.println(readWatch.getTotalTimeSeconds() + " ms");
    }

    @Before("@annotation(SaveTimeMeasure)")
    public void startSaveTime() {
        saveWatch.start();
    }

    @After("@annotation(SaveTimeMeasure)")
    public void stopSaveTime() {
        saveWatch.stop();
        System.out.println(saveWatch.getTotalTimeSeconds() + " ms");
    }
}
