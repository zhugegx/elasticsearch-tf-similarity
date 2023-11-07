package com.pap.similarity.tf;

import org.elasticsearch.index.similarity.SimilarityModule;
import org.elasticsearch.plugins.Plugin;

public class TfSimilarityPlugin extends Plugin {

    @Override
    public String name() {
        return "tf-similarity";
    }

    @Override
    public String description() {
        return "tf-similarity-plugin";
    }

    public void onModule(SimilarityModule module) {
        module.addSimilarity("tf-similarity",TfSimilarityProvider.class);
    }
}