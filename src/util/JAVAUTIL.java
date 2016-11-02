package util;



import com.framework.device.TestContext;
import com.framework.events.IClient;
import com.framework.pages.DummyPage;

import events.IXPNEvents;

public class JAVAUTIL {

			public void ATHENAlogin(TestContext testContext)
			{   DummyPage dummyPage=new DummyPage(testContext);
				dummyPage.athenaelementsendtext(IXPNEvents.ATHENA_LOGIN_USERNAME, testContext.getxPathProperties().getProperty(IXPNEvents.ATHENA_USERNAME_CREDENTIALS));
				
				System.out.println("send text akhilesh");
				dummyPage.athenaelementsendtext(IXPNEvents.ATHENA_LOGIN_PASSWORD, testContext.getxPathProperties().getProperty(IXPNEvents.ATHENA_PASSWORD_CREDENTIALS));
				dummyPage.athenaverifyElementFound(IXPNEvents.ATHENA_LOGIN_BUTTON);
				dummyPage.athenaclick(IXPNEvents.ATHENA_LOGIN_BUTTON);
				
				//dummyPage.athenadefaultWaitTillElementAppear(IXPNEvents.ATHENA_GOT_IT, 0, 16000);
					dummyPage.defaultWait(15000);
				if(dummyPage.athenaisElementFound(IXPNEvents.ATHENA_GOT_IT))
					{dummyPage.athenaclick(IXPNEvents.ATHENA_GOT_IT);
					}
					dummyPage.athenadefaultwait(3000);
					if(dummyPage.athenaisElementFound(IXPNEvents.ATHENA_SKIP_TO_ATHENA))
					{
					dummyPage.athenaclick(IXPNEvents.ATHENA_SKIP_TO_ATHENA);
					}
				if(dummyPage.athenaisElementFound(IXPNEvents.ATHENA_START_RECEIVING_CHATS_BUTTON))
				{
				dummyPage.athenaclick(IXPNEvents.ATHENA_START_RECEIVING_CHATS_BUTTON);
				}
				dummyPage.defaultWait(7000);
				if(dummyPage.athenaisElementFound(IXPNEvents.ATHENA_HELPSECTION_DROPDOWN_BUTTON)==false)
				{dummyPage.athenadefaultWaitTillElementAppear(IXPNEvents.ATHENA_HELPSECTION_DROPDOWN_BUTTON, 0, 10000);
				}
				
			}
			
			
}
