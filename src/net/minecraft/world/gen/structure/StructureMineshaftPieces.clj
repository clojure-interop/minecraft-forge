(ns net.minecraft.world.gen.structure.StructureMineshaftPieces
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureMineshaftPieces]))

(defn ->structure-mineshaft-pieces
  "Constructor."
  (^StructureMineshaftPieces []
    (new StructureMineshaftPieces )))

(defn *register-structure-pieces
  ""
  ([]
    (StructureMineshaftPieces/registerStructurePieces )))

