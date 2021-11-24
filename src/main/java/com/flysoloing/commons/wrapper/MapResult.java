package com.flysoloing.commons.wrapper;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Map类型返回结果类
 *
 * @author laitao
 * @date 2015-03-18 15:03:00
 */
public class MapResult<T> extends Result implements Serializable {

    private static final long serialVersionUID = -6735175977188647965L;

    private Map<String, T> map = new HashMap<String, T>();

    public MapResult() {
    }

    public MapResult(String code, String message) {
        super(code, message);
    }

    public MapResult(String code, String message, Map<String, T> map) {
        super(code, message);
        this.map = map;
    }

    public Map<String, T> getMap() {
        return map;
    }

    public void setMap(Map<String, T> map) {
        this.map = map;
    }

    public T put(String key, T value) {
        return this.map.put(key, value);
    }

    public T remove(String key) {
        return this.map.remove(key);
    }

    public T get(String key) {
        return this.map.get(key);
    }

    public static <T> MapResult<T> build(String code, String message, Map<String, T> map) {
        return new MapResult<>(code, message, map);
    }
}
