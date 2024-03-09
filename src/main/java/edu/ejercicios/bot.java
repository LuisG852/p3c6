package edu.ejercicios;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class bot extends TelegramLongPollingBot{


    @java.lang.Override
    public String getBotUsername() {
        return "P3Luis_bot";
    }

    @java.lang.Override
    public String getBotToken() {
        return "7126123626:AAG6J0mvEL8kHvzaM-Nm0l_lMaJIl_tsapw";
    }

    @java.lang.Override
    public void onUpdateReceived(Update update) {
        System.out.println(update);

    }
}