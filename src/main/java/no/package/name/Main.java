package no.package.name;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.eu.habbo.Emulator;
import com.eu.habbo.habbohotel.users.Habbo;
import com.eu.habbo.plugin.EventListener;
import com.eu.habbo.plugin.HabboPlugin;


public class Main extends HabboPlugin implements EventListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	@Override
	public boolean hasPermission(Habbo habbo, String string) {

		return true;
	}

	@Override
	public void onDisable() throws Exception {

	    LOGGER.info("[Base Plugin] Plugin disabled.");
	}

	@Override
	public void onEnable() throws Exception {
	    Emulator.getPluginManager().registerEvents(this, this);
	    LOGGER.info("[Base Plugin] Plugin started.");
	}
	
}