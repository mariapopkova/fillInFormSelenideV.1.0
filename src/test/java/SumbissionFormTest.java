import org.testng.Assert;
import org.testng.annotations.Test;

public class SumbissionFormTest extends BaseTest {
    private final static String BASE_URL = "https://demoqa.com/automation-practice-form";
    private final static String EXPECTED_TEXT = "Thanks for submitting the form";


    @Test
    public void checkSubmission(){
        FillInFormByEmployee fillInFormByEmployee = new FillInFormByEmployee(BASE_URL);
        Assert.assertEquals(fillInFormByEmployee.fillInForm(),EXPECTED_TEXT);
    }

}
