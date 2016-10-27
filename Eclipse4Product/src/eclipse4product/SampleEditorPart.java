
package eclipse4product;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class SampleEditorPart {

	@Inject
	MPart part;

	@PostConstruct
	public void postConstruct(Composite parent) {
		Text text = new Text(parent, SWT.MULTI | SWT.BORDER);
		text.setText("Some Text");

		this.part.setLabel("Title");
	}

}