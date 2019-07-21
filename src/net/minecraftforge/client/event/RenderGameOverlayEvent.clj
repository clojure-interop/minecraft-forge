(ns net.minecraftforge.client.event.RenderGameOverlayEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event RenderGameOverlayEvent]))

(defn ->render-game-overlay-event
  "Constructor.

  partial-ticks - `float`
  resolution - `net.minecraft.client.gui.ScaledResolution`"
  (^RenderGameOverlayEvent [^Float partial-ticks ^net.minecraft.client.gui.ScaledResolution resolution]
    (new RenderGameOverlayEvent partial-ticks resolution)))

(defn get-partial-ticks
  "returns: `float`"
  (^Float [^RenderGameOverlayEvent this]
    (-> this (.getPartialTicks))))

(defn get-resolution
  "returns: `net.minecraft.client.gui.ScaledResolution`"
  (^net.minecraft.client.gui.ScaledResolution [^RenderGameOverlayEvent this]
    (-> this (.getResolution))))

(defn get-type
  "returns: `net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType`"
  (^net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType [^RenderGameOverlayEvent this]
    (-> this (.getType))))

