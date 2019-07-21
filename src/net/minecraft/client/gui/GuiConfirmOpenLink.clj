(ns net.minecraft.client.gui.GuiConfirmOpenLink
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiConfirmOpenLink]))

(defn ->gui-confirm-open-link
  "Constructor.

  parent-screen-in - `net.minecraft.client.gui.GuiYesNoCallback`
  link-text-in - `java.lang.String`
  parent-button-clicked-id-in - `int`
  p-i-1084-4 - `boolean`"
  (^GuiConfirmOpenLink [^net.minecraft.client.gui.GuiYesNoCallback parent-screen-in ^java.lang.String link-text-in ^Integer parent-button-clicked-id-in ^Boolean p-i-1084-4]
    (new GuiConfirmOpenLink parent-screen-in link-text-in parent-button-clicked-id-in p-i-1084-4)))

(defn init-gui
  ""
  ([^GuiConfirmOpenLink this]
    (-> this (.initGui))))

(defn copy-link-to-clipboard
  ""
  ([^GuiConfirmOpenLink this]
    (-> this (.copyLinkToClipboard))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiConfirmOpenLink this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

(defn disable-security-warning
  ""
  ([^GuiConfirmOpenLink this]
    (-> this (.disableSecurityWarning))))

