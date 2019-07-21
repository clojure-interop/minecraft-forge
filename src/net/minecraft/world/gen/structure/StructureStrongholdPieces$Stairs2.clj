(ns net.minecraft.world.gen.structure.StructureStrongholdPieces$Stairs2
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureStrongholdPieces$Stairs2]))

(defn ->stairs-2
  "Constructor.

  p-i-2083-1 - `int`
  p-i-2083-2 - `java.util.Random`
  p-i-2083-3 - `int`
  p-i-2083-4 - `int`"
  (^StructureStrongholdPieces$Stairs2 [^Integer p-i-2083-1 ^java.util.Random p-i-2083-2 ^Integer p-i-2083-3 ^Integer p-i-2083-4]
    (new StructureStrongholdPieces$Stairs2 p-i-2083-1 p-i-2083-2 p-i-2083-3 p-i-2083-4))
  (^StructureStrongholdPieces$Stairs2 []
    (new StructureStrongholdPieces$Stairs2 )))

(defn stronghold-piece-weight
  "Instance Field.

  type: net.minecraft.world.gen.structure.StructureStrongholdPieces.PieceWeight"
  (^net.minecraft.world.gen.structure.StructureStrongholdPieces.PieceWeight [^StructureStrongholdPieces$Stairs2 this]
    (-> this .-strongholdPieceWeight)))

(defn stronghold-portal-room
  "Instance Field.

  type: net.minecraft.world.gen.structure.StructureStrongholdPieces$PortalRoom"
  (^net.minecraft.world.gen.structure.StructureStrongholdPieces$PortalRoom [^StructureStrongholdPieces$Stairs2 this]
    (-> this .-strongholdPortalRoom)))

(defn pending-children
  "Instance Field.

  type: java.util.List<net.minecraft.world.gen.structure.StructureComponent>"
  (^java.util.List [^StructureStrongholdPieces$Stairs2 this]
    (-> this .-pendingChildren)))

