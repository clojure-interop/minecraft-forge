(ns net.minecraftforge.client.event.RenderGameOverlayEvent$Chat
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event RenderGameOverlayEvent$Chat]))

(defn ->chat
  "Constructor.

  parent - `net.minecraftforge.client.event.RenderGameOverlayEvent`
  pos-x - `int`
  pos-y - `int`"
  (^RenderGameOverlayEvent$Chat [^net.minecraftforge.client.event.RenderGameOverlayEvent parent ^Integer pos-x ^Integer pos-y]
    (new RenderGameOverlayEvent$Chat parent pos-x pos-y)))

(defn get-pos-x
  "returns: `int`"
  (^Integer [^RenderGameOverlayEvent$Chat this]
    (-> this (.getPosX))))

(defn set-pos-x
  "pos-x - `int`"
  ([^RenderGameOverlayEvent$Chat this ^Integer pos-x]
    (-> this (.setPosX pos-x))))

(defn get-pos-y
  "returns: `int`"
  (^Integer [^RenderGameOverlayEvent$Chat this]
    (-> this (.getPosY))))

(defn set-pos-y
  "pos-y - `int`"
  ([^RenderGameOverlayEvent$Chat this ^Integer pos-y]
    (-> this (.setPosY pos-y))))

