package net.pubgapi.api;

import net.pubgapi.exception.PubgClientException;

public interface ResponseCallback<T> {

    void onResponse(T t);

    void onError(PubgClientException pubgClientException);
    
}
