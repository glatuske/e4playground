package e4component;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

@Component
public class E4Component {

	@Activate
	public void activate() {
		System.out.println("activate");
	}

	@Deactivate
	public void deactivate() {
		System.out.println("deactivate");
	}

}
