(ns net.minecraft.world.gen.structure.StructureVillagePieces
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureVillagePieces]))

(defn ->structure-village-pieces
  "Constructor."
  (^StructureVillagePieces []
    (new StructureVillagePieces )))

(defn *register-village-pieces
  ""
  ([]
    (StructureVillagePieces/registerVillagePieces )))

(defn *get-structure-village-weighted-piece-list
  "random - `java.util.Random`
  size - `int`

  returns: `java.util.List<net.minecraft.world.gen.structure.StructureVillagePieces$PieceWeight>`"
  (^java.util.List [^java.util.Random random ^Integer size]
    (StructureVillagePieces/getStructureVillageWeightedPieceList random size)))

