(ns net.minecraft.world.ColorizerFoliage
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world ColorizerFoliage]))

(defn ->colorizer-foliage
  "Constructor."
  (^ColorizerFoliage []
    (new ColorizerFoliage )))

(defn *set-foliage-biome-colorizer
  "foliage-buffer-in - `int[]`"
  ([foliage-buffer-in]
    (ColorizerFoliage/setFoliageBiomeColorizer foliage-buffer-in)))

(defn *get-foliage-color
  "temperature - `double`
  humidity - `double`

  returns: `int`"
  (^Integer [^Double temperature ^Double humidity]
    (ColorizerFoliage/getFoliageColor temperature humidity)))

(defn *get-foliage-color-pine
  "returns: `int`"
  (^Integer []
    (ColorizerFoliage/getFoliageColorPine )))

(defn *get-foliage-color-birch
  "returns: `int`"
  (^Integer []
    (ColorizerFoliage/getFoliageColorBirch )))

(defn *get-foliage-color-basic
  "returns: `int`"
  (^Integer []
    (ColorizerFoliage/getFoliageColorBasic )))

