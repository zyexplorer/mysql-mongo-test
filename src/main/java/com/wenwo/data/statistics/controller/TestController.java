package com.wenwo.data.statistics.controller;

import com.wenwo.data.statistics.entity.mongodb.community.Community;
import com.wenwo.data.statistics.entity.mysql.Dict;
import com.wenwo.data.statistics.service.mongodb.CommunityService;
import com.wenwo.data.statistics.service.mysql.DictService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>Title: TestController</p>
 * <p>Description: </p>
 * <p>Company: </p>
 *
 * @author ZY
 * <p> Just go on !!!</p>
 * @date 2020年01月02日  12:49
 */
@Api(tags = {"测试类"})
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private DictService dictService;

    @Autowired
    private CommunityService communityService;

    @ApiOperation(value = "获取所有数据字典", notes = "获取所有数据字典")
    @GetMapping("/getAllDict")
    public List<Dict> getAllDict() {
        return dictService.getAllDict();
    }

    @ApiOperation(value = "获取所有社区信息", notes = "获取所有社区信息")
    @GetMapping("/getAllCommunity")
    public List<Community> getCommunity() {
        return communityService.getAllCommunity();
    }

    @ApiOperation(value = "获取指定的社区信息", notes = "获取指定的社区信息")
    @ApiImplicitParam(name = "communityId", value = "社区id", required = true, dataType = "String", paramType = "query")
    @GetMapping("/getOneCommunity")
    public Community getOneCommunity(String communityId) {
        return communityService.getOneCommunity(communityId);
    }

    @ApiOperation(value = "新增社区信息", notes = "新增社区信息")
    @PostMapping("/addCommunity")
    public Community addCommunity(@RequestBody Community community) {
        return communityService.insertCommunity(community);
    }

    @ApiOperation(value = "更新社区信息", notes = "更新社区信息")
    @PostMapping("/updateCommunity")
    public Community updateCommunity(@RequestBody Community community) {
        return communityService.updateCommunity(community);
    }

    @ApiOperation(value = "删除社区信息", notes = "删除社区信息")
    @ApiImplicitParam(name = "communityId", value = "社区id", required = true, dataType = "String", paramType = "query")
    @GetMapping("/removeCommunity")
    public String removeCommunity(String communityId) {
        communityService.removeCommunity(communityId);
        return "success";
    }
}
