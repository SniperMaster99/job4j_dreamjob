package ru.job4j.dream.store;

import net.jcip.annotations.ThreadSafe;
import org.springframework.stereotype.Repository;
import ru.job4j.dream.model.Candidate;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@ThreadSafe
@Repository
public class CandidateStore {
    private final AtomicInteger count = new AtomicInteger(0);
    private final Map<Integer, Candidate> candidates = new ConcurrentHashMap<>();

    public Collection<Candidate> findAll() {
        return candidates.values();
    }

    public void create(Candidate candidate) {
        candidate.setId(count.incrementAndGet());
        candidates.putIfAbsent(candidate.getId(), candidate);
    }

    public Candidate findById(int id) {
        return candidates.get(id);
    }

    public void update(Candidate candidate) {
        candidates.replace(candidate.getId(), candidate);
    }
}
