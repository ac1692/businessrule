package main.com.business.rule.rules;

public class SendEmail implements BusinessRules {

    @Override
    public String applyRule() {
        return "Email sent";
    }
}