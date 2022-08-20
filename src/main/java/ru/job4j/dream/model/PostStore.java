package ru.job4j.dream.model;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PostStore {
    private static final PostStore INST = new PostStore();
    private static int count = 0;
    private final Map<Integer, Post> posts = new ConcurrentHashMap<>();

    private PostStore() {
    }

    public static PostStore instOf() {
        return INST;
    }

    public Collection<Post> findAll() {
        return posts.values();
    }

    public void create(Post post) {
        posts.put(count++, post);
    }

    public Post findById(int id) {
        Post result = new Post();
        for (Post post : posts.values()) {
            if (post.getId() == id) {
                result = post;
            }
        }
        return result;
    }

    public void update(Post post) {
        posts.put(post.getId(), post);
    }

}
