package com.javaded.config;

import com.jcabi.xml.XML;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public final class TextXpath {

    private final XML xml;
    private final String node;

    @Override
    public String toString() {
        return this.xml.nodes(this.node)
                .getFirst()
                .xpath("text()")
                .getFirst();
    }

}
