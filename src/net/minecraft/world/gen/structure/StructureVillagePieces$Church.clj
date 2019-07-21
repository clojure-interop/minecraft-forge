(ns net.minecraft.world.gen.structure.StructureVillagePieces$Church
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureVillagePieces$Church]))

(defn ->church
  "Constructor.

  start - `net.minecraft.world.gen.structure.StructureVillagePieces$Start`
  type - `int`
  rand - `java.util.Random`
  p-i-45564-4 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  facing - `net.minecraft.util.EnumFacing`"
  (^StructureVillagePieces$Church [^net.minecraft.world.gen.structure.StructureVillagePieces$Start start ^Integer type ^java.util.Random rand ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45564-4 ^net.minecraft.util.EnumFacing facing]
    (new StructureVillagePieces$Church start type rand p-i-45564-4 facing))
  (^StructureVillagePieces$Church []
    (new StructureVillagePieces$Church )))

(defn *create-piece
  "start - `net.minecraft.world.gen.structure.StructureVillagePieces$Start`
  p-175854-1 - `java.util.List`
  rand - `java.util.Random`
  p-175854-3 - `int`
  p-175854-4 - `int`
  p-175854-5 - `int`
  facing - `net.minecraft.util.EnumFacing`
  p-175854-7 - `int`

  returns: `net.minecraft.world.gen.structure.StructureVillagePieces$Church`"
  (^net.minecraft.world.gen.structure.StructureVillagePieces$Church [^net.minecraft.world.gen.structure.StructureVillagePieces$Start start ^java.util.List p-175854-1 ^java.util.Random rand ^Integer p-175854-3 ^Integer p-175854-4 ^Integer p-175854-5 ^net.minecraft.util.EnumFacing facing ^Integer p-175854-7]
    (StructureVillagePieces$Church/createPiece start p-175854-1 rand p-175854-3 p-175854-4 p-175854-5 facing p-175854-7)))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureVillagePieces$Church this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

