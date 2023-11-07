package com.pap.similarity.tf;

import org.apache.lucene.search.similarities.TFIDFSimilarity;

public class TfSimilarity extends TFIDFSimilarity {

    @Override
    public float tf(float v) {
        return v;
    }

    @Override
    public float idf(long l, long l1) {
        return 1;
    }

    @Override
    public float lengthNorm(int i) {
        return 1;
    }
}
