(ns net.minecraft.world.gen.structure.StructureVillagePieces$House1
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureVillagePieces$House1]))

(defn ->house-1
  "Constructor.

  start - `net.minecraft.world.gen.structure.StructureVillagePieces$Start`
  type - `int`
  rand - `java.util.Random`
  p-i-45571-4 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  facing - `net.minecraft.util.EnumFacing`"
  (^StructureVillagePieces$House1 [^net.minecraft.world.gen.structure.StructureVillagePieces$Start start ^Integer type ^java.util.Random rand ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45571-4 ^net.minecraft.util.EnumFacing facing]
    (new StructureVillagePieces$House1 start type rand p-i-45571-4 facing))
  (^StructureVillagePieces$House1 []
    (new StructureVillagePieces$House1 )))

(defn *create-piece
  "start - `net.minecraft.world.gen.structure.StructureVillagePieces$Start`
  p-175850-1 - `java.util.List`
  rand - `java.util.Random`
  p-175850-3 - `int`
  p-175850-4 - `int`
  p-175850-5 - `int`
  facing - `net.minecraft.util.EnumFacing`
  p-175850-7 - `int`

  returns: `net.minecraft.world.gen.structure.StructureVillagePieces$House1`"
  (^net.minecraft.world.gen.structure.StructureVillagePieces$House1 [^net.minecraft.world.gen.structure.StructureVillagePieces$Start start ^java.util.List p-175850-1 ^java.util.Random rand ^Integer p-175850-3 ^Integer p-175850-4 ^Integer p-175850-5 ^net.minecraft.util.EnumFacing facing ^Integer p-175850-7]
    (StructureVillagePieces$House1/createPiece start p-175850-1 rand p-175850-3 p-175850-4 p-175850-5 facing p-175850-7)))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureVillagePieces$House1 this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

