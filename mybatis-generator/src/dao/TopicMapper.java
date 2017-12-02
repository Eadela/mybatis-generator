package dao;

import entity.Topic;
import entity.TopicWithBLOBs;

public interface TopicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TopicWithBLOBs record);

    int insertSelective(TopicWithBLOBs record);

    TopicWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TopicWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TopicWithBLOBs record);

    int updateByPrimaryKey(Topic record);
}