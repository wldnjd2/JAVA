package date0914;

public class Car {
	int gas;

	void SetGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("������ �����ϴ�.");
			return false;
		} else
			System.out.println("������ �ֽ��ϴ�");
		return true;
	}

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("���� ����: " + gas);
				gas -= 1;

			} else {
				System.out.println("����ϴ�. ��������: " + gas);
				return;//while�� ����
			}
		}
	}
}
