package main.com.business.rule.rules;

public class ActivateMembership implements BusinessRules {

    @Override
    public String applyRule() {
        return "Membership Activated";
    }
}
