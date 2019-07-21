(ns net.minecraft.client.gui.spectator.categories.SpectatorDetails
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui.spectator.categories SpectatorDetails]))

(defn ->spectator-details
  "Constructor.

  p-i-45494-1 - `net.minecraft.client.gui.spectator.ISpectatorMenuView`
  p-i-45494-2 - `java.util.List`
  p-i-45494-3 - `int`"
  (^SpectatorDetails [^net.minecraft.client.gui.spectator.ISpectatorMenuView p-i-45494-1 ^java.util.List p-i-45494-2 ^Integer p-i-45494-3]
    (new SpectatorDetails p-i-45494-1 p-i-45494-2 p-i-45494-3)))

(defn get-object
  "p-178680-1 - `int`

  returns: `net.minecraft.client.gui.spectator.ISpectatorMenuObject`"
  (^net.minecraft.client.gui.spectator.ISpectatorMenuObject [^SpectatorDetails this ^Integer p-178680-1]
    (-> this (.getObject p-178680-1))))

(defn get-selected-slot
  "returns: `int`"
  (^Integer [^SpectatorDetails this]
    (-> this (.getSelectedSlot))))

