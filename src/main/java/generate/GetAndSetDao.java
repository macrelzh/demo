package generate;

import generate.GetAndSet;

public interface GetAndSetDao {
    int deleteByPrimaryKey(Integer id);

    int insert(GetAndSet record);

    int insertSelective(GetAndSet record);

    GetAndSet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GetAndSet record);

    int updateByPrimaryKey(GetAndSet record);
}