package com.mv.dao.gen;

import com.mv.entity.sessions;
import com.mv.entity.sessionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface sessionsMapper {
    int countByExample(sessionsExample example);

    int deleteByExample(sessionsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(sessions record);

    int insertSelective(sessions record);

    List<sessions> selectByExample(sessionsExample example);

    sessions selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") sessions record, @Param("example") sessionsExample example);

    int updateByExample(@Param("record") sessions record, @Param("example") sessionsExample example);

    int updateByPrimaryKeySelective(sessions record);

    int updateByPrimaryKey(sessions record);
}