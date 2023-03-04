package com.design.u044.E;

import com.design.u044.IRuleConfigParser;
import com.design.u044.JsonRuleConfigParser;

public class JsonRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser(String configFormat) {
        return new JsonRuleConfigParser();
    }
}
