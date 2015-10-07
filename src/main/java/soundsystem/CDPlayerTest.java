package soundsystem;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //pri starte testu sa automaticky vytvori spring context
@ContextConfiguration(classes=CDPlayerConfig.class) //nacitaj konfiguracnu classu, ktora vyhlada komponenty(tato classa obsahuje anotaciu ComponentScan)
public class CDPlayerTest {
	
	@Autowired
	private CompactDisc cd;
	
	@Test
	public void cdShouldBeNull(){
		assertNotNull(cd);
	}

}
