package ru.job4j.dream.store;

import net.jcip.annotations.ThreadSafe;
import org.springframework.stereotype.Repository;
import ru.job4j.dream.model.City;
import ru.job4j.dream.model.Post;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@ThreadSafe
@Repository
public class PostStore {
    private final AtomicInteger count = new AtomicInteger(0);
    private final Map<Integer, Post> posts = new ConcurrentHashMap<>();

    public Collection<Post> findAll() {
        return posts.values();
    }

    public void create(Post post) {
        post.setId(count.incrementAndGet());
        posts.putIfAbsent(post.getId(), post);
    }

    public Post findById(int id) {
        return posts.get(id);
    }

    public void update(Post post) {
        posts.replace(post.getId(), post);
    }

    public String findByCity(int id) {
       return posts.get(id).getCity().getName();
    }

}
