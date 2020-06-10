package com.sarakeal.mydb.index;

/**
 * @author sliu
 * @description B树抽象节点
 * @date 2020-06-10
 */
public abstract class AbstractBTreeNode<K extends Comparable<K>> {

    protected final int degree;

    public AbstractBTreeNode(int degree) {

        this.degree = degree;
    }

    public abstract boolean isLeaf();

    public abstract K search(K key);

    protected void insertKey(K key) {

    }

    protected K deleteKey(K key) {


        return null;
    }

    protected K deleteKey(int index) {

        return null;
    }

    protected boolean existKey(K key) {
        return false;
    }

    protected void replaceKey(K oldKey, K newKey) {

    }

    protected abstract K setKey(K newKey, int oldKeyIndex);

    protected abstract void setChild(AbstractBTreeNode<K> childNode, int index);

    protected void insertChild(AbstractBTreeNode<K> child, int index) {

    }

    protected abstract AbstractBTreeNode<K> getChild(int index);

    protected void deleteChild(AbstractBTreeNode<K> child) {

    }

    protected AbstractBTreeNode<K> deleteChild(int index) {

        return null;
    }

    public abstract int getKeySize();

    public abstract int getChildSize();

    protected int indexOfKey(K key) {
        return -1;
    }

    protected boolean isFull() {

        return false;
    }
}
