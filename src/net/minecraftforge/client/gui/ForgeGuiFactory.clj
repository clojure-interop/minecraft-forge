(ns net.minecraftforge.client.gui.ForgeGuiFactory
  "This is the base GuiConfig screen class that all the other Forge-specific config screens will be called from.
  Since Forge has multiple config files I thought I would use that opportunity to show some of the ways
  that the config GUI system can be extended to create custom config GUIs that have additional features
  over the base functionality of just displaying Properties and ConfigCategories.

  The concepts implemented here are:
  - using custom IConfigEntry objects to define child-screens that have specific Properties listed
  - using custom IConfigEntry objects to define a dummy property that can be used to generate new ConfigCategory objects
  - defining the configID string for a GuiConfig object so that the config changed events will be posted when that GuiConfig screen is closed
       (the configID string is optional; if it is not defined the config changed events will be posted when the top-most GuiConfig screen
       is closed, eg when the parent is null or is not an instance of GuiConfig)
  - overriding the IConfigEntry.enabled() method to control the enabled state of one list entry based on the value of another entry
  - overriding the IConfigEntry.onGuiClosed() method to perform custom actions when the screen that owns the entry is closed (in this
       case a new ConfigCategory is added to the Configuration object)

  The config file structure looks like this:
       forge.cfg (general settings all in one category)
       forgeChunkLoading.cfg
           - Forge (category)
           - defaults (category)
           - [optional mod override categories]...

  The GUI structure is this:
       Base Screen
           - General Settings (from forge.cfg)
           - Chunk Loader Settings (from forgeChunkLoading.cfg)
               - Defaults (these elements are listed directly on this screen)
               - Mod Overrides
                   - Add New Mod Override
                   - Mod1
                   - Mod2
                   - etc.

  Other things to check out:
       ForgeModContainer.syncConfig()
       ForgeModContainer.onConfigChanged()
       ForgeChunkManager.syncConfigDefaults()
       ForgeChunkManager.loadConfiguration()"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.gui ForgeGuiFactory]))

(defn ->forge-gui-factory
  "Constructor."
  (^ForgeGuiFactory []
    (new ForgeGuiFactory )))

(defn initialize
  "Description copied from interface: IModGuiFactory

  minecraft-instance - the instance - `net.minecraft.client.Minecraft`"
  ([^ForgeGuiFactory this ^net.minecraft.client.Minecraft minecraft-instance]
    (-> this (.initialize minecraft-instance))))

(defn main-config-gui-class
  "Description copied from interface: IModGuiFactory

  returns: A class that will be instantiated on clicks on the config button
    or null if no GUI is desired. - `java.lang.Class<? extends net.minecraft.client.gui.GuiScreen>`"
  ([^ForgeGuiFactory this]
    (-> this (.mainConfigGuiClass))))

(defn runtime-gui-categories
  "Description copied from interface: IModGuiFactory

  returns: the set of options this mod wishes to have available, or empty if none - `java.util.Set<net.minecraftforge.fml.client.IModGuiFactory$RuntimeOptionCategoryElement>`"
  (^java.util.Set [^ForgeGuiFactory this]
    (-> this (.runtimeGuiCategories))))

(defn get-handler-for
  "Description copied from interface: IModGuiFactory

  element - The element we wish to paint for - `net.minecraftforge.fml.client.IModGuiFactory$RuntimeOptionCategoryElement`

  returns: The Handler for painting it - `net.minecraftforge.fml.client.IModGuiFactory$RuntimeOptionGuiHandler`"
  (^net.minecraftforge.fml.client.IModGuiFactory$RuntimeOptionGuiHandler [^ForgeGuiFactory this ^net.minecraftforge.fml.client.IModGuiFactory$RuntimeOptionCategoryElement element]
    (-> this (.getHandlerFor element))))

