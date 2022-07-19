package by.mitskevich.tg_bot.appconfig;

import by.mitskevich.tg_bot.TgBotTelegramBot;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.bots.DefaultBotOptions;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "telegrambot")
public class BotConfig {
    private String webHookPath;
    private String botUserName;
    private String botToken;

    private DefaultBotOptions.ProxyType proxyType;
    private String proxyHost;
    private int proxyPort;

    @Bean
    public TgBotTelegramBot MySuperTelegramBot() {
//        DefaultBotOptions options = ApiContext
//                .getInstance(DefaultBotOptions.class);
//
//        options.setProxyHost(proxyHost);
//        options.setProxyPort(proxyPort);
//        options.setProxyType(proxyType);

//        TgBotTelegramBot mySuperTelegramBot = new TgBotTelegramBot(options);
//        mySuperTelegramBot.setBotUserName(botUserName);
//        mySuperTelegramBot.setBotToken(botToken);
//        mySuperTelegramBot.setWebHookPath(webHookPath);

//        return mySuperTelegramBot;
        return null;
    }
}
