package final_project.root.board;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	public int insertBoard(BoardVO vo) {
		int result = sqlSession.insert("Board.insertBoard",vo);
		return result;
	}
	
	public int updateBoard(BoardVO vo) {
		int result;
		return result;
	}
	
	public int deleteBoard(int id) {
		int result;
		return result;
	}
	
	public BoardVO getBoard(int id) {
		BoardVO one;
		return one;
	}
	
	public List<BoardVO> getBoardList(){
		List<BoardVO> list = sqlSession.selectList("Board.getBoardList");
		return list;
	}
	
	
}
