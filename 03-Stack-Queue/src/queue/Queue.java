package queue;

/**
 * 队列
 *
 * @author carl
 * @version 2020/8/4
 */
public interface Queue<E> {

    /**
     * 获取队列的大小
     *
     * @param
     * @return int
     * @author carl
     * @version 2020/8/4
     */
    int getSize();

    /**
     * 查看队列是否为空
     *
     * @param
     * @return boolean
     * @author carl
     * @version 2020/8/4
     */
    boolean isEmpty();

    /**
     * 将一个元素插入队尾
     *
     * @param e
     * @return void
     * @author carl
     * @version 2020/8/4
     */
    void enqueue(E e);

    /**
     * 将队首一个元素移除队列
     *
     * @param
     * @return E
     * @author carl
     * @version 2020/8/4
     */
    E dequeue();

    /**
     * 获取队首的一个元素
     *
     * @param
     * @return E
     * @author carl
     * @version 2020/8/4
     */
    E getFront();
}
