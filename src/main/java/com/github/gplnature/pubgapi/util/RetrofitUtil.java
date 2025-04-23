package com.github.gplnature.pubgapi.util;

import com.github.gplnature.pubgapi.api.ResponseCallback;
import com.github.gplnature.pubgapi.exception.PubgClientException;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

public class RetrofitUtil {

    public static <T> T getResponse(Call<T> call) throws PubgClientException {
        try {
            Response<T> response = call.execute();
            return getBody(response);
        } catch (IOException e) {
            throw new PubgClientException(e);
        }
    }

    public static <T> void getResponseAsync(Call<T> call, ResponseCallback<T> responseCallback) {
        call.enqueue(new Callback<T>() {
            @Override
            public void onResponse(Call<T> call, Response<T> response) {
                try {
                    responseCallback.onResponse(getBody(response));
                } catch (PubgClientException exception) {
                    responseCallback.onError(exception);
                }
            }

            @Override
            public void onFailure(Call<T> call, Throwable t) {
                responseCallback.onError(new PubgClientException(t));
            }
        });
    }

    private static <T> T getBody(Response<T> response) throws PubgClientException {
        if (!response.isSuccessful()) {
            String errorMessage = "HTTP " + response.code();

            try {
                if (response.errorBody() != null) {
                    errorMessage += ": " + response.errorBody().string();
                }
            } catch (IOException e) {
                errorMessage += ": [error reading error body]";
            }

            throw new PubgClientException(errorMessage, response.code());
        }

        if (response.body() == null) {
            throw new PubgClientException("Empty body", response.code());
        }

        return response.body();
    }
}
