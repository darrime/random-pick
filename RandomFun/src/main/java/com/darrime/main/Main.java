package com.darrime.main;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;


import java.util.logging.Logger;

public final class Main extends JavaPlugin {
    public final Logger logger = Logger.getLogger("Minecraft");

    PluginDescriptionFile pdfile = this.getDescription();

    String prefix = ChatColor.AQUA + "[TUT] " + ChatColor.WHITE + "";
    String info = ChatColor.YELLOW + "[Info] " + ChatColor.WHITE + "";
    String error = ChatColor.DARK_RED + "[Error] " + ChatColor.RED + "";
    String warning = ChatColor.DARK_RED + "[Warning] " + ChatColor.RED + "";
    String plname = ChatColor.GREEN + pdfile.getName() + "";
    String plvers = ChatColor.GREEN + pdfile.getVersion() + "";
    String pname = plname + " v" + plvers + " ";
    String cinfo = info + ChatColor.YELLOW + pname + ChatColor.WHITE + " ";

    // 많이 쓰이는 색깔 코드 정리 (ChatColor.<Color>)
    String white = ChatColor.WHITE + "";
    String red = ChatColor.RED + "";
    String dred = ChatColor.DARK_RED + "";
    String gold = ChatColor.GOLD + "";
    String yellow = ChatColor.YELLOW + "";
    String green = ChatColor.GREEN + "";
    String dgreen = ChatColor.DARK_GREEN + "";
    String aqua = ChatColor.AQUA + "";
    String blue = ChatColor.BLUE + "";
    String dblue = ChatColor.DARK_BLUE + "";
    String gray = ChatColor.GRAY + "";


    @Override
    public void onEnable() {
        console(cinfo + " (이)가 활성화 되는 중 입니다.");
    }

    @Override
    public void onDisable() {
        console(cinfo + " (이)가 비활성화 되는 중 입니다.");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String commandlabel, String[] args) {
        Player player = (Player) sender;

        //h 를 입력하면
        if(commandlabel.equalsIgnoreCase("h")) {
            if(args.length == 0) {
                player.sendMessage(error);
            }
            else if (args.length > 0) {
                if(args[0].equalsIgnoreCase("help")) {
                    player.sendMessage(aqua + "= = = = = = = 랜덤 갓-챠 뽑기 = = = = = = =");
                    player.sendMessage(green + "/h help : 도움말을 표시합니다.");
                    player.sendMessage(green + "/h random : 10% 확률로 당첨되는 뽑기.");
                    player.sendMessage(aqua + "= = = = = = = = = = = = = = = = = = = = =");

                }
                else if(args[0].equalsIgnoreCase("random")) {
                    int random = (int)(Math.random()*9);
                    switch (random) {
                        case 0:
                            player.sendTitle("꽝", String.valueOf(random), -1, -1, -1);
                            break;
                        case 1:
                            player.sendTitle("꽝", String.valueOf(random), -1, -1, -1);
                            break;
                        case 2:
                            player.sendTitle("꽝", String.valueOf(random), -1, -1, -1);
                            break;
                        case 3:
                            player.sendTitle("꽝", String.valueOf(random), -1, -1, -1);
                            break;
                        case 4:
                            player.sendTitle("꽝", String.valueOf(random), -1, -1, -1);
                            break;
                        case 5:
                            player.sendTitle(yellow + "당첨!!", String.valueOf(random), -1, -1, -1);
                            break;
                        case 6:
                            player.sendTitle("꽝", String.valueOf(random), -1, -1, -1);
                            break;
                        case 7:
                            player.sendTitle("꽝", String.valueOf(random), -1, -1, -1);
                            break;
                        case 8:
                            player.sendTitle("꽝", String.valueOf(random), -1, -1, -1);
                            break;
                        case 9:
                            player.sendTitle("꽝", String.valueOf(random), -1, -1, -1);
                            break;
                        default:
                            player.sendMessage(warning + "예외 처리 되지 않은 값이 발생함.");
                            break;



                    }
                }
            }
        }


        return false;
    }

    public void console(String msg) {
        Bukkit.getConsoleSender().sendMessage(msg);
    }
}

