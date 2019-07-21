(ns net.minecraft.world.gen.structure.StructureStrongholdPieces
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureStrongholdPieces]))

(defn ->structure-stronghold-pieces
  "Constructor."
  (^StructureStrongholdPieces []
    (new StructureStrongholdPieces )))

(defn *register-stronghold-pieces
  ""
  ([]
    (StructureStrongholdPieces/registerStrongholdPieces )))

(defn *prepare-structure-pieces
  ""
  ([]
    (StructureStrongholdPieces/prepareStructurePieces )))

