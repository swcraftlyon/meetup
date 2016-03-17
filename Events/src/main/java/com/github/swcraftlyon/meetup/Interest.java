package com.github.swcraftlyon.meetup;

import java.util.HashSet;
import java.util.Set;

public class Interest {
    private String description;
    private Interest parent = null;
    private final Set<Interest> children = new HashSet<Interest>();

    public Interest(String description) {
        setDescription(description);
    }

    public void setDescription(String description) {
        this.description = description.toLowerCase();
    }

    public String getDescription() {
        return description;
    }

    public Interest getParent() {
        return parent;
    }

    public boolean addChild(String interest) {
        Interest child = new Interest(interest);
        child.parent = this;
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

        return description.equals(interest.description) && (parent != null ? parent.equals(interest.parent) : interest.parent == null);

    }

    @Override
    public int hashCode() {
        int result = description.hashCode();
        result = 31 * result + (parent != null ? parent.hashCode() : 0);
        return result;
    }
}
