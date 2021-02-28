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
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public final class MorphSupportPlugin extends JavaPlugin implements Listener {

    public static int count = 0;
    public static boolean isStarted = false;
    public static int Time;
    public static BossBar bossBar = null;

    @Override
    public void onEnable()
    {
        // Plugin startup logic
        saveDefaultConfig();
        Time = getConfig().getInt("time");
        Bukkit.getServer().getPluginManager().registerEvents(this , this);
    }

    @EventHandler
    public void onPlayerChat (AsyncPlayerChatEvent e)
    {
        if (e.getMessage().equalsIgnoreCase("test"))
        {

            if (isStarted) return;
            if (!e.getPlayer().isOp()) return;

            bossBar = Bukkit.createBossBar("変身まで残り60秒" ,  BarColor.GREEN , BarStyle.SOLID);
            bossBar.setVisible(true);

            bossBar.setProgress(1);

            for (Player player : Bukkit.getServer().getOnlinePlayers())
            {
                bossBar.addPlayer(player);
            }

            new BukkitRunnable()
            {
                double i = Time;
                @Override
                public void run()
                {
                    if (i < 0)
                    {

                        if (count < 5)
                        {
                            for (Player player : Bukkit.getServer().getOnlinePlayers())
                            {
                                double k =  Math.random() * 100;

                                if (k < 80)
                                {
                                    double j =  Math.random() * TIER1.values().length;
                                    Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player.getName() +
                                            " " + TIER1.values()[(int) j]);
                                }
                                else if (k >= 80 && k < 90)
                                {
                                    double j =  Math.random() * TIER2.values().length;
                                    Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player.getName() +
                                            " " + TIER2.values()[(int) j]);
                                }
                                else
                                {
                                    double j =  Math.random() * TIER3.values().length;
                                    Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player.getName() +
                                            " " + TIER3.values()[(int) j]);
                                }

                            }
                        }
                        else if (count >= 5 && count < 10)
                        {
                            for (Player player : Bukkit.getServer().getOnlinePlayers())
                            {
                                double k =  Math.random() * 100;

                                if (k < 40)
                                {
                                    double j =  Math.random() * TIER1.values().length;
                                    Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player.getName() +
                                            " " + TIER1.values()[(int) j]);
                                }
                                else if (k >= 40 && k < 60)
                                {
                                    double j =  Math.random() * TIER2.values().length;
                                    Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player.getName() +
                                            " " + TIER2.values()[(int) j]);
                                }
                                else if (k >= 60 && k < 80)
                                {
                                    double j =  Math.random() * TIER3.values().length;
                                    Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player.getName() +
                                            " " + TIER3.values()[(int) j]);
                                }
                                else if (k >= 80)
                                {
                                    double l =  Math.random() * 100;

                                    if (l > 60)
                                    {
                                        double j =  Math.random() * TIER4.values().length;
                                        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player.getName() +
                                                " " + TIER4.values()[(int) j]);
                                    }
                                    else
                                    {
                                        double j =  Math.random() * TIER5.values().length;
                                        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player.getName() +
                                                " " + TIER5.values()[(int) j]);
                                    }
                                }

                            }
                        }
                        else if (count >= 10 && count < 15)
                        {
                            for (Player player : Bukkit.getServer().getOnlinePlayers())
                            {
                                double k = Math.random() * 100;

                                if (k < 20)
                                {
                                    double j = Math.random() * TIER1.values().length;
                                    Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player.getName() +
                                            " " + TIER1.values()[(int) j]);
                                }
                                else if (k >= 20 && k < 40)
                                {
                                    double j = Math.random() * TIER2.values().length;
                                    Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player.getName() +
                                            " " + TIER2.values()[(int) j]);
                                }
                                else if (k >= 40 && k < 60)
                                {
                                    double j = Math.random() * TIER3.values().length;
                                    Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player.getName() +
                                            " " + TIER3.values()[(int) j]);
                                }
                                else if (k >= 60)
                                {
                                    double l = Math.random() * 100;

                                    if (l > 60)
                                    {
                                        double j = Math.random() * TIER4.values().length;
                                        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player.getName() +
                                                " " + TIER4.values()[(int) j]);
                                    }
                                    else
                                    {
                                        double j = Math.random() * TIER5.values().length;
                                        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player.getName() +
                                                " " + TIER5.values()[(int) j]);
                                    }
                                }
                            }
                        }
                        else
                        {
                            for (Player player : Bukkit.getServer().getOnlinePlayers())
                            {
                                double k = Math.random() * 100;

                                if (k < 15)
                                {
                                    double j = Math.random() * TIER1.values().length;
                                    Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player.getName() +
                                            " " + TIER1.values()[(int) j]);
                                }
                                else if (k >= 15 && k < 30)
                                {
                                    double j = Math.random() * TIER2.values().length;
                                    Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player.getName() +
                                            " " + TIER2.values()[(int) j]);
                                }
                                else if (k >= 30 && k < 50)
                                {
                                    double j = Math.random() * TIER3.values().length;
                                    Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player.getName() +
                                            " " + TIER3.values()[(int) j]);
                                }
                                else if (k >= 50)
                                {
                                    double l =Math.random() * 100;

                                    if (l > 60)
                                    {
                                        double j = Math.random() * TIER4.values().length;
                                        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player.getName() +
                                                " " + TIER4.values()[(int) j]);
                                    }
                                    else
                                    {
                                        double j = Math.random() * TIER5.values().length;
                                        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + player.getName() +
                                                " " + TIER5.values()[(int) j]);
                                    }
                                }
                            }
                        }

                        i = Time;
                        count++;
                        bossBar.setProgress(1);
                    }

                    bossBar.setProgress(i / 60);
                    bossBar.setTitle("変身まで残り" + i + "秒");
                    i--;
                }
            }.runTaskTimer(this , 0 , 20);

        }
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e)
    {
        if (bossBar != null)
        {
            bossBar.addPlayer(e.getPlayer());
        }
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e)
    {
        if (isStarted)
        {
            double j = Math.random() * TIER1.values().length;
            Bukkit.getServer().dispatchCommand(getServer().getConsoleSender() , "morph morph " + e.getEntity().getName() +
                    " " + TIER1.values()[(int) j]);
        }
    }
}
