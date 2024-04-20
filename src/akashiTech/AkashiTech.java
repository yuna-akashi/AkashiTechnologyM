package akashiTech;

import arc.*;
import arc.util.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class AkashiTech extends Mod{
    public static final String MOD_RELEASES = "https://github.com/yuna-akashi/AkashiTechnologyM/releases";
    public static final String MOD_REPO = "yuna-akashi/AkashiTechnologyM";
    public static final String MOD_GITHUB_URL = "https://github.com/yuna-akashi/AkashiTechnologyM";
    public static final String MOD_NAME = "akashiTech";

    public static Mods.LoadedMod MOD;

    public static String name(String name) {
        return MOD_NAME + "-" + name;
    }

    public AkashiTech(){
        Log.info("Loaded AkashiIndustryMod constructor.");

        //TODO ダイアログの作成。
        Events.on(ClientLoadEvent.class, e -> {
            Time.runTask(10f, () -> {
                BaseDialog dialogMain = new BaseDialog("MOD LOADED");
                dialogMain.cont.add("赤石工業").row();
                dialogMain.cont.image(Core.atlas.find(MOD_NAME+"-icon2")).pad(20f).row();
                dialogMain.cont.add("This mod's language is Japanese. Also support zh_TW.").row();
                dialogMain.cont.add().row();
                dialogMain.cont.add("IMPORTANT").row();
                dialogMain.cont.add("English is not officially supported in this mod.").row();
                dialogMain.cont.button("ACCEPT", dialogMain::hide).size(200f, 50f);
                dialogMain.show();
            });
        });
    }

    @Override
    public void loadContent(){
        {
        }

        Log.info("Loading some Akashi-Industry content.");
    }

}
