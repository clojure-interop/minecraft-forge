(ns net.minecraftforge.client.model.animation.IAnimatedModel
  "IModel that has animation data."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.animation IAnimatedModel]))

(defn get-clip
  "name - `java.lang.String`

  returns: `com.google.common.base.Optional<? extends net.minecraftforge.common.model.animation.IClip>`"
  ([^IAnimatedModel this ^java.lang.String name]
    (-> this (.getClip name))))

