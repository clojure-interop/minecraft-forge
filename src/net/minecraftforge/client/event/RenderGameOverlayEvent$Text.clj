(ns net.minecraftforge.client.event.RenderGameOverlayEvent$Text
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event RenderGameOverlayEvent$Text]))

(defn ->text
  "Constructor.

  parent - `net.minecraftforge.client.event.RenderGameOverlayEvent`
  left - `java.util.ArrayList`
  right - `java.util.ArrayList`"
  (^RenderGameOverlayEvent$Text [^net.minecraftforge.client.event.RenderGameOverlayEvent parent ^java.util.ArrayList left ^java.util.ArrayList right]
    (new RenderGameOverlayEvent$Text parent left right)))

(defn get-left
  "returns: `java.util.ArrayList<java.lang.String>`"
  (^java.util.ArrayList [^RenderGameOverlayEvent$Text this]
    (-> this (.getLeft))))

(defn get-right
  "returns: `java.util.ArrayList<java.lang.String>`"
  (^java.util.ArrayList [^RenderGameOverlayEvent$Text this]
    (-> this (.getRight))))

