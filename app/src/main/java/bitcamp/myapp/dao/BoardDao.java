package bitcamp.myapp.dao;

import bitcamp.myapp.vo.Board;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BoardDao {

  void add(Board board);

  int delete(int no);

  List<Board> findAll(
      @Param("category") int category,
      @Param("offset") int offset,
      @Param("rowCount") int rowCount);

  Board findBy(int no);

  int update(Board board);

  int countAll(int category);
}
