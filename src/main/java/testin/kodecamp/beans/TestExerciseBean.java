package testin.kodecamp.beans;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ConversationScoped
public class TestExerciseBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private TestUnitTest test1 = new TestUnitTest("What is your name ?");
	private TestUnitTest test2 = new TestUnitTest("Where do you live ?");
	private TestUnitTest test3 = new TestUnitTest("What is your qualification ?");

	@Inject
	private Conversation conversation;

	@PostConstruct
	public void init() {
		this.startConversation();
	}

	private void startConversation() {
		if (this.conversation.isTransient()) {
			System.out.println("Starting Conversation...");
			this.conversation.begin();
		}

	}

	private void stopConversation() {
		if (!this.conversation.isTransient()) {
			System.out.println("Ending Conversation...");
			this.conversation.end();
		}

	}


	public TestUnitTest getTest1() {
		return test1;
	}

	public void setTest1(TestUnitTest test1) {
		this.test1 = test1;
	}

	public TestUnitTest getTest2() {
		return test2;
	}

	public void setTest2(TestUnitTest test2) {
		this.test2 = test2;
	}

	public TestUnitTest getTest3() {
		return test3;
	}

	public void setTest3(TestUnitTest test3) {
		this.test3 = test3;
	}

	public String submit() {
		System.out.println(this.test1);
		System.out.println(this.test2);
		System.out.println(this.test3);
		this.stopConversation();
		return "/testviews/testindex";
	}

}
