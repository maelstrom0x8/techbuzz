/*
 * This file is generated by jOOQ.
 */
package com.sivalabs.techbuzz.jooq.tables;


import com.sivalabs.techbuzz.jooq.Keys;
import com.sivalabs.techbuzz.jooq.Public;
import com.sivalabs.techbuzz.jooq.tables.records.PostsRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function8;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Posts extends TableImpl<PostsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.posts</code>
     */
    public static final Posts POSTS = new Posts();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PostsRecord> getRecordType() {
        return PostsRecord.class;
    }

    /**
     * The column <code>public.posts.id</code>.
     */
    public final TableField<PostsRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.posts.title</code>.
     */
    public final TableField<PostsRecord, String> TITLE = createField(DSL.name("title"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>public.posts.url</code>.
     */
    public final TableField<PostsRecord, String> URL = createField(DSL.name("url"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.posts.content</code>.
     */
    public final TableField<PostsRecord, String> CONTENT = createField(DSL.name("content"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.posts.created_by</code>.
     */
    public final TableField<PostsRecord, Long> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.posts.cat_id</code>.
     */
    public final TableField<PostsRecord, Long> CAT_ID = createField(DSL.name("cat_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.posts.created_at</code>.
     */
    public final TableField<PostsRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.posts.updated_at</code>.
     */
    public final TableField<PostsRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), SQLDataType.LOCALDATETIME(6), this, "");

    private Posts(Name alias, Table<PostsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Posts(Name alias, Table<PostsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.posts</code> table reference
     */
    public Posts(String alias) {
        this(DSL.name(alias), POSTS);
    }

    /**
     * Create an aliased <code>public.posts</code> table reference
     */
    public Posts(Name alias) {
        this(alias, POSTS);
    }

    /**
     * Create a <code>public.posts</code> table reference
     */
    public Posts() {
        this(DSL.name("posts"), null);
    }

    public <O extends Record> Posts(Table<O> child, ForeignKey<O, PostsRecord> key) {
        super(child, key, POSTS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<PostsRecord, Long> getIdentity() {
        return (Identity<PostsRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<PostsRecord> getPrimaryKey() {
        return Keys.POSTS_PKEY;
    }

    @Override
    public List<ForeignKey<PostsRecord, ?>> getReferences() {
        return Arrays.asList(Keys.POSTS__POSTS_CREATED_BY_FKEY, Keys.POSTS__POSTS_CAT_ID_FKEY);
    }

    private transient Users _users;
    private transient Categories _categories;

    /**
     * Get the implicit join path to the <code>public.users</code> table.
     */
    public Users users() {
        if (_users == null)
            _users = new Users(this, Keys.POSTS__POSTS_CREATED_BY_FKEY);

        return _users;
    }

    /**
     * Get the implicit join path to the <code>public.categories</code> table.
     */
    public Categories categories() {
        if (_categories == null)
            _categories = new Categories(this, Keys.POSTS__POSTS_CAT_ID_FKEY);

        return _categories;
    }

    @Override
    public Posts as(String alias) {
        return new Posts(DSL.name(alias), this);
    }

    @Override
    public Posts as(Name alias) {
        return new Posts(alias, this);
    }

    @Override
    public Posts as(Table<?> alias) {
        return new Posts(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Posts rename(String name) {
        return new Posts(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Posts rename(Name name) {
        return new Posts(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Posts rename(Table<?> name) {
        return new Posts(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, String, String, String, Long, Long, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function8<? super Long, ? super String, ? super String, ? super String, ? super Long, ? super Long, ? super LocalDateTime, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function8<? super Long, ? super String, ? super String, ? super String, ? super Long, ? super Long, ? super LocalDateTime, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
