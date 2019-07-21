(ns net.minecraft.client.gui.GuiCreateWorld
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiCreateWorld]))

(defn ->gui-create-world
  "Constructor.

  p-i-46320-1 - `net.minecraft.client.gui.GuiScreen`"
  (^GuiCreateWorld [^net.minecraft.client.gui.GuiScreen p-i-46320-1]
    (new GuiCreateWorld p-i-46320-1)))

(defn chunk-provider-settings-json
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^GuiCreateWorld this]
    (-> this .-chunkProviderSettingsJson)))

(defn *get-uncolliding-save-dir-name
  "save-loader - `net.minecraft.world.storage.ISaveFormat`
  name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^net.minecraft.world.storage.ISaveFormat save-loader ^java.lang.String name]
    (GuiCreateWorld/getUncollidingSaveDirName save-loader name)))

(defn update-screen
  ""
  ([^GuiCreateWorld this]
    (-> this (.updateScreen))))

(defn init-gui
  ""
  ([^GuiCreateWorld this]
    (-> this (.initGui))))

(defn on-gui-closed
  ""
  ([^GuiCreateWorld this]
    (-> this (.onGuiClosed))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiCreateWorld this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

(defn recreate-from-existing-world
  "original - `net.minecraft.world.storage.WorldInfo`"
  ([^GuiCreateWorld this ^net.minecraft.world.storage.WorldInfo original]
    (-> this (.recreateFromExistingWorld original))))

