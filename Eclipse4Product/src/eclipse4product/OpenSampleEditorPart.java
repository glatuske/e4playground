
package eclipse4product;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.workbench.IWorkbench;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;

public class OpenSampleEditorPart {
	@Inject
	private IWorkbench workbench;

	@Execute
	public void execute(EPartService partService, EModelService modelService, MApplication application) {
		MPart part = partService.createPart("eclipse4product.partdescriptor.0");

		MPartStack partStack = (MPartStack) modelService.find("eclipse4product.partstack.0", application);
		partStack.getChildren().add(part);

		partService.showPart(part, PartState.ACTIVATE);
		Object object = part.getObject();
	}

}