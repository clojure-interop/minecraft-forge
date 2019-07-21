(ns net.minecraft.world.gen.structure.StructureVillagePieces$Torch
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureVillagePieces$Torch]))

(defn ->torch
  "Constructor.

  start - `net.minecraft.world.gen.structure.StructureVillagePieces$Start`
  p-i-45568-2 - `int`
  rand - `java.util.Random`
  p-i-45568-4 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  facing - `net.minecraft.util.EnumFacing`"
  (^StructureVillagePieces$Torch [^net.minecraft.world.gen.structure.StructureVillagePieces$Start start ^Integer p-i-45568-2 ^java.util.Random rand ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45568-4 ^net.minecraft.util.EnumFacing facing]
    (new StructureVillagePieces$Torch start p-i-45568-2 rand p-i-45568-4 facing))
  (^StructureVillagePieces$Torch []
    (new StructureVillagePieces$Torch )))

(defn *find-piece-box
  "start - `net.minecraft.world.gen.structure.StructureVillagePieces$Start`
  p-175856-1 - `java.util.List`
  rand - `java.util.Random`
  p-175856-3 - `int`
  p-175856-4 - `int`
  p-175856-5 - `int`
  facing - `net.minecraft.util.EnumFacing`

  returns: `net.minecraft.world.gen.structure.StructureBoundingBox`"
  (^net.minecraft.world.gen.structure.StructureBoundingBox [^net.minecraft.world.gen.structure.StructureVillagePieces$Start start ^java.util.List p-175856-1 ^java.util.Random rand ^Integer p-175856-3 ^Integer p-175856-4 ^Integer p-175856-5 ^net.minecraft.util.EnumFacing facing]
    (StructureVillagePieces$Torch/findPieceBox start p-175856-1 rand p-175856-3 p-175856-4 p-175856-5 facing)))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureVillagePieces$Torch this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

