package guru.springframework.joke.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class ChuckConfiguration {
    // Configuration is used to consume whatever source isn't from yourself
    // them u need inform a Bean

    // if u gonna do the XML Config comment the @Configuration and the @Bean then
    // create a file on Resources folder then write like my chuck-config.xml
    // and import @ImportResource("classpath:your-file.xml") on main Application

    //@Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }

}
