package com.mjc.stage2.parser;


import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponentType;

public class WordParser extends AbstractTextParser {

    // Write your code here!

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        char[] chars = string.toCharArray();
        for (char c : chars
        ){
            abstractTextComponent.add(new SymbolLeaf(c, TextComponentType.WORD));
        }

    }
}
