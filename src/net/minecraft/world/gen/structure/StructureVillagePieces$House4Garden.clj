(ns net.minecraft.world.gen.structure.StructureVillagePieces$House4Garden
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureVillagePieces$House4Garden]))

(defn ->house-4-garden
  "Constructor.

  start - `net.minecraft.world.gen.structure.StructureVillagePieces$Start`
  p-i-45566-2 - `int`
  rand - `java.util.Random`
  p-i-45566-4 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  facing - `net.minecraft.util.EnumFacing`"
  (^StructureVillagePieces$House4Garden [^net.minecraft.world.gen.structure.StructureVillagePieces$Start start ^Integer p-i-45566-2 ^java.util.Random rand ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45566-4 ^net.minecraft.util.EnumFacing facing]
    (new StructureVillagePieces$House4Garden start p-i-45566-2 rand p-i-45566-4 facing))
  (^StructureVillagePieces$House4Garden []
    (new StructureVillagePieces$House4Garden )))

(defn *create-piece
  "start - `net.minecraft.world.gen.structure.StructureVillagePieces$Start`
  p-175858-1 - `java.util.List`
  rand - `java.util.Random`
  p-175858-3 - `int`
  p-175858-4 - `int`
  p-175858-5 - `int`
  facing - `net.minecraft.util.EnumFacing`
  p-175858-7 - `int`

  returns: `net.minecraft.world.gen.structure.StructureVillagePieces$House4Garden`"
  (^net.minecraft.world.gen.structure.StructureVillagePieces$House4Garden [^net.minecraft.world.gen.structure.StructureVillagePieces$Start start ^java.util.List p-175858-1 ^java.util.Random rand ^Integer p-175858-3 ^Integer p-175858-4 ^Integer p-175858-5 ^net.minecraft.util.EnumFacing facing ^Integer p-175858-7]
    (StructureVillagePieces$House4Garden/createPiece start p-175858-1 rand p-175858-3 p-175858-4 p-175858-5 facing p-175858-7)))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureVillagePieces$House4Garden this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

