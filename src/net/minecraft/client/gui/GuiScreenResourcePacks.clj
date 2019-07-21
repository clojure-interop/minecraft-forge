(ns net.minecraft.client.gui.GuiScreenResourcePacks
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiScreenResourcePacks]))

(defn ->gui-screen-resource-packs
  "Constructor.

  parent-screen-in - `net.minecraft.client.gui.GuiScreen`"
  (^GuiScreenResourcePacks [^net.minecraft.client.gui.GuiScreen parent-screen-in]
    (new GuiScreenResourcePacks parent-screen-in)))

(defn init-gui
  ""
  ([^GuiScreenResourcePacks this]
    (-> this (.initGui))))

(defn handle-mouse-input
  "throws: java.io.IOException"
  ([^GuiScreenResourcePacks this]
    (-> this (.handleMouseInput))))

(defn has-resource-pack-entry?
  "resource-pack-entry - `net.minecraft.client.resources.ResourcePackListEntry`

  returns: `boolean`"
  (^Boolean [^GuiScreenResourcePacks this ^net.minecraft.client.resources.ResourcePackListEntry resource-pack-entry]
    (-> this (.hasResourcePackEntry resource-pack-entry))))

(defn get-list-containing
  "resource-pack-entry - `net.minecraft.client.resources.ResourcePackListEntry`

  returns: `java.util.List<net.minecraft.client.resources.ResourcePackListEntry>`"
  (^java.util.List [^GuiScreenResourcePacks this ^net.minecraft.client.resources.ResourcePackListEntry resource-pack-entry]
    (-> this (.getListContaining resource-pack-entry))))

(defn get-available-resource-packs
  "returns: `java.util.List<net.minecraft.client.resources.ResourcePackListEntry>`"
  (^java.util.List [^GuiScreenResourcePacks this]
    (-> this (.getAvailableResourcePacks))))

(defn get-selected-resource-packs
  "returns: `java.util.List<net.minecraft.client.resources.ResourcePackListEntry>`"
  (^java.util.List [^GuiScreenResourcePacks this]
    (-> this (.getSelectedResourcePacks))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiScreenResourcePacks this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

(defn mark-changed
  ""
  ([^GuiScreenResourcePacks this]
    (-> this (.markChanged))))

