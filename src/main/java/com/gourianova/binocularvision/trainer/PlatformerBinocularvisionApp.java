package com.gourianova.binocularvision.trainer;

import javax.annotation.PostConstruct;

//@Component
//@Scope("prototype")
public class PlatformerBinocularvisionApp implements BinocularvisionApp {

 @PostConstruct
    public void doMynit(){
        System.out.println(("Initialization of Platformer"));}

    //@PreDestroy
   public void doMyDestroy(){
      System.out.println("Destruction of Platformer");
    }


    @Override
    public String getBinocularvisionApp() {
        return "10-levels platformer";
    }
}
