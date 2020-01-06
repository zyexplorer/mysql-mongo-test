package com.wenwo.data.statistics.service.mongodb;

import com.wenwo.data.statistics.entity.mongodb.community.Community;

import java.util.List;

/**
 * <p>Title: CommunityService</p>
 * <p>Description: </p>
 * <p>Company: </p>
 *
 * @author ZY
 * <p> Just go on !!!</p>
 * @date 2020年01月02日  13:50
 */
public interface CommunityService {

    List<Community> getAllCommunity();

    Community insertCommunity(Community community);

    Community updateCommunity(Community community);

    void removeCommunity(String communityId);

    Community getOneCommunity(String communityId);
}
