(ns net.minecraft.world.gen.structure.StructureNetherBridgePieces$Start
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureNetherBridgePieces$Start]))

(defn ->start
  "Constructor.

  p-i-2059-1 - `java.util.Random`
  p-i-2059-2 - `int`
  p-i-2059-3 - `int`"
  (^StructureNetherBridgePieces$Start [^java.util.Random p-i-2059-1 ^Integer p-i-2059-2 ^Integer p-i-2059-3]
    (new StructureNetherBridgePieces$Start p-i-2059-1 p-i-2059-2 p-i-2059-3))
  (^StructureNetherBridgePieces$Start []
    (new StructureNetherBridgePieces$Start )))

(defn the-nether-bridge-piece-weight
  "Instance Field.

  type: net.minecraft.world.gen.structure.StructureNetherBridgePieces.PieceWeight"
  (^net.minecraft.world.gen.structure.StructureNetherBridgePieces.PieceWeight [^StructureNetherBridgePieces$Start this]
    (-> this .-theNetherBridgePieceWeight)))

(defn primary-weights
  "Instance Field.

  type: java.util.List<net.minecraft.world.gen.structure.StructureNetherBridgePieces.PieceWeight>"
  (^java.util.List [^StructureNetherBridgePieces$Start this]
    (-> this .-primaryWeights)))

(defn secondary-weights
  "Instance Field.

  type: java.util.List<net.minecraft.world.gen.structure.StructureNetherBridgePieces.PieceWeight>"
  (^java.util.List [^StructureNetherBridgePieces$Start this]
    (-> this .-secondaryWeights)))

(defn pending-children
  "Instance Field.

  type: java.util.List<net.minecraft.world.gen.structure.StructureComponent>"
  (^java.util.List [^StructureNetherBridgePieces$Start this]
    (-> this .-pendingChildren)))

