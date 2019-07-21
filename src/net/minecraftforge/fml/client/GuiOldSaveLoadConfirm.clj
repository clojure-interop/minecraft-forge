(ns net.minecraftforge.fml.client.GuiOldSaveLoadConfirm
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client GuiOldSaveLoadConfirm]))

(defn ->gui-old-save-load-confirm
  "Constructor.

  dir-name - `java.lang.String`
  save-name - `java.lang.String`
  parent - `net.minecraft.client.gui.GuiScreen`"
  (^GuiOldSaveLoadConfirm [^java.lang.String dir-name ^java.lang.String save-name ^net.minecraft.client.gui.GuiScreen parent]
    (new GuiOldSaveLoadConfirm dir-name save-name parent)))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiOldSaveLoadConfirm this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

