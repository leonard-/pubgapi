package com.github.gplnature.pubgapi.api;

import com.github.gplnature.pubgapi.exception.PubgClientException;


public interface ResponseCallback<T> {

    void onResponse(T t);

    void onError(PubgClientException pubgClientException);
}
