package sptech.jswing.sprint2.controllers;

import com.github.seratch.jslack.Slack;
import com.github.seratch.jslack.api.methods.SlackApiRequest;
import com.github.seratch.jslack.api.webhook.Payload;
import com.github.seratch.jslack.api.webhook.WebhookResponse;
import java.net.http.HttpClient;

public class SlackIntegration {

    private static String webHooksUrl = "https://hooks.slack.com/services/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";
    private static String oAuthToken = "xoxb-5282339203682-5282252399603-Ptyh7RjIvZPDNIg37Yg0EZG9";
    private static String slackChannel = "airplanesolutions";
    //private static HttpClient client = HttpClient.newHttpClient();

    /*
    public static void main(String[] args) {
        sendMessageToSlack("Primeira mensagem de teste da automação Slack");
    }
    */

    public static void sendMessageToSlack(String message) {

        try {
            
            StringBuilder msgBuilder = new StringBuilder();
            
            msgBuilder.append(message);

            Payload payload = Payload.builder().channel(slackChannel).text(msgBuilder.toString()).build();

            WebhookResponse wbResp = Slack.getInstance().send(webHooksUrl, payload);
                    

        }catch(Exception e){
            e.printStackTrace();
            
        }

    }
}
