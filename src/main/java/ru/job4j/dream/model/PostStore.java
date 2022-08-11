package ru.job4j.dream.model;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PostStore {
    private static final PostStore INST = new PostStore();

    private final Map<Integer, Post> posts = new ConcurrentHashMap<>();

    private PostStore() {
        posts.put(1, new Post(1, "Junior Java Job", "Most comfortable", "19-01-2021"));
        posts.put(2, new Post(2, "Middle Java Job", "Most charisma", "10-05-2021"));
        posts.put(3, new Post(3, "Senior Java Job", "Most skill", "14-04-2021"));
    }

    public static PostStore instOf() {
        return INST;
    }

    public Collection<Post> findAll() {
        return posts.values();
    }
}
