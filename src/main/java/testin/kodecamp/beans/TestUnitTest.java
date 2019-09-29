package testin.kodecamp.beans;

public class TestUnitTest {
	private String question;
	private String answer;

	public TestUnitTest(final String question, final String answer) {
		this.question = question;
		this.answer = answer;
	}
	public TestUnitTest(final String question) {
		this.question = question;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "TestUnitTest [question=" + question + ", answer=" + answer + "]";
	}
	
	
}
