package com.pap.similarity.tf;


import org.elasticsearch.index.IndexModule;
import org.elasticsearch.plugins.Plugin;

public class TfSimilarityPlugin extends Plugin {

    @Override
    public void onIndexModule(IndexModule indexModule) {
        indexModule.addSimilarity("tf_similarity", new TfSimilarityProvider());
    }

}
