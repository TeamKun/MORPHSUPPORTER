package com.gmail.tomatan515.morphsupportplugin;

import org.bukkit.Bukkit;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public final class MorphSupportPlugin extends JavaPlugin implements Listener {

    public static int count = 0;
    public static boolean isStarted = false;

    @Override
    public void onEnable()
    {
        // Plugin startup logic
        Bukkit.getServer().getPluginManager().registerEvents(this , this);
    }

    @EventHandler
    public void onPlayerChat (AsyncPlayerChatEvent e)
    {
        if (e.getMessage().equalsIgnoreCase("start"))
        {

            if (isStarted) return;
            if (!e.getPlayer().isOp()) return;

            BossBar bossBar = Bukkit.createBossBar("変身まで残り60秒" ,  BarColor.GREEN , BarStyle.SOLID);

            for (Player player : Bukkit.getServer().getOnlinePlayers())
            {
                bossBar.addPlayer(player);
            }

            new BukkitRunnable()
            {
                double i = 0;
                @Override
                public void run()
                {
                    if (i > 60)
                    {

                        if (count < 5)
                        {
                            for (Player player : Bukkit.getServer().getOnlinePlayers())
                            {
                                int k = (int) Math.random() * 100;

                                if (k < 80)
                                {
                                    int j = (int) Math.random() * EntityType.values().length;
                                    Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player +
                                            " " + TIER1.values()[j]);
                                }
                                else if (k >= 80 && k < 90)
                                {
                                    int j = (int) Math.random() * EntityType.values().length;
                                    Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player +
                                            " " + TIER2.values()[j]);
                                }
                                else
                                {
                                    int j = (int) Math.random() * EntityType.values().length;
                                    Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player +
                                            " " + TIER3.values()[j]);
                                }

                            }
                        }
                        else if (count >= 5 && count < 10)
                        {
                            for (Player player : Bukkit.getServer().getOnlinePlayers())
                            {
                                int k = (int) Math.random() * 100;

                                if (k < 40)
                                {
                                    int j = (int) Math.random() * EntityType.values().length;
                                    Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player +
                                            " " + TIER1.values()[j]);
                                }
                                else if (k >= 40 && k < 60)
                                {
                                    int j = (int) Math.random() * EntityType.values().length;
                                    Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player +
                                            " " + TIER2.values()[j]);
                                }
                                else if (k >= 60 && k < 80)
                                {
                                    int j = (int) Math.random() * EntityType.values().length;
                                    Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player +
                                            " " + TIER3.values()[j]);
                                }
                                else if (k >= 80)
                                {
                                    int l = (int) Math.random() * 100;

                                    if (l > 60)
                                    {
                                        int j = (int) Math.random() * EntityType.values().length;
                                        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player +
                                                " " + TIER4.values()[j]);
                                    }
                                    else
                                    {
                                        int j = (int) Math.random() * EntityType.values().length;
                                        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player +
                                                " " + TIER5.values()[j]);
                                    }
                                }

                            }
                        }
                        else if (count >= 10 && count < 15)
                        {
                            for (Player player : Bukkit.getServer().getOnlinePlayers())
                            {
                                int k = (int) Math.random() * 100;

                                if (k < 20)
                                {
                                    int j = (int) Math.random() * EntityType.values().length;
                                    Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player +
                                            " " + TIER1.values()[j]);
                                }
                                else if (k >= 20 && k < 40)
                                {
                                    int j = (int) Math.random() * EntityType.values().length;
                                    Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player +
                                            " " + TIER2.values()[j]);
                                }
                                else if (k >= 40 && k < 60)
                                {
                                    int j = (int) Math.random() * EntityType.values().length;
                                    Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player +
                                            " " + TIER3.values()[j]);
                                }
                                else if (k >= 60)
                                {
                                    int l = (int) Math.random() * 100;

                                    if (l > 60)
                                    {
                                        int j = (int) Math.random() * EntityType.values().length;
                                        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player +
                                                " " + TIER4.values()[j]);
                                    }
                                    else
                                    {
                                        int j = (int) Math.random() * EntityType.values().length;
                                        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player +
                                                " " + TIER5.values()[j]);
                                    }
                                }
                            }
                        }
                        else
                        {
                            for (Player player : Bukkit.getServer().getOnlinePlayers())
                            {
                                int k = (int) Math.random() * 100;

                                if (k < 15)
                                {
                                    int j = (int) Math.random() * EntityType.values().length;
                                    Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player +
                                            " " + TIER1.values()[j]);
                                }
                                else if (k >= 15 && k < 30)
                                {
                                    int j = (int) Math.random() * EntityType.values().length;
                                    Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player +
                                            " " + TIER2.values()[j]);
                                }
                                else if (k >= 30 && k < 50)
                                {
                                    int j = (int) Math.random() * EntityType.values().length;
                                    Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player +
                                            " " + TIER3.values()[j]);
                                }
                                else if (k >= 50)
                                {
                                    int l = (int) Math.random() * 100;

                                    if (l > 60)
                                    {
                                        int j = (int) Math.random() * EntityType.values().length;
                                        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player +
                                                " " + TIER4.values()[j]);
                                    }
                                    else
                                    {
                                        int j = (int) Math.random() * EntityType.values().length;
                                        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player +
                                                " " + TIER5.values()[j]);
                                    }
                                }
                            }
                        }

                        i = 0;
                        count++;
                    }

                    bossBar.setProgress(i / 60);
                    i++;
                }
            }.runTaskTimer(this , 0 , 20);

        }
    }
}
