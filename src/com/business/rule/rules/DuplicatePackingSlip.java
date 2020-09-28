package com.business.rule.rules;

public class DuplicatePackingSlip implements BusinessRules {

    @Override
    public String applyRule() {
        return "Duplicate packing slip for royalty department";
    }
}
