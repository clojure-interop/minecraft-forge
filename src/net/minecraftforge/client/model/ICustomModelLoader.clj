(ns net.minecraftforge.client.model.ICustomModelLoader
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model ICustomModelLoader]))

(defn accepts
  "model-location - `net.minecraft.util.ResourceLocation`

  returns: `boolean`"
  (^Boolean [^ICustomModelLoader this ^net.minecraft.util.ResourceLocation model-location]
    (-> this (.accepts model-location))))

(defn load-model
  "model-location - `net.minecraft.util.ResourceLocation`

  returns: `net.minecraftforge.client.model.IModel`

  throws: java.lang.Exception"
  (^net.minecraftforge.client.model.IModel [^ICustomModelLoader this ^net.minecraft.util.ResourceLocation model-location]
    (-> this (.loadModel model-location))))

