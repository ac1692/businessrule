import com.business.rule.RuleFactory;
import com.business.rule.rules.BusinessRules;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class RuleFactoryTest {

    private final RuleFactory ruleFactory = new RuleFactory();
    private static final String DUPLICATE_SLIP = "Duplicate packing slip for royalty department";
    private static final String BOOK = "book";
    private static final String PHYSICAL_PRODUCT = "physical product";
    private static final String COMMISSION = "Commission payment generated";
    private static final String PACKING_SLIP = "Packing slip for shipping";
    private static final String MEMBERSHIP = "membership";
    private static final String ACTIVATE_MEMBERSHIP = "Membership Activated";
    private static final String SEND_EMAIL = "Email sent";
    private static final String UPGRADE = "upgrade";
    private static final String UPGRADE_MEMBERSHIP = "Membership upgraded";
    private static final String LEARN_SKI = "learning to ski";
    private static final String LEARNING_VIDEO = "Learning video";

    @Test
    public void testGetPhysicalProduct() {
        List<BusinessRules> list = ruleFactory.getRules(PHYSICAL_PRODUCT);

        Assert.assertEquals(list.get(0).applyRule(), PACKING_SLIP);
        Assert.assertEquals(list.get(1).applyRule(), COMMISSION);
    }

    @Test
    public void testGetRulesBook() {
        List<BusinessRules> list = ruleFactory.getRules(BOOK);

        Assert.assertEquals(list.get(0).applyRule(), DUPLICATE_SLIP);
        Assert.assertEquals(list.get(1).applyRule(), COMMISSION);
    }

    @Test
    public void testGetMembership() {
        List<BusinessRules> list = ruleFactory.getRules(MEMBERSHIP);

        Assert.assertEquals(list.get(0).applyRule(), ACTIVATE_MEMBERSHIP);
        Assert.assertEquals(list.get(1).applyRule(), SEND_EMAIL);
    }

    @Test
    public void testGetUpgrade() {
        List<BusinessRules> list = ruleFactory.getRules(UPGRADE);

        Assert.assertEquals(list.get(0).applyRule(), UPGRADE_MEMBERSHIP);
        Assert.assertEquals(list.get(1).applyRule(), SEND_EMAIL);
    }

    @Test
    public void testGetLearningSki() {
        List<BusinessRules> list = ruleFactory.getRules(LEARN_SKI);

        Assert.assertEquals(list.get(0).applyRule(), PACKING_SLIP);
        Assert.assertEquals(list.get(1).applyRule(), LEARNING_VIDEO);
    }
}
