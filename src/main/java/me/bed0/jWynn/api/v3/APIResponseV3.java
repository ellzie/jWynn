package me.bed0.jWynn.api.v3;

public class APIResponseV3<T> {
    private T data;

    public APIResponseV3(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }


}
