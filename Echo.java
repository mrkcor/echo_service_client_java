import net.without_brains.echo_service.*;
import net.without_brains.echo.*;

public class Echo {
  public static void main( String[] args ) throws Exception {
    String message = null;

    if (args.length > 0) {
      message = args[0];
    } 

    if (message.equals("") || message == null) {
      message = "Hello from Java";
    }

    EchoService client = new EchoService();
    EchoPortType echo = client.getEchoPort();

    EchoMessageType request;
    EchoMessageType response;

    request = new EchoMessageType();
    request.setMessage(message);

    response = echo.echo(request);
    System.out.println("EchoService responded to Echo: " + response.getMessage());

    response = echo.reverseEcho(request);
    System.out.println("EchoService responded to ReverseEcho: " + response.getMessage());
  }
}
