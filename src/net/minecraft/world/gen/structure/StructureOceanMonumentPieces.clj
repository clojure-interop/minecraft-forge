(ns net.minecraft.world.gen.structure.StructureOceanMonumentPieces
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureOceanMonumentPieces]))

(defn ->structure-ocean-monument-pieces
  "Constructor."
  (^StructureOceanMonumentPieces []
    (new StructureOceanMonumentPieces )))

(defn *register-ocean-monument-pieces
  ""
  ([]
    (StructureOceanMonumentPieces/registerOceanMonumentPieces )))

