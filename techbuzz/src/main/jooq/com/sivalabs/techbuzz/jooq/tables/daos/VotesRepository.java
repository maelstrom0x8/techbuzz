/*
 * This file is generated by jOOQ.
 */
package com.sivalabs.techbuzz.jooq.tables.daos;


import com.sivalabs.techbuzz.jooq.tables.Votes;
import com.sivalabs.techbuzz.jooq.tables.pojos.JooqVotes;
import com.sivalabs.techbuzz.jooq.tables.records.VotesRecord;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class VotesRepository extends DAOImpl<VotesRecord, JooqVotes, Long> {

    /**
     * Create a new VotesRepository without any configuration
     */
    public VotesRepository() {
        super(Votes.VOTES, JooqVotes.class);
    }

    /**
     * Create a new VotesRepository with an attached configuration
     */
    @Autowired
    public VotesRepository(Configuration configuration) {
        super(Votes.VOTES, JooqVotes.class, configuration);
    }

    @Override
    public Long getId(JooqVotes object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<JooqVotes> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Votes.VOTES.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<JooqVotes> fetchById(Long... values) {
        return fetch(Votes.VOTES.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public JooqVotes fetchOneById(Long value) {
        return fetchOne(Votes.VOTES.ID, value);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Optional<JooqVotes> fetchOptionalById(Long value) {
        return fetchOptional(Votes.VOTES.ID, value);
    }

    /**
     * Fetch records that have <code>user_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<JooqVotes> fetchRangeOfUserId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Votes.VOTES.USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>user_id IN (values)</code>
     */
    public List<JooqVotes> fetchByUserId(Long... values) {
        return fetch(Votes.VOTES.USER_ID, values);
    }

    /**
     * Fetch records that have <code>post_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<JooqVotes> fetchRangeOfPostId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Votes.VOTES.POST_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>post_id IN (values)</code>
     */
    public List<JooqVotes> fetchByPostId(Long... values) {
        return fetch(Votes.VOTES.POST_ID, values);
    }

    /**
     * Fetch records that have <code>val BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<JooqVotes> fetchRangeOfVal(BigDecimal lowerInclusive, BigDecimal upperInclusive) {
        return fetchRange(Votes.VOTES.VAL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>val IN (values)</code>
     */
    public List<JooqVotes> fetchByVal(BigDecimal... values) {
        return fetch(Votes.VOTES.VAL, values);
    }

    /**
     * Fetch records that have <code>created_at BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<JooqVotes> fetchRangeOfCreatedAt(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Votes.VOTES.CREATED_AT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>created_at IN (values)</code>
     */
    public List<JooqVotes> fetchByCreatedAt(LocalDateTime... values) {
        return fetch(Votes.VOTES.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>updated_at BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<JooqVotes> fetchRangeOfUpdatedAt(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Votes.VOTES.UPDATED_AT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>updated_at IN (values)</code>
     */
    public List<JooqVotes> fetchByUpdatedAt(LocalDateTime... values) {
        return fetch(Votes.VOTES.UPDATED_AT, values);
    }
}
