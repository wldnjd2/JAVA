package date0916;

public class Television {
	int channel;
	int volume;
	boolean onOff;//�ʵ尡 ����, �ؾ Ʋ
	
	public void print(){
		System.out.println("���� �ڷ����� ä����"+channel+", ������"+volume+", ���� ���´�"+onOff+"�Դϴ�.");
	}
	int getChannel() {// �������� private ����Ҷ� �����Ϸ���		
	return channel;
	}
	void setchannel(int a) {
		channel = a;
	}
	
	//�ʵ�
	//�ʵ�� �ʱ�ȭ�� ���� �ʾƵ� ��밡��
	//���� �޼��� �ȿ��� �־��ټ� ����
	//����
	//�ʱ�ȭ�ؼ� ��� ����
}
