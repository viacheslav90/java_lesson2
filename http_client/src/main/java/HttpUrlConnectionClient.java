import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUrlConnectionClient {

    public static void main(String[] args) throws Exception {

        HttpUrlConnectionClient httpUrlConnectionClient = new HttpUrlConnectionClient();

        String getURL = "http://httpbin.org/get";

        String postURL = "http://httpbin.org/post";
        String paramsForPost = "login=vdontsov&password=test";

        String putUrl ="http://httpbin.org/put";
        String putParams = "";

        try {
            httpUrlConnectionClient.sendGet(getURL);
        } catch (IOException e){
            e.getMessage();
            e.getStackTrace();
        }

        try {
            httpUrlConnectionClient.sendPost(postURL, paramsForPost);
        } catch (IOException e){
            e.getMessage();
            e.getStackTrace();
        }

        try {
            httpUrlConnectionClient.sendPut(putUrl, putParams);
        } catch (IOException e){
            e.getMessage();
            e.getStackTrace();
        }

        System.out.println("Following requests was sent via HttpUrlConnection");

    }


    private void sendGet(String url) throws IOException {

        URL urlObj = new URL(url);

        HttpURLConnection connection = (HttpURLConnection)urlObj.openConnection();

        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        String responseMessage = connection.getResponseMessage();
        System.out.println("\nSending '" + connection.getRequestMethod() + "' request to URL : " + url);
        System.out.println("Response code: " + responseCode);
        System.out.println("Response message: " + responseMessage);

        BufferedReader br = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
        String resp;
        StringBuffer response = new StringBuffer();

        while ((resp = br.readLine()) != null){
            response.append(resp);
        }

        System.out.println(response);
    }


    private void sendPost(String url, String params) throws IOException {

        URL urlObj = new URL(url);
        HttpURLConnection connection = (HttpURLConnection)urlObj.openConnection();

        connection.setRequestMethod("POST");

        int responseCode = connection.getResponseCode();
        String responseMessage = connection.getResponseMessage();

        System.out.println("\nSending '" + connection.getRequestMethod() + "' request to URL : " + url);
        System.out.println("Parameters: " + params);
        System.out.println("Response code: " + responseCode);
        System.out.println("Response message: " + responseMessage);

        BufferedReader br = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
        String resp;
        StringBuffer response = new StringBuffer();

        while ((resp = br.readLine()) != null){
            response.append(resp);
        }

        br.close();

        System.out.println(response);

    }

    private void sendPut(String url, String json) throws IOException {

        URL urlObj = new URL(url);
        HttpURLConnection connection = (HttpURLConnection)urlObj.openConnection();

        connection.setRequestMethod("PUT");

        int responseCode = connection.getResponseCode();
        String responseMessage = connection.getResponseMessage();

        System.out.println("\nSending '" + connection.getRequestMethod() + "' request to URL : " + url);
        System.out.println("Response code: " + responseCode);
        System.out.println("Response message: " + responseMessage);

        BufferedReader br = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
        String resp;
        StringBuffer response = new StringBuffer();

        while ((resp = br.readLine()) != null){
            response.append(resp);
        }

        br.close();

        System.out.println(response);

    }


}
