package coding1;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		makeStarEmailFormat("espalda@naver.com");
	}
	 //핸드폰 중간번호를 *로 바꿔주는 메서드
	//메일 주소
    public static String makeStarEmailFormat(String email) {
        String result = email;

        String[] arr = email.split("@");

        if(arr.length == 2) {
            int idLen = arr[0].length();
            if(idLen > 2)
                result = arr[0].substring(0, 2)+arr[0].substring(2).replaceAll("[A-Za-z0-9]", "*");
            else
                result = arr[0];

            result += "@"+arr[1];
        }
        else {
            result = "";
        }
        System.out.println(result);
        return result;
    }

}
