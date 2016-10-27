
package eclipse4plugin.handlers;

import org.eclipse.e4.core.di.annotations.Execute;

public class SaveHandler {

	@Execute
	public void execute() {
		System.out.println("Save");
	}

}