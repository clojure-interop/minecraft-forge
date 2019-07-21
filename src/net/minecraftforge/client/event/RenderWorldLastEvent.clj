(ns net.minecraftforge.client.event.RenderWorldLastEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event RenderWorldLastEvent]))

(defn ->render-world-last-event
  "Constructor.

  context - `net.minecraft.client.renderer.RenderGlobal`
  partial-ticks - `float`"
  (^RenderWorldLastEvent [^net.minecraft.client.renderer.RenderGlobal context ^Float partial-ticks]
    (new RenderWorldLastEvent context partial-ticks)))

(defn get-context
  "returns: `net.minecraft.client.renderer.RenderGlobal`"
  (^net.minecraft.client.renderer.RenderGlobal [^RenderWorldLastEvent this]
    (-> this (.getContext))))

(defn get-partial-ticks
  "returns: `float`"
  (^Float [^RenderWorldLastEvent this]
    (-> this (.getPartialTicks))))

