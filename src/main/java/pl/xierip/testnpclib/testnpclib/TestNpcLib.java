package pl.xierip.testnpclib.testnpclib;

import java.util.Arrays;
import net.jitse.npclib.NPCLib;
import org.bukkit.plugin.java.JavaPlugin;

public final class TestNpcLib extends JavaPlugin {

  @Override
  public void onEnable() {
    NPCLib npcLib = new NPCLib(this);
    npcLib.createNPC(Arrays.asList("hello"));

  }

  @Override
  public void onDisable() {
    // Plugin shutdown logic
  }
}
