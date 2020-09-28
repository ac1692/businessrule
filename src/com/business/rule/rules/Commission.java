package main.com.business.rule.rules;

public class Commission implements BusinessRules {

    @Override
    public String applyRule() {
        return "Commission payment generated";
    }
}
