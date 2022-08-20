package ru.job4j.dream.model;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CandidateStore {
    private static final CandidateStore INST = new CandidateStore();
    private static int count = 0;

    private final Map<Integer, Candidate> candidates = new ConcurrentHashMap<>();

    public CandidateStore() {
    }

    public static CandidateStore instOf() {
        return INST;
    }

    public Collection<Candidate> findAll() {
        return candidates.values();
    }

    public void create(Candidate candidate) {
        candidates.put(count++, candidate);
    }

    public Candidate findById(int id) {
        Candidate result = new Candidate();
        for (Candidate candidate: candidates.values()) {
            if (candidate.getId() == id) {
                result = candidate;
            }
        }
        return result;
    }

    public void update(Candidate candidate) {
        candidates.put(candidate.getId(), candidate);
    }
}
