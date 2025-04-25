package me.bed0.jWynn.api.v1;

import me.bed0.jWynn.api.APIResponse;

public class APIResponseV1<T> implements APIResponse<T> {

    private final APIResponseV1Request request;
    private final T data;

    public APIResponseV1(APIResponseV1Request request, T data) {
        this.request = request;
        this.data = data;
    }

    public String getVersion() {
        return request.getVersion();
    }

    public long getTimestamp() {
        return request.getTimestamp();
    }

    @Override
    public T getData() {
        return data;
    }
}
