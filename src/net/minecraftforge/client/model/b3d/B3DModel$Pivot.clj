(ns net.minecraftforge.client.model.b3d.B3DModel$Pivot
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.b3d B3DModel$Pivot]))

(defn ->pivot
  "Constructor."
  (^B3DModel$Pivot []
    (new B3DModel$Pivot )))

(defn set-parent
  "parent - `net.minecraftforge.client.model.b3d.B3DModel$Node`"
  ([^B3DModel$Pivot this ^net.minecraftforge.client.model.b3d.B3DModel$Node parent]
    (-> this (.setParent parent))))

(defn get-parent
  "returns: `net.minecraftforge.client.model.b3d.B3DModel$Node<net.minecraftforge.client.model.b3d.B3DModel$Pivot>`"
  (^net.minecraftforge.client.model.b3d.B3DModel$Node [^B3DModel$Pivot this]
    (-> this (.getParent))))

