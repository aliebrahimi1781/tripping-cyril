import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
 
public class TestLogin {
 
  public static void main(String[] args) throws Exception, IOException {
    DefaultHttpClient httpClient = new DefaultHttpClient();
    HttpPost postRequest = new HttpPost("http://www.rushucloud:90/activiti-rest/service/login");
 
    StringEntity input = new StringEntity("{\"userId\":\"kermit\",\"password\":\"kermit\"}");
    input.setContentType("application/json");
    postRequest.setEntity(input);
    System.out.println("Post to Server .... \n");
    HttpResponse response = httpClient.execute(postRequest);
 
    BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
 
    String output;
    System.out.println("Output from Server .... \n");
    while ((output = br.readLine()) != null) {
      System.out.println(output);
    }
 
    httpClient.getConnectionManager().shutdown();
  }
}