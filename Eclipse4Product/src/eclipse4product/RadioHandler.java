
package eclipse4product;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;

public class RadioHandler {

	@Execute
	public void execute() {

	}

	@CanExecute
	public boolean canExecute() {
		return true;
	}

}