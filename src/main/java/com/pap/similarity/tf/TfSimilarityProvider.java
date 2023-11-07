package com.pap.similarity.tf;

import org.apache.lucene.search.similarities.Similarity;

import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.inject.assistedinject.Assisted;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.index.similarity.AbstractSimilarityProvider;

public class TfSimilarityProvider extends AbstractSimilarityProvider {

    private Similarity similarity;

    public TfSimilarityProvider(String name) {
        super(name);
    }

    @Inject
    public TfSimilarityProvider(@Assisted String name, @Assisted Settings settings) {
        super(name);
        this.similarity = TfSimilarity.getSim();
    }

    @Override
    public Similarity get() {
        return similarity;
    }

}