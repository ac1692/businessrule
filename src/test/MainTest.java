import com.business.rule.Main;
import com.business.rule.RuleFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.mock;

public class MainTest {

    @Test
    public void mainTest() {

        RuleFactory ruleFactory = mock(RuleFactory.class);
        Main.main(new String[]{});
        List<String> listOfRules = List.of("physical product", "book", "membership"
                ,"upgrade","Learning to ski");


        Assert.assertEquals(new Main().getRules(listOfRules),
                "Packing slip for shippingCommission payment generatedDuplicate packing slip for royalty departmentCommission payment generatedMembership ActivatedEmail sentMembership upgradedEmail sentPacking slip for shippingLearning video");
    }
}
