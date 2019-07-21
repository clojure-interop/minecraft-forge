(ns net.minecraftforge.client.event.RenderGameOverlayEvent$Pre
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event RenderGameOverlayEvent$Pre]))

(defn ->pre
  "Constructor.

  parent - `net.minecraftforge.client.event.RenderGameOverlayEvent`
  type - `net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType`"
  (^RenderGameOverlayEvent$Pre [^net.minecraftforge.client.event.RenderGameOverlayEvent parent ^net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType type]
    (new RenderGameOverlayEvent$Pre parent type)))

