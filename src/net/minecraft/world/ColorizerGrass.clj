(ns net.minecraft.world.ColorizerGrass
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world ColorizerGrass]))

(defn ->colorizer-grass
  "Constructor."
  (^ColorizerGrass []
    (new ColorizerGrass )))

(defn *set-grass-biome-colorizer
  "grass-buffer-in - `int[]`"
  ([grass-buffer-in]
    (ColorizerGrass/setGrassBiomeColorizer grass-buffer-in)))

(defn *get-grass-color
  "temperature - `double`
  humidity - `double`

  returns: `int`"
  (^Integer [^Double temperature ^Double humidity]
    (ColorizerGrass/getGrassColor temperature humidity)))

