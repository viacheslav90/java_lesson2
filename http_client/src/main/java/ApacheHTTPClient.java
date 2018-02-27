import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ApacheHTTPClient {

    public static void main(String[] args) throws Exception {

        // URL for GET request
        String getURL = "http://httpbin.org/get";


        // URL and parameters for POST request
        String postURL = "http://httpbin.org/post";
        List<NameValuePair> postParams = new ArrayList<NameValuePair>();
        postParams.add(new BasicNameValuePair("login", "test"));
        postParams.add(new BasicNameValuePair("password", "test"));


        // URL and parameters for PUT request
        String putUrl ="http://httpbin.org/put";
        String putParams = "{\"name\":\"car\", \"value\":\"5\"}";


        ApacheHTTPClient apacheHTTPClient = new ApacheHTTPClient();

        apacheHTTPClient.sendGet(getURL);
        apacheHTTPClient.sendPost(postURL, postParams);
        apacheHTTPClient.sendPut(putUrl, putParams);

        System.out.println("\nFollowing requests was sent via ApacheHTTPClient");

        }



    // GET method
    private void sendGet(String url) throws Exception{

        HttpClient client = new DefaultHttpClient();
        HttpGet request = new HttpGet(url);

        HttpResponse response = client.execute(request);

        System.out.println("\nSending '" + request.getMethod() + "' request to URL : " + url);
        System.out.println("Response Code : " +
                response.getStatusLine().getStatusCode());

        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

        StringBuffer result = new StringBuffer();
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            result.append(line);
        }

        System.out.println(result.toString());
    }


    // POST method
    private void sendPost(String url, List<NameValuePair> params) throws Exception {

        HttpClient client = new DefaultHttpClient();
        HttpPost request = new HttpPost(url);

        request.setEntity(new UrlEncodedFormEntity(params));

        HttpResponse response = client.execute(request);
        System.out.println("\nSending '" + request.getMethod() + "' request to URL : " + url);
        System.out.println("Post parameters : " + request.getEntity());
        System.out.println("Response Code : " +
                response.getStatusLine().getStatusCode());

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

        StringBuffer result = new StringBuffer();
        String line = "";
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }

        System.out.println(result.toString());

    }


    // PUT method
    private void sendPut(String url, String params) throws Exception {

        HttpClient client = new DefaultHttpClient();
        HttpPut request = new HttpPut(url);

        request.setHeader("Content-Type", "application/json");
        request.setEntity(new StringEntity("{\"car\": \"\"bmw}"));

        HttpResponse response = client.execute(request);
        System.out.println("\nSending '" + request.getMethod() + "' request to URL : " + url);
        System.out.println("Response Code : " +
                response.getStatusLine().getStatusCode());

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

        StringBuffer result = new StringBuffer();
        String line = "";
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }

        System.out.println(result.toString());

    }
}
