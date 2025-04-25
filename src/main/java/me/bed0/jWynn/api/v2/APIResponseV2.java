package me.bed0.jWynn.api.v2;

import me.bed0.jWynn.api.APIResponse;

public class APIResponseV2<T> implements APIResponse<T> {

    private final String kind;
    private final int code;
    private final String message;
    private final long timestamp;
    private final String version;
    private final T data;

    public APIResponseV2(String kind, int code, String message, long timestamp, String version, T data) {
        this.kind = kind;
        this.code = code;
        this.message = message;
        this.timestamp = timestamp;
        this.version = version;
        this.data = data;
    }

    public String getKind() {
        return kind;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public T getData() {
        return data;
    }
}
