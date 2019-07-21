(ns net.minecraft.client.gui.GuiLockIconButton
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiLockIconButton]))

(defn ->gui-lock-icon-button
  "Constructor.

  button-id - `int`
  x - `int`
  y - `int`"
  (^GuiLockIconButton [^Integer button-id ^Integer x ^Integer y]
    (new GuiLockIconButton button-id x y)))

(defn locked?
  "returns: `boolean`"
  (^Boolean [^GuiLockIconButton this]
    (-> this (.isLocked))))

(defn set-locked
  "locked-in - `boolean`"
  ([^GuiLockIconButton this ^Boolean locked-in]
    (-> this (.setLocked locked-in))))

(defn draw-button
  "mc - `net.minecraft.client.Minecraft`
  mouse-x - `int`
  mouse-y - `int`"
  ([^GuiLockIconButton this ^net.minecraft.client.Minecraft mc ^Integer mouse-x ^Integer mouse-y]
    (-> this (.drawButton mc mouse-x mouse-y))))

