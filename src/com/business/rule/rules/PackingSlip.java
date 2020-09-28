package main.com.business.rule.rules;

public class PackingSlip implements BusinessRules {

    @Override
    public String applyRule() {
        return "Packing slip for shipping";
    }
}
