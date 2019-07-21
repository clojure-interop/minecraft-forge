(ns net.minecraft.client.renderer.texture.ITickable
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.texture ITickable]))

(defn tick
  ""
  ([^ITickable this]
    (-> this (.tick))))

