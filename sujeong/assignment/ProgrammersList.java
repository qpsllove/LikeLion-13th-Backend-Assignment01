package assignment;

class Main {
    public static void main(String[] args) {
        int n = 3;
        int[] slicer = {1, 5, 2};
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] result = solution(n, slicer, num_list);

        System.out.println(java.util.Arrays.toString(result));  //결과 출력
    }

    public static int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        if (n == 1) {
            return java.util.Arrays.copyOfRange(num_list, 0, b + 1);    //Arrays.copyOfRange: 배열의 일부분을 복사해서 새 배열을 만들어주는 함수
                                                                                 //끝 인덱스가 포함되지 않아 + 1을 해줌
        } else if (n == 2) {
            return java.util.Arrays.copyOfRange(num_list, a, num_list.length);
        } else if (n == 3) {
            return java.util.Arrays.copyOfRange(num_list, a, b + 1);
        } else {
            java.util.List<Integer> list = new java.util.ArrayList<>();     //결과 담을 List 만들기
            for (int i = a; i <= b; i += c) {       //i = a 부터 i <= b까지 i를 c씩 증가 시키며 반복
                list.add(num_list[i]);  //List에 해당값 추가
            }

            return list.stream().mapToInt(i -> i).toArray();    //list.stream: 리스트 안의 요소를 스트림으로 변환
                                                                       //.mapToInt(i -> i): 각 요소 i를 int로 변환
                                                                       //.toArray(): 만들어진 int 스트림을 배열로 변환
        }
    }
}