package com.pap.similarity.tf;

import org.apache.lucene.search.similarities.Similarity;
import org.elasticsearch.Version;
import org.elasticsearch.common.TriFunction;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.script.ScriptService;

public class TfSimilarityProvider implements TriFunction<Settings, Version, ScriptService, Similarity> {

    TfSimilarityProvider() {
    }

    @Override
    public Similarity apply(Settings settings, Version version, ScriptService scriptService) {
        return new TfSimilarity();
    }

}
