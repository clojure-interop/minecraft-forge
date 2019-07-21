(ns net.minecraft.client.gui.inventory.GuiContainerCreative
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui.inventory GuiContainerCreative]))

(defn ->gui-container-creative
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`"
  (^GuiContainerCreative [^net.minecraft.entity.player.EntityPlayer player]
    (new GuiContainerCreative player)))

(defn update-screen
  ""
  ([^GuiContainerCreative this]
    (-> this (.updateScreen))))

(defn init-gui
  ""
  ([^GuiContainerCreative this]
    (-> this (.initGui))))

(defn on-gui-closed
  ""
  ([^GuiContainerCreative this]
    (-> this (.onGuiClosed))))

(defn handle-mouse-input
  "throws: java.io.IOException"
  ([^GuiContainerCreative this]
    (-> this (.handleMouseInput))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiContainerCreative this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

(defn get-selected-tab-index
  "returns: `int`"
  (^Integer [^GuiContainerCreative this]
    (-> this (.getSelectedTabIndex))))

