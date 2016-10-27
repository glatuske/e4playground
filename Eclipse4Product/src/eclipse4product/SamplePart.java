
package eclipse4product;

import javax.annotation.PostConstruct;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class SamplePart {

	@PostConstruct
	public void postConstruct(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new RowLayout());

		Label label = new Label(composite, SWT.NONE);
		label.setText("Some Text");

		Button button = new Button(composite, SWT.NONE);
		button.setText("Change Text");
		button.addListener(SWT.Selection, event -> label.setText("Some other Text"));
	}

}