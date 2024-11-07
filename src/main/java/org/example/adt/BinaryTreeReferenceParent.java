package org.example.adt;

public class BinaryTreeReferenceParent implements BinaryTree {
    private final int root;
    private BinaryTreeReferenceParent left;
    private BinaryTreeReferenceParent right;
    private BinaryTreeReferenceParent parent; // Referencia al nodo padre

    public BinaryTreeReferenceParent(int root) {
        this.root = root;
    }

    public BinaryTreeReferenceParent (int root, BinaryTreeReferenceParent parent) {
        this.root = root;
        this.parent = parent;
    }

    @Override
    public int getRoot() {

        return root;
    }

    @Override
    public void addLeft(int value) {
        if (this.left != null) {
            throw new RuntimeException("Ya existe un hijo izquierdo");
        }
        this.left = new BinaryTreeReferenceParent (value, this); // Asignar el nodo actual como padre

    }

    @Override
    public void addRight(int value) {
        if (this.right != null) {
            throw new RuntimeException("Ya existe un hijo derecho");
        }
        this.right = new BinaryTreeReferenceParent (value, this); // Asignar el nodo actual como padre

    }

    @Override
    public BinaryTree getLeft() {
        return this.left;
    }

    @Override
    public BinaryTree getRight() {
        return this.right;
    }

    @Override
    public void deleteLeft() {
        this.left = null;

    }

    @Override
    public void deleteRight() {
        this.right = null;

    }
}
