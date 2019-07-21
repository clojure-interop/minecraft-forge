(ns net.minecraft.client.gui.GuiSpectator
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiSpectator]))

(defn ->gui-spectator
  "Constructor.

  mc-in - `net.minecraft.client.Minecraft`"
  (^GuiSpectator [^net.minecraft.client.Minecraft mc-in]
    (new GuiSpectator mc-in)))

(def *-spectator-widgets
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  GuiSpectator/SPECTATOR_WIDGETS)

(defn on-hotbar-selected
  "p-175260-1 - `int`"
  ([^GuiSpectator this ^Integer p-175260-1]
    (-> this (.onHotbarSelected p-175260-1))))

(defn render-tooltip
  "p-175264-1 - `net.minecraft.client.gui.ScaledResolution`
  p-175264-2 - `float`"
  ([^GuiSpectator this ^net.minecraft.client.gui.ScaledResolution p-175264-1 ^Float p-175264-2]
    (-> this (.renderTooltip p-175264-1 p-175264-2))))

(defn render-selected-item
  "p-175263-1 - `net.minecraft.client.gui.ScaledResolution`"
  ([^GuiSpectator this ^net.minecraft.client.gui.ScaledResolution p-175263-1]
    (-> this (.renderSelectedItem p-175263-1))))

(defn on-spectator-menu-closed
  "p-175257-1 - `net.minecraft.client.gui.spectator.SpectatorMenu`"
  ([^GuiSpectator this ^net.minecraft.client.gui.spectator.SpectatorMenu p-175257-1]
    (-> this (.onSpectatorMenuClosed p-175257-1))))

(defn menu-active?
  "returns: `boolean`"
  (^Boolean [^GuiSpectator this]
    (-> this (.isMenuActive))))

(defn on-mouse-scroll
  "p-175259-1 - `int`"
  ([^GuiSpectator this ^Integer p-175259-1]
    (-> this (.onMouseScroll p-175259-1))))

(defn on-middle-click
  ""
  ([^GuiSpectator this]
    (-> this (.onMiddleClick))))

