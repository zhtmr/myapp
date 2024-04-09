package bitcamp.myapp.dao;

import bitcamp.myapp.vo.Assignment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AssignmentDao {

  void add(Assignment assignment);

  int delete(int no);

  List<Assignment> findAll(@Param("rowCount") int rowCount, @Param("offset") int offset);

  Assignment findBy(int no);

  int update(Assignment assignment);

  int countAll();
}
