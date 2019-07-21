(ns net.minecraft.client.gui.GuiResourcePackSelected
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiResourcePackSelected]))

(defn ->gui-resource-pack-selected
  "Constructor.

  mc-in - `net.minecraft.client.Minecraft`
  p-i-45056-2 - `int`
  p-i-45056-3 - `int`
  p-i-45056-4 - `java.util.List`"
  (^GuiResourcePackSelected [^net.minecraft.client.Minecraft mc-in ^Integer p-i-45056-2 ^Integer p-i-45056-3 ^java.util.List p-i-45056-4]
    (new GuiResourcePackSelected mc-in p-i-45056-2 p-i-45056-3 p-i-45056-4)))

