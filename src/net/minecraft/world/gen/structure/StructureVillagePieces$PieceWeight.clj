(ns net.minecraft.world.gen.structure.StructureVillagePieces$PieceWeight
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureVillagePieces$PieceWeight]))

(defn ->piece-weight
  "Constructor.

  p-i-2098-1 - `java.lang.Class`
  p-i-2098-2 - `int`
  p-i-2098-3 - `int`"
  (^StructureVillagePieces$PieceWeight [^java.lang.Class p-i-2098-1 ^Integer p-i-2098-2 ^Integer p-i-2098-3]
    (new StructureVillagePieces$PieceWeight p-i-2098-1 p-i-2098-2 p-i-2098-3)))

(defn village-piece-class
  "Instance Field.

  type: java.lang.Class<? extends net.minecraft.world.gen.structure.StructureVillagePieces$Village>"
  ([^StructureVillagePieces$PieceWeight this]
    (-> this .-villagePieceClass)))

(defn village-piece-weight
  "Instance Constant.

  type: int"
  (^Integer [^StructureVillagePieces$PieceWeight this]
    (-> this .-villagePieceWeight)))

(defn village-pieces-spawned
  "Instance Field.

  type: int"
  (^Integer [^StructureVillagePieces$PieceWeight this]
    (-> this .-villagePiecesSpawned)))

(defn village-pieces-limit
  "Instance Field.

  type: int"
  (^Integer [^StructureVillagePieces$PieceWeight this]
    (-> this .-villagePiecesLimit)))

(defn can-spawn-more-village-pieces-of-type?
  "component-type - `int`

  returns: `boolean`"
  (^Boolean [^StructureVillagePieces$PieceWeight this ^Integer component-type]
    (-> this (.canSpawnMoreVillagePiecesOfType component-type))))

(defn can-spawn-more-village-pieces?
  "returns: `boolean`"
  (^Boolean [^StructureVillagePieces$PieceWeight this]
    (-> this (.canSpawnMoreVillagePieces))))

