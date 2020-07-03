package or.itschool.mapper;

import java.util.List;

import or.itschool.model.BoardVO;

public interface BoardMapper {
	// ����� ��ȭ�ϱ� ���� �������̽� ����
	// �Խ��� ����� ���Ѵ�.

	// 1. �Խñ� ��� ��� �޼��� - �Խñ��� �ϳ� �����ͼ� ����Ѵ�.
	void insert(BoardVO article) throws Exception;

	// 2. �ϳ��� �Խñ� ��ȸ ��� �޼��� - �ϳ��� ��ȸ�Ϸ��� �����̸Ӹ�Ű(�۹�ȣ)�� ������ ��ü ������ ��ȯ�Ѵ�.
	BoardVO getArticle(int boardNo) throws Exception;

	// 3. �Խù� ���� ��� �޼��� - �Խù� ��ü ������ �����ͼ� �����Ѵ�.
	void update(BoardVO article) throws Exception;

	// 4. �Խù� ���� ��� �޼��� - �Խù� ��ȣ�� ���� �����Ѵ�.
	void delete(int boardNo) throws Exception;

	// 5. ��� �Խù� ��ȸ ��� �޼���
	List<BoardVO> getAllArticles() throws Exception;
}
