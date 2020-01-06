package com.wenwo.data.statistics.service.mongodb.impl;

import com.wenwo.data.statistics.dao.mongodb.community.CommunityDao;
import com.wenwo.data.statistics.entity.mongodb.community.Community;
import com.wenwo.data.statistics.service.mongodb.BaseMongoServiceBiz;
import com.wenwo.data.statistics.service.mongodb.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>Title: CommunityServiceImpl</p>
 * <p>Description: </p>
 * <p>Company: </p>
 *
 * @author ZY
 * <p> Just go on !!!</p>
 * @date 2020年01月02日  13:50
 */
@Service
public class CommunityServiceImpl extends BaseMongoServiceBiz<Community, CommunityDao> implements CommunityService {

    @Autowired
    private CommunityDao communityDao;

    @Override
    public List<Community> getAllCommunity() {
        return communityDao.findAll();
    }

    @Override
    public Community insertCommunity(Community community) {
        return communityDao.insert(community);
    }

    @Override
    public Community updateCommunity(Community community) {
        communityDao.update(community);
        return community;
    }

    @Override
    public void removeCommunity(String communityId) {
        communityDao.remove(communityId);
    }

    @Override
    public Community getOneCommunity(String communityId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(communityId));
        return communityDao.findOne(query);
    }
}
