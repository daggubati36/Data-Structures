package com.passion2code.datastructures.linkedList;

public class NodeV2<T> {
    private T data;
    private NodeV2<T> previousNode;
    private NodeV2<T> nextNode;

    public NodeV2(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public NodeV2<T> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(NodeV2<T> previousNode) {
        this.previousNode = previousNode;
    }

    public NodeV2<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(NodeV2<T> nextNode) {
        this.nextNode = nextNode;
    }
}
