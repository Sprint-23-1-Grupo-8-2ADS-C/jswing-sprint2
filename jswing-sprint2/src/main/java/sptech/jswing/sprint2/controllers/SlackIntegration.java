package sptech.jswing.sprint2.controllers;

import com.github.seratch.jslack.Slack;
import com.github.seratch.jslack.api.webhook.Payload;
import com.github.seratch.jslack.api.webhook.WebhookResponse;
import java.io.IOException;

public class SlackIntegration {

    private static final String webHooksUrl = "https://hooks.slack.com/services/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";
    private static final String oAuthToken = "xoxb-5282339203682-5282252399603-omwYsDyHSR4ZO5Zqir51YCBc";
    private static final String slackChannel = "airplanesolutions";


    public void sendMessageToSlack(String message) {

        try {
            
            StringBuilder msgBuilder = new StringBuilder();
            
            msgBuilder.append(message);

            Payload payload = Payload.builder().channel(slackChannel).text(msgBuilder.toString()).build();

            Slack.getInstance().send(webHooksUrl, payload);
                    

        }catch(IOException e){
        }

    }
}
