package Utils;

import entity.Seed;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import sun.net.www.http.HttpClient;

import java.io.IOException;
import java.util.Random;

/**
 * Created by mac on 03/05/2017.
 */
public class ParseSeed {

    public static void parseSeed(Seed seed) throws Exception{

        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet get = new HttpGet(seed.getSeed());
        System.out.println("====== REQUESTING ======== "+ seed.getSeed());
        ResponseHandler<String> responseHandler = new ResponseHandler<String>() {
            public String handleResponse(HttpResponse httpResponse) throws ClientProtocolException, IOException {
                int status = httpResponse.getStatusLine().getStatusCode();
                System.out.println("======== STATUS ========= " +status);
                if(status >= 200 && status <300){
                    HttpEntity entity = httpResponse.getEntity();
                    return entity != null ? EntityUtils.toString(entity):null;

                }
                return null;
            }
        };

        String responseBody = client.execute(get, responseHandler);

        if(responseBody != null ){
            ParsePage.parsePage(responseBody);
        }



    }

}
