(ns net.minecraft.client.renderer.block.model.ItemOverride
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model ItemOverride]))

(defn ->item-override
  "Constructor.

  location-in - `net.minecraft.util.ResourceLocation`
  property-values - `java.util.Map`"
  (^ItemOverride [^net.minecraft.util.ResourceLocation location-in ^java.util.Map property-values]
    (new ItemOverride location-in property-values)))

(defn get-location
  "returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^ItemOverride this]
    (-> this (.getLocation))))

