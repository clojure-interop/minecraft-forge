(ns net.minecraftforge.client.model.obj.OBJModel$UVsOutOfBoundsException
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.obj OBJModel$UVsOutOfBoundsException]))

(defn ->u-vs-out-of-bounds-exception
  "Constructor.

  model-location - `net.minecraft.util.ResourceLocation`"
  (^OBJModel$UVsOutOfBoundsException [^net.minecraft.util.ResourceLocation model-location]
    (new OBJModel$UVsOutOfBoundsException model-location)))

(defn model-location
  "Instance Field.

  type: net.minecraft.util.ResourceLocation"
  (^net.minecraft.util.ResourceLocation [^OBJModel$UVsOutOfBoundsException this]
    (-> this .-modelLocation)))

