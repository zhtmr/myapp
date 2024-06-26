package bitcamp.myapp.service.impl;

import bitcamp.myapp.dao.AssignmentDao;
import bitcamp.myapp.service.AssignmentService;
import bitcamp.myapp.vo.Assignment;
import lombok.RequiredArgsConstructor;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DefaultAssignmentService implements AssignmentService {

  private static final Log log = LogFactory.getLog(DefaultAssignmentService.class);
  private final AssignmentDao assignmentDao;

  @Transactional
  @Override
  public void add(Assignment assignment) {
    assignmentDao.add(assignment);
  }

  @Override
  public List<Assignment> list(int pageNo, int pageSize) {
    return assignmentDao.findAll(pageSize, (pageNo -1) * pageSize);
  }

  @Override
  public Assignment get(int no) {
    return assignmentDao.findBy(no);
  }

  @Transactional
  @Override
  public int update(Assignment assignment) {
    return assignmentDao.update(assignment);
  }

  @Transactional
  @Override
  public int delete(int no) {
    return assignmentDao.delete(no);
  }

  @Override
  public int countAll() {
    return assignmentDao.countAll();
  }
}
