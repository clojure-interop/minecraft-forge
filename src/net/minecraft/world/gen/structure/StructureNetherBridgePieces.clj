(ns net.minecraft.world.gen.structure.StructureNetherBridgePieces
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureNetherBridgePieces]))

(defn ->structure-nether-bridge-pieces
  "Constructor."
  (^StructureNetherBridgePieces []
    (new StructureNetherBridgePieces )))

(defn *register-nether-fortress-pieces
  ""
  ([]
    (StructureNetherBridgePieces/registerNetherFortressPieces )))

