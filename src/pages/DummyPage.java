package pages;

import java.util.List;

import com.framework.device.TestContext;
import com.framework.pages.BasePage;

public class DummyPage extends BasePage{

	public DummyPage(TestContext testContext) {
		super(testContext);
	}
	public DummyPage(TestContext testContext, List<String> extraList) {
		super(testContext, extraList);
	}

}
