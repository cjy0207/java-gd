package homework.homework2;

public class UnSupportedException extends RuntimeException {
    @Override
    public String getMessage() {
        return "원인을 알 수 없는 오류입니다.";
    }
}