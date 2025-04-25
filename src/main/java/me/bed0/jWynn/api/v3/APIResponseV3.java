package me.bed0.jWynn.api.v3;

import me.bed0.jWynn.api.APIResponse;

public class APIResponseV3<T> implements APIResponse<T> {
    private final T data;

    public APIResponseV3(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }


}
