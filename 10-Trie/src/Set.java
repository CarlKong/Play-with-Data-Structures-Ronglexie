/**
 * 集合
 *
 * @author carl
 * @version 2020/8/18
 */
public interface Set<E> {

    /**
     * 向集合中添加元素
     *
     * @param e
     * @return void
     * @author carl
     * @version 2020/8/18
     */
    void add(E e);

    /**
     * 删除集合中的某个元素
     *
     * @param e
     * @return void
     * @author carl
     * @version 2020/8/18
     */
    void remove(E e);

    /**
     * 查看是否包含某个元素
     *
     * @param e
     * @return boolean
     * @author carl
     * @version 2020/8/18
     */
    boolean contains(E e);

    /**
     * 获取集合的大小
     *
     * @param
     * @return int
     * @author carl
     * @version 2020/8/18
     */
    int getSize();

    /**
     * 判断集合是否为空
     *
     * @param
     * @return boolean
     * @author carl
     * @version 2020/8/18
     */
    boolean isEmpty();
}
