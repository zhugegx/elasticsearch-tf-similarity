package com.pap.similarity.tf;

import org.apache.lucene.search.similarities.ClassicSimilarity;

public class TfSimilarity extends ClassicSimilarity {

    private final static TfSimilarity sim = new TfSimilarity();

    public static TfSimilarity getSim(){
        return sim;
    }

    @Override
    public float idf(long l, long l1) {
        return 1f;
    }

}