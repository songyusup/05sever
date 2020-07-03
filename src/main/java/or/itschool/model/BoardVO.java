package or.itschool.model;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {
	 //����� DATABASE TABLE �÷��� 1:1�� ���εǴ� �ʵ���� ĸ��ȭ�� ���� ������Ƽȭ ��Ų��.
    private int boardNo;        //�۹�ȣ
    private String title;        //������
    private String content;        //�۳���
    private String writer;        //�ۼ���
    private Date regDate;        //�ۼ���
    private int viewCnt;        //��ȸ��
}
