(ns net.minecraftforge.fml.client.IModGuiFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client IModGuiFactory]))

(defn initialize
  "Called when instantiated to initialize with the active minecraft instance.

  minecraft-instance - the instance - `net.minecraft.client.Minecraft`"
  ([^IModGuiFactory this ^net.minecraft.client.Minecraft minecraft-instance]
    (-> this (.initialize minecraft-instance))))

(defn main-config-gui-class
  "Return the name of a class extending GuiScreen. This class will
   be instantiated when the \"config\" button is pressed in the mod list. It will
   have a single argument constructor - the \"parent\" screen, the same as all
   Minecraft GUIs. The expected behaviour is that this screen will replace the
   \"mod list\" screen completely, and will return to the mod list screen through
   the parent link, once the appropriate action is taken from the config screen.

   A null from this method indicates that the mod does not provide a \"config\"
   button GUI screen, and the config button will be hidden/disabled.

   This config GUI is anticipated to provide configuration to the mod in a friendly
   visual way. It should not be abused to set internals such as IDs (they're gonna
   keep disappearing anyway), but rather, interesting behaviours. This config GUI
   is never run when a server game is running, and should be used to configure
   desired behaviours that affect server state. Costs, mod game modes, stuff like that
   can be changed here.

  returns: A class that will be instantiated on clicks on the config button
    or null if no GUI is desired. - `java.lang.Class<? extends net.minecraft.client.gui.GuiScreen>`"
  ([^IModGuiFactory this]
    (-> this (.mainConfigGuiClass))))

(defn runtime-gui-categories
  "Return a list of the \"runtime\" categories this mod wishes to populate with
   GUI elements.

   Runtime categories are created on demand and organized in a 'lite' tree format.
   The parent represents the parent node in the tree. There is one special parent
   'Help' that will always list first, and is generally meant to provide Help type
   content for mods. The remaining parents will sort alphabetically, though
   this may change if there is a lot of alphabetic abuse. \"AAA\" is probably never a valid
   category parent.

   Runtime configuration itself falls into two flavours: in-game help, which is
   generally non interactive except for the text it wishes to show, and client-only
   affecting behaviours. This would include things like toggling minimaps, or cheat modes
   or anything NOT affecting the behaviour of the server. Please don't abuse this to
   change the state of the server in any way, this is intended to behave identically
   when the server is local or remote.

  returns: the set of options this mod wishes to have available, or empty if none - `java.util.Set<net.minecraftforge.fml.client.IModGuiFactory$RuntimeOptionCategoryElement>`"
  (^java.util.Set [^IModGuiFactory this]
    (-> this (.runtimeGuiCategories))))

(defn get-handler-for
  "Return an instance of a IModGuiFactory.RuntimeOptionGuiHandler that handles painting the
   right hand side option screen for the specified IModGuiFactory.RuntimeOptionCategoryElement.

  element - The element we wish to paint for - `net.minecraftforge.fml.client.IModGuiFactory$RuntimeOptionCategoryElement`

  returns: The Handler for painting it - `net.minecraftforge.fml.client.IModGuiFactory$RuntimeOptionGuiHandler`"
  (^net.minecraftforge.fml.client.IModGuiFactory$RuntimeOptionGuiHandler [^IModGuiFactory this ^net.minecraftforge.fml.client.IModGuiFactory$RuntimeOptionCategoryElement element]
    (-> this (.getHandlerFor element))))

