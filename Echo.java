import net.without_brains.echo_service.*;
import net.without_brains.echo.*;

public class Echo {
  public static void main( String[] args ) throws Exception {
    // message is the message to send to the EchoService
    String message = null;

    if (args.length > 0) {
      // If command line arguments were given then the first argument is used
      // to send to the EchoService
      message = args[0];
    } 

    if (message == null || message.equals("")) {
      // If no message was defined use "Hello from Java" as the default
      message = "Hello from Java";
    }

    try {
      // Instantiate SOAP client (the code for it was generated using Apache 
      // CXF's wsdl2java utility)
      EchoPortType client = new EchoService().getEchoPort();

      // Define request and response variables
      //
      // Because the same XML types are used for both the Echo and ReverseEcho 
      // operation in the XML schema Java uses the same classes for the request 
      // and response for both operations. In this example the request is set 
      // once and is used for calling both Echo and ReverseEcho, and the same 
      // response variable is used to capture the response for both calls.
      // Most services that offer multiple operations will use different XML 
      // types for different operations, so you will not always be able to reuse
      // request and response variables between operations like done in this 
      // example
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
