package com.github.swcraftlyon.meetup;

import java.util.HashSet;
import java.util.Set;

public class Interest {
    private boolean isRoot;
    private String description;
    private Interest parent = null;
    private final Set<Interest> children = new HashSet<Interest>();

    public Interest(String description) {
        setDescription(description);
        this.isRoot = true;
    }

    public boolean isRoot() {
        return isRoot;
    }

    public void setDescription(String description) {
        this.description = description.toLowerCase();
    }

    public String getDescription() {
        return description;
    }

    public Interest getParent() {
        if (parent == null)
            return this;
        return parent;
    }

    public boolean addChild(String interest) {
        Interest child = new Interest(interest);
        child.parent = this;
        child.isRoot = false;
        return children.add(child);
    }

    public Set getChildren() {
        return children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Interest interest = (Interest) o;

        return isRoot == interest.isRoot && description.equals(interest.description)
                && (parent != null ? parent.equals(interest.parent) : interest.parent == null);
    }

    @Override
    public int hashCode() {
        int result = (isRoot ? 1 : 0);
        result = 31 * result + description.hashCode();
        result = 31 * result + (parent != null ? parent.hashCode() : 0);
        return result;
    }
}
