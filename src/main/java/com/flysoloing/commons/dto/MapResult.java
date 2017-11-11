package com.flysoloing.commons.dto;

import java.util.HashMap;
import java.util.Map;

/**
 * Map类型返回结果类
 *
 * @author laitao
 * @since 2015-03-18 15:03:00
 */
public class MapResult<K, V> extends AbstractResult {

    private static final long serialVersionUID = -9058256094590002360L;

    private Map<K, V> map = new HashMap<K, V>();

    public Map<K, V> getMap() {
        return map;
    }

    public void setMap(Map<K, V> map) {
        this.map = map;
    }

    public V put(K key, V value) {
        return this.map.put(key, value);
    }

    public V remove(K key) {
        return this.map.remove(key);
    }

    public V get(K key) {
        return this.map.get(key);
    }
}
