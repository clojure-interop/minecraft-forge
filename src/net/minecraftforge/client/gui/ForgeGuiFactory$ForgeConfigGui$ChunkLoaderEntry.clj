(ns net.minecraftforge.client.gui.ForgeGuiFactory$ForgeConfigGui$ChunkLoaderEntry
  "This custom list entry provides the Forge Chunk Manager Config entry on the Minecraft Forge Configuration screen.
  It extends the base Category entry class and defines the IConfigElement objects that will be used to build the child screen."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.gui ForgeGuiFactory$ForgeConfigGui$ChunkLoaderEntry]))

(defn ->chunk-loader-entry
  "Constructor.

  owning-screen - `net.minecraftforge.fml.client.config.GuiConfig`
  owning-entry-list - `net.minecraftforge.fml.client.config.GuiConfigEntries`
  prop - `net.minecraftforge.fml.client.config.IConfigElement`"
  (^ForgeGuiFactory$ForgeConfigGui$ChunkLoaderEntry [^net.minecraftforge.fml.client.config.GuiConfig owning-screen ^net.minecraftforge.fml.client.config.GuiConfigEntries owning-entry-list ^net.minecraftforge.fml.client.config.IConfigElement prop]
    (new ForgeGuiFactory$ForgeConfigGui$ChunkLoaderEntry owning-screen owning-entry-list prop)))

