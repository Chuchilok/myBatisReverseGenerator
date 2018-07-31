package com.mv.dao.gen;

import com.mv.entity.comments;
import com.mv.entity.commentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface commentsMapper {
    int countByExample(commentsExample example);

    int deleteByExample(commentsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(comments record);

    int insertSelective(comments record);

    List<comments> selectByExample(commentsExample example);

    comments selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") comments record, @Param("example") commentsExample example);

    int updateByExample(@Param("record") comments record, @Param("example") commentsExample example);

    int updateByPrimaryKeySelective(comments record);

    int updateByPrimaryKey(comments record);
}