import java.io.IOException;
import java.net.Socket;

public class Exam03 {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 8806;
        try( Socket socket = new Socket(host, port)) {
            System.out.println("연결에 성공하였습니다.");
            int i;
            while((i=socket.getInputStream().read())>=0){
                System.out.write(i);
            }
            socket.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
