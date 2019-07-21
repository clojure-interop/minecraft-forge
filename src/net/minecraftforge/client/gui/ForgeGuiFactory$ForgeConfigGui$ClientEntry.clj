(ns net.minecraftforge.client.gui.ForgeGuiFactory$ForgeConfigGui$ClientEntry
  "This custom list entry provides the Client only Settings entry on the Minecraft Forge Configuration screen.
  It extends the base Category entry class and defines the IConfigElement objects that will be used to build the child screen."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.gui ForgeGuiFactory$ForgeConfigGui$ClientEntry]))

(defn ->client-entry
  "Constructor.

  owning-screen - `net.minecraftforge.fml.client.config.GuiConfig`
  owning-entry-list - `net.minecraftforge.fml.client.config.GuiConfigEntries`
  prop - `net.minecraftforge.fml.client.config.IConfigElement`"
  (^ForgeGuiFactory$ForgeConfigGui$ClientEntry [^net.minecraftforge.fml.client.config.GuiConfig owning-screen ^net.minecraftforge.fml.client.config.GuiConfigEntries owning-entry-list ^net.minecraftforge.fml.client.config.IConfigElement prop]
    (new ForgeGuiFactory$ForgeConfigGui$ClientEntry owning-screen owning-entry-list prop)))

