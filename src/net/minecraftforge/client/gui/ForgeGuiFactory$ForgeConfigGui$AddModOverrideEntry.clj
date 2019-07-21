(ns net.minecraftforge.client.gui.ForgeGuiFactory$ForgeConfigGui$AddModOverrideEntry
  "This custom list entry provides a button that will open to a screen that will allow a user to define a new mod override."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.gui ForgeGuiFactory$ForgeConfigGui$AddModOverrideEntry]))

(defn ->add-mod-override-entry
  "Constructor.

  owning-screen - `net.minecraftforge.fml.client.config.GuiConfig`
  owning-entry-list - `net.minecraftforge.fml.client.config.GuiConfigEntries`
  prop - `net.minecraftforge.fml.client.config.IConfigElement`"
  (^ForgeGuiFactory$ForgeConfigGui$AddModOverrideEntry [^net.minecraftforge.fml.client.config.GuiConfig owning-screen ^net.minecraftforge.fml.client.config.GuiConfigEntries owning-entry-list ^net.minecraftforge.fml.client.config.IConfigElement prop]
    (new ForgeGuiFactory$ForgeConfigGui$AddModOverrideEntry owning-screen owning-entry-list prop)))

(defn changed?
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: true if changes have been made to this entry's value, false otherwise. - `boolean`"
  (^Boolean [^ForgeGuiFactory$ForgeConfigGui$AddModOverrideEntry this]
    (-> this (.isChanged))))

