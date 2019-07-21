(ns net.minecraftforge.client.model.b3d.B3DModel$IKind
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.b3d B3DModel$IKind]))

(defn set-parent
  "parent - `net.minecraftforge.client.model.b3d.B3DModel$Node`"
  ([^B3DModel$IKind this ^net.minecraftforge.client.model.b3d.B3DModel$Node parent]
    (-> this (.setParent parent))))

(defn get-parent
  "returns: `net.minecraftforge.client.model.b3d.B3DModel$Node<K>`"
  (^net.minecraftforge.client.model.b3d.B3DModel$Node [^B3DModel$IKind this]
    (-> this (.getParent))))

