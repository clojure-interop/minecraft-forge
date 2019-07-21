(ns net.minecraft.client.gui.inventory.GuiEditCommandBlockMinecart
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui.inventory GuiEditCommandBlockMinecart]))

(defn ->gui-edit-command-block-minecart
  "Constructor.

  p-i-46595-1 - `net.minecraft.tileentity.CommandBlockBaseLogic`"
  (^GuiEditCommandBlockMinecart [^net.minecraft.tileentity.CommandBlockBaseLogic p-i-46595-1]
    (new GuiEditCommandBlockMinecart p-i-46595-1)))

(defn update-screen
  ""
  ([^GuiEditCommandBlockMinecart this]
    (-> this (.updateScreen))))

(defn init-gui
  ""
  ([^GuiEditCommandBlockMinecart this]
    (-> this (.initGui))))

(defn on-gui-closed
  ""
  ([^GuiEditCommandBlockMinecart this]
    (-> this (.onGuiClosed))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiEditCommandBlockMinecart this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

(defn set-completions
  "new-completions - `java.lang.String`"
  ([^GuiEditCommandBlockMinecart this ^java.lang.String new-completions]
    (-> this (.setCompletions new-completions))))

