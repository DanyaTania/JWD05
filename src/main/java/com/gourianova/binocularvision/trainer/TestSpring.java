package com.gourianova.binocularvision.trainer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {

    public  static void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

              AppTrainer appTrainer=context.getBean("appTrainer", AppTrainer.class);

System.out.println(appTrainer.getName());
System.out.println(appTrainer.getColor());

BinocularvisionApp platformerBinocularvisionApp1=context.getBean("platformerBinocularvisionApp",PlatformerBinocularvisionApp.class);
BinocularvisionApp platformerBinocularvisionApp2=context.getBean("platformerBinocularvisionApp",PlatformerBinocularvisionApp.class);
 //BinocularvisionApp platformerBinocularvisionApp2=context.getBean("platformerBinocularvisionApp",PlatformerBinocularvisionApp.class);
BinocularvisionApp questBinocularvisionApp=context.getBean("questBinocularvisionApp",QuestBinocularvisionApp.class);
System.out.println(platformerBinocularvisionApp1==platformerBinocularvisionApp2);
System.out.println(platformerBinocularvisionApp1.getBinocularvisionApp());
        System.out.println(platformerBinocularvisionApp2.getBinocularvisionApp());
        System.out.println(questBinocularvisionApp.getBinocularvisionApp());
      context.close();
    }
}
