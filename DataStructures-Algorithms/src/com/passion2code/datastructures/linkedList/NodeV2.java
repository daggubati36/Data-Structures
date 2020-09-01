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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NodeV2<T> other = (NodeV2<T>) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		return true;
	}
    
    
}
