(ns net.minecraft.world.gen.structure.StructureVillagePieces$House2
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureVillagePieces$House2]))

(defn ->house-2
  "Constructor.

  start - `net.minecraft.world.gen.structure.StructureVillagePieces$Start`
  type - `int`
  rand - `java.util.Random`
  p-i-45563-4 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  facing - `net.minecraft.util.EnumFacing`"
  (^StructureVillagePieces$House2 [^net.minecraft.world.gen.structure.StructureVillagePieces$Start start ^Integer type ^java.util.Random rand ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45563-4 ^net.minecraft.util.EnumFacing facing]
    (new StructureVillagePieces$House2 start type rand p-i-45563-4 facing))
  (^StructureVillagePieces$House2 []
    (new StructureVillagePieces$House2 )))

(defn *create-piece
  "start - `net.minecraft.world.gen.structure.StructureVillagePieces$Start`
  p-175855-1 - `java.util.List`
  rand - `java.util.Random`
  p-175855-3 - `int`
  p-175855-4 - `int`
  p-175855-5 - `int`
  facing - `net.minecraft.util.EnumFacing`
  p-175855-7 - `int`

  returns: `net.minecraft.world.gen.structure.StructureVillagePieces$House2`"
  (^net.minecraft.world.gen.structure.StructureVillagePieces$House2 [^net.minecraft.world.gen.structure.StructureVillagePieces$Start start ^java.util.List p-175855-1 ^java.util.Random rand ^Integer p-175855-3 ^Integer p-175855-4 ^Integer p-175855-5 ^net.minecraft.util.EnumFacing facing ^Integer p-175855-7]
    (StructureVillagePieces$House2/createPiece start p-175855-1 rand p-175855-3 p-175855-4 p-175855-5 facing p-175855-7)))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureVillagePieces$House2 this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

