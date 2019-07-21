(ns net.minecraftforge.client.gui.ForgeGuiFactory$ForgeConfigGui$ModIDEntry
  "This custom list entry provides a Mod ID selector. The control is a button that opens a list of values to select from.
  This entry also overrides onGuiClosed() to run code to save the data to a new ConfigCategory when the user is done."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.gui ForgeGuiFactory$ForgeConfigGui$ModIDEntry]))

(defn ->mod-id-entry
  "Constructor.

  owning-screen - `net.minecraftforge.fml.client.config.GuiConfig`
  owning-entry-list - `net.minecraftforge.fml.client.config.GuiConfigEntries`
  prop - `net.minecraftforge.fml.client.config.IConfigElement`"
  (^ForgeGuiFactory$ForgeConfigGui$ModIDEntry [^net.minecraftforge.fml.client.config.GuiConfig owning-screen ^net.minecraftforge.fml.client.config.GuiConfigEntries owning-entry-list ^net.minecraftforge.fml.client.config.IConfigElement prop]
    (new ForgeGuiFactory$ForgeConfigGui$ModIDEntry owning-screen owning-entry-list prop)))

(defn on-gui-closed
  "By overriding onGuiClosed() for this entry we can perform additional actions when the user is done such as saving
   a new ConfigCategory object to the Configuration object."
  ([^ForgeGuiFactory$ForgeConfigGui$ModIDEntry this]
    (-> this (.onGuiClosed))))

