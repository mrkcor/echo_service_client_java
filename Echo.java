import net.without_brains.echo_service.*;
import net.without_brains.echo.*;

public class Echo {
  public static void main( String[] args ) throws Exception {
    // message is the message to send to the EchoService
    String message = null;

    if (args.length > 0) {
      // If command line arguments were given then the first argument os ised
      // to send to the EchoService
      message = args[0];
    } 

    if (message.equals("") || message == null) {
      // If no message was defined use "Hello from Java" as the default
      message = "Hello from Java";
    }

    try {
      // Instantiate SOAP client (the code for it was generated using Apache 
      // CXF's wsdl2java utility)
      EchoPortType client = new EchoService().getEchoPort();

      // Define request and response variables
      EchoMessageType request;
      EchoMessageType response;

      // Set the message in the request object
      request = new EchoMessageType();
      request.setMessage(message);

      // Call Echo and output the result
      response = client.echo(request);
      System.out.println("EchoService responded to Echo: " + response.getMessage());

      // Call ReverseEcho and output the result
      response = client.reverseEcho(request);
      System.out.println("EchoService responded to ReverseEcho: " + response.getMessage());
    } catch (javax.xml.ws.WebServiceException exception) {
      // In case of an error (SOAP fault or otherwise) output the error
      System.out.println("An error occurred while attempting to interact with the EchoService: " + exception.getMessage());
    }
  }
}
