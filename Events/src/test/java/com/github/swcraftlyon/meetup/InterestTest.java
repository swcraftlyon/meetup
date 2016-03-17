package com.github.swcraftlyon.meetup;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InterestTest {

    private Interest interest;

    @Before
    public void setUp() throws Exception {
        interest = new Interest("Interest");
    }

    @Test
    public void testIsRoot(){
        assertThat(interest.isRoot()).isTrue();
    }

    @Test
    public void testGetDescription() {
        assertThat(interest.getDescription()).isEqualTo("interest");
    }

    @Test
    public void testSetDescription() {
        interest.setDescription("Rename");
        assertThat(interest.getDescription()).isEqualTo("rename");
    }

    @Test
    public void testGetParentOfRootReturnsSelf() {
        assertThat(interest.getParent()).isEqualTo(interest);
    }

    @Test
    public void testAddChildWithNoDuplication() {
        assertThat(interest.addChild("interestChild1")).isTrue();
        assertThat(interest.addChild("interestChild2")).isTrue();
        assertThat(interest.addChild("interestChild2")).isFalse();
        assertThat(interest.getChildren().size()).isEqualTo(2);
        for (Object next : interest.getChildren()) {
            Interest child = (Interest) next;
            assertThat(child.getParent()).isEqualTo(interest);
            assertThat(child.isRoot()).isFalse();
        }
    }
}
