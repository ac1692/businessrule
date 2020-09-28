package main.com.business.rule;

import main.com.business.rule.rules.*;

import java.util.ArrayList;
import java.util.List;

public class RuleFactory {

    public List<BusinessRules> getRules(String rule) {
        List<BusinessRules> rulesList = new ArrayList<>();

        switch (rule.toLowerCase()) {
            case "physical product":
                rulesList.add(new PackingSlip());
                rulesList.add(new Commission());
                break;
            case "book":
                rulesList.add(new DuplicatePackingSlip());
                rulesList.add(new Commission());
                break;
            case "membership":
                rulesList.add(new ActivateMembership());
                rulesList.add(new SendEmail());
                break;
            case "upgrade":
                rulesList.add(new UpgradeMembership());
                rulesList.add(new SendEmail());
                break;
            case "learning to ski":
                rulesList.add(new PackingSlip());
                rulesList.add(new SendVideo());
                break;
            default:
                break;
        }
        return rulesList;
    }
}
