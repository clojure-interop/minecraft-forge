(ns net.minecraft.client.gui.GuiResourcePackList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiResourcePackList]))

(defn ->gui-resource-pack-list
  "Constructor.

  mc-in - `net.minecraft.client.Minecraft`
  p-i-45055-2 - `int`
  p-i-45055-3 - `int`
  p-i-45055-4 - `java.util.List`"
  (^GuiResourcePackList [^net.minecraft.client.Minecraft mc-in ^Integer p-i-45055-2 ^Integer p-i-45055-3 ^java.util.List p-i-45055-4]
    (new GuiResourcePackList mc-in p-i-45055-2 p-i-45055-3 p-i-45055-4)))

(defn get-list
  "returns: `java.util.List<net.minecraft.client.resources.ResourcePackListEntry>`"
  (^java.util.List [^GuiResourcePackList this]
    (-> this (.getList))))

(defn get-list-entry
  "index - `int`

  returns: `net.minecraft.client.resources.ResourcePackListEntry`"
  (^net.minecraft.client.resources.ResourcePackListEntry [^GuiResourcePackList this ^Integer index]
    (-> this (.getListEntry index))))

(defn get-list-width
  "returns: `int`"
  (^Integer [^GuiResourcePackList this]
    (-> this (.getListWidth))))

