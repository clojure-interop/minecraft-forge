(ns net.minecraft.world.gen.structure.StructureVillagePieces$House3
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureVillagePieces$House3]))

(defn ->house-3
  "Constructor.

  start - `net.minecraft.world.gen.structure.StructureVillagePieces$Start`
  type - `int`
  rand - `java.util.Random`
  p-i-45561-4 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  facing - `net.minecraft.util.EnumFacing`"
  (^StructureVillagePieces$House3 [^net.minecraft.world.gen.structure.StructureVillagePieces$Start start ^Integer type ^java.util.Random rand ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45561-4 ^net.minecraft.util.EnumFacing facing]
    (new StructureVillagePieces$House3 start type rand p-i-45561-4 facing))
  (^StructureVillagePieces$House3 []
    (new StructureVillagePieces$House3 )))

(defn *create-piece
  "start - `net.minecraft.world.gen.structure.StructureVillagePieces$Start`
  p-175849-1 - `java.util.List`
  rand - `java.util.Random`
  p-175849-3 - `int`
  p-175849-4 - `int`
  p-175849-5 - `int`
  facing - `net.minecraft.util.EnumFacing`
  p-175849-7 - `int`

  returns: `net.minecraft.world.gen.structure.StructureVillagePieces$House3`"
  (^net.minecraft.world.gen.structure.StructureVillagePieces$House3 [^net.minecraft.world.gen.structure.StructureVillagePieces$Start start ^java.util.List p-175849-1 ^java.util.Random rand ^Integer p-175849-3 ^Integer p-175849-4 ^Integer p-175849-5 ^net.minecraft.util.EnumFacing facing ^Integer p-175849-7]
    (StructureVillagePieces$House3/createPiece start p-175849-1 rand p-175849-3 p-175849-4 p-175849-5 facing p-175849-7)))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureVillagePieces$House3 this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

