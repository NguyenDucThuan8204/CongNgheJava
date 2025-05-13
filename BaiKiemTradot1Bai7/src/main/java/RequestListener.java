import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class RequestListener implements ServletRequestListener {
    private static int requestCount = 0;

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        requestCount++;
        System.out.println("Yêu cầu thứ: " + requestCount);
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {}
}