(ns net.minecraft.world.gen.structure.StructureVillagePieces$Field2
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureVillagePieces$Field2]))

(defn ->field-2
  "Constructor.

  start - `net.minecraft.world.gen.structure.StructureVillagePieces$Start`
  p-i-45569-2 - `int`
  rand - `java.util.Random`
  p-i-45569-4 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  facing - `net.minecraft.util.EnumFacing`"
  (^StructureVillagePieces$Field2 [^net.minecraft.world.gen.structure.StructureVillagePieces$Start start ^Integer p-i-45569-2 ^java.util.Random rand ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45569-4 ^net.minecraft.util.EnumFacing facing]
    (new StructureVillagePieces$Field2 start p-i-45569-2 rand p-i-45569-4 facing))
  (^StructureVillagePieces$Field2 []
    (new StructureVillagePieces$Field2 )))

(defn *create-piece
  "start - `net.minecraft.world.gen.structure.StructureVillagePieces$Start`
  p-175852-1 - `java.util.List`
  rand - `java.util.Random`
  p-175852-3 - `int`
  p-175852-4 - `int`
  p-175852-5 - `int`
  facing - `net.minecraft.util.EnumFacing`
  p-175852-7 - `int`

  returns: `net.minecraft.world.gen.structure.StructureVillagePieces$Field2`"
  (^net.minecraft.world.gen.structure.StructureVillagePieces$Field2 [^net.minecraft.world.gen.structure.StructureVillagePieces$Start start ^java.util.List p-175852-1 ^java.util.Random rand ^Integer p-175852-3 ^Integer p-175852-4 ^Integer p-175852-5 ^net.minecraft.util.EnumFacing facing ^Integer p-175852-7]
    (StructureVillagePieces$Field2/createPiece start p-175852-1 rand p-175852-3 p-175852-4 p-175852-5 facing p-175852-7)))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureVillagePieces$Field2 this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

