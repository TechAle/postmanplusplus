package me.srgantmoomoo.postmanplusplus.modules;

import me.srgantmoomoo.postman.client.module.Category;
import me.srgantmoomoo.postman.client.module.Module;
import me.srgantmoomoo.postman.client.setting.settings.BooleanSetting;
import me.srgantmoomoo.postman.client.setting.settings.NumberSetting;
import net.minecraft.util.text.TextFormatting;
import org.lwjgl.input.Keyboard;


public class AutoTntMinecart extends Module {


	public static AutoTntMinecart INSTANCE;

	public static AutoTntMinecart getInstance() {
		if(INSTANCE==null) {
			INSTANCE = new AutoTntMinecart();
		}
		return INSTANCE;
	}


	public AutoTntMinecart() {
		super("AutoTntMinecart" + TextFormatting.LIGHT_PURPLE + "++", "MinecartTnt go brr", Keyboard.KEY_NONE, Category.PVP);
		this.addSettings();
	}

	@Override
	protected void onEnable() {
		INSTANCE = this;
	}

	@Override
	protected void onDisable() {

	}

	@Override
	public void onUpdate() {

	}

}
