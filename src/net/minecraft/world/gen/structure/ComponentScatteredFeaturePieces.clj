(ns net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure ComponentScatteredFeaturePieces]))

(defn ->component-scattered-feature-pieces
  "Constructor."
  (^ComponentScatteredFeaturePieces []
    (new ComponentScatteredFeaturePieces )))

(defn *register-scattered-feature-pieces
  ""
  ([]
    (ComponentScatteredFeaturePieces/registerScatteredFeaturePieces )))

