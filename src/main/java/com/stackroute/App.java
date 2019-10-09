package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
//        AppConfig appConfig=context.getBean();
        Movie moviea=context.getBean("MovieA",Movie.class);
        Movie movieb=context.getBean("MovieB",Movie.class);

        moviea.display();
        movieb.display();
        System.out.println(moviea==movieb);

    }

}
