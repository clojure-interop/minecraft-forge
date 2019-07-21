(ns net.minecraftforge.fml.client.FMLConfigGuiFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client FMLConfigGuiFactory]))

(defn ->fml-config-gui-factory
  "Constructor."
  (^FMLConfigGuiFactory []
    (new FMLConfigGuiFactory )))

(defn initialize
  "Description copied from interface: IModGuiFactory

  minecraft-instance - the instance - `net.minecraft.client.Minecraft`"
  ([^FMLConfigGuiFactory this ^net.minecraft.client.Minecraft minecraft-instance]
    (-> this (.initialize minecraft-instance))))

(defn main-config-gui-class
  "Description copied from interface: IModGuiFactory

  returns: A class that will be instantiated on clicks on the config button
    or null if no GUI is desired. - `java.lang.Class<? extends net.minecraft.client.gui.GuiScreen>`"
  ([^FMLConfigGuiFactory this]
    (-> this (.mainConfigGuiClass))))

(defn runtime-gui-categories
  "Description copied from interface: IModGuiFactory

  returns: the set of options this mod wishes to have available, or empty if none - `java.util.Set<net.minecraftforge.fml.client.IModGuiFactory$RuntimeOptionCategoryElement>`"
  (^java.util.Set [^FMLConfigGuiFactory this]
    (-> this (.runtimeGuiCategories))))

(defn get-handler-for
  "Description copied from interface: IModGuiFactory

  element - The element we wish to paint for - `net.minecraftforge.fml.client.IModGuiFactory$RuntimeOptionCategoryElement`

  returns: The Handler for painting it - `net.minecraftforge.fml.client.IModGuiFactory$RuntimeOptionGuiHandler`"
  (^net.minecraftforge.fml.client.IModGuiFactory$RuntimeOptionGuiHandler [^FMLConfigGuiFactory this ^net.minecraftforge.fml.client.IModGuiFactory$RuntimeOptionCategoryElement element]
    (-> this (.getHandlerFor element))))

