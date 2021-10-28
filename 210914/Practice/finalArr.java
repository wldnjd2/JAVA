package exam_date0914;

public class finalArr {
//8번문제
//주어진 두 배열의 같은 위치의 숫자를 합쳐서
//하나의 배열로 출력하는 메서드
	
	 int[] Arraysum (int[]arr1, int[]arr2) {				//리턴타입이 배열이기 때문에 배열로 바꿔줘야함
		 int[] arrS;
		if(arr1.length == arr2.length) {					//배열의 길이가 같으면
			arrS = new int[arr1.length];					//저장해줄 배열 생성
			for(int x = 0; x<arr1.length; x++) {
				arrS[x] = arr1[x] + arr2[x];
			}
		}
		else if(arr1.length > arr2.length) {				//arr1의 배열의 크기가 더 크면
			arrS = new int[arr1.length];
				for(int x = 0; x<arr2.length; x++) {		//작은거의 길이에 맞추기
					arrS[x] = arr1[x] + arr2[x];
				}
				int a = arr1.length-arr2.length;         	 //배열의 길이 차이       
				arrS[arr1.length-a] = arr1[arr1.length-a];	 //다른 위치에 있는 숫자 배열 arrS에 대입
		}
		else {
			
			arrS = new int[arr2.length];
			for(int x = 0; x<arr1.length; x++) {
				arrS[x] = arr1[x] + arr2[x];
			}
			int a = arr2.length-arr1.length;         
			arrS[arr2.length-a] = arr2[arr2.length-a];
		}
		return  arrS;
		
	}
}
