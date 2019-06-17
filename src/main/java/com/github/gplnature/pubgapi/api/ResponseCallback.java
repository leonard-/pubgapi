package com.pubgapi.api;

import com.pubgapi.exception.PubgClientException;

public interface ResponseCallback<T> {

    void onResponse(T t);

    void onError(PubgClientException pubgClientException);
}
