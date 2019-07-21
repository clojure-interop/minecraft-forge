(ns net.minecraftforge.client.gui.ForgeGuiFactory$ForgeConfigGui$ModOverridesEntry
  "This custom list entry provides the Mod Overrides entry on the Forge Chunk Loading config screen.
  It extends the base Category entry class and defines the IConfigElement objects that will be used to build the child screen.
  In this case it adds the custom entry for adding a new mod override and lists the existing mod overrides."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.gui ForgeGuiFactory$ForgeConfigGui$ModOverridesEntry]))

(defn ->mod-overrides-entry
  "Constructor.

  owning-screen - `net.minecraftforge.fml.client.config.GuiConfig`
  owning-entry-list - `net.minecraftforge.fml.client.config.GuiConfigEntries`
  prop - `net.minecraftforge.fml.client.config.IConfigElement`"
  (^ForgeGuiFactory$ForgeConfigGui$ModOverridesEntry [^net.minecraftforge.fml.client.config.GuiConfig owning-screen ^net.minecraftforge.fml.client.config.GuiConfigEntries owning-entry-list ^net.minecraftforge.fml.client.config.IConfigElement prop]
    (new ForgeGuiFactory$ForgeConfigGui$ModOverridesEntry owning-screen owning-entry-list prop)))

(defn enabled
  "By overriding the enabled() method and checking the value of the \"enabled\" entry this entry is enabled/disabled based on the value of
   the other entry.

  returns: true if this entry's controls should be enabled, false otherwise. - `boolean`"
  (^Boolean [^ForgeGuiFactory$ForgeConfigGui$ModOverridesEntry this]
    (-> this (.enabled))))

(defn changed?
  "Check to see if the child screen's entry list has changed.

  returns: true if changes have been made to this entry's value, false otherwise. - `boolean`"
  (^Boolean [^ForgeGuiFactory$ForgeConfigGui$ModOverridesEntry this]
    (-> this (.isChanged))))

(defn undo-changes
  "Since adding a new entry to the child screen is what constitutes a change here, reset the child
   screen listEntries to the saved list."
  ([^ForgeGuiFactory$ForgeConfigGui$ModOverridesEntry this]
    (-> this (.undoChanges))))

