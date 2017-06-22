package com.Aquarium.DiscordBots.RandomBot;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.exceptions.RateLimitedException;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;

/**
 * BotOfRandomness was created by Menkalian in Java
 */
public class BotMain extends ListenerAdapter {

    public static void main(String[] args){
        try {
            JDA bot = new JDABuilder(AccountType.BOT).setToken("Your Token here").addEventListener(new BotMain()).buildBlocking();
        } catch (LoginException | InterruptedException | RateLimitedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event){
        if(new java.util.Random().nextDouble() <= 0.02){
            event.getChannel().sendMessage("Your are totally right!").queue();
        }
    }
}
