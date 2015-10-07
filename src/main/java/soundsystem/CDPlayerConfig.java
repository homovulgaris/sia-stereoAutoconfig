package soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //anotaca konfiguracie
@ComponentScan // enable component scanning - Spring skenuje package v ktorom sa nachadza tato trieda a hlada vsetky klasy s anotaciou Component, aby z nich vytvorila beany

/*
 * niekedy(alebo stale) je lepsie drzat konfiguracny kod mimo vykonavaneho kodu
 * preto je vhodne pouzivat @ComponetnScan s priznakom, ktory urcuje, v ktorom package sa ma vyhladavat
 * cize u nas teraz napriklad @ComponentScan("soundsystem")
 * alebo pomocou basePackage atributu @ComponentScan(basePackages="soundsystem")
 * da sa pouzit viacero... ak mame 2 package napr base1 a base2, tak sa da
 * 		@ComponentScan(basePackages={"base1", "base2"})
 * 
 * taketo pouzitie vsak nie je velmi type safe, pretoze sa pouzivaju stringy
 * preto je vhodnejsie pouzivat toto:
 * 	@ComponentScan(basePackageClasses={CDPlayer.class, DVDPlayer.class})
 * 
 * ** Whatever packages those classes are in will be used as the base package for component scanning.
 */

public class CDPlayerConfig {

}
