(ns net.minecraft.client.gui.GuiResourcePackAvailable
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiResourcePackAvailable]))

(defn ->gui-resource-pack-available
  "Constructor.

  mc-in - `net.minecraft.client.Minecraft`
  p-i-45054-2 - `int`
  p-i-45054-3 - `int`
  p-i-45054-4 - `java.util.List`"
  (^GuiResourcePackAvailable [^net.minecraft.client.Minecraft mc-in ^Integer p-i-45054-2 ^Integer p-i-45054-3 ^java.util.List p-i-45054-4]
    (new GuiResourcePackAvailable mc-in p-i-45054-2 p-i-45054-3 p-i-45054-4)))

