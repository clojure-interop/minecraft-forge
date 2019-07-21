(ns net.minecraft.world.gen.structure.StructureVillagePieces$Field1
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureVillagePieces$Field1]))

(defn ->field-1
  "Constructor.

  start - `net.minecraft.world.gen.structure.StructureVillagePieces$Start`
  type - `int`
  rand - `java.util.Random`
  p-i-45570-4 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  facing - `net.minecraft.util.EnumFacing`"
  (^StructureVillagePieces$Field1 [^net.minecraft.world.gen.structure.StructureVillagePieces$Start start ^Integer type ^java.util.Random rand ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45570-4 ^net.minecraft.util.EnumFacing facing]
    (new StructureVillagePieces$Field1 start type rand p-i-45570-4 facing))
  (^StructureVillagePieces$Field1 []
    (new StructureVillagePieces$Field1 )))

(defn *create-piece
  "start - `net.minecraft.world.gen.structure.StructureVillagePieces$Start`
  p-175851-1 - `java.util.List`
  rand - `java.util.Random`
  p-175851-3 - `int`
  p-175851-4 - `int`
  p-175851-5 - `int`
  facing - `net.minecraft.util.EnumFacing`
  p-175851-7 - `int`

  returns: `net.minecraft.world.gen.structure.StructureVillagePieces$Field1`"
  (^net.minecraft.world.gen.structure.StructureVillagePieces$Field1 [^net.minecraft.world.gen.structure.StructureVillagePieces$Start start ^java.util.List p-175851-1 ^java.util.Random rand ^Integer p-175851-3 ^Integer p-175851-4 ^Integer p-175851-5 ^net.minecraft.util.EnumFacing facing ^Integer p-175851-7]
    (StructureVillagePieces$Field1/createPiece start p-175851-1 rand p-175851-3 p-175851-4 p-175851-5 facing p-175851-7)))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureVillagePieces$Field1 this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

