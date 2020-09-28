package main.com.business.rule.rules;

public class UpgradeMembership implements BusinessRules {

    @Override
    public String applyRule() {
        return "Membership upgraded";
    }
}