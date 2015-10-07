package soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //anotaca konfiguracie
@ComponentScan // enable component scanning - Spring skenuje package v ktorom sa nachadza tato trieda a hlada vsetky klasy s anotaciou Component, aby z nich vytvorila beany
public class CDPlayerConfig {

}
