package com.business.rule;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> listOfRules = List.of("physical product", "book", "membership"
                ,"upgrade","Learning to ski");

        Main main = new Main();
        System.out.println(main.getRules(listOfRules));
    }

    public String getRules(List<String> listOfRules) {
        StringBuilder sb= new StringBuilder();
        RuleFactory ruleFactory = new RuleFactory();
        listOfRules.forEach(rule->
                ruleFactory.getRules(rule).forEach(r -> sb.append(r.applyRule())));
        return sb.toString();
    }}
