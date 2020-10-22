package map;

/**
 * 映射
 *
 * @author carl
 * @version 2020/8/19
 */
public interface Map<K, V> {

    /**
     * 添加元素
     *
     * @param key
     * @param value
     * @return void
     * @author carl
     * @version 2020/8/19
     */
    void add(K key, V value);

    /**
     * 删除元素
     *
     * @param key
     * @return V
     * @author carl
     * @version 2020/8/19
     */
    V remove(K key);

    /**
     * 查看是否包含某个key
     *
     * @param key
     * @return boolean
     * @author carl
     * @valueersion 2020/8/19
     */
    boolean contains(K key);

    /**
     * 获取某个key对应的value
     *
     * @param key
     * @return V
     * @author carl
     * @valueersion 2020/8/19
     */
    V get(K key);

    /**
     * 更新某个key对应的value
     *
     * @param key
     * @param value
     * @return void
     * @author carl
     * @version 2020/8/19
     */
    void set(K key, V value);

    /**
     * 获取大小
     *
     * @param
     * @return int
     * @author carl
     * @version 2020/8/19
     */
    int getSize();

    /**
     * 查看是否为空
     *
     * @param
     * @return boolean
     * @author carl
     * @version 2020/8/19
     */
    boolean isEmpty();
}
