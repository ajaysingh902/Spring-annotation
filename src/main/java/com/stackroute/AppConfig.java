package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    public Actor ActorObj(){
        Actor act=new Actor();
        act.setName("Ram");
        act.setGender("Male");
        act.setAge(18);
        return  act;
    }


    @Bean(name={"MovieA","MovieB"})
    @Scope("prototype")
    public Movie movie()
    {
        return new Movie(ActorObj());
    }

}
