package tt.utilities;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeActions {
	@Before
	public void beforeAction(Scenario scen) {
	 //Initializing Chrome Driver
		SetupDrivers.setupDriver();
		System.out.println(scen.getName());
		
	}
		
	}


