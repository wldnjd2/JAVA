package class0909;

public class VariableScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15;				//���ú��� v1, v2
		int v2=0;					//
		
		if(v1>10) {	
			//int v2 = 0; 			//if�� ��Ͽ��� ������ �����ϰԵǸ� if�� �ۿ����� ������� ����
			v2 = v1-10;
			}
		
		int v3 = v1+ v2 +5; 		//v2������ if�� �ȿ� �����ϰ� �ȴٸ� �����߻� 									//
		System.out.println(v3);
	}

}
