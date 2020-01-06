package com.wenwo.data.statistics.service.mongodb;

import com.wenwo.data.statistics.dao.mongodb.BaseMongoDaoBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapreduce.MapReduceResults;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public abstract class BaseMongoServiceBiz<T, DAO extends BaseMongoDaoBiz<T>> {

    @Autowired
    protected DAO dao;

    public T findById(String id) {
        return dao.findById(id);
    }

    public T findOne(String key, String value) {
        return dao.findOne(key, value);
    }

    public T findOneByMap(Map<String, Object> map) {
        return dao.findOneByMap(map);
    }

    public T findOne(Query query) {
        return dao.findOne(query);
    }

    public List<T> findListByKeyValue(String key, Object value) {
        return dao.findListByKeyValue(key, value);
    }

    public List<T> findListByKeyValues(String key, Collection<Object> values) {
        return dao.findListByKeyValues(key, values);
    }

    public List<T> findListByKeyValue(String key, Object value, int limit) {
        return dao.findListByKeyValue(key, value, limit);
    }

    public List<T> findListByKeyValues(String key, Collection<Object> values, int limit) {
        return dao.findListByKeyValues(key, values, limit);
    }

    public List<T> findListByIds(Collection<String> ids) {
        return dao.findListByIds(ids);
    }

    public List<T> findAll() {
        return dao.findAll();
    }

    public long getCount() {
        return dao.getCount();
    }

    public long getCount(String key, String value) {
        return dao.getCount(key, value);
    }

    public T save(T t) {
        dao.save(t);
        return t;
    }

    public void save(Collection<T> collection) {
        dao.save(collection);
    }

    public int updateByKeyValue(String key, String value, T t) {
        return dao.updateByKeyValue(key, value, t);
    }

    public int updateById(String id, Update update) {
        return dao.updateById(id, update);
    }

    public int updateByIds(Collection<String> ids, Update update) {
        return dao.updateByIds(ids, update);
    }

    public void remove(Query query) {
        dao.remove(query);
    }

    public void remove(String id) {
        dao.remove(id);
    }

    public void remove(T t) {
        dao.remove(t);
    }

    public void remove(Collection<String> ids) {
        dao.remove(ids);
    }

    public <O> MapReduceResults<O> mapReduce(Query query, String inputCollectionName, String mapFunction,
                                             String reduceFunction, Class<O> clazz) {
        return dao.mapReduce(query, inputCollectionName, mapFunction, reduceFunction, clazz);
    }

//    public <O> GroupByResults<O> group(Criteria criteria, String inputCollectionName, GroupBy groupBy, Class<O> clazz) {
//        return dao.group(criteria, inputCollectionName, groupBy, clazz);
//    }

    public String getCollectionName() {
        return dao.getCollectionName();
    }

    public T findAndRemove(Query query) {
        return dao.findAndRemove(query);
    }

    public void findAndUpdate(Query query, Update update) {
        dao.findAndUpdate(query, update);
    }

    protected MongoTemplate getMongoTemplate() {
        return dao.getMongoTemplate();
    }

    public <O> O findSub(String id, Class<O> subClazz) {
        return dao.findSub(id, subClazz);
    }

    public <O> O findSub(String id, Class<O> subClazz, String subName) {
        return dao.findSub(id, subClazz, subName);
    }

    public List<T> findList(Query query) {
        return dao.findList(query);
    }

    public List<T> findList(Query query, Sort... sort) {
        return dao.findList(query, sort);
    }

    public List<T> findList(Query query, int limit) {
        return dao.findList(query, limit);
    }

    public List<T> findListByMap(Map<String, Object> queryMap) {
        return dao.findListByMap(queryMap);
    }

    public List<T> findListByIds(Collection<String> ids, Sort... sort) {
        return dao.findListByIds(ids, sort);
    }

//    public Page<T> findPage(Query query, Pageable pageable, Sort... sort) {
//        return dao.findPage(query, pageable, sort);
//    }

//    public Page<T> findPage(Query query, int pageNum, int pageSize, Sort... sort) {
//        return dao.findPage(query, pageNum, pageSize, sort);
//    }

    public Long getCount(Query query) {
        return dao.getCount(query);
    }

    public List<String> findField(Query query, String fieldName) {
        return dao.findField(query, fieldName);
    }

    public List<String> findId(Query query) {
        return dao.findId(query);
    }

    public Long getCount(Map<String, Object> queryMap) {
        return dao.getCount(queryMap);
    }

    public T insert(T entity) {
        return dao.insert(entity);
    }

    public int upsert(Query query, Update update) {
        return dao.upsert(query, update);
    }

    public int update(Query query, Update update, boolean isFirst) {
        return dao.update(query, update, isFirst);
    }

    /**
     * 实体必须有id字段，id不能为空，更新非空字段
     *
     * @param entity
     * @return
     */
    public int updateById(T entity) {
        return dao.updateById(entity);
    }

    public int updateByMap(Map<String, Object> map, T entity) {
        return dao.updateByMap(map, entity);
    }

    public int updateByMap(Query query, Map<String, Object> map) {
        return dao.updateByMap(query, map);
    }

    public void update(T t) {
        dao.update(t);
    }

    public T insertByMap(Map<String,Object> map) {
        return dao.insertByMap(map);
    }
}
