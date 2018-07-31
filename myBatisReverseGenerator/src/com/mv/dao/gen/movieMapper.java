package com.mv.dao.gen;

import com.mv.entity.movie;
import com.mv.entity.movieExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface movieMapper {
    int countByExample(movieExample example);

    int deleteByExample(movieExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(movie record);

    int insertSelective(movie record);

    List<movie> selectByExample(movieExample example);

    movie selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") movie record, @Param("example") movieExample example);

    int updateByExample(@Param("record") movie record, @Param("example") movieExample example);

    int updateByPrimaryKeySelective(movie record);

    int updateByPrimaryKey(movie record);
}